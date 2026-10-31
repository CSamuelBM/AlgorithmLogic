package Zoo;

public class Cuidador {
    
    String nombre, direccion, fecha;
    int telefono, num_Especie;
    
    public Cuidador(){
        this(" ", " ", 0, 0, " ");
    }
    
    public Cuidador(String nombre, String direccion, int num_Especie, int telefono, String fecha){
        setNombre(nombre);
        setDireccion(direccion);
        setNum_Especie(num_Especie);
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
    
    public int getNum_Especie(){
        return num_Especie;
    }
    public void setNum_Especie(int num_Especie){
        this.num_Especie= num_Especie;
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
