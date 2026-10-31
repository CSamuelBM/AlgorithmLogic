package Clases20;

public class Foto {
    
    String tipo, calidad, autor;
    int precio;
    
    public Foto(){
        this(" ", " ", " ", 0);
    }
    
    public Foto(String tipo, String calidad, String autor, int precio){
        setTipo(tipo);
        setCalidad(calidad);
        setAutor(autor);
        setPrecio(precio);
    }
    
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo= tipo;
    }
    
    public String getCalidad(){
        return calidad;
    }
    public void setCalidad(String calidad){
        this.calidad= calidad;
    }
    
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor= autor;
    }
    
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precio){
        this.precio= precio;
    }
    
}
