package Clases20;

public class Silla {
    
    String marca, tipo, material;
    double precio;
    
    public Silla(){
        this(" ", " ", " ", 0);
    }
    
    public Silla(String marca, String tipo, String material, double precio){
        setMarca(marca);
        setTipo(tipo);
        setMaterial(material);
        setPrecio(precio);
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca= marca;
    }
    
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo= tipo;
    }
    
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material= material;
    }
    
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio= precio;
    }
    
}
