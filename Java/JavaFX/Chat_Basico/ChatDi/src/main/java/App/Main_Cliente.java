package App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main_Cliente extends Application {

    public static Stage stage;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;
        FXMLLoader fxmlLoader = new FXMLLoader(Main_Cliente.class.getResource("/View/LoginV.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 600);
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/burbuja-de-chat.png")));
        stage.setTitle("Chat! - Inicio de Sesión");
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(Main_Cliente.class, args);
    }

}
