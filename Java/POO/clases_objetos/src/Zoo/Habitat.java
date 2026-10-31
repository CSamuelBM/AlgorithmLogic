package Zoo;

public class Habitat {
    
    String nombre, clima, vegetacion, continente;
    
    public Habitat(){
        this(" ", " ", " ", " ");
    }
    
    public Habitat(String nombre, String clima, String vegetacion, String continente){
        setNombre(nombre);
        setClima(clima);
        setVegetacion(vegetacion);
        setContinente(continente);
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public String getClima(){
        return clima;
    }
    public void setClima(String clima){
        this.clima= clima;
    }
    
    public String getVegetacion(){
        return vegetacion;
    }    
    public void setVegetacion(String vegetacion){
        this.vegetacion= vegetacion;
    }
    
    public String getContinente(){
        return continente;
    }
    public void setContinente(String continente){
        this.continente= continente;
    }
}
