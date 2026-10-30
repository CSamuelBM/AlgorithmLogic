package Main;

import Controlador.MainEdicionControlador;
import Servicios.InicioServicio;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private final InicioServicio inicioServicio = new InicioServicio();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                App.class.getResource("/vista/Main-Edicion-Vista.fxml")
        );

        Parent parent = fxmlLoader.load();

        MainEdicionControlador mainEdicionControlador = fxmlLoader.getController();
        mainEdicionControlador.setInicioServicio(inicioServicio);

        Scene scene = new Scene(parent);

        stage.setScene(scene);
        stage.setMaximized(true);
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/img/icono.png")));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
