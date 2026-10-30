package org.example.reproductor.Util;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import org.example.reproductor.Model.CancionM;


public class TarjetaCancion {

    public static HBox crearTarjeta(CancionM cm,
                                    EventHandler<ActionEvent> onPlay,
                                    EventHandler<ActionEvent> onFavorito,
                                    EventHandler<ActionEvent> onEliminar) {
        ImageView imgCancion = crearImagen("/org.example.reproductor/Image/iconoCancion.png");

        Label lbCancion = new Label(cm.getNombre());
        lbCancion.setAlignment(Pos.CENTER);
        lbCancion.getStyleClass().add("label-cancion");

        ToggleButton tbPlay = new ToggleButton();
        tbPlay.getStyleClass().add("boton-play");
        tbPlay.setOnAction(onPlay);
        colocarImage("/org.example.reproductor/Image/play.png", tbPlay);

        ToggleButton tbFavorito = new ToggleButton();
        tbFavorito.getStyleClass().add("boton-favorito");
        tbFavorito.setOnAction(onFavorito);
        if(cm.getFavorito()){
            colocarImage("/org.example.reproductor/Image/estrella.png", tbFavorito);
            tbFavorito.setSelected(true);
        }
        else
            colocarImage("/org.example.reproductor/Image/favorito.png", tbFavorito);

        HBox tarjeta;
        if(onEliminar != null){
            ToggleButton tbEliminar = new ToggleButton();
            tbEliminar.getStyleClass().add("boton-eliminar");
            tbEliminar.setOnAction(onEliminar);
            tbEliminar.getStyleClass().add("boton-eliminar");
            colocarImage("/org.example.reproductor/Image/eliminar.png", tbEliminar);
            tarjeta = new HBox(imgCancion, lbCancion, new Region(), tbPlay, tbFavorito, tbEliminar, new Region());
        }
        else
            tarjeta = new HBox(imgCancion, lbCancion, new Region(), tbPlay, tbFavorito);

        HBox.setHgrow(tarjeta.getChildren().get(2), Priority.ALWAYS);
        tarjeta.setAlignment(Pos.CENTER_RIGHT);
        tarjeta.getStyleClass().add("fondo-cancion-h");

        HBox.setMargin(imgCancion, new Insets(0, 0, 0, 60));
        HBox.setMargin(lbCancion, new Insets(0, 0, 0, 300));
        HBox.setMargin(tbPlay, new Insets(0, 70, 0, 0));
        HBox.setMargin(tbFavorito, new Insets(0, 70, 0, 0));

        return tarjeta;
    }

    public static void colocarImage(String url, ToggleButton tb) {
        ImageView imageView = new ImageView(cargarImage(url));
        imageView.setFitWidth(42);
        imageView.setFitHeight(42);
        imageView.setPreserveRatio(true);
        imageView.setSmooth(true);
        tb.setGraphic(imageView);
    }

    private static ImageView crearImagen(String url) {
        ImageView iv = new ImageView(cargarImage(url));
        iv.setFitWidth(42);
        iv.setFitHeight(42);
        iv.setPreserveRatio(true);
        iv.setSmooth(true);
        return iv;
    }

    private static Image cargarImage(String url) {
        var image = TarjetaCancion.class.getResourceAsStream(url);
        if (image == null)
            throw new IllegalArgumentException("Error en la ruta: " + url);
        return new Image(image);
    }

    public static StackPane textFieldConIcono(TextField tf, String urlIcono) {
        ImageView icon = new ImageView(cargarImage(urlIcono));
        icon.setFitWidth(18);
        icon.setFitHeight(18);
        icon.setPreserveRatio(true);
        icon.setSmooth(true);

        StackPane.setAlignment(icon, Pos.CENTER_RIGHT);
        StackPane.setMargin(icon, new Insets(0, 60, 0, 0));

        StackPane stack = new StackPane(tf, icon);
        return stack;
    }

}
