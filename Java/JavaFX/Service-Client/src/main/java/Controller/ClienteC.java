package Controller;

import Socket.SocketC;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ClienteC {

    private SocketC cliente;
    @FXML
    protected TextField tfMensaje;
    @FXML
    protected TextArea taMostrarMensajes;

    @FXML
    public void initialize(){
        cliente = new SocketC("127.0.0.1", 5000, mensaje ->{
            Platform.runLater(() -> {
                taMostrarMensajes.appendText(mensaje+ "\n");
            });
        });
        new Thread(cliente).start();
    }

    @FXML
    protected void enviarMensaje(){
        String mensaje = tfMensaje.getText();

        cliente.enviarMensaje(mensaje);

        taMostrarMensajes.appendText("Cliente: " + mensaje + "\n");

        tfMensaje.clear();
    }

}
