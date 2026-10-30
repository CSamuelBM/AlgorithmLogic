package org.example.reproductor.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.example.reproductor.Model.CancionM;
import org.example.reproductor.Model.CancionRepositorioM;
import org.example.reproductor.Model.ManipularCancionM;
import org.example.reproductor.Util.TarjetaCancion;

import java.util.List;

public class EliminarCancionC {

    private static CancionC cancionC;

    @FXML
    private VBox vBox;

    @FXML
    public void initialize() {
        cargarCanciones();
    }

    private void cargarCanciones() {
        vBox.getChildren().clear();
        List<CancionM> lista = ManipularCancionM.getListCancion();
        if (lista != null)
            lista.forEach(this::agregarTarjeta);
    }

    private void agregarTarjeta(CancionM cM) {
        HBox[] ref = new HBox[1];
        HBox tarjeta = TarjetaCancion.crearTarjeta(
                cM,
                e -> cancionC.accionPlay(cM, (ToggleButton) e.getSource()),
                e -> cancionC.accionFavorito(cM, (ToggleButton) e.getSource()),
                e -> accionEliminar(cM, ref[0])
        );
        ref[0] = tarjeta;
        ToggleButton tbFavorito = (ToggleButton) tarjeta.getChildren().get(4);
        cancionC.registrarFavorito(cM, tbFavorito);
        vBox.getChildren().add(tarjeta);
    }

    private void accionEliminar(CancionM cM, HBox tarjeta) {
        ManipularCancionM.getListCancion().remove(cM);
        vBox.getChildren().remove(tarjeta);

        if (cancionC != null)
            cancionC.eliminarTarjetaVista(cM);

        CancionRepositorioM.guardarCancion(ManipularCancionM.getListCancion());
    }

    public void recargar() {
        cargarCanciones();
    }

    public static void setCancionC(CancionC c) {
        cancionC = c;
    }

}
