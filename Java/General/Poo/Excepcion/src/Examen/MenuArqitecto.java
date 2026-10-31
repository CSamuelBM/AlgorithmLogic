package Examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuArqitecto {
     Scanner cs= new Scanner(System.in);
    
    private int opc= 0;
    Arquitecto ObArqitecto= new Arquitecto();
    private boolean continuar;
    
    public void Menu(){
      
        while(true){
          try{
           continuar= false;
             System.out.println("");
             System.out.println("1.- Registrar");
             System.out.println("2.- Mostrar");
             System.out.println("3.- Buscar");
             System.out.println("4.- Actualizar");
             System.out.println("5.- Volver");
             System.out.print("Opcion: "); 
              opc= cs.nextInt();
            switch(opc){
                case 1:
                     ObArqitecto.Registrar();
                    break;
                case 2:
                     ObArqitecto.Mostrar();
                    break;
                case 3:
                     ObArqitecto.Buscar();
                    break;
                case 4:
                     ObArqitecto.Actualizar();
                    break;
                case 5:
                     System.out.println("Volviste");
                    break;
                default:
                    System.out.println("Opcion No Valida");
            }
        }catch(InputMismatchException ex){
           System.err.println("Debe Ser Un Numero(1-5)");
           cs.next();
            continuar= true;
        }
       }
    }
    
}
