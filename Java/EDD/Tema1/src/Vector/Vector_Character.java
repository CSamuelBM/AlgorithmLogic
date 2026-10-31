package Vector;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Vector_Character {
    public static void main(String[]args){
        Vector <Character> obVc= new Vector<> ();
        Scanner cs= new Scanner(System.in);
        
        int opc= 0;
        char alfabeto, letraEliminar;
        
        while(opc!= 6){
            System.out.println("1.-Registrar");
            System.out.println("2.-Eliminar");
            System.out.println("3.-Tamaño");
            System.out.println("4.-Mostrar");
            System.out.println("5.-Limpiar");
            System.out.println("6.-Salir");
             opc= cs.nextByte();
           switch(opc){
               case 1:
                   System.out.println("Letra");   
                     alfabeto= cs.next().charAt(0);
                    obVc.add(alfabeto);
                    System.out.println("Accion Exitosa!!");
                break;
               case 2:
                   System.out.println("Ingresa Una Letra A Eliminar");
                    letraEliminar= cs.next().charAt(0);
                   obVc.removeAll(Collections.singleton(letraEliminar));
                   System.out.println("Accion Exitosa!!");
                break;
               case 3:
                   System.out.println("El Tamaño Es: "+ obVc.size());
                break;
               case 4:
                   System.out.println("Letras: "+ obVc);   
                break;
               case 5:
                   obVc.clear();
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
