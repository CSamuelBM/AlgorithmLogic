package Clases20;

public class Ropa {
    
    String color, material, marca;
    double precio;
    
    public Ropa(){
        this(" ", " ", " ", 0);
    }
    public Ropa(String color, String material, String marca, double precio){
        setColor(color);
        setMaterial(material);
        setMarca(marca);
        setPrecio(precio);
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color= color;
    }
    
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material= material;
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca= marca;
    }
    
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio= precio;
    }
    
}
