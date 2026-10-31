package Vector;

import java.util.Collections;
import java.util.Vector;
import java.util.Scanner;

public class Vector_Float {
    public static void main(String[]args){
        Vector <Float> obVf= new Vector<> ();
        Scanner cs= new Scanner(System.in);
        
        int opc= 0;
        float temperatura, temperaturaEliminar;
        
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
                  System.out.println("Ingresa Temperatura");
                   temperatura= cs.nextFloat();
                  obVf.add(temperatura);
                   System.out.println("Accion Exitosa!!");
                break;
              case 2:
                  System.out.println("Eliminar Temperatura");
                   temperaturaEliminar= cs.nextFloat();
                  obVf.removeAll(Collections.singleton(temperaturaEliminar));
                   System.out.println("Accion Exitosa!!");
                break;
              case 3:
                  System.out.println("El Tamaño Es: "+ obVf.size());  
                break;
              case 4:
                  System.out.println("Temperaturas: "+ obVf);  
                break;
              case 5:
                  obVf.clear(); 
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
