package Escuela_Vector;

import java.util.Scanner;

public class MenuDocente {
    private Docente obD= new Docente();
    
    public void MenuDocente(){
        Scanner cs= new Scanner(System.in);
        
        String nombre, apellido, sexo, curp, horario; 
        int edad; 
        long telefono; 
        String numTrabajador, academia, clave, grado;
        
        int opc= 0;
        String numControl;
        
        while(opc!= 6){
            System.out.println("1.-Registrar");
            System.out.println("2.-Eliminar");
            System.out.println("3.-Tamaño");
            System.out.println("4.-Mostrar");
            System.out.println("5.-Limpiar");
            System.out.println("6.-Salir");
            System.out.print("Elige una opción: ");
             opc= cs.nextByte();
          switch(opc){
              case 1:
                  System.out.println("Nombre"); 
                   nombre= cs.next();
                  System.out.println("Apellido");  
                   apellido= cs.next();
                  System.out.println("Sexo");  
                   sexo= cs.next();
                  System.out.println("Curp");  
                   curp= cs.next();
                  System.out.println("Horario");  
                   horario= cs.next();
                  System.out.println("Edad");  
                   edad= cs.nextInt();
                  System.out.println("Telefono");  
                   telefono= cs.nextLong();
                  System.out.println("Numero De Trabajador");  
                   numTrabajador= cs.next();
                  System.out.println("Academia");  
                   academia= cs.next();
                  System.out.println("Clave");
                   clave= cs.next();
                  System.out.println("Grado");
                   grado= cs.next();
                   
                  Docente agg= new Docente(nombre, apellido, sexo, curp, horario, edad, telefono, numTrabajador, 
                                             academia, clave, grado);
                  obD.getObVd().add(agg);
                  System.out.println("Registro Exitoso!!");
                break;
              case 2:
                  if(obD.getObVd().isEmpty()){
                      System.out.println("No Hay Registro");
                  }else{
                      System.out.println("Numero De Trabajador A Eliminar");
                       numControl= cs.next();
                      Docente eliminar= null;
                     for(Docente d : obD.getObVd()){
                         if(d.getNumTrabajador().equals(numControl)){
                              eliminar= d;
                              break;
                         }
                     }
                     if(eliminar!= null){
                          obD.getObVd().remove(eliminar);
                         System.out.println("Se Elimino");
                     }else{
                         System.out.println("No Se Encontro");
                     }
                  }
                break;
              case 3:
                  if(obD.getObVd().isEmpty()){
                      System.out.println("No Hay Registro");
                  }else{
                    System.out.println("El Tamaño Es: "+ obD.getObVd().size());     
                  }
                break;
              case 4:
                  if(obD.getObVd().isEmpty()){
                      System.out.println("No Hay Registro");
                  }else{
                      System.out.println(obD.getObVd().toString());
                       System.out.println("Accion Exitosa!!");
                  }  
                break;
              case 5:
                  if(obD.getObVd().isEmpty()){
                      System.out.println("No Hay Regristros");
                  }else{
                     obD.getObVd().clear();
                     System.out.println("Accion Exitosa");     
                  }
                break;
              case 6:
                  System.out.println("Saliste");  
                break;
              default:
                  System.err.println("Opcion No Valida");
          }   
        }
        
    }
    
}
