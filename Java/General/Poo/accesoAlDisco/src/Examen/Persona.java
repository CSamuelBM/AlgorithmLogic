package Examen;

import java.util.Scanner;

public class Persona {
    public static void main(String[]args){      
        
        Scanner cs= new Scanner(System.in);
                         
          Menu MenuAlumno= new Menu();
          int opc= 0;
          
          while(opc!= 2){
              System.out.println("1.- Persona");
              System.out.println("2.- Salir");
              System.out.print("Opcion: ");
              opc = cs.nextInt();
             switch(opc){
                case 1:    
                    MenuAlumno.MenuPersona();
                 break;                
                case 2:
                    System.out.println("Saliste");
                    return;
                default:
                    System.out.println("Opcion No Valida");
             }
          }
          
    }
}