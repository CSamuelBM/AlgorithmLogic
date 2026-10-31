package Escuela;

public class Alumno extends Persona {
    
    String num_Control, carrera, especialidad, semestre, horario;
    
    public Alumno(){
        num_Control= " ";
        carrera= Lista.opcCarrera(); 
        especialidad= Lista.opcEspecialidad();
        semestre= " ";
        horario= Lista.opcHorario();
    }
    public Alumno(String nombre, String edad, String sexo, String num_Control, String carrera, 
                            String especialidad, String semestre, String horario){
       super(" ", " ", " "); 
        setNum_Control(num_Control);
        setCarrera(carrera);
        setEspecialidad(especialidad);
        setSemestre(semestre);
        setHorario(horario);
        setNombre(nombre);
        setEdad(edad);
        setSexo(sexo);
    }
    
    public String getNum_Control(){
        return num_Control;
    }
    public void setNum_Control(String num_Control){
        this.num_Control= num_Control;
    }
    
    public String getCarrera(){
        return carrera;
    }
    public void setCarrera(String carrera){
        this.carrera= carrera;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad= especialidad;
    }
    
    public String getSemestre(){
        return semestre;
    }
    public void setSemestre(String semestre){
        this.semestre= semestre;
    }
    
    public String getHorario(){
        return horario;
    }
    public void setHorario(String horario){
        this.horario= horario;
    }
    
    
}
