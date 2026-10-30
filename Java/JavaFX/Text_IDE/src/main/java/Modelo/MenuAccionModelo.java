package Modelo;

public class MenuAccionModelo {

    private final String texto;
    private final Runnable accion;

    public MenuAccionModelo(String texto, Runnable accion){
        this.texto = texto;
        this.accion = accion;
    }

    public String getTexto(){ return texto; }

    public Runnable getAccion(){ return accion; }
}
