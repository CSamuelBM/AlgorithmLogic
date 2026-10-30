package org.example.reproductor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        "/org.example.reproductor/View/ScreensV.fxml")
        );

        Scene scene = new Scene(loader.load(), 900, 600);
        Image icono = new Image(getClass().getResourceAsStream(
                "/org.example.reproductor/Image/iconoPrincipal.png"
        ));
        primaryStage.setMaximized(true);
        primaryStage.setTitle("PamLidS");
        style(scene);
        primaryStage.getIcons().add(icono);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void style(Scene scene) {
        scene.getStylesheets().add(
                App.class.getResource(("/org.example.reproductor/Css" +
                        "/buscar.css")).toExternalForm()
        );
        scene.getStylesheets().add(
                App.class.getResource(("/org.example.reproductor/Css" +
                        "/manipularCancion.css")).toExternalForm()
        );
        scene.getStylesheets().add(
                App.class.getResource("/org.example.reproductor/Css" +
                        "/canciones.css").toExternalForm()
        );
        scene.getStylesheets().add(
                App.class.getResource("/org.example.reproductor/Css/" +
                        "botones.css").toExternalForm()
        );
        scene.getStylesheets().add(
                App.class.getResource("/org.example.reproductor/Css/" +
                        "fondos.css").toExternalForm()
        );
    }

    public static void main(String[] args) {
        Application.launch(App.class, args);
    }
}
