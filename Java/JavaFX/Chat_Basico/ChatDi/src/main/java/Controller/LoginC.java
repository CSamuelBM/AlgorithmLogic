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

public class LoginC implements BaseC{

    @FXML private javafx.scene.layout.StackPane rootPane;
    @FXML private javafx.scene.control.ToggleButton btnModoOscuro;
    @FXML protected TextField tfNombre;
    @FXML protected PasswordField pfPassword;
    @FXML protected ImageView ivFoto;
    @FXML protected Label lblError;

    private byte[] fotoSeleccionada = null;
    private ChatClient socketC;

    @FXML
    public void initialize() {
        try{
            socketC = new ChatClient();
            socketC.conectar("10.149.95.171", 5000);
            socketC.setControladorActivo(this);
        } catch (Exception e) {
            throw new RuntimeException(e);
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

    @FXML
    private void ingresar() {
        String nombre   = tfNombre.getText().trim();
        String password = pfPassword.getText();

        if (nombre.isEmpty() || password.isEmpty()) {
            mostrarError("Completa usuario y contraseña.");
            return;
        }

        PaqueteM pM = PaqueteM.login(nombre, password);
        pM.setAvatar(fotoSeleccionada);
        socketC.enviar(pM);
    }

    @FXML
    private void crearCuenta() {
        Navegacion.cambiarVista("/View/RegistroV.fxml",
                (RegistroC registroC) -> registroC.setSocket(socketC));
    }

    @Override
    public void procesarPaquete(PaqueteM pM) {
        switch (pM.getTipoOperacion()){
            case LOGIN_OK -> {
                    UsuarioM u = new UsuarioM(
                    pM.getIdEmisor(),
                    pM.getUsuario(),
                    null,
                    pM.getAvatar());

                    SesionActual.setUsuario(u);

                    System.out.println("Sesión creada: " + u.getNombre());

                    Platform.runLater(() -> {
                        Navegacion.cambiarVista(
                                "/View/ClienteV.fxml",
                                (ClienteC c) -> {
                                    socketC.setControladorActivo(c);
                                    System.out.println("Controlador activo cambiado a ClienteC");
                                    c.iniciarConexion(socketC);
                                });
                    });
                }
            case LOGIN_ERROR ->
                    Platform.runLater(() -> mostrarError(pM.getMensajeSistema()));
            }
    }

    public void iniciar() {
        tfNombre.clear();
        pfPassword.clear();
        lblError.setVisible(false);
    }

}
