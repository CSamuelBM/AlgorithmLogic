package Cine;

public class Cartelera {
    
    Pelicula pelicula;
    String nombre, hora, num_Sala, num_Asistente;
    String genero, duracion, horario;
    int id_Cartelera;
    
    public Cartelera(){
        this(null, " ", " ", 0, " ", " ", " ", " ", " ");
    }
    
    public Cartelera(Pelicula pelicula, String nombre, String hora, int id_Cartelera, String num_Sala, String num_Asistente, 
                                              String genero, String duracion, String horario){
        setPelicula(pelicula);
        setNombre(nombre);
        setHora(hora);
        setId_Cartelera(id_Cartelera);
        setNum_Sala(num_Sala);
        setNum_Asistente(num_Asistente);
        setGenero(genero);
        setDuracion(duracion);
        setHorario(horario);
    }

    public Pelicula getPelicula(){
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula){
        this.pelicula= pelicula;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public int getId_Cartelera() {
        return id_Cartelera;
    }
    public void setId_Cartelera(int id_Cartelera) {
        this.id_Cartelera = id_Cartelera;
    }
    
    public String getNum_Sala() {
        return num_Sala;
    }
    public void setNum_Asistente(String num_Asistente) {
        this.num_Asistente = num_Asistente;
    }
    
    public String getNum_Asistente() {
        return num_Asistente;
    }
    public void setNum_Sala(String num_Sala) {
        this.num_Sala = num_Sala;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracion() {
        return duracion;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getHorario() {
        return horario;
    }
     public void setHorario(String horario) {
        this.horario = horario;
    }
    
}
