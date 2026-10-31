                  package Escuela_Vector;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        MenuEstudiante obMe= new MenuEstudiante();
        MenuDocente obMd= new MenuDocente();
        
        int opc= 0;
        
        while(opc!= 3){
            System.out.println("1.-Estudiante");
            System.out.println("2.-Docente");
            System.out.println("3.-Salir");
            System.out.print("Opcion: ");
             opc= cs.nextByte();
          switch(opc){
              case 1:
                  obMe.MenuEstudiante();
                break;
              case 2:
                  obMd.MenuDocente();
                break;
              case 3:
                  System.out.println("Saliste");  
                return;
              default:
                  System.err.println("Opcion No Valida");
          }   
        }
        
    }
}
