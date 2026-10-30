package Controller;

import Model.GuardarUsuariosM;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class UserC {
    private GuardarUsuariosM guardarUser = new GuardarUsuariosM();

    @FXML
    private TextField tfName;
    @FXML
    private PasswordField tfPassword;
    @FXML
    private Label img;

    @FXML
    protected void entrar() {
       if(guardarUser.verificarUser(tfName.getText(), tfPassword.getText()))
           img.setText("Hola user");
       else
           img.setText("");
    }

}
