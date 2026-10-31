package Vector;

import java.util.Scanner;
import java.util.Vector;

public class Vector_Boolean {
    public static void main(String[]args){
        Vector <Boolean> obVb= new Vector<> ();
        Scanner cs= new Scanner(System.in);
        
        int opc= 0, pos;
        boolean condicion_luz;
        
        while(opc!= 6){
            System.out.println("1.-Registrar");
            System.out.println("2.-Eliminar");
            System.out.println("3.-Tamaño");
            System.out.println("4.-Mostrar");
            System.out.println("5.-Limpiar");
            System.out.println("6.-Salir");
             opc= cs.nextInt();
           switch(opc){
               case 1:
                   System.out.println("Condicion De Luz true/false");
                    condicion_luz= cs.nextBoolean();
                   obVb.add(condicion_luz);
                    System.out.println("Accion Exitosa!!");
                 break;
               case 2:
                   System.out.println("La Posicion");
                    pos= cs.nextInt();
                   obVb.remove(pos);
                    System.out.println("Accion Exitosa!!");
                 break;
               case 3:
                   System.out.println("El Tamaño: "+ obVb.size()+ " Posiciones");  
                 break;
               case 4:
                   System.out.println(obVb);
                    System.out.println("Accion Exitosa!!");
                 break;
               case 5:
                   obVb.clear();
                    System.out.println("Accion Exitosa!!");  
                 break;
               case 6:
                   System.out.println("Saliste");
                 return;
               default:
                   System.err.println("Opcion No Valida");
           }  
        }
        
    }
}
