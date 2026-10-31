package Ex_Diagnostico;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
         Scanner cs= new Scanner(System.in); 
        
        int opc = 0;
        Menu obM= new Menu();
        
        while(opc!= 3){
            System.out.println("  Menu  ");
            System.out.println("1.-Paciente");
            System.out.println("2.-Doctor");
            System.out.println("3.-Salir");
           opc= cs.nextInt();
          switch(opc){
              case 1:
                   obM.MenuP();
                break;
              case 2:
                   obM.MenuD();
                break;
              case 3:
                  System.out.println("Saliste");
                return;
              default:
                  System.err.println("Error");
          } 
        }
        
    }
}
