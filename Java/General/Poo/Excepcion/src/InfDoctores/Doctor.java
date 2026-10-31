package InfDoctores;

public class Doctor {
    public String nombre;
    public int edad;
    public boolean cedula;
    
    public Doctor(){
       nombre= ""; 
       edad= 0;
       cedula= false;
    }
    public Doctor(String nombre, int edad, boolean cedula){        
        setNombre(nombre);
        setEdad(edad);
        setCedula(cedula);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }   

    public boolean isCedula() {
        return cedula;
    }

    public void setCedula(boolean cedula) {
        this.cedula = cedula;
    }
   
}
