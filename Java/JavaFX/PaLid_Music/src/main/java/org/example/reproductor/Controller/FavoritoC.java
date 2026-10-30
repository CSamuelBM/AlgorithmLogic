package org.example.reproductor.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.example.reproductor.Model.CancionM;
import org.example.reproductor.Util.TarjetaCancion;

import java.util.ArrayList;
import java.util.List;

public class FavoritoC {

    private static List<CancionM> listFavorito = new ArrayList<>();
    private static FavoritoC favoritoC;
    private static CancionC cancionC;

    @FXML
    private VBox vBox;
    @FXML
    public void initialize(){
        favoritoC = this;
    }

    public static void setCancionC(CancionC cC){
        cancionC = cC;
    }

    private void cargarF(){
        vBox.getChildren().clear();

        for(CancionM cM : listFavorito){
            HBox hBTarjeta = TarjetaCancion.crearTarjeta(
                    cM,
                    e -> accionPlay(cM, (ToggleButton) e.getSource()),
                    e -> accionFavorito(cM, (ToggleButton) e.getSource()),
                    null
            );
            vBox.getChildren().add(hBTarjeta);
        }
    }

    public static void addFavorito(CancionM cM){
        listFavorito.add(cM);
        if(favoritoC != null)
            favoritoC.cargarF();
    }

    public static void elimnarFavorito(CancionM cM){
        listFavorito.remove(cM);
        if(favoritoC != null)
            favoritoC.cargarF();
    }

    private void accionPlay(CancionM cM, ToggleButton tb) {
        if (cancionC != null)
            cancionC.accionPlay(cM, tb);
    }

    private void accionFavorito(CancionM cM, ToggleButton tb){
        cM.setFavorito(false);
        elimnarFavorito(cM);
        if(cancionC != null)
            cancionC.actualizarFavorito(cM);
    }

}
