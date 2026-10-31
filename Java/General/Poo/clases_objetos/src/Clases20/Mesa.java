package Clases20;

public class Mesa {
    
    String marca, material;
    double tamaño, precio;
    
    public Mesa(){
        this(" ", " ", 0, 0);
    }
    
    public Mesa(String marca, String material, double tamaño, double precio){
        setMarca(marca);
        setMaterial(material);
        setTamaño(tamaño);
        setPrecio(precio);
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca= marca;
    }
    
    public String getMaterial(){
        return marca;
    }
    public void setMaterial(String material){
        this.material= material;
    }
    
    public double getTamaño(){
        return tamaño;
    }
    public void setTamaño(double tamaño){
        this.tamaño= tamaño;
    }
    
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio= precio;
    }
    
}
