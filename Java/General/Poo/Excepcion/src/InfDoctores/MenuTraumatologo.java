package InfDoctores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuTraumatologo {
    Scanner cs= new Scanner(System.in);
    
    private int opc= 0;
    Traumatologo ObTraumatologo= new Traumatologo();
    private boolean continuar;
    
    public void Menu(){
        while(opc!= 5){
           try{ 
             continuar= false;
            System.out.println("<--Traumatologo-->");
             System.out.println("1.- Registrar.");
             System.out.println("2.- Mostrar.");
             System.out.println("3.- Buscar.");
             System.out.println("4.- Actualizar.");
             System.out.println("5.- <--Volver.");
            System.out.print("Opcion: ");
             opc= cs.nextInt();
            switch(opc){
                case 1:
                     ObTraumatologo.Registrar();
                    break;
                case 2:
                     ObTraumatologo.Mostrar();
                    break;
                case 3:
                     ObTraumatologo.Buscar();
                    break;
                case 4:
                     ObTraumatologo.Actualizar();
                    break;
                case 5:
                     System.out.println("Volviste...");
                    break;
                default:
                     System.out.println("Debe Ser Un Numero Entre(1-5)");
            }
          }catch(InputMismatchException ex){
               System.err.println("Debe Ser Un Numero Entre(1-5)");
                cs.next();
               continuar= true; 
          }
        }while(continuar);   
    }
    
}
