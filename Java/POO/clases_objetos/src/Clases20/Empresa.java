package Clases20;

public class Empresa {
    
    String nombre, giro, ubicacion;
    int num_Trabajadores;
    
    public Empresa(){
        this(" ", " ", " ", 0);
    }
    
    public Empresa(String nombre, String giro, String ubicacion, int num_Trabajadores){
        setNombre(nombre);
        setGiro(giro);
        setUbicacion(ubicacion);
        setNum_Trabajadores(num_Trabajadores);
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public String getGiro(){
        return giro;
    }
    public void setGiro(String giro){
        this.giro= giro;
    }
    
    public String getUbicacion(){
        return ubicacion;
    }
    public void setUbicacion(String ubicacion){
        this.ubicacion= ubicacion;
    }
    
    public int getNum_Trabajadores(){
        return num_Trabajadores;
    }
    public void setNum_Trabajadores(int num_Trabajadores){
        this.num_Trabajadores= num_Trabajadores;
    }
    
}
