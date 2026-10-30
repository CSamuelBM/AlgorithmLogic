package org.example.reproductor.Controller;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import org.example.reproductor.Model.CancionM;
import org.example.reproductor.Model.CancionRepositorioM;
import org.example.reproductor.Model.ManipularCancionM;
import org.example.reproductor.Util.TarjetaCancion;

import java.nio.file.Paths;
import java.util.*;

public class CancionC {

    private ObservableList<CancionM> listCancion;
    private MediaPlayer mediaPlayer;
    private CancionM cancionActual;
    private ToggleButton tbActual;
    public Map<CancionM, ToggleButton> mapCancion = new HashMap<>();
    private Map<CancionM, List<ToggleButton>> mapFavorito = new HashMap<>();

    @FXML
    protected VBox vBox;
    @FXML
    protected ManipularCancionC manipularCancionController;

    @FXML
    protected void initialize(){
        manipularCancionController.setCancionC(this);
        BuscarC.setCancionC(this);
        FavoritoC.setCancionC(this);
        AgregarCancionC.setCancionC(this);
        EliminarCancionC.setCancionC(this);
        listCancion = new CancionRepositorioM().cargarCancion();
        ManipularCancionM.setListCancion(listCancion);
        cargarTarjeta();
    }

    private void cargarTarjeta(){
        vBox.getChildren().clear();
        for(CancionM cm : listCancion){
            HBox hBox = crearTarjetaCancion(cm);
            vBox.getChildren().add(hBox);
        }
    }

    private HBox crearTarjetaCancion(CancionM cancionM){
        HBox hBTarjeta = TarjetaCancion.crearTarjeta(
                cancionM,
                e -> accionPlay(cancionM, (ToggleButton) e.getSource()),
                e -> accionFavorito(cancionM, (ToggleButton) e.getSource()),
                null
        );
        ToggleButton tbPlay = (ToggleButton) hBTarjeta.getChildren().get(3);
        ToggleButton tbFavorito = (ToggleButton) hBTarjeta.getChildren().get(4);
        mapCancion.put(cancionM, tbPlay);
        registrarFavorito(cancionM, tbFavorito);
        return hBTarjeta;
    }

    public void accionSiguiente(){
        int siguiente = listCancion.indexOf(cancionActual) + 1;
        if (siguiente < listCancion.size()) {
            CancionM cancionM = listCancion.get(siguiente);
            ToggleButton tbSiguiente = mapCancion.get(cancionM);

            if (tbActual != null) {
                tbActual.setSelected(false);
                TarjetaCancion.colocarImage("/org.example.reproductor/Image/play.png", tbActual);
            }
            tbSiguiente.setSelected(true);
            accionPlay(cancionM, tbSiguiente);
        }
    }

    public void accionAnterior(){
        int anterior = listCancion.indexOf(cancionActual) - 1;
        if (anterior >= 0) {
            CancionM cancionM = listCancion.get(anterior);
            ToggleButton tbAnterior = mapCancion.get(cancionM);

            if (tbActual != null) {
                tbActual.setSelected(false);
                TarjetaCancion.colocarImage("/org.example.reproductor/Image/play.png", tbActual);
            }
            tbAnterior.setSelected(true);
            accionPlay(cancionM, tbAnterior);
        }
    }

    public void recargarVista(){
        Collections.shuffle(listCancion);
        mapCancion.clear();
        cargarTarjeta();
    }

    public void agregarTarjetaVista(CancionM cM) {
        HBox hBox = crearTarjetaCancion(cM);
        vBox.getChildren().add(hBox);
    }

    public void accionFavorito(CancionM cM, ToggleButton tb){
        cM.setFavorito(!cM.getFavorito());
        if(cM.getFavorito()){
            FavoritoC.addFavorito(cM);
            actualizarTodosFavorito(cM, true);
        }
        else{
            FavoritoC.elimnarFavorito(cM);
            actualizarTodosFavorito(cM, false);
        }
    }

    public void registrarFavorito(CancionM cM, ToggleButton tb){
        mapFavorito.computeIfAbsent(cM, e -> new ArrayList<>()).add(tb);
    }

    public void actualizarFavorito(CancionM cM){
        actualizarTodosFavorito(cM, false);
    }

    private void actualizarTodosFavorito(CancionM cM, boolean favorito) {
        List<ToggleButton> listTb = mapFavorito.get(cM);
        if (listTb != null) {
            String icon = favorito
                    ? "/org.example.reproductor/Image/estrella.png"
                    : "/org.example.reproductor/Image/favorito.png";
            for (ToggleButton tb : listTb)
                TarjetaCancion.colocarImage(icon, tb);
        }
    }

    public void eliminarTarjetaVista(CancionM cM) {
        ToggleButton tb = mapCancion.get(cM);
        if (tb != null) {
            vBox.getChildren().remove(tb.getParent());
            mapCancion.remove(cM);
        }
    }


    public void accionPlay(CancionM cM, ToggleButton tb){
        if (!tb.isSelected()) {
            if(mediaPlayer != null){
                mediaPlayer.pause();
                TarjetaCancion.colocarImage("/org.example.reproductor/Image/play.png", tb);
            }
            return;
        }

        if(mediaPlayer != null && cancionActual == cM){
            mediaPlayer.play();
            TarjetaCancion.colocarImage("/org.example.reproductor/Image/pausa.png", tb);
            return;
        }

        if(mediaPlayer != null){
            mediaPlayer.stop();
            mediaPlayer.dispose();
            if(tbActual != null){
                tbActual.setSelected(false);
                TarjetaCancion.colocarImage("/org.example.reproductor/Image/play.png", tbActual);
            }
        }

        cancionActual = cM;
        tbActual = tb;

        String url = Paths.get(cM.getUrl()).toUri().toString();
        Media media = new Media(url);
        mediaPlayer = new MediaPlayer(media);
        ManipularCancionM.setMediaPlayer(mediaPlayer);

        mediaPlayer.setOnReady(() -> {
            mediaPlayer.play();
            Platform.runLater(() ->
                    TarjetaCancion.colocarImage("/org.example.reproductor/Image/pausa.png", tb)
            );
        });

        mediaPlayer.setOnEndOfMedia(() -> {
            int siguiente = listCancion.indexOf(cancionActual) + 1;
            if(siguiente < listCancion.size()){
                CancionM cancionM = listCancion.get(siguiente);
                ToggleButton tbSiguiente = mapCancion.get(cancionM);

                Platform.runLater(() -> {
                    if (tbActual != null) {
                        tbActual.setSelected(false);
                        TarjetaCancion.colocarImage("/org.example.reproductor/Image/play.png", tbActual);
                    }
                    tbSiguiente.setSelected(true);
                    accionPlay(cancionM, tbSiguiente);
                });
            }
        });

    }

}
