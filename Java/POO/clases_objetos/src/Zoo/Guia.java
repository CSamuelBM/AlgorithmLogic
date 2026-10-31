package Zoo;

public class Guia {
    
    String nombre, direccion, itinerario, fecha;
    int telefono;
    
    public Guia(){
        this(" ", " ", " ", 0, " ");
    }
    
    public Guia(String nombre, String direccion, String itinerario, int telefono, String fecha){
        setNombre(nombre);
        setDireccion(direccion);
        setItinerario(itinerario);
        setTelefono(telefono);
        setFecha(fecha);
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion= direccion;
    }
    
    public String getItinerario(){
        return itinerario;
    }
    public void setItinerario(String itinerario){
        this.itinerario= itinerario;
    }
    
    public int getTelefono(){
        return telefono;
    }
    public void setTelefono(int telefono){
        this.telefono= telefono;
    }
    
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha= fecha;
    }
    
}
