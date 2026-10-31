package Cine;

public class Dulceria {
    
    String nombre, marca;
    long cod_Barra;
    double precio, cantidad;
    
    public Dulceria(){
        this(" ", " ", 0, 0, 0);
    }
    public Dulceria(String nombre, String marca, long cod_Barra, double precio, double cantidad){
        setNombre(nombre);
        setMarca(marca);
        setCod_Barra(cod_Barra);
        setPrecio(precio);
        setCantidad(cantidad);
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public long getCod_Barra(){
        return cod_Barra;
    }
    public void setCod_Barra(long cod_Barra){
        this.cod_Barra = cod_Barra;
    }

    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getCantidad(){
        return cantidad;
    }

    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    
    public void Mostrar(){
        System.out.println("Se Mostro");
    }
    
    public void Cobrar(){
        System.out.println("Se Cobro");
    }

}
