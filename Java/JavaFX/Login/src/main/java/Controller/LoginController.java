package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * LoginController — Controlador de la pantalla de inicio de sesión.
 *
 * Conecta el FXML login.fxml con la lógica de autenticación.
 */
public class LoginController implements Initializable {

    /* ─── Campos del formulario ─────────────────────────────────────── */

    @FXML private TextField     emailField;
    @FXML private PasswordField passwordField;
    @FXML private CheckBox      rememberMe;
    @FXML private Button        loginButton;

    /* ─── Inicialización ────────────────────────────────────────────── */

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Listener de validación en tiempo real para el botón
        loginButton.disableProperty().bind(
            emailField.textProperty().isEmpty()
                .or(passwordField.textProperty().isEmpty())
        );

        // Permitir "Enter" en el campo email para pasar al password
        emailField.setOnAction(e -> passwordField.requestFocus());

        // Permitir "Enter" en el password para hacer login directamente
        passwordField.setOnAction(e -> onLogin(null));
    }

    /* ─── Acciones ──────────────────────────────────────────────────── */

    /**
     * Acción del botón "Iniciar sesión".
     */
    @FXML
    private void onLogin(ActionEvent event) {
        String email    = emailField.getText().trim();
        String password = passwordField.getText();

        if (!isValidEmail(email)) {
            showAlert(Alert.AlertType.WARNING,
                      "Correo inválido",
                      "Por favor ingresa un correo electrónico válido.");
            emailField.requestFocus();
            return;
        }

        if (password.length() < 6) {
            showAlert(Alert.AlertType.WARNING,
                      "Contraseña muy corta",
                      "La contraseña debe tener al menos 6 caracteres.");
            passwordField.requestFocus();
            return;
        }

        // ── Aquí va tu lógica de autenticación ──────────────────────
        // Ejemplo: llamada a servicio, BD, API, etc.
        boolean loginExitoso = autenticar(email, password);

        if (loginExitoso) {
            System.out.println("Login exitoso — usuario: " + email);
            System.out.println("Recordarme: " + rememberMe.isSelected());
            // TODO: navegar a la pantalla principal
            // cargarVista("/com/example/dashboard.fxml");
        } else {
            showAlert(Alert.AlertType.ERROR,
                      "Credenciales incorrectas",
                      "El correo o la contraseña no son correctos. Intenta de nuevo.");
            passwordField.clear();
            passwordField.requestFocus();
        }
    }

    /**
     * Acción del enlace "¿Olvidaste tu contraseña?".
     */
    @FXML
    private void onForgotPassword(ActionEvent event) {
        // TODO: abrir pantalla de recuperación de contraseña
        System.out.println("Recuperar contraseña solicitado.");
        showAlert(Alert.AlertType.INFORMATION,
                  "Recuperar contraseña",
                  "Se enviará un enlace de recuperación a tu correo.");
    }

    /**
     * Acción del enlace "Regístrate aquí".
     */
    @FXML
    private void onRegister(ActionEvent event) {
        // TODO: navegar a la pantalla de registro
        System.out.println("Navegando a pantalla de registro...");
        // cargarVista("/com/example/registro.fxml");
    }

    /* ─── Utilidades privadas ───────────────────────────────────────── */

    /**
     * Lógica de autenticación (reemplaza con tu implementación real).
     */
    private boolean autenticar(String email, String password) {
        // ⚠️ Ejemplo hardcodeado — reemplaza con tu lógica real
        return "admin@ejemplo.com".equals(email) && "123456".equals(password);
    }

    /**
     * Valida el formato básico de un correo electrónico.
     */
    private boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w._%+\\-]+@[\\w.\\-]+\\.[a-zA-Z]{2,}$");
    }

    /**
     * Muestra un diálogo de alerta.
     */
    private void showAlert(Alert.AlertType type, String titulo, String mensaje) {
        Alert alert = new Alert(type);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
