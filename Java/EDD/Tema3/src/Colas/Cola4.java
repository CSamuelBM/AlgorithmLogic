package Colas;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Cola4 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        Queue<Boolean> cola= new LinkedList<>();
        
        int opc= 0;
        
        while(opc!= 7){
            System.out.println("1.- Registrar");
            System.out.println("2.- Mostrar");
            System.out.println("3.- Ver Primer Elemento");
            System.out.println("4.- Estado");
            System.out.println("5.- Cantidad");
            System.out.println("6.- Eliminar");
            System.out.println("7.- Salir");
             opc= cs.nextInt();
          switch(opc){
              case 1:
                  System.out.println("Ingresa Si Tu Luz Esta Encendida");
                   boolean luzEncendida= cs.nextBoolean();
                  cola.offer(luzEncendida);
                  System.out.println("Registro Exitoso!!");
                break;
              case 2:
                  System.out.println("Los Elementos En Cola Son: "+ cola);
                break;
              case 3:
                  System.out.println("El Primer Elemento De La Cola Es: "+ cola.peek());
                break;
              case 4:
                  if(!cola.isEmpty())
                      System.out.println("Hay Elementos En Cola");
                  else System.out.println("No Hay Elementos En Cola");
                break;
              case 5:
                  System.out.println("La Cantidad De Elementos En Cola Son: "+ cola.size());
                break;
              case 6:
                  cola.poll();
                  System.out.println("Se Fue El Primer Elemento De La Cola");
                break;
              
              case 7:
                  System.out.println("Saliste-->");
                return;
              default:
                  System.err.println("Opcion No Valida");
          }   
        }
        
    }
}
