package Repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int opc= 0;
        boolean continuar;
        MenuCamion ObCamion= new MenuCamion();
        MenuAutobus ObAutobus= new MenuAutobus();
        
        while(opc!= 3){
            try{
                continuar= false;
                System.out.println("<--Bienvenido->>");
                 System.out.println("1.- Camino.");
                 System.out.println("2.- Autobus.");
                 System.out.println("3.- Salir-->");
                System.out.print("Opcion: "); 
                 opc= cs.nextInt();
            switch(opc){
                case 1:
                     ObCamion.Menu();
                    break;
                case 2:
                     ObAutobus.Menu();
                    break;
                case 3:
                    System.out.println("Saliste....");
                    return;
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
        }while(continuar);
       }
    }
}
