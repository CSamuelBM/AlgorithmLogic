package Controller;

import Modelo.PaqueteM;
import Modelo.SesionActual;
import Modelo.UsuarioM;
import Servicios.ChatClient;
import Util.Navegacion;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class RegistroC implements BaseC{

    @FXML private javafx.scene.layout.StackPane rootPane;
    @FXML private javafx.scene.control.ToggleButton btnModoOscuro;
    @FXML protected TextField tfNombre;
    @FXML protected PasswordField pfPassword;
    @FXML protected TextField tfEmail;
    @FXML protected ImageView ivFoto;
    @FXML protected Label lblError;

    private byte[] fotoSeleccionada = null;
    private ChatClient socketC;

    @FXML
    protected void crearCuenta(){
        if (tfNombre.getText().isBlank() || pfPassword.getText().isBlank()
                || tfEmail.getText().isBlank()) {
            mostrarError("Completa todos los campos");
            return;
        }

        PaqueteM p = PaqueteM.registrar(
                tfNombre.getText(),
                pfPassword.getText(),
                tfEmail.getText(),
                fotoSeleccionada
        );

        socketC.enviar(p);
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
    public void volverLogin() {
        Util.Navegacion.cambiarVista("/View/LoginV.fxml", (LoginC c) -> {});
    }

    @FXML
    private void seleccionarFoto() {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Seleccionar foto de perfil");
        chooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Imágenes", "*.png", "*.jpg", "*.jpeg")
        );
        Stage stage = (Stage) ivFoto.getScene().getWindow();
        File archivo = chooser.showOpenDialog(stage);
        if (archivo == null) return;

        try {
            fotoSeleccionada = Files.readAllBytes(archivo.toPath());
            ivFoto.setImage(new Image(new ByteArrayInputStream(fotoSeleccionada)));
        } catch (IOException e) {
            mostrarError("No se pudo cargar la imagen.");
        }
    }

    private void mostrarError(String msg) {
        lblError.setText(msg);
        lblError.setVisible(true);
    }

    public void setSocket(ChatClient socketC) {
        this.socketC = socketC;
        this.socketC.setControladorActivo(this);
    }

    public void regitroOK(int idUsuario, String nombre) {
        SesionActual.setUsuario(new UsuarioM(idUsuario, nombre, null, null));

        Navegacion.cambiarVista("/View/ClienteV.fxml",
                (ClienteC clienteC) -> clienteC.iniciarConexion(socketC));
    }

    @Override
    public void procesarPaquete(PaqueteM pM) {
        switch (pM.getTipoOperacion()) {
            case LOGIN_OK ->
                    Platform.runLater(() -> regitroOK(pM.getIdEmisor(), pM.getUsuario()));
            case  ERROR ->
                    Platform.runLater(() -> mostrarError(pM.getMensajeSistema()));
        }
    }

}
