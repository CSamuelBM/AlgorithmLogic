package Escuela;

import java.util.Scanner;

public class Lista {
    private static Scanner cs= new Scanner(System.in);
    
    public static String opcEspecialidad(){
        int opcE;
        String especialidad= " ";
       do{
           System.out.println("Selecciona Tu Especialidad");
             System.out.println("1.- Sistemas Computacionales");
             System.out.println("2.- Inovacion Agricola Sustentables");
             System.out.println("3.- Gestion Empresarial");
             System.out.println("4.- Quimica");
             System.out.println("5.- Industrial");
              opcE= cs.nextInt();
            switch(opcE){
                case 1:
                    especialidad= "Sistemas Computacionales";
                  break;
                case 2:
                    especialidad= "Inovacion Agricola Sustentables";
                  break;
                case 3:
                    especialidad= "Gestion Empresarial";
                  break; 
                case 4:
                    especialidad= "Quimica";
                  break;   
                case 5:
                    especialidad= "Industrial";
                  break;   
                default:
                    System.out.println("Opcion No Valida");
                  break;  
            }  
        }while(especialidad.equals(" "));
         return especialidad;
    }
    
    public static String opcCarrera(){
        int opcC;
        String carrera= " ";
       do{
           System.out.println("Selecciona Tu Carrera");
             System.out.println("1.- Ing. En Sistemas Computacionales");
             System.out.println("2.- Ing. En Inovacion Agricola Sustentables");
             System.out.println("3.- Ing. Gestion Empresarial");
             System.out.println("4.- Ing. Quimica");
             System.out.println("5.- Ing. Industrial");
             opcC= cs.nextInt();
            switch(opcC){
                case 1:
                    carrera= "Ing. En Sistemas Computacionales";
                  break;
                case 2:
                    carrera= "Ing. En Inovacion Agricola Sustentables";
                  break;
                case 3:
                    carrera= "Ing. Gestion Empresarial";
                  break;
                case 4:
                    carrera= " Ing. Quimica";
                  break;
                case 5:
                    carrera= "Ing. Industrial";
                  break; 
                default:
                    System.out.println("Opcion No Validad");
                  break;
            } 
       }while(carrera.equals(" "));
        return carrera;
    }
    
    public static String opcAcademia(){
       int opcA;
       String academia= " ";
      do{
         System.out.println("Selecciona Tu Academia");
             System.out.println("1.- Sistemas Computacionales");
             System.out.println("2.- Inovacion Agricola Sustentables");
             System.out.println("3.- Gestion Empresarial");
             System.out.println("4.- Quimica");
             System.out.println("5.- Industrial");
              opcA= cs.nextInt();
            switch(opcA){
                case 1:
                    academia= "Sistemas Computacionales";
                 break;
                case 2:
                    academia= "Inovacion Agricola Sustentables";
                 break;
                case 3:
                    academia= "Gestion Empresarial";
                 break;   
                case 4:
                    academia= "Quimica";
                 break;
                case 5:
                    academia= "Industrial";
                 break;   
            }  
      }while(academia.equals(" "));
        return academia;
    }
    
    public static String Especialidad(){
        int opcEs;
        String especialidad= " ";
       do{
          System.out.println("Selecciona Tu Especialidad"); 
            System.out.println("1.- Tecnologia");
            System.out.println("2.- Agricultura");
            System.out.println("3.- Administracion");
            System.out.println("4.- Matematicas");
            System.out.println("5.- Investigacion");
             opcEs= cs.nextInt();
           switch(opcEs){
                case 1:
                    especialidad= "Tecnologia";
                 break;
                case 2:
                    especialidad= "Agricultura";
                 break; 
                case 3:
                    especialidad= "Administracion";
                 break; 
                case 4:
                    especialidad= "Matematicas";
                 break; 
                case 5:
                    especialidad= "Investigacion";
                 break; 
           } 
       }while(especialidad.equals(" ")); 
        return especialidad;
    }
    
    public static String opcHorario(){
        int opcH;
        String horario= " ";
       do{
           System.out.println("Selecciona Tu Horario");
             System.out.println("1.- 7:50 A 3:20");
             System.out.println("2.- 8:50 A 4:10");
             System.out.println("3.- 9:45 A 5:10");
             System.out.println("4.- 10:35 A 6:00");
             System.out.println("5.- 11:30 A 7:00");
             opcH= cs.nextInt();
            switch(opcH){
                case 1:
                    horario= "7:50 - 3:20";
                  break;
                case 2:
                    horario= "8:50 - 4:10";
                  break;  
                case 3:
                    horario= "9:45 - 5:10";
                  break;  
                case 4:
                    horario= "10:35 - 6:00";
                  break;  
                case 5:
                    horario= "11:30 - 7:00";
                  break;    
            } 
       }while(horario.equals(" "));
        return horario;
    }
    
}
