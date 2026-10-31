package Clases20;

public class Pais {
    
    String nombre, idioma, ubicacion;
    float economia;
    
    public Pais(){
        this(" ", " ", " ", 0);
    }
    
    public Pais(String nombre, String idioma, String ubicacion, float economia){
        setNombre(nombre);
        setIdioma(idioma);
        setUbicacion(ubicacion);
        setEconomia(economia);
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public String getIdioma(){
        return idioma;
    }
    public void setIdioma(String idioma){
        this.idioma= idioma;
    }
    
    public String getUbicacion(){
        return ubicacion;
    }
    public void setUbicacion(String ubicacion){
        this.ubicacion= ubicacion;
    }
    
    public float getEconomia(){
        return economia;
    }
    public void setEconomia(float economia){
        this.economia= economia;
    }
   
}
