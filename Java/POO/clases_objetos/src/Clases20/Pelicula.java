package Clases20;

public class Pelicula {
    
    String genero, actor, trama, estreno;
    
    public Pelicula(){
        this(" ", " ", " ", " ");
    }
    public Pelicula(String genero, String actor, String trama, String estreno){
        setGenero(genero);
        setActor(actor);
        setTrama(trama);
        setEstreno(estreno);
    }
    
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero= genero;
    }
    
    public String getActor(){
        return actor;
    }
    public void setActor(String actor){
        this.actor= actor;
    }
    
    public String getTrama(){
        return trama;
    }
    public void setTrama(String trama){
        this.trama= trama;
    }
    
    public String getEstreno(){
        return estreno;
    }
    public void setEstreno(String estreno){
        this.estreno= estreno;
    }
    
}
