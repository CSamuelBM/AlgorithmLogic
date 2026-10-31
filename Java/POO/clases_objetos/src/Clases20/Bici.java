package Clases20;

public class Bici {
    
    String tipo, marca;
    double precio, tamaño;
    
    public Bici(){
        this(" ", " ", 0, 0);
    }
    
    public Bici(String tipo, String marca, double precio, double tamaño){
        setTipo(tipo);
        setMarca(marca);
        setPrecio(precio);
        setTamaño(tamaño);
    }
    
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo= tipo;
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
    
    public double getTamaño(){
        return tamaño;
    }
    public void setTamaño(double tamaño){
        this.tamaño= tamaño;
    }
    
}
