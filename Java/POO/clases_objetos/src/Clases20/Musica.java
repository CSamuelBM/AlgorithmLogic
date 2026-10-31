package Clases20;

public class Musica {
    
    String genero, idioma, popularidad, artista;
    
    public Musica(){
        this(" ", " ", " ", " ");
    }
    public Musica(String genero, String idioma, String popularidad, String artista){
        setGenero(genero);
        setIdioma(idioma);
        setPopularidad(popularidad);
        setArtista(artista);
    }
    
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero= genero;
    }
    
    public String getIdioma(){
        return idioma;
    }
    public void setIdioma(String idioma){
        this.idioma= idioma;
    }
    
    public String getPopularidad(){
        return popularidad;
    }
    public void setPopularidad(String popularidad){
        this.popularidad= popularidad;
    }
    
    public String getArtista(){
        return artista;
    }
    public void setArtista(String artista){
        this.artista= artista;
    }
    
}
