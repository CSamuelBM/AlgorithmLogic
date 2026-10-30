package org.example.reproductor.Model;

import javafx.scene.media.MediaPlayer;
import org.example.reproductor.Controller.ManipularCancionC;

import java.util.Collections;
import java.util.List;

public class ManipularCancionM {

    private static MediaPlayer mediaPlayer;
    private static ManipularCancionC manipularCancionC;
    private static List<CancionM> listCancion;

    public static MediaPlayer getMediaPlayer(){
        return mediaPlayer;
    }

    public static void setManipularCancionC(ManipularCancionC mCC){
        manipularCancionC = mCC;
    }

    public static void setMediaPlayer(MediaPlayer mP){
        mediaPlayer = mP;
        if(manipularCancionC != null)
            manipularCancionC.iniciarTiempo();
    }

    public static List<CancionM> getListCancion(){
        return listCancion;
    }
    public static void setListCancion(List<CancionM> list){
        listCancion = list;
    }

    public static void mezclarLista(){
        Collections.shuffle(listCancion);
    }

}
