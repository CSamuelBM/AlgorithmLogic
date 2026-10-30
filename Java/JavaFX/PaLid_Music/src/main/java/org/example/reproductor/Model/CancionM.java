package org.example.reproductor.Model;

public class CancionM {

    private String nombre;
    private String url;
    private boolean favorito = false;

    public CancionM(String nombre, String url){
        setNombre(nombre);
        setUrl(url);
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getUrl(){
        return url;
    }
    public void setUrl(String url){
        this.url = url;
    }

    public boolean getFavorito(){ return favorito; }
    public void setFavorito(boolean favorito){ this.favorito = favorito; }

    @Override
    public String toString(){
        return nombre +" "+ url;
    }
}
