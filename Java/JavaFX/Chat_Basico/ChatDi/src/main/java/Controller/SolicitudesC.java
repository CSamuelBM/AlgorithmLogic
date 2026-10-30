package Controller;

import Modelo.PaqueteM;
import Modelo.SesionActual;
import Modelo.UsuarioM;
import Servicios.ChatClient;
import Util.Navegacion;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class SolicitudesC implements BaseC{

    @FXML
    private ListView<UsuarioM> listaSolicitudes;

    private ChatClient chatClient;
    @FXML private javafx.scene.layout.StackPane rootPane;
    @FXML private javafx.scene.control.ToggleButton btnModoOscuro;
    @FXML
    public void initialize(){
        listaSolicitudes.setItems(
                SesionActual.getSolicitudesPendientes()
        );
    }

    @FXML
    protected void aceptarSolicitud(){
        UsuarioM seleccionado =
                listaSolicitudes.getSelectionModel().getSelectedItem();

        if (seleccionado == null) return;

        PaqueteM p = PaqueteM.aceptarContacto(
                SesionActual.getUsuario().getId(),
                seleccionado.getId()
        );

        chatClient.enviar(p);
    }

    public void setChatClient(ChatClient chatClient) {
        this.chatClient = chatClient;
        chatClient.setControladorActivo(this);

        SesionActual.limpiarSolicitudes();
        listaSolicitudes.getItems().clear();

        PaqueteM p = PaqueteM.solicitudesPendientes(
                SesionActual.getUsuario().getId()
        );
        chatClient.enviar(p);
    }

    @Override
    public void procesarPaquete(PaqueteM pM) {
        switch (pM.getTipoOperacion()) {
            case SOLICITUD ->
                    Platform.runLater(() -> {
                        if (!listaSolicitudes.getItems().contains(pM.getUsuarioM()))
                            listaSolicitudes.getItems().add(pM.getUsuarioM());
                    });
            case CONTACTO_ACEPTADO ->
                    Platform.runLater(() ->
                            Navegacion.cambiarVista(
                                    "/View/ClienteV.fxml",
                                    (ClienteC c) -> {
                                        chatClient.setControladorActivo(c);
                                        c.iniciarConexion(chatClient);
                                    }
                            )
                    );
        }
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
            // Es vital pasar el cliente de red de vuelta al chat principal
            c.iniciarConexion(this.chatClient);
        });
    }
}
