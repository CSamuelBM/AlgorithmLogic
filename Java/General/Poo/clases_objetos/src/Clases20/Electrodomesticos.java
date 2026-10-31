package Clases20;

public class Electrodomesticos {
    
    String nombre, color, marca;
    float tamaño;
    
    public Electrodomesticos(){
         this(" ", " ", " ", 0);
   }
    
    public Electrodomesticos(String nombre, String color, String marca, float tamaño){
        setNombre(nombre);
        setColor(color);
        setMarca(marca);
        setTamaño(tamaño);
    }
    

   public String getNombre(){
       return nombre;
   }
   public void setNombre(String nombre){
       this.nombre= nombre;
   }
   
   public String getColor(){
       return color;
   }
   public void setColor(String color){
       this.color= color;
   }
   
   public String getMarca(){
       return marca;
   }
   public void setMarca(String marca){
       this.marca= marca;
   }
   
   public float getTamaño(){
       return tamaño;
   }
   public void setTamaño(float tamaño){
       this.tamaño= tamaño;
   }
   
}
