package Escuela_Vector;

public class Persona{
    
    String nombre, apellido, sexo, curp, horario;
    int edad;
    long telefono;
    
    public Persona(){
        nombre= "";
        apellido= "";
        sexo= "";
        curp= "";
        horario= "";
        edad= 0;
        telefono= 0;
    }
    
    public Persona(String nombre, String apellido, String sexo, String curp, String horario, int edad, long telefono){
        setNombre(nombre);
        setApellido(apellido);
        setSexo(sexo);
        setCurp(curp);
        setHorario(horario);
        setEdad(edad);
        setTelefono(telefono);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCurp() {
        return curp;
    }
    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getTelefono() {
        return telefono;
    }
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
}
