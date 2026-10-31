package Clases20;

public class Vendedor {
    
    String calidad, marca;
    int cant_Producto, precio;
    
    public Vendedor(){
        this(" ", " ", 0, 0);
    }
    
    public Vendedor(String calidad, String marca, int cant_Producto, int precio){
        setCalidad(calidad);
        setMarca(marca);
        setCant_Producto(cant_Producto);
        setPrecio(precio);
    }
    
    public String getCalidad(){
        return calidad;
    }
    public void setCalidad(String calidad){
        this.calidad= calidad;
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca= marca;
    }
    
    public int getCant_Producto(){
        return cant_Producto;
    }
    public void setCant_Producto(int cant_Producto){
        this.cant_Producto= cant_Producto;
    }
    
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precio){
        this.precio= precio;
    }
    
}
