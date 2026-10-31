package Clases20;

public class Laptop {
    
    String marca, procesador;
    float precio, ram;
    
    public Laptop(){
        this(" ", " ", 0, 0);
    }
    
    public Laptop(String marca, String procesador, float precio, float ram){
        setMarca(marca);
        setProcesador(procesador);
        setPrecio(precio);
        setRam(ram);
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca= marca;
    }
    
    public String getProcesador(){
        return procesador;
    }
    public void setProcesador(String procesador){
        this.procesador= procesador;
    }
    
    public float getPrecio(){
        return precio;
    }
    public void setPrecio(float precio){
        this.precio= precio;
    }
    
    public float getRam(){
        return ram;
    }
    public void setRam(float ram){
        this.ram= ram;
    }
    
}
