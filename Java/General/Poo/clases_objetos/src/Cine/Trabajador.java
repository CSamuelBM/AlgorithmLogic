package Cine;

public class Trabajador {
    
    String nombre, direccion, horario;
    int id_Trabajador;
    long telefono;
    
    public Trabajador(){
        this(" ", " ", 0, 0, " ");
    }
    
    public Trabajador(String nombre, String direccion, int id_Trabajador, long telefono, String horario){
        setNombre(nombre);
        setDireccion(direccion);
        setId_Trabajador(id_Trabajador);
        setTelefono(telefono);
        setHorario(horario);
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion; 
    }

    public int getId_Trabajador(){
        return id_Trabajador;
    }
    public void setId_Trabajador(int id_Trabajador){
        this.id_Trabajador = id_Trabajador;
    }

    public long getTelefono(){
        return telefono;
    }
    public void setTelefono(long telefono){
        this.telefono = telefono;
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
    
    public void Soli_Permiso(){
        System.out.println("Soli Aceptada");
    }
    
 }
