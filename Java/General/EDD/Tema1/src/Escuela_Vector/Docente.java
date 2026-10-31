package Escuela_Vector;

import java.util.Vector;

public class Docente extends Persona implements Accion{
    Vector <Docente> obVd= new Vector<> ();
    
    private String numTrabajador, academia, clave, grado;
    
    public Docente(){
        numTrabajador= "";
        academia= "";
        clave= "";
        grado= "";
    }
    public Docente(String nombre, String apellido, String sexo, String curp, String horario, int edad, 
                        long telefono, String numTrabajador, String academia, String clave, String grado){
        super(nombre, apellido, sexo, curp, horario, edad, telefono);
        setNumTrabajador(numTrabajador);
        setAcademia(academia);
        setClave(clave);
        setGrado(grado);
    }

    public Vector<Docente> getObVd() {
        return obVd;
    }
    public void setObVd(Vector<Docente> obVd) {
        this.obVd = obVd;
    }

    public String getNumTrabajador() {
        return numTrabajador;
    }
    public void setNumTrabajador(String numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    public String getAcademia() {
        return academia;
    }
    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getGrado() {
        return grado;
    }
    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    @Override
     public String toString(){
         return getNombre()+ " "+ getApellido()+ " "+ getSexo()+ " "+ getCurp()+ " "+ getHorario()+ " "+ getEdad()+ 
                 " "+ getTelefono()+ " "+ getNumTrabajador()+ " "+ getAcademia()+ " "+ getClave()+ ""+ getGrado();
     }
    
}
