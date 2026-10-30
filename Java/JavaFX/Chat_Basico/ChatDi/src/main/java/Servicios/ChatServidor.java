package Servicios;

import DAO.ContactoD;
import DAO.MensajeD;
import DAO.UsuarioD;
import Modelo.PaqueteM;
import Modelo.UsuarioM;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

public class ChatServidor extends Thread{

    private Socket socket;

    private ObjectInputStream in;
    private ObjectOutputStream out;

    private UsuarioM usuario;

    public ChatServidor(Socket socket) throws IOException {
        this.socket = socket;
        this.out = new ObjectOutputStream(socket.getOutputStream());
        this.in = new ObjectInputStream(socket.getInputStream());
    }

    @Override
    public void run() {
        try {
            while (true) {
                PaqueteM pM = (PaqueteM) in.readObject();

                switch (pM.getTipoOperacion()) {
                    case LOGIN -> procesarLogin(pM);
                    case REGISTRAR -> procesarRegistro(pM);
                    case MENSAJE -> {
                        switch (pM.getTipoMensaje()){
                            case TEXTO, ARCHIVO, IMAGEN, AUDIO, VIDEO, ANIMACION,
                                 EMOTICON, MUSICA -> procesarMensaje(pM);
                        }
                    }
                    case HISTORIAL -> enviarHistorial(pM);
                    case BLOQUEAR -> procesarBloqueo(pM);
                    case CAMBIAR_ESTADO -> cambiarEstado(pM);
                    case LOGOUT -> procesarLogout();
                    case AGREGAR_CONTACTO -> procesarContacto(pM);
                    case ACEPTAR_CONTACTO -> procesarAceptar(pM);
                    case SOLICITUDES_PENDIENTES -> enviarSolicitudesPendientes(pM);
                    case CONTACTO_ACEPTADO -> enviarContactosAceptados(pM);
                    case ZUMBADOR -> procesarZumbador(pM);
                    case DESBLOQUEAR -> procesarDesbloqueo(pM);
                    case BORRAR_HISTORIAL -> procesarBorrarHistorial(pM);
                    default -> enviar(
                            PaqueteM.respuesta(
                                    PaqueteM.TipoOperacion.ERROR,
                                    "Operación no soportada"
                            )
                    );
                }
            }
        }
        catch (Exception e) {
            System.out.println("Cliente desconectado o error crítico:");
            e.printStackTrace();
            limpiarSesion();
        }
    }

    private void procesarLogin(PaqueteM p) throws IOException {
        UsuarioM usuario = UsuarioD.login(p.getUsuario(), p.getPassword());

        if (usuario == null) {
            enviar(PaqueteM.respuesta(
                    PaqueteM.TipoOperacion.LOGIN_ERROR,
                    "Usuario o contraseña incorrectos"
            ));
            return;
        }

        this.usuario = usuario;

        if (p.getAvatar() != null) {
            UsuarioD.actualizarFoto(usuario.getId(), p.getAvatar());
            usuario.setAvatar(p.getAvatar());
        }

        PaqueteM pM = PaqueteM.respuesta(
                PaqueteM.TipoOperacion.LOGIN_OK,
                "Bienvenido"
        );
        pM.setIdEmisor(usuario.getId());
        pM.setUsuario(usuario.getNombre());
        pM.setAvatar(usuario.getAvatar());

        Main_Servidor.clientes.put(usuario.getId(), this);
        enviar(pM);
    }

    private void procesarRegistro(PaqueteM p) throws IOException {
        boolean creado = UsuarioD.crear(
                p.getUsuario(),
                p.getPassword(),
                p.getEmail(),
                p.getAvatar()
        );

        if (!creado) {
            enviar(PaqueteM.respuesta(
                    PaqueteM.TipoOperacion.ERROR,
                    "Usuario o email ya existen"
            ));
            return;
        }

        enviar(PaqueteM.respuesta(
                PaqueteM.TipoOperacion.LOGIN_OK,
                "Cuenta creada correctamente"
        ));
    }

    private void procesarMensaje(PaqueteM p) {
        MensajeD.guardarMensaje(p);

        ChatServidor receptor = Main_Servidor.clientes.get(p.getIdReceptor());

        if (receptor != null)
            receptor.enviarSeguro(p);

        enviarSeguro(p);
    }

    private void enviarHistorial(PaqueteM p) {
        List<PaqueteM> historial =
                MensajeD.historial(p.getIdEmisor(), p.getIdReceptor());

        for (PaqueteM msg : historial) {
            enviarSeguro(msg);
        }
    }

