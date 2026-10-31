package Clases20;

public class Deporte {
    
    String tipo, historia;
    boolean popular, extremo;
    
    public Deporte(){
        this(" ", " ", false, false);
    }
    
    public Deporte(String tipo, String historia, boolean popular, boolean extremo){
        setTipo(tipo);
        setHistoria(historia);
        setPopular(popular);
        setExtremo(extremo);
    }
    
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo= tipo;
    }
    
    public String getHistoria(){
        return historia;
    }
    public void setHistoria(String historia){
        this.historia= historia;
    }
    
    public boolean getPopular(){
        return popular;
    }
    public void setPopular(boolean popular){
        this.popular= popular;
    }
    
    public boolean getExtremo(){
        return extremo;
    }
    public void setExtremo(boolean extremo){
        this.extremo= extremo;
    }
    
}
