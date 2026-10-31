package Persona;

public class Persona {
     
    String nombre, sexo;
    int edad;
    
    public Persona(){
        this(" ", " ", 0);
    }
    
    public Persona(String nombre, String sexo, int edad){
        setNombre(nombre);
        setSexo(sexo);
        setEdad(edad);
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo= sexo;
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad= edad;
    }
    
}
