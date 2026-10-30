package Modelo;

import java.util.ArrayList;
import java.util.List;

public class MenuOpcionesModelo {

    private final String titulo;
    private final List<MenuAccionModelo> accciones = new ArrayList<>();

    public MenuOpcionesModelo(String titulo){
        this.titulo = titulo;
    }

    public void addAccion(MenuAccionModelo accion){
        accciones.add(accion);
    }

    public String getTitulo(){ return titulo; }

    public List<MenuAccionModelo> getAccciones(){ return accciones; }
}
