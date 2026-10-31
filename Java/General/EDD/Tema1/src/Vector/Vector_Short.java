package Vector;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Vector_Short {
    public static void main(String[]args){
        Vector <Short> obVs= new Vector<> ();
        Scanner cs= new Scanner(System.in);
        
        int opc= 0;
        short numero, numeroEliminar;
        
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
                  System.out.println("Ingresa Un Numero");  
                   numero= cs.nextShort();
                  obVs.add(numero);
                   System.out.println("Registro Exitoso!!");
                break;
              case 2:
                  System.out.println("Ingresa Numero A Eliminar");
                   numeroEliminar= cs.nextShort();
                  obVs.removeAll(Collections.singleton(numeroEliminar));
                   System.out.println("Eliminado Exitoso!!");
                break;
              case 3:
                  System.out.println("El Tamaño Es: "+ obVs.size());  
                break;
              case 4:
                  System.out.println("Los Numero: "+ obVs);  
                break;
              case 5:
                  obVs.clear();
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
