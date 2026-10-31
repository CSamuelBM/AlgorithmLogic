package Examen;

public class Persona {
    
    String nombre, curp;
    
    public Persona(){
        nombre= " "; 
        curp= " ";
    }
    
    public Persona(String nombre, String curp){
        setNombre(nombre);
        setCurp(curp);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
    
}
