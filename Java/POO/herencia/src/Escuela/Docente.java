package Escuela;

    public class Docente extends Persona{
    
    String id_Docente, academia, horario, especialidad;
    
    public Docente(){
        id_Docente= " ";
        academia= Lista.opcAcademia();
        horario= Lista.opcHorario();
        especialidad= Lista.Especialidad();
    }
    public Docente(String nombre, String edad, String sexo, String id_Docente, String academia, String horario, String especialidad){
        super(" ", " ", " ");
         setId_Docente(id_Docente);
         setAcademia(academia);
         setHorario(horario);
         setEspecialidad(especialidad);
         setNombre(nombre);
         setEdad(edad);
         setSexo(sexo);
    }

    public String getId_Docente() {
        return id_Docente;
    }
    public void setId_Docente(String id_Empleado) {
        this.id_Docente = id_Empleado;
    }
    
    public String getAcademia() {
        return academia;
    }
    public void setAcademia(String academia) {
        this.academia = academia;
    }
    
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
