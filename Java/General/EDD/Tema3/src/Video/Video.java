package Video;

public class Video {
    
    private String nombre;
    private String duracion;
    private String genero;
    private String canal;
    private String fecha;
    
    public Video(){
        nombre= "";
        duracion= "";
        genero= "";
        canal= "";
        fecha= "";
    }
    public Video(String nombre, String duracion, String genero, String canal, String fecha){
        setNombre(nombre);
        setDuracion(duracion);
        setGenero(genero);
        setCanal(canal);
        setFecha(fecha);
    }

    public void setNombre(String nombre) {
        if(!nombre.isEmpty())
            this.nombre = nombre;
        else
            System.out.println("Llena Todos Los Campos");
    }
    public String getNombre() {
        return nombre;
    }

    public void setDuracion(String duracion) {
        if(!duracion.isEmpty())
            this.duracion = duracion;
        else
            System.out.println("Llena Todos Los Campos");
    }
    public String getDuracion() {
        return duracion;
    }

    public void setGenero(String genero) {
        if(!genero.isEmpty())
            this.genero = genero;
        else
            System.out.println("Llena Todos Los Campos");
    }
    public String getGenero() {
        return genero;
    }

    public void setCanal(String canal) {
        if(!canal.isEmpty())
            this.canal = canal;
        else
            System.out.println("Llena Todos Los Campos");
    }
    public String getCanal() {
        return canal;
    }

    public void setFecha(String fecha) {
        if(!fecha.isEmpty())
            this.fecha = fecha;
        else
            System.out.println("Llena Todos Los Campos");
    }
    public String getFecha() {
        return fecha;
    }
    
    @Override
    public String toString(){
        return nombre+ " "+ duracion+ " "+ genero+ " "+ canal+ " "+ fecha;
    }
    
}
