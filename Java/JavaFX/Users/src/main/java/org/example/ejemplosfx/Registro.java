package org.example.ejemplosfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Registro extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("userV.fxml"));
        Scene scene = new Scene(root, 900, 600);
        estilos(scene);
        primaryStage.setTitle("REGISTRO DE USUARIO");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void estilos(Scene scene){
        scene.getStylesheets().add(
                getClass().getResource("/css/style.css").toExternalForm()
        );
    }

    public static void main(String[] args) {
        launch(args);
    }
}
