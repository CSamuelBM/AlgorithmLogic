package org.example.reproductor.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import org.example.reproductor.Model.CancionM;
import org.example.reproductor.Model.CancionRepositorioM;
import org.example.reproductor.Model.ManipularCancionM;
import org.example.reproductor.Util.TarjetaCancion;

import java.io.File;
import java.util.List;

public class AgregarCancionC {

    private static CancionC cancionC;

    @FXML
    private Button btnAgregar;
    @FXML
    private VBox vBox;

    @FXML
    private void accionAgregar() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Seleccionar canción");
        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Audio", "*.mp3", "*.wav")
        );

        List<File> archivos = fileChooser.showOpenMultipleDialog(vBox.getScene().getWindow());
        if (archivos != null) {
            for (File archivo : archivos) {
                String nombre = archivo.getName()
                        .replace(".mp3", "")
                        .replace(".wav", "");
                CancionM nueva = new CancionM(nombre, archivo.getAbsolutePath());

                ManipularCancionM.getListCancion().add(nueva);
                agregarTarjeta(nueva);

                if (cancionC != null)
                    cancionC.agregarTarjetaVista(nueva);
                CancionRepositorioM.guardarCancion(ManipularCancionM.getListCancion());
            }
        }
    }

    public static void setCancionC(CancionC c) {
        cancionC = c;
    }

    private void agregarTarjeta(CancionM cM) {
        HBox tarjeta = TarjetaCancion.crearTarjeta(
                cM,
                e -> cancionC.accionPlay(cM, (ToggleButton) e.getSource()),
                e -> cancionC.accionFavorito(cM, (ToggleButton) e.getSource()),
                null
        );
        ToggleButton tbFavorito = (ToggleButton) tarjeta.getChildren().get(4);
        cancionC.registrarFavorito(cM, tbFavorito);
        vBox.getChildren().add(tarjeta);
    }

}
