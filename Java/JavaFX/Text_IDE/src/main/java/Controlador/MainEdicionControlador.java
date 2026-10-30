package Controlador;

import Servicios.InicioServicio;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class MainEdicionControlador {

    private InicioServicio inicioServicio;

    @FXML
    protected MenuControlador menuController;
    @FXML
    protected CampoEditarControlador campoEditarController;
    @FXML
    protected BorderPane campoEditar;
    @FXML
    protected BorderPane menu;

    public void setInicioServicio(InicioServicio inicioServicio){
        this.inicioServicio = inicioServicio;

        menuController.setInicioServicio(inicioServicio);
        campoEditarController.setInicioServicio(inicioServicio);
    }

}
