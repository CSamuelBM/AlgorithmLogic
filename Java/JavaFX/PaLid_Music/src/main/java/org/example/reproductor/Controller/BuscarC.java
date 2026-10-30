package org.example.reproductor.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import org.example.reproductor.Model.CancionM;
import org.example.reproductor.Model.ManipularCancionM;
import org.example.reproductor.Util.TarjetaCancion;
import javafx.scene.control.TextField;
import java.util.List;
import java.util.stream.Collectors;

public class BuscarC {

    private static CancionC cancionC;
    private boolean limpiando = false;

    @FXML
    protected TextField tfBuscar;
    @FXML
    protected VBox vBox;

    @FXML
    public void initialize(){
        BorderPane parent = (BorderPane) tfBuscar.getParent();
        StackPane campoBusqueda = TarjetaCancion.textFieldConIcono(
                tfBuscar,
                "/org.example.reproductor/Image/buscar.png"
        );
        parent.setTop(campoBusqueda);

        tfBuscar.textProperty().addListener((obs, anterior, actual) -> buscar(actual));
    }

    private void buscar(String texto){
        vBox.getChildren().clear();

        if (texto == null || texto.isBlank()) return;

        var listCancion = ManipularCancionM.getListCancion();
        if (listCancion == null) return;

        List<CancionM> resultados = ManipularCancionM.getListCancion()
                .stream()
                .filter(e ->
                        e.getNombre().toLowerCase().contains(texto.toLowerCase()))
                .collect(Collectors.toList());

        for (CancionM cM : resultados){
            HBox tarjeta = TarjetaCancion.crearTarjeta(
                    cM,
                    e -> cancionC.accionPlay(cM,
                            (ToggleButton) e.getSource()),
                    e -> cancionC.accionFavorito(cM,
                            (ToggleButton) e.getSource()),
                    null
            );
            ToggleButton tbFavorito = (ToggleButton) tarjeta.getChildren().get(4);
            cancionC.registrarFavorito(cM, tbFavorito);
            vBox.getChildren().add(tarjeta);
        }
    }

    public void limpiar() {
        limpiando = true;
        vBox.getChildren().clear();
        tfBuscar.clear();
        limpiando = false;
    }

    public static void setCancionC(CancionC c){
        cancionC = c;
    }

}
