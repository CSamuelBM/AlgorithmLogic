package InfDoctores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCirujano {
    Scanner cs= new Scanner(System.in);
    
    private int opc= 0;
    Cirujano ObCirujano= new Cirujano();
    private boolean continuar;
    
    public void Menu(){
      
        while(opc!= 5){
          try{
              continuar= false;
            System.out.println("<--Cirujano-->");
             System.out.println("1.- Registrar.");
             System.out.println("2.- Mostrar.");
             System.out.println("3.- Buscar.");
             System.out.println("4.- Actualizar.");
             System.out.println("5.- <--Volver.");
            System.out.print("Opcion: ");
             opc= cs.nextInt();
            switch(opc){
                case 1:
                    ObCirujano.Registrar();
                    break;
                case 2:
                     ObCirujano.Mostrar();
                    break;
                case 3:
                     ObCirujano.Buscar();
                    break;
                case 4:
                     ObCirujano.Actualizar();
                    break;
                case 5:
                    System.out.println("Volviste...");
                    break;
                default:
                    System.out.println("Debe Ser Un Numero Entre(1-5).");
            }
        }catch(InputMismatchException ex){
           System.err.println("Debe Ser Un Numero Entre(1-5).");
            cs.next();
           continuar= true;
        }
       }while(continuar);
    }
    
}
