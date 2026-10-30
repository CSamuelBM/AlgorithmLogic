package Controller;

import Modelo.PaqueteM;
import Modelo.SesionActual;
import Servicios.ChatClient;
import Util.Navegacion;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ContactoC implements BaseC{

    @FXML
    protected TextField tfEmail;
    @FXML
    protected Label lbMensaje;
    @FXML private javafx.scene.layout.StackPane rootPane;
    @FXML private javafx.scene.control.ToggleButton btnModoOscuro;
    private ChatClient chatClient;

    @FXML
    protected void agregarContacto() {
        String usuario = tfEmail.getText().trim();

        if (usuario.isEmpty()) {
            mostrarMensaje("Escribe un email de usuario");
            return;
        }

        PaqueteM p = PaqueteM.agregarContacto(
                SesionActual.getUsuario().getId(),
                usuario
        );

        chatClient.enviar(p);
    }

    public void setChatClient(ChatClient chatClient){
        this.chatClient = chatClient;
        this.chatClient.setControladorActivo(this);
    }

    private void mostrarMensaje(String m) {
        lbMensaje.setText(m);
        lbMensaje.setVisible(true);
    }

    @Override
    public void procesarPaquete(PaqueteM pM) {
        switch (pM.getTipoOperacion()) {
            case AGREGAR_CONTACTO -> Platform.runLater(() -> {
                Navegacion.cambiarVista(
                        "/View/ClienteV.fxml",
                        (ClienteC c) -> c.iniciarConexion(chatClient)
                );
            });

            case ERROR -> Platform.runLater(() -> {
                mostrarError(pM.getMensajeSistema());
            });
        }
    }

    private void mostrarError(String msg) {
        lbMensaje.setText(msg);
        lbMensaje.setVisible(true);
    }
    @FXML
    public void cambiarTema() {
        if (btnModoOscuro.isSelected()) {
            rootPane.getStyleClass().add("dark-mode");
        } else {
            rootPane.getStyleClass().remove("dark-mode");
        }
    }

    @FXML
    public void volverChat() {
        Util.Navegacion.cambiarVista("/View/ClienteV.fxml", (ClienteC c) -> {
            // Le pasamos el cliente de red al chat para que no se desconecte
            c.iniciarConexion(this.chatClient);
        });
    }
}
