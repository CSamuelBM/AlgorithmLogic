package Vector;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Vector_Integer {
    public static void main(String[]args){
        Vector <Integer> obVi= new Vector<> ();
        Scanner cs= new Scanner(System.in);
        
        int opc= 0, eliminarEdad, edad;
        
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
                    System.out.println("Tu Edad");
                     edad= cs.nextInt();
                    obVi.add(edad);
                     System.out.println("Accion Exitosa!!");
                 break;
                case 2:
                    System.out.println("Edad A Eliminar");
                     eliminarEdad= cs.nextInt();
                    obVi.removeAll(Collections.singleton(eliminarEdad));
                     System.out.println("Accion Exitosa!!");
                 break;
                case 3:
                    System.out.println("El Tamaño Es: "+ obVi.size()+ " Posiciones");   
                 break;
                case 4:
                    System.out.println("Edades: "+ obVi);   
                 break;
                case 5:
                    obVi.clear();
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
