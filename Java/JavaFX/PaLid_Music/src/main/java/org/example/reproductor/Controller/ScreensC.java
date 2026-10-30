package org.example.reproductor.Controller;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import org.example.reproductor.Model.ScreenParentM;

import java.util.HashMap;
import java.util.Map;

public class ScreensC {
    
    private static final String CANCIONID = "canciones";
    private static final String BUSCARID = "buscar";
    private static final String FAVORITOID = "favoritos";
    private static final String AGREGARCANCIONID = "agregarCancion";
    private static final String ELIMINARID = "eliminar";

    private static final String CANCIONXML = "/org.example.reproductor/View/CancionV.fxml";
    private static final String BUSCARXML = "/org.example.reproductor/View/BuscarV.fxml";
    private static final String FAVORITOXML = "/org.example.reproductor/View/FavoritoV.fxml";
    private static final String AGREGARCANCIONXML = "/org.example.reproductor/View/AgregarCancionV.fxml";
    private static final String ELIMINARXML = "/org.example.reproductor/View/EliminarCancionV.fxml";

    private final Map<String, Node> screens = new HashMap<>();
    private final Map<String, Object> controllers = new HashMap<>();

    @FXML
    protected StackPane stackPane;

    @FXML
    protected void initialize(){
        cargarScreen(CANCIONID, CANCIONXML);
        cargarScreen(BUSCARID, BUSCARXML);
        cargarScreen(FAVORITOID, FAVORITOXML);
        cargarScreen(AGREGARCANCIONID, AGREGARCANCIONXML);
        cargarScreen(ELIMINARID, ELIMINARXML);

        setScreen(CANCIONID);
    }

    @FXML
    protected void panelCancion(){
        setScreen(CANCIONID);
    }

    @FXML
    protected void panelBuscar(){
        setScreen(BUSCARID);
        Object control = controllers.get(BUSCARID);
        if (control instanceof BuscarC buscarC)
            buscarC.limpiar();
    }

    @FXML
    protected void panelFavorito() {
        setScreen(FAVORITOID);
    }

    @FXML
    protected void panelAgregarCancion(){
        setScreen(AGREGARCANCIONID);
    }

    @FXML
    protected void panelEliminar() {
        setScreen(ELIMINARID);
        Object control = controllers.get(ELIMINARID);
        if (control instanceof EliminarCancionC eliminarC)
            eliminarC.recargar();
    }

    public void addScreen(String name, Node node, ScreenParentM controller){
        screens.put(name, node);
        if(controller != null)
            controllers.put(name, controller);
    }

    public boolean cargarScreen(String name, String resource){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource(resource));
            Parent parent = loader.load();
            Object controller = loader.getController();

            if(controller instanceof ScreenParentM screenParent)
                screenParent.setScreenParent(this);

            screens.put(name, parent);
            if(controller != null)
                controllers.put(name, controller);

            return true;
        }
        catch (Exception e){
            msgError(name, resource);
            return false;
        }
    }

    public boolean setScreen(final String name){
        final Node next = screens.get(name);
        if(next == null){
            msgError(name, "next");
            return false;
        }
        if(stackPane.getChildren().isEmpty()){
            next.setOpacity(0);
            stackPane.getChildren().add(next);
            FadeTransition transition = new FadeTransition(Duration.millis(250), next);
            transition.setFromValue(0);
            transition.setToValue(1);
            transition.play();
        }
        else{
            final Node current = stackPane.getChildren().get(0);
            FadeTransition fadeCourrent = new FadeTransition(Duration.millis(200), current);
            fadeCourrent.setFromValue(1);
            fadeCourrent.setToValue(0);
            fadeCourrent.setOnFinished(e ->{
                stackPane.getChildren().setAll(next);
                next.setOpacity(0);
                FadeTransition fadeNext = new FadeTransition(Duration.millis(200), next);
                fadeNext.setFromValue(0);
                fadeNext.setToValue(1);
                fadeNext.play();
            });
            fadeCourrent.play();
        }
        return true;
    }

    private void msgError(String name, String resource){
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("ERROR");
        alerta.setContentText("En La Pantalla "+ name +" Problema En "+ resource);
        alerta.show();
    }

}
