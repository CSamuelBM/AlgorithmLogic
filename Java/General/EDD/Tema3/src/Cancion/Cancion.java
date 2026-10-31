package Cancion;

public class Cancion{
    
    private String nombreCancion, nombreArtista, genero, fecha, duracion;
    
    public Cancion(){
        nombreCancion= "";
        nombreArtista= "";
        genero= "";
        fecha= "";
        duracion= "";
    }
    
    public Cancion(String nombreCancion, String nombreArtista, String genero, String fecha, String duracion){
        setNombreCancion(nombreCancion);
        setNombreArtista(nombreArtista);
        setGenero(genero);
        setFecha(fecha);
        setDuracion(duracion);
    }
    
    public String getNombreCancion(){ 
        return nombreCancion; 
    }
    public void setNombreCancion(String nombreCancion){
        this.nombreCancion= nombreCancion;
    }
    
    public String getNombreArtista(){
        return nombreArtista;
    }
    public void setNombreArtista(String nombreArtista){
        this.nombreArtista= nombreArtista;
    }
    
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero= genero;
    }
    
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha= fecha;
    }
    
    public String getDuracion(){
        return duracion;
    }
    public void setDuracion(String duracion){
        this.duracion= duracion;
    }

    @Override
    public String toString(){
        return nombreCancion+ " "+ nombreArtista+ " "+ genero+ " "+ fecha+ " "+ duracion;
    }
    
}
