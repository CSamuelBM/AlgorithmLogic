package Clases20;

public class Libro {
    
    String genero, autor;
    double precio;
    int num_Paginas;
    
    public Libro(){
        this(" ", " ", 0, 0);
    }
    
    public Libro(String genero, String autor, double precio, int num_Paginas){
        setGenero(genero);
        setAutor(autor);
        setPrecio(precio);
        setNum_Paginas(num_Paginas);
    }
    
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero= genero;
    }
    
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor= autor;
    }
    
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio= precio;
    }
    
    public int getNum_Paginas(){
        return num_Paginas;
    }
    public void setNum_Paginas(int num_Paginas){
        this.num_Paginas= num_Paginas;
    }
    
}
