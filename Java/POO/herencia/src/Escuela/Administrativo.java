package Escuela;

public class Administrativo extends Persona{
    
    String id_Administrativo, area, funcion, jefe;
    
    public Administrativo(){
        id_Administrativo= " ";
        area= " ";
        funcion= " ";
        jefe= " ";
    }
    public Administrativo(String nombre, String edad, String sexo, String id_Administrativo, String area, String funcion, String jefe){
        super(" ", " ", " ");
         setId_Administrativo(id_Administrativo);
         setArea(area);
         setFuncion(funcion);
         setJefe(jefe);
         setNombre(nombre);
         setEdad(edad);
         setSexo(sexo);
    }

    public String getId_Administrativo() {
        return id_Administrativo;
    }
    public void setId_Administrativo(String id_Administrativo) {
        this.id_Administrativo = id_Administrativo;
    }
    
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    
    public String getFuncion() {
        return funcion;
    }
    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    
    public String getJefe() {
        return jefe;
    }
    public void setJefe(String jefe) {
        this.jefe = jefe;
    }
    
}
