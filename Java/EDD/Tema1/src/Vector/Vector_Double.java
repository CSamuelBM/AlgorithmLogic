package Vector;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Vector_Double {
    public static void main(String[]args){
        Vector <Double> obVd= new Vector<> ();
        Scanner cs= new Scanner(System.in);
        
        int opc= 0;
        double cambio, cambioEliminar;
        
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
                   System.out.println("Ingresa El Cambio");
                    cambio= cs.nextDouble();
                   obVd.add(cambio);
                    System.out.println("Registro Exitoso!!");
                break;
               case 2:
                   System.out.println("Cambio A Eliminar");
                    cambioEliminar= cs.nextDouble();
                   obVd.removeAll(Collections.singleton(cambioEliminar));
                    System.out.println("Elinado Exitoso!!");
                break;
               case 3:
                   System.out.println("El Tamaño Es: "+ obVd.size());   
                break;
               case 4:
                   System.out.println("Cambios: "+ obVd);   
                break;
               case 5:
                   obVd.clear();
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
