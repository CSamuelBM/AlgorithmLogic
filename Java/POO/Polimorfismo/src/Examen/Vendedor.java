package Examen;

public class Vendedor extends Persona implements Accion{
    
    String tipo;
    int area;
    
    public Vendedor(){
        tipo= " ";
        area= 0;
    }
    
     public Vendedor(String nombre, String curp, String tipo, int area){
        super(nombre, curp); 
         setTipo(tipo);
         setArea(area);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
    @Override
     public void Cobrar(){
         System.out.println("Cobro En Electronico");
     }
     
    @Override
     public void Mostrar(){
         System.out.println("Nombre: "+ getNombre());
         System.out.println("Curp: "+ getCurp());
         System.out.println("Tipo: "+ getTipo());
         System.out.println("Area: "+ getArea());
     }
    
}
