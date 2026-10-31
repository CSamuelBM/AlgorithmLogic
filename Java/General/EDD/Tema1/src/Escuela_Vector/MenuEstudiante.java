package Escuela_Vector;

import java.util.Scanner;

public class MenuEstudiante {
    private Estudiante obE= new Estudiante();
    
    public void MenuEstudiante(){
        Scanner cs= new Scanner(System.in);
        int opc= 0;
        
        String nombre, apellido, sexo, curp, horario, numControl, carrera, especialidad;
        int edad;
        long telefono;
        
        String clave;
        
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
                  System.out.println("Numero De Control");
                   numControl= cs.next();
                  System.out.println("Carrera");
                   carrera= cs.next();
                  System.out.println("Especialidad");
                   especialidad= cs.next();
                  
                  Estudiante agg= new Estudiante(nombre, apellido, sexo, curp, horario, edad, telefono, numControl,
                                                     carrera, especialidad);
                  obE.getObVe().add(agg);
                  System.out.println("Registro Exitoso!!");
                break;
              case 2:
                if(obE.getObVe().isEmpty()){
                    System.out.println("No Hay Registro");
                }else{
                 System.out.println("Ingresa Numero De Control A Eliminar");
                   clave= cs.next();
                  Estudiante encontrado= null; 
                   for(Estudiante e : obE.getObVe()){
                       if(e.getNumControl().equals(clave)){
                            encontrado = e;
                           break;
                       }
                   }
                   if(encontrado!= null){
                       obE.getObVe().remove(encontrado);
                       System.out.println("Se Elimino");
                   }else{
                       System.out.println("No Se Encontro");
                   }
                }
                break;
              case 3:
                  System.out.println("El Tamaño Es: "+ obE.getObVe().size());
                break;
              case 4:
                 if(obE.getObVe().size()< 1){
                  System.out.println("No Hay Registro");
                 }else{
                   for(Estudiante e : obE.getObVe()){
                      System.out.println("Los Datos: "+ e.toString());
                    }
                  }
                break;
              case 5:
                 if(obE.getObVe().size()< 1){
                     System.out.println("No Hay Registros");
                 }else{
                  obE.getObVe().clear();
                  System.out.println("Accion Exitosa!!");
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
