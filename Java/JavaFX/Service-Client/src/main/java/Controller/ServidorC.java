package Controller;

import Socket.SocketS;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ServidorC {

    private SocketS servidor;
    @FXML
    protected TextArea taMostrarMensajes;
    @FXML
    protected TextField tfMensaje;

    @FXML
    protected void initialize(){
        servidor = new SocketS(5000, mensaje ->{
            Platform.runLater(() -> {
                taMostrarMensajes.appendText(mensaje + "\n");
            });
        });

        new Thread(servidor).start();
    }

    @FXML
    protected void enviarMensaje(){
        String mensaje = tfMensaje.getText();

        servidor.enviarMensaje(mensaje);

        taMostrarMensajes.appendText("Servidor: " + mensaje + "\n");

        tfMensaje.clear();
    }

}
