package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/login_record/Login_View.fxml"));

        Parent root = loader.load();

        Scene scene = new Scene(root);

        scene.getStylesheets().add(getClass().getResource("/style/Global_Style.css").toExternalForm());

        Image icono = new Image(getClass().getResourceAsStream("/assets/img/AppMainIcon.png"), 862, 862, true, true);

        primaryStage.setTitle("Vet Clin");
        primaryStage.getIcons().add(icono);
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(App.class, args);
    }

}
