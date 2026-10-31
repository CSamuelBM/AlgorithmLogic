package BusHasMap;

import java.util.Scanner;

public class Menu {
    
    public static void Principal(){
        Scanner cs= new Scanner(System.in);
        
        int opc= 0;
        
        while(opc!= 2){
            System.out.println("1- Metodos De Ordenamiento.");
            System.out.println("2- Salir.");
            opc= cs.nextByte();
            switch(opc){
                case 1:
                    Metodos.Ordenamiento();
                break;
                case 2:
                    System.out.println("Gracias Por Usar La Busqueda Has Map");
                return;
                default:
                    System.err.println("Opcion No Valida");
            }
        }
        
    }
    
}
