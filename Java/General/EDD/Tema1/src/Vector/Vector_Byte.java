package Vector;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Vector_Byte {
    public static void main(String[]args){
        Vector <Byte> obVb= new Vector<> ();
        Scanner cs= new Scanner(System.in);
        
        int opc= 0;
        byte dia, diaEliminar;
        
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
                   System.out.println("Ingresa Un Dia");
                    dia= cs.nextByte();
                   obVb.add(dia);
                    System.out.println("Registro Exitoso!!");
                break;
               case 2:
                   System.out.println("Dia A Eliminar");
                    diaEliminar= cs.nextByte();
                   obVb.removeAll(Collections.singleton(diaEliminar));
                    System.out.println("Eliminacion Exitosa!!");
                break;
               case 3:
                   System.out.println("El Tamaño Es: "+ obVb.size());   
                break;
               case 4:
                   System.out.println("Los Dias: "+ obVb);   
                break;
               case 5:
                   obVb.clear();
                    System.out.println("Se Limpio Exitosa Mente!!");
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
