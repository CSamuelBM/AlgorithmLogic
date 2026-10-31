package Tema6;

public class ModelPerson {
    
    String nombre;
    int edad;
    
    public ModelPerson(){
        nombre= "";
        edad= 0;
    }
    public ModelPerson(String nombre, int edad){
        setNombre(nombre);
        setEdad(edad);
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad= edad;
    }
    
}
