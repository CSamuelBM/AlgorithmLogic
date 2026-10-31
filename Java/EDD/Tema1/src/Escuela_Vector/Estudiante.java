package Escuela_Vector;

import java.util.Vector;

public class Estudiante extends Persona implements Accion{
    Vector <Estudiante> obVe= new Vector<Estudiante> ();
    
   private String numControl, carrera, especialidad;
   
   public Estudiante(){
       numControl= "";
       carrera= "";
       especialidad= "";
   }
   
   public Estudiante(String nombre, String apellido, String sexo, String curp, String horario, int edad, 
                        long telefono, String numControl, String carrera, String especialidad){
       super(nombre, apellido, sexo, curp, horario, edad, telefono);
       setNumControl(numControl);
       setCarrera(carrera);
       setEspecialidad(especialidad);
   }

    public Vector<Estudiante> getObVe() {
        return obVe;
    }
    public void setObVe(Vector<Estudiante> obVe) {
        this.obVe = obVe;
    }
   
    public String getNumControl() {
        return numControl;
    }
    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }  
    
    @Override
     public String toString(){
         return getNombre()+ " "+ getApellido()+ " "+ getSexo()+ " "+ getCurp()+ " "+ getHorario()+ " "+ getEdad()+ 
                 " "+ getTelefono()+ " "+ getNumControl()+ " "+ getCarrera()+ " "+ getEspecialidad();
     }
   
}
