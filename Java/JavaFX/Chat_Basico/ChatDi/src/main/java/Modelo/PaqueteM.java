package Modelo;

import java.io.Serializable;

public class PaqueteM implements Serializable {
    private static final long serialVersionUID = 1L;

    private TipoOperacion tipoOperacion;
    private TipoMensaje tipoMensaje;
    private EstadoUsuario estadoUsuario;

    private int idEmisor;
    private int idReceptor;

    private String usuario;
    private String password;
    private String email;

    private String nombreArchivo;
    private String contenido;

    private byte[] datos;
    private byte[] avatar;

    private String mensajeSistema;
    private UsuarioM usuarioM;

    public static PaqueteM login(String usuario, String password) {
        PaqueteM pM = new PaqueteM();
        pM.tipoOperacion = TipoOperacion.LOGIN;
        pM.usuario = usuario;
        pM.password = password;
        return pM;
    }

    public static PaqueteM registrar(String usuario, String password, String email, byte[] avatar){
        PaqueteM pM = new PaqueteM();
        pM.tipoOperacion = TipoOperacion.REGISTRAR;
        pM.usuario = usuario;
        pM.password = password;
        pM.email = email;
        pM.avatar = avatar;
        return pM;
    }

    public static PaqueteM texto(int idEmisor, int idReceptor, String mensaje) {
        PaqueteM pM = new PaqueteM();
        pM.tipoOperacion = TipoOperacion.MENSAJE;
        pM.tipoMensaje = TipoMensaje.TEXTO;
        pM.idEmisor = idEmisor;
        pM.idReceptor = idReceptor;
        pM.contenido = mensaje;
        return pM;
    }

    public static PaqueteM archivo(TipoMensaje tipoMensaje, int idEmisor, int idReceptor, String nombreArchivo, byte[] datos){
        PaqueteM pM = new PaqueteM();
        pM.tipoOperacion = TipoOperacion.MENSAJE;
        pM.tipoMensaje = tipoMensaje;
        pM.idEmisor = idEmisor;
        pM.idReceptor = idReceptor;
        pM.nombreArchivo = nombreArchivo;
        pM.datos = datos;
        return pM;
    }

    public static PaqueteM respuesta(TipoOperacion tipoOperacion, String mensajeSistema){
        PaqueteM pM = new PaqueteM();
        pM.tipoOperacion = tipoOperacion;
        pM.mensajeSistema = mensajeSistema;
        return pM;
    }

    public static PaqueteM agregarContacto(int idEmisor, String emailContacto) {
        PaqueteM p = new PaqueteM();
        p.tipoOperacion = TipoOperacion.AGREGAR_CONTACTO;
        p.idEmisor = idEmisor;
        p.email = emailContacto;
        return p;
    }

    public static PaqueteM contacto(UsuarioM u) {
        PaqueteM p = new PaqueteM();
        p.tipoOperacion = TipoOperacion.CONTACTO;
        p.usuarioM = u;
        return p;
    }

    public static PaqueteM historial(int idEmisor, int idReceptor){
        PaqueteM p = new PaqueteM();
        p.tipoOperacion = TipoOperacion.HISTORIAL;
        p.idEmisor = idEmisor;
        p.idReceptor = idReceptor;
        return p;
    }

    public static PaqueteM solicitudesPendientes(int idUsuario) {
        PaqueteM p = new PaqueteM();
        p.tipoOperacion = TipoOperacion.SOLICITUDES_PENDIENTES;
        p.idEmisor = idUsuario;
        return p;
    }

    public static PaqueteM aceptarContacto(int idEmisor, int idReceptor) {
        PaqueteM p = new PaqueteM();
        p.tipoOperacion = TipoOperacion.ACEPTAR_CONTACTO;
        p.idEmisor = idEmisor;
        p.idReceptor = idReceptor;
        return p;
    }

    public static PaqueteM contactosAceptados(int idUsuario) {
        PaqueteM p = new PaqueteM();
        p.tipoOperacion = TipoOperacion.CONTACTO_ACEPTADO;
        p.idEmisor = idUsuario;
        return p;
    }

