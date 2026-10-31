package Ex_Diagnostico;

public class Persona {
    
    String nombre;
    long telefono;
    
    public Persona(){
        nombre= "";
        telefono= 0;
    }
    
    public Persona(String nombre, long telefono){
        setNombre(nombre);
        setTelefono(telefono);
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public long getTelefono(){
        return telefono;
    }
    public void setTelefono(long telefono){
        this.telefono= telefono;
    }
    
}
