package InfDoctores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int opc= 0;
        MenuCirujano ObCirujano= new MenuCirujano();
        MenuTraumatologo ObTraumatologo= new MenuTraumatologo();
        boolean continuar= false;
        
       while(opc!= 3){
           try{  
             continuar= false;
            System.out.println("<-Bienvenido->>");
             System.out.println("1.- Cirujano.");
             System.out.println("2.- Traumatologo.");
             System.out.println("3.- Sallir-->");
            System.out.print("Opcion: ");
             opc= cs.nextInt();
          switch(opc){
              case 1:
                  ObCirujano.Menu();
                  break;
              case 2:
                   ObTraumatologo.Menu();
                  break;
              case 3:
                   System.out.println("Saliste....");
                  return;
              default:
                  System.out.println("Deber Ser Un Numero Entre(1-3)");

          }   
       }catch(InputMismatchException ex){
          System.err.println("Deber Ser Un Numero Entre(1-3)");
           cs.next();
          continuar= true;
       }    
     }while(continuar); 
   }
    
}
