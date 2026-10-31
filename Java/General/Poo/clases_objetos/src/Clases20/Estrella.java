package Clases20;

public class Estrella {
    
    String brilla, verla, foto, estudiarla;
    
    public Estrella(){
        this(" ", " ", " ", " ");
    }
    
    public Estrella(String brilla, String verla, String foto, String estudiarla){
        setBrilla(brilla);
        setVerla(verla);
        setFoto(foto);
        setEstudiarla(estudiarla);
    }
    
    public String getBrilla(){
        return brilla;
    }
    public void setBrilla(String brilla){
        this.brilla= brilla;
    }
    
    public String getVerla(){
        return verla;
    }
    public void setVerla(String verla){
        this.verla= verla;
    }
    
    public String getFoto(){
        return foto;
    }
    public void setFoto(String foto){
        this.foto= foto;
    }
    
    public String getEstudiarla(){
        return estudiarla;
    }
    public void setEstudiarla(String estudiarla){
        this.estudiarla= estudiarla;
    }
    
}
