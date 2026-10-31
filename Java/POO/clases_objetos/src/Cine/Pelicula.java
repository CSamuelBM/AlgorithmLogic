package Cine;

public class Pelicula {
    
    String nombre, genero, horario, duracion;
    int id_Pelicula;
    
    public Pelicula(){
        this(" ", " ", 0, " ", " ");
    }
    
    public Pelicula(String nombre, String genero, int id_Pelicula, String duracion, String horario){
        setNombre(nombre);
        setGenero(genero);
        setId_Pelicula(id_Pelicula);
        setDuracion(duracion);
        setHorario(horario);
    }
    
     public Pelicula copiar() {
        return new Pelicula(nombre, genero, id_Pelicula, duracion, horario);
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return genero;
    }
    
    public void setId_Pelicula(int id_Pelicula){
        this.id_Pelicula = id_Pelicula;
    }
    public int getId_Pelicula(){
        return id_Pelicula;
    }

    public String getDuracion(){
        return duracion;
    }
    public void setDuracion(String duracion){
        this.duracion = duracion;
    }

    public String getHorario(){
        return horario;
    }
    public void setHorario(String horario){
        this.horario = horario;
    }
    
    public void Mostrar(){
        System.out.println("Se Mostro");
    }
    
    public void Reservar(){
        System.out.println("Reservar Ya");
    }
    
}
