package Controlador;

import Servicios.InicioServicio;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import org.fxmisc.richtext.InlineCssTextArea;

public class CampoEditarControlador {

    @FXML
    protected VBox espacioEditor;

    private InicioServicio inicioServicio;
    private AnchorPane hoja;
    private boolean creandoPagina = false;

    public void setInicioServicio(InicioServicio inicioServicio){
        this.inicioServicio = inicioServicio;

        agregarHoja();
    }

    private AnchorPane crearHoja(){
        hoja = new AnchorPane();

        hoja.setPrefSize(794, 1123);
        hoja.setMinSize(794, 1123);
        hoja.setMaxSize(794, 1123);

        hoja.setScaleX(0.9);
        hoja.setScaleY(0.9);

        InlineCssTextArea lienzo = new InlineCssTextArea();
        lienzo.setWrapText(true);
        lienzo.getStyleClass().add("lienzo-texto");

        lienzo.setPrefWidth(794);
        lienzo.setPrefHeight(1000);
        lienzo.setMinHeight(1000);
        lienzo.setMaxHeight(1000);

        AnchorPane.setTopAnchor(lienzo, 60.0);
        AnchorPane.setLeftAnchor(lienzo, 60.0);

        lienzo.focusedProperty().addListener((obs, old, now) -> {
            if(now)
                inicioServicio.setNodoActual(lienzo);
        });

        lienzo.totalHeightEstimateProperty().subscribe(alturaContenido -> {
            double limite = 900;

            if(alturaContenido > limite && !creandoPagina && lienzo.isFocused()){
                creandoPagina = true;

                moverTextoOrden(lienzo);

                Platform.runLater(() -> creandoPagina = false);
            }

        });

        lienzo.textProperty().addListener((obs, oldVal, newVal) -> {
            if(newVal.isEmpty())
                eliminarHoja(lienzo);
        });

        hoja.getChildren().add(lienzo);

        return hoja;
    }

    private void agregarHoja(){
        AnchorPane area = crearHoja();
        espacioEditor.getChildren().add(area);
    }

    private InlineCssTextArea obtenerLienzo(AnchorPane area){
        return (InlineCssTextArea) area.getChildren().get(0);
    }

    private InlineCssTextArea obtenerSiguiente(InlineCssTextArea actual){
        AnchorPane hojaActual = (AnchorPane) actual.getParent();
        int i = espacioEditor.getChildren().indexOf(hojaActual);

        if(i < espacioEditor.getChildren().size() - 1){
            AnchorPane siguienteHoja = (AnchorPane) espacioEditor.getChildren().get(i + 1);
            return obtenerLienzo(siguienteHoja);
        }

        return null;
    }

    private int buscarUltimoSalto(String texto){
        int corte = texto.length() - 1;

        while(corte > 0 && texto.charAt(corte) != ' ' && texto.charAt(corte) != '\n')
            corte--;

        return corte;
    }

    private void eliminarHoja(InlineCssTextArea lienzo){
        AnchorPane hoja = (AnchorPane) lienzo.getParent();

        if(espacioEditor.getChildren().size() > 1){
            if(lienzo.getText().trim().isEmpty()){
                espacioEditor.getChildren().remove(hoja);

                AnchorPane ultima = (AnchorPane) espacioEditor.getChildren()
                        .get(espacioEditor.getChildren().size() - 1);

                InlineCssTextArea anterior = obtenerLienzo(ultima);
                anterior.requestFocus();
            }
        }
    }

    private void moverTextoOrden(InlineCssTextArea actual){
        String texto = actual.getText();

        int corte = buscarUltimoSalto(texto);

        String visible = texto.substring(0, corte);
        String sobrante = texto.substring(corte);

        actual.replaceText(visible);

        InlineCssTextArea siguiente = obtenerSiguiente(actual);

        if(siguiente == null){
            AnchorPane nuevaHoja = crearHoja();
            espacioEditor.getChildren().add(nuevaHoja);
            siguiente = obtenerLienzo(nuevaHoja);
        }

        siguiente.insertText(0, sobrante.trim());

        siguiente.requestFocus();
    }

}
