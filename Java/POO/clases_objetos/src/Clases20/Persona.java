package Clases20;

public class Persona {
    
    String nombre, recidencia;
    boolean sexo;
    int edad;
    
    public Persona(){
        this(" ", " ", false, 0);
    }
    
    public Persona(String nombre, String recidencia, boolean sexo, int edad){
        setNombre(nombre);
        setRecidencia(recidencia);
        setSexo(sexo);
        setEdad(edad);
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public String getRecidencia(){
        return recidencia;
    }
    public void setRecidencia(String recidencia){
        this.recidencia= recidencia;
    }
    
    public boolean getSexo(){
        return sexo;
    }
    public void setSexo(boolean sexo){
        this.sexo= sexo;
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad= edad;
    }
    
}
