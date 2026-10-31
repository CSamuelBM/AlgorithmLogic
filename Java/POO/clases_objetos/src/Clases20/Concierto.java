package Clases20;

public class Concierto {
    
    String cantante, genero, ospedaje, tip_Boleto;
    
    public Concierto(){
        this(" ", " ", " ", " ");
    }
    
    public Concierto(String cantante, String genero, String ospedaje, String tip_Boleto){
        setCantante(cantante);
        setGenero(genero);
        setOspedaje(ospedaje);
        setTip_Boleto(tip_Boleto);
    }
    
    public String getCantante(){
        return cantante;
    }
    public void setCantante(String cantante){
        this.cantante= cantante;
    }
    
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero= genero;
    }
    
    public String getOspedaje(){
        return ospedaje;
    }
    public void setOspedaje(String ospedaje){
        this.ospedaje= ospedaje;
    }
    
    public String getTip_Boleto(){
        return tip_Boleto;
    }
    public void setTip_Boleto(String tip_Boleto){
        this.tip_Boleto= tip_Boleto;
    }
    
}
