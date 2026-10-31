package Vector;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Vector_Long {
    public static void main(String[]args){
        Vector <Long> obVl= new Vector<> ();
        Scanner cs= new Scanner(System.in);
        
        int opc= 0;
        long telefono, telefonoEliminar;
        
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
                   System.out.println("Ingresa Tu Telefono");
                    telefono= cs.nextLong();
                   obVl.add(telefono);
                    System.out.println("Registro Exitoso!!");
                break;
               case 2:
                   System.out.println("Telefono A Eliminar");
                    telefonoEliminar= cs.nextLong();
                   obVl.removeAll(Collections.singleton(telefonoEliminar));{
                    System.out.println("Eliminacion Exitosa!!");
               }
                break;
               case 3:
                   System.out.println("El Tamaño Es: "+ obVl.size());   
                break;
               case 4:
                   System.out.println("Los Telefonos: "+ obVl);   
                break;
               case 5:
                    obVl.clear();
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
