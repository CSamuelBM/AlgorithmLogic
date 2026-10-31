package Ex_Diagnostico;

import java.util.Scanner;

public class Doctor extends Persona implements Operaciones{
    private static Scanner cs= new Scanner(System.in);
    
    private String name;
    private boolean bandera;
    private int pos;
    private Doctor[] Arr= new Doctor[5];
    
    private String especialidad, turno;
    
    public Doctor(){
        especialidad= "";
        turno= "";
    }
    
    public Doctor(String nombre, long telefono, String especialidad, String turno){
        super(nombre, telefono);
        setEspecialidad(especialidad);
        setTurno(turno);
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public void Registrar() {
       if(pos> Arr.length){
           System.out.println("Maximo de Registros");
       }else{ 
        System.out.println("Nombre");
         nombre= cs.next();
        System.out.println("Teléfono");
         telefono= cs.nextLong();
        System.out.println("Especialidad");
         especialidad= cs.next();
        System.out.println("Turno");
         turno= cs.next();
         
        Arr[pos]= new Doctor(nombre, telefono, especialidad, turno);
        pos ++;
       }
    }

    @Override
    public void Actualizar() {
      if(pos== 0){
          System.out.println("No Hay Registros");
      }else{
        System.out.println("Ingresa Tu Nombre");
         name= cs.next();
         bandera= false;
        for(int i= 0; i< pos; i++){
            if(name.equals(nombre)){
                System.out.println("Cambio De Telefono");
                 telefono= cs.nextLong();
                bandera= true;
            }
        }
        if(!bandera){
            System.out.println("No Se Actualizo");
        }else{
            System.out.println("Se Actualizo");
        }
      }
    }

    @Override
    public void Buscar() {
      if(pos== 0){
          System.out.println("No Hay Registros");
      }else{
        System.out.println("Ingresa Tu Nombre");
         name= cs.next();
         bandera= false;
        for(int i= 0; i< pos; i++){
            if(name.equals(nombre)){
                bandera= true;
            }
        }
        if(!bandera){
            System.out.println("No Se Encontro");
        }else{
            System.out.println("Se Encontro");
        }
      }
    }
    
}
