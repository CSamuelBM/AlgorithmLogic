package Zoo;

public class Zona {
    
    String nombre;
    int num_Especie, extencion;
    
    public Zona(){
        this(" ", 0, 0);
    }
    
    public Zona(String nombre, int num_Especie, int extencion){
        setNombre(nombre);
        setNum_Especie(num_Especie);
        setExtencion(extencion);
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public int getNum_Especie(){
        return num_Especie;
    }
    public void setNum_Especie(int num_Especie){
        this.num_Especie= num_Especie;
    }
    
    public int getExtencion(){
        return extencion;
    }
    public void setExtencion(int extencion){
        this.extencion= extencion;
    }
    
}
