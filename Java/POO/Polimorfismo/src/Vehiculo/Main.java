package Vehiculo;

import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int opc;
        
        ControllerCarro ObControllerCarro= new ControllerCarro();
        
        while(true){
            System.out.println("Carro....1");
            System.out.println("Triciclo...2");
            System.out.println("Salir....3");
           switch(opc= cs.nextInt()){
               case 1:
                   ObControllerCarro.MenuCarro();
                   break;
               case 2:
                   break;
               case 3:
                   System.out.println("Saliendo");
                   return;
               default:
                   System.out.println("Opcion No Valida");
           }
        }
        
    }
    
}
