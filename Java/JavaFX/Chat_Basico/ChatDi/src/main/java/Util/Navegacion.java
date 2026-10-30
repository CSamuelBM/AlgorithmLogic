package Util;

import App.Main_Cliente;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.util.function.Consumer;

public class Navegacion {

    public static <T> void cambiarVista(String fxml, Consumer<T> controladorConfig) {
        try {
            FXMLLoader loader = new FXMLLoader(Navegacion.class.getResource(fxml));

            Parent root = loader.load();

            T controller = loader.getController();

            if (controladorConfig != null)
                controladorConfig.accept(controller);

            Scene scene = Main_Cliente.stage.getScene();
            scene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
