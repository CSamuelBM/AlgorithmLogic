package Examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int opc= 0;
        MenuArqitecto ObArqitecto= new MenuArqitecto();
        boolean continuar;
        
        do{
           try{
               continuar= false;
             System.out.println("1.- Arqitecto");
             System.out.println("2.- Salir");
             System.out.print("Opcion: ");
              opc= cs.nextInt();
            switch(opc){
                case 1:
                     ObArqitecto.Menu();
                    break;
                case 2:
                    System.out.println("Saliste");
                    return;
                default:
                    System.out.println("Opcion No Valida");
            }
          }catch(InputMismatchException ex){
           System.err.println("Debe Ser Un Numero(1-5)");
           cs.next();
            continuar= true;
        }
        }while(continuar);
      }

}
