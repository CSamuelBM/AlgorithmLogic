package Mascota;

public class Veterinario {
    
    String nombre, sexo, horario, especialidad, celular;
    int id_Veterinario, edad;
    
    public Veterinario(){
        this(" ", " ", " ", " ", " ", 0, 0);
    }
    
    public Veterinario(String nombre, String sexo, String horario, String especialidad, String celular, 
                            int id_Veterinario, int edad){
        setNombre(nombre);
        setSexo(sexo);
        setHorario(horario);
        setEspecialidad(especialidad);
        setCelular(celular);
        setId_Veterinario(id_Veterinario);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo= sexo;
    }

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario){
        this.horario= horario;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad= especialidad;
    }

    public String getCelular(){
        return celular;
    }
    public void setCelular(String celular){
        this.celular= celular;
    }

    public int getId_Veterinario() {
        return id_Veterinario;
    }
    public void setId_Veterinario(int id_Veterinario){
        this.id_Veterinario= id_Veterinario;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad= edad;
    }
    
}
