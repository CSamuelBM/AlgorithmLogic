package Servicios;

import Controller.BaseC;
import Controller.ClienteC;
import Controller.LoginC;
import Controller.SolicitudesC;
import Modelo.PaqueteM;
import Modelo.SesionActual;
import Util.Navegacion;
import javafx.application.Platform;

import java.io.*;
import java.net.Socket;
import java.util.function.Consumer;

public class ChatClient implements BaseC{

    private ObjectOutputStream out;
    private ObjectInputStream in;

    private Consumer<PaqueteM> mensajes;

    private BaseC controladorActivo;

    public ChatClient() { }

    private void escuchar() {
        try {
            while (true) {
                PaqueteM p = (PaqueteM) in.readObject();
                procesarPaquete(p);
            }

        } catch (java.io.EOFException e) {
            Platform.runLater(() -> {
                SesionActual.cerrar();
                Navegacion.cambiarVista("/View/LoginV.fxml",
                        (LoginC c) -> c.iniciar()
                );
            });
        } catch (Exception e) {
            System.out.println("Error en comunicación:");
            e.printStackTrace();
        }
    }

    @Override
    public void procesarPaquete(PaqueteM p) {
        if(p == null || controladorActivo == null) return;

        System.out.println("Paquete recibido: " + p.getTipoOperacion());
        System.out.println("Controlador activo: " + controladorActivo.getClass().getSimpleName());

        if (p.getTipoOperacion() == PaqueteM.TipoOperacion.SOLICITUD) {
            SesionActual.agregarSolicitud(p.getUsuarioM());

            if (controladorActivo instanceof SolicitudesC s)
                Platform.runLater(() -> s.procesarPaquete(p));

            return;
        }

        Platform.runLater(() -> controladorActivo.procesarPaquete(p));
    }

    public void conectar(String host, int puerto) {
        try {
            Socket socket = new Socket(host, puerto);
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());

            new Thread(this::escuchar).start();
        } catch (IOException e) {
            System.out.println("No Conectado");
        }
    }

    public void enviar(PaqueteM paqueteM) {
        try {
            if (out != null) {
                out.writeObject(paqueteM);
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setMensajes(Consumer<PaqueteM> mensajes) {
        this.mensajes = mensajes;
    }

    public void setControladorActivo(BaseC controlador) {
        this.controladorActivo = controlador;
    }

}
