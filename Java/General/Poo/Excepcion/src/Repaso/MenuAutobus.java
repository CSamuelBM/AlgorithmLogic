package Repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuAutobus {
    Scanner cs= new Scanner(System.in);
    
    private int opc= 0;
    Autobus ObAutobus= new Autobus();
    private boolean continuar;
    
    public void Menu(){
        while(opc!= 5){
            try{
                continuar= false;
                System.out.println("<-Autobus->");
                 System.out.println("1.- Registrar");
                 System.out.println("2.- Mostrar");
                 System.out.println("3.- Buscar");
                 System.out.println("4.- Actualizar");
                 System.out.println("5.- <--Volver");
                System.out.print("Opcion: ");
                 opc= cs.nextInt();
            switch(opc){
                case 1:
                    ObAutobus.Registrar();
                     break;
                case 2:
                    ObAutobus.Mostrar();
                     break;
                case 3:
                    ObAutobus.Buscar();
                     break;
                case 4:
                    ObAutobus.Actualizar();
                     break;
                case 5:
                    System.out.println("Volviendo...");
                     break;
                default:
                    System.out.println("Opcion No Valida");
            }
           }catch(InputMismatchException ex){
                System.err.println("Debe Ser Un Numero Entre(1-5).");
                 cs.next();
                continuar= true; 
           }catch(NumberFormatException ex){
                System.err.println("Ingresa Un Numero Valido.");
                 cs.next();
                continuar= true;
           }
        }while(continuar);
    }
    
}
