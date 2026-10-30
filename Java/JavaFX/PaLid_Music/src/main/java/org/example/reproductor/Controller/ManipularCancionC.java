package org.example.reproductor.Controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import org.example.reproductor.Model.ManipularCancionM;

import java.util.Collection;
import java.util.Collections;

public class ManipularCancionC {

    private CancionC cancionC;

    @FXML
    private Slider sTiempo;
    @FXML
    private Label lbTiempo;
    @FXML
    private ToggleButton tbAdelantar;
    @FXML
    private ToggleButton tbAtrasar;
    @FXML
    private Slider sVolumen;
    @FXML
    private ToggleButton tbSilenciar;
    @FXML
    private ToggleButton tbSiguiente;
    @FXML
    private ToggleButton tbAnterior;
    @FXML
    private ToggleButton tbReinicio;
    @FXML
    private ToggleButton tbAleatorio;

    @FXML
    protected void initialize(){
        ManipularCancionM.setManipularCancionC(this);

        botonesConImgOscuro();
    }

    @FXML
    protected void accionAdelantar(){
        MediaPlayer mediaPlayer = ManipularCancionM.getMediaPlayer();
        mediaPlayer.seek(mediaPlayer.getCurrentTime().add(Duration.seconds(10)));
    }

    @FXML
    protected void accionAtrasar(){
        MediaPlayer mediaPlayer = ManipularCancionM.getMediaPlayer();
        mediaPlayer.seek(mediaPlayer.getCurrentTime().subtract(Duration.seconds(10)));
    }

    @FXML
    protected void accionSiguiente(){
        if(cancionC != null)
            cancionC.accionSiguiente();
    }

    @FXML
    protected void accionAnterior(){
        if(cancionC != null)
            cancionC.accionAnterior();
    }

    @FXML
    protected void accionSilenciar() {
        MediaPlayer mediaPlayer = ManipularCancionM.getMediaPlayer();
        if (mediaPlayer.isMute()) {
            mediaPlayer.setMute(false);
            colocarImage("/org.example.reproductor/Image/sonido.png", tbSilenciar);
        } else {
            mediaPlayer.setMute(true);
            colocarImage("/org.example.reproductor/Image/sinSonido.png", tbSilenciar);
        }
    }

    @FXML
    protected void accionReinicio(){
        MediaPlayer mediaPlayer = ManipularCancionM.getMediaPlayer();
        if(mediaPlayer != null){
            mediaPlayer.seek(mediaPlayer.getStartTime());
            mediaPlayer.play();
        }
    }

    @FXML
    protected void accionAleatorio(){
        if(cancionC != null){
            cancionC.recargarVista();
            ManipularCancionM.mezclarLista();
        }
    }

    public void setCancionC(CancionC cC){
        cancionC = cC;
    }

    private void botonesConImgOscuro(){
        colocarImage("/org.example.reproductor/Image/aleatorio.png", tbAleatorio);
        colocarImage("/org.example.reproductor/Image/reiniciar.png", tbReinicio);
        colocarImage("/org.example.reproductor/Image/delanteTiempo.png", tbAdelantar);
        colocarImage("/org.example.reproductor/Image/atrasTiempo.png", tbAtrasar);
        colocarImage("/org.example.reproductor/Image/sonido.png", tbSilenciar);
        colocarImage("/org.example.reproductor/Image/adelante.png", tbSiguiente);
        colocarImage("/org.example.reproductor/Image/atras.png", tbAnterior);
        accionSonido();
    }

    private void accionSonido(){
        sVolumen.valueProperty().addListener( (observable, valorAnterior, valorActual ) -> {
            MediaPlayer mediaPlayer = ManipularCancionM.getMediaPlayer();
            if(mediaPlayer != null)
                mediaPlayer.setVolume(valorActual.doubleValue()/ 100);
        });
    }

    public void iniciarTiempo(){
        MediaPlayer mediaPlayer = ManipularCancionM.getMediaPlayer();

        mediaPlayer.currentTimeProperty().addListener( (observable, valorAnterior, valorActual )-> {
            Platform.runLater(() -> {
                long seg = (long) valorActual.toSeconds();
                lbTiempo.setText(String.format("%02d:%02d", seg / 60, seg % 60));

                double total = mediaPlayer.getTotalDuration().toSeconds();
                sTiempo.setValue( (valorActual.toSeconds() / total) * 100 );
            });
        });

        sTiempo.setOnMousePressed(e -> {
            double total = mediaPlayer.getTotalDuration().toSeconds();
            mediaPlayer.seek(Duration.seconds(sTiempo.getValue() / 100 * total));
        });

        sTiempo.setOnMouseDragged(e -> {
            double total = mediaPlayer.getTotalDuration().toSeconds();
            mediaPlayer.seek(Duration.seconds(sTiempo.getValue() / 100 * total));
        });
    }

    private void colocarImage(String url, ToggleButton tb){
        ImageView imageView = new ImageView(cargarImage(url));
        imageView.setFitWidth(42);
        imageView.setFitHeight(42);
        imageView.setPreserveRatio(true);
        imageView.setSmooth(true);
        tb.setGraphic(imageView);
    }

    private Image cargarImage(String url){
        var image = getClass().getResourceAsStream(url);
        if(image == null)
            throw new IllegalArgumentException("Erro en la ruta"+ url);
        return new Image(image);
    }

}
