package Clases20;

public class Bailar {
    
    String musica, pasos, clases, pareja;
    
    public Bailar(){
        this(" ", " ", " ", " ");
    }
    
    public Bailar(String musica, String pasos, String clases, String pareja){
        setMusica(musica);
        setPasos(pasos);
        setClases(clases);
        setPareja(pareja);
    }
    
    public String getMusica(){
        return musica;
    }
    public void setMusica(String musica){
        this.musica= musica;
    }
    
    public String getPasos(){
        return pasos;
    }
    public void setPasos(String pasos){
        this.pasos= pasos;
    }
    
    public String getClases(){
        return clases;
    }
    public void setClases(String clases){
        this.clases= clases;
    }
    
    public String getPareja(){
        return pareja;
    }
    public void setPareja(String pareja){
        this.pareja= pareja;
    }
    
}
