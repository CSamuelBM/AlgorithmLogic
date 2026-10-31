package Cine;

public class Producto {
    
    String nombre;
    int id_Producto;
    double precio, tim_Preparar, cantidad;
    
    public Producto(){
        this(" ", 0, 0, 0, 0);
    }
    
    public Producto(String nombre, int id_Producto, double precio, double tim_Preparar, double cantidad){
        setNombre(nombre);
        setId_Producto(id_Producto);
        setPrecio(precio);
        setTim_Preparar(tim_Preparar);
        setCantidad(cantidad);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_Producto() {
        return id_Producto;
    } 
    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTim_Preparar() {
        return tim_Preparar;
    }
    public void setTim_Preparar(double tim_Preparar) {
        this.tim_Preparar = tim_Preparar;
    }

    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public void Mostrar(){
        System.out.println("Se Mostro");
    }
    
    public void Pagar(){
        System.out.println("Se Pago");
    }
    
}