    private void procesarContacto(PaqueteM p) {
        int yo = p.getIdEmisor();
        String emailContacto = p.getEmail();

        UsuarioM contacto = UsuarioD.obtenerUsuarioEmail(emailContacto);

        if (contacto == null) {
            enviarSeguro(PaqueteM.respuesta(
                     PaqueteM.TipoOperacion.ERROR,
                    "El usuario no existe"
            ));
            return;
        }

        if (yo == contacto.getId()) {
            enviarSeguro(PaqueteM.respuesta(
                    PaqueteM.TipoOperacion.ERROR,
                    "No puedes agregarte a ti mismo"
            ));
            return;
        }

        boolean ok = ContactoD.insertarSolicitud(yo, contacto.getId());

        if (!ok) {
            enviarSeguro(PaqueteM.respuesta(
                    PaqueteM.TipoOperacion.ERROR,
                    "Ya existe una solicitud o contacto"
            ));
            return;
        }

        enviarSeguro(PaqueteM.respuesta(
                PaqueteM.TipoOperacion.AGREGAR_CONTACTO,
                "Solicitud enviada"
        ));

        ChatServidor receptor = Main_Servidor.clientes.get(contacto.getId());

        if (receptor != null) {
            PaqueteM solicitud = new PaqueteM();
            solicitud.setTipoOperacion(PaqueteM.TipoOperacion.SOLICITUD);

            solicitud.setUsuarioM(UsuarioD.obtenerUsuarioId(yo));

            receptor.enviarSeguro(solicitud);
        }
    }

    private void procesarBloqueo(PaqueteM p) {
        ContactoD.bloquear(p.getIdEmisor(), p.getIdReceptor());
        enviarSeguro(PaqueteM.respuesta(
                PaqueteM.TipoOperacion.BLOQUEAR,
                "Contacto bloqueado"
        ));
    }

    private void procesarDesbloqueo(PaqueteM p) {
        ContactoD.desbloquear(p.getIdEmisor(), p.getIdReceptor());
        enviarSeguro(PaqueteM.respuesta(
                PaqueteM.TipoOperacion.DESBLOQUEAR,
                "Contacto desbloqueado"
        ));
    }

    private void procesarBorrarHistorial(PaqueteM p) {
        MensajeD.borrarHistorial(p.getIdEmisor(), p.getIdReceptor());
        enviarSeguro(PaqueteM.respuesta(
                PaqueteM.TipoOperacion.BORRAR_HISTORIAL,
                "Historial borrado"
        ));
    }


    private void enviarSolicitudesPendientes(PaqueteM p) {
        List<UsuarioM> solicitudes =
                ContactoD.solicitudesPendientes(p.getIdEmisor());

        for (UsuarioM u : solicitudes) {
            PaqueteM resp = new PaqueteM();
            resp.setTipoOperacion(PaqueteM.TipoOperacion.SOLICITUD);
            resp.setUsuarioM(u);
            enviarSeguro(resp);
        }
    }

    private void enviarContactosAceptados(PaqueteM p) {
        System.out.println("Servidor enviando contactos aceptados para id="
                + p.getIdEmisor());

        List<UsuarioM> contactos =
                ContactoD.contactosAceptados(p.getIdEmisor());

        System.out.println("Total contactos: " + contactos.size());

        for (UsuarioM u : contactos) {
            System.out.println("Enviando contacto: " + u.getNombre());
            enviarSeguro(PaqueteM.contacto(u));
        }
    }

    private void procesarAceptar(PaqueteM p) {
        ContactoD.aceptarContacto(
                p.getIdReceptor(),
                p.getIdEmisor()
        );

        ContactoD.crearContactoInverso(
                p.getIdEmisor(),
                p.getIdReceptor()
        );

        PaqueteM resp = PaqueteM.respuesta(
                PaqueteM.TipoOperacion.CONTACTO_ACEPTADO,
                "Contacto agregado"
        );

        enviarSeguro(resp);

        ChatServidor solicitante = Main_Servidor.clientes.get(p.getIdReceptor());

        if (solicitante != null)
            solicitante.enviarSeguro(resp);
    }

    private void cambiarEstado(PaqueteM p) {
        UsuarioD.cambiarEstado(
                p.getIdEmisor(),
                p.getEstadoUsuario()
        );

        enviarSeguro(PaqueteM.respuesta(
                PaqueteM.TipoOperacion.CAMBIAR_ESTADO,
                p.getEstadoUsuario().name()
        ));
    }

    private void procesarZumbador(PaqueteM p) {

        ChatServidor receptor =
                Main_Servidor.clientes.get(p.getIdReceptor());

        if (receptor != null) {
            receptor.enviarSeguro(p);
        }
    }

    private void procesarLogout() {
        if (usuario != null) {
            Main_Servidor.clientes.remove(usuario.getId());
        }
        limpiarSesion();
    }

    private void enviarSeguro(PaqueteM p) {
        try {
            out.writeObject(p);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enviar(PaqueteM p) throws IOException {
        out.writeObject(p);
        out.flush();
    }

    private void limpiarSesion() {
        try {
            socket.close();
        } catch (Exception ignored) {}
    }

}
