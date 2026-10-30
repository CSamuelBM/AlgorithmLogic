package controller;

import model.MainModel;
import view.MainView;

public class MainController {
    
    private MainModel model;
    private MainView view;
    
    public MainController(MainModel model, MainView view){
        this.model = model;
        this.view = view;
    }
    
    public void setNombre(String nombre){
        model.setNombre(nombre);
    }
    public String getNombre(){
        return model.getNombre();
    }
    
    public void setMatricula(String matricula){
        model.setMatricula(matricula);
    }
    public String getMatricula(){
        return model.getMatricula();
    }
    
    public void imprimirDatos(){
        view.imprimirDatos(model.getNombre(), model.getMatricula());
    }
    
}