    public static PaqueteM cambiarEstado(int idUsuario, EstadoUsuario estado) {
        PaqueteM p = new PaqueteM();
        p.tipoOperacion = TipoOperacion.CAMBIAR_ESTADO;
        p.idEmisor = idUsuario;
        p.estadoUsuario = estado;
        return p;
    }

    public static PaqueteM logout(int idUsuario) {
        PaqueteM p = new PaqueteM();
        p.tipoOperacion = TipoOperacion.LOGOUT;
        p.idEmisor = idUsuario;
        return p;
    }

    public static PaqueteM zumbador(int idEmisor, int idReceptor) {
        PaqueteM p = new PaqueteM();
        p.tipoOperacion = TipoOperacion.ZUMBADOR;
        p.idEmisor = idEmisor;
        p.idReceptor = idReceptor;
        return p;
    }

    public static PaqueteM bloquear(int idEmisor, int idReceptor) {
        PaqueteM p = new PaqueteM();
        p.tipoOperacion = TipoOperacion.BLOQUEAR;
        p.idEmisor = idEmisor;
        p.idReceptor = idReceptor;
        return p;
    }

    public static PaqueteM desbloquear(int idEmisor, int idReceptor) {
        PaqueteM p = new PaqueteM();
        p.tipoOperacion = TipoOperacion.DESBLOQUEAR;
        p.idEmisor = idEmisor;
        p.idReceptor = idReceptor;
        return p;
    }

    public static PaqueteM borrarHistorial(int idEmisor, int idReceptor) {
        PaqueteM p = new PaqueteM();
        p.tipoOperacion = TipoOperacion.BORRAR_HISTORIAL;
        p.idEmisor = idEmisor;
        p.idReceptor = idReceptor;
        return p;
    }

    public enum TipoOperacion { LOGIN, REGISTRAR, LOGIN_OK, LOGIN_ERROR, ERROR,
        LOGOUT, MENSAJE, HISTORIAL, BLOQUEAR, CAMBIAR_ESTADO, AGREGAR_CONTACTO,
        SOLICITUD, SOLICITUDES_PENDIENTES, ACEPTAR_CONTACTO, RECHAZAR_CONTACTO,
        CONTACTO_ACEPTADO, CONTACTO, ZUMBADOR, DESBLOQUEAR, BORRAR_HISTORIAL
    }

    public enum TipoMensaje { TEXTO, ARCHIVO, IMAGEN, AUDIO, VIDEO, ANIMACION,
                              EMOTICON, MUSICA }

    public enum EstadoUsuario { DISPONIBLE, OCUPADO, AUSENTE, NO_DISPONIBLE, INVISIBLE }

    public TipoOperacion getTipoOperacion() { return tipoOperacion; }
    public void setTipoOperacion(TipoOperacion tipoOperacion) { this.tipoOperacion = tipoOperacion; }

    public TipoMensaje getTipoMensaje() { return tipoMensaje; }
    public void setTipoMensaje(TipoMensaje tipoMensaje) { this.tipoMensaje = tipoMensaje; }

    public int getIdEmisor() { return idEmisor; }
    public void setIdEmisor(int idEmisor){ this.idEmisor = idEmisor; }

    public int getIdReceptor() { return idReceptor; }
    public void setIdReceptor(int idReceptor) { this.idReceptor = idReceptor; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getPassword() { return password; }

    public String getEmail() { return email; }

    public byte[] getAvatar() { return avatar; }
    public void setAvatar(byte[] avatar) { this.avatar = avatar; }

    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }

    public String getNombreArchivo() { return nombreArchivo; }

    public byte[] getDatos() { return datos; }
    public void setDatos(byte[] datos) { this.datos = datos; }

    public String getMensajeSistema() { return mensajeSistema; }

    public EstadoUsuario getEstadoUsuario() { return estadoUsuario; }

    public UsuarioM getUsuarioM() { return usuarioM; }
    public void setUsuarioM(UsuarioM usuarioM) { this.usuarioM = usuarioM; }
}
