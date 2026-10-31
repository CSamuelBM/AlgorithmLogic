package Clases20;

public class Pintura {
    
    String tipo, exivicion, artista;
    int precio;
    
    public Pintura(){
        this(" ", " ", " ", 0);
    }
    
    public Pintura(String tipo, String exivicion, String artista, int precio){
        setTipo(tipo);
        setExivicion(exivicion);
        setArtista(artista);
        setPrecio(precio);
    }
    
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo= tipo;
    }
    
    public String getExivicion(){
        return exivicion;
    }
    public void setExivicion(String exivicion){
        this.exivicion= exivicion;
    }
    
    public String getArtista(){
        return artista;
    }
    public void setArtista(String artista){
        this.artista= artista;
    }
    
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precio){
        this.precio= precio;
    }
    
}
