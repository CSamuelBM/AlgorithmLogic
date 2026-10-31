package Escuela;

public class Intendente extends Persona{
    
    String id_Intendente, area, uso_Producto;
    
    public Intendente(){
        id_Intendente= " ";
        area= " ";
        uso_Producto= " ";
    }
    public Intendente(String nombre, String edad, String sexo, String id_Intendente, String area, String uso_Producto){
        super(" ", " ", " ");
         setId_Intendente(id_Intendente);
         setArea(area);
         setUso_Producto(uso_Producto);
         setNombre(nombre);
         setEdad(edad);
         setSexo(sexo);
    }

    public String getId_Intendente() {
        return id_Intendente;
    }
    public void setId_Intendente(String id_Intendente) {
        this.id_Intendente = id_Intendente;
    }
      
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    public String getUso_Producto() {
        return uso_Producto;
    }
    public void setUso_Producto(String uso_Producto) {
        this.uso_Producto = uso_Producto;
    }
    
}
