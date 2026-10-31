package ColaPrioridad;

import java.util.Scanner;
import java.util.PriorityQueue;

public class ColaPrioridad4 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        PriorityQueue<Boolean> colaPrioridad= new PriorityQueue<>();
        
         int opc= 0;
        
        while(opc!= 8){
            System.out.println("1.- Registrar");
            System.out.println("2.- Mostrar");
            System.out.println("3.- Ver Elemento");
            System.out.println("4.- Eliminar");
            System.out.println("5.- Buscar Elemento");
            System.out.println("6.- Cantidad De Elementos");
            System.out.println("7.- Eliminar Todo");
            System.out.println("8.- Salir");
             opc= cs.nextInt();
          switch(opc){
              case 1:
                  System.out.println("Luz Encendida");
                   boolean luzEncendida= cs.nextBoolean();
                   
                  colaPrioridad.offer(luzEncendida);
                  System.out.println("Registro Exitoso!!");
                break;
              case 2:
                  System.out.println("Los Elementos De La Cola Son: "+ colaPrioridad);
                break;
              case 3:
                  System.out.println("El Primer Elemento De La Cola Es: "+ colaPrioridad.peek());
                break;
              case 4:
                  colaPrioridad.poll();
                  System.out.println("Se Elimino El Primer Elemento De La Cola");
                break;
              case 5:
                  System.out.println("Ingresa Elemnto A Buscar");
                   boolean luzEncendiadB= cs.nextBoolean();
                   
                  if(colaPrioridad.contains(luzEncendiadB))
                      System.out.println("Se Encontro El Elemento");
                  else 
                      System.out.println("No Se Encontro El Elemento");
                break;
              case 6:
                  System.out.println("La Cantidad De Elementos Son: "+ colaPrioridad.size());
                break;
              case 7:
                  colaPrioridad.clear();
                  System.out.println("Se Elimino Todo Elemento De Cola");
                break;
                  
              case 8:
                  System.out.println("Saliste-->");
                return;
              default:
                  System.out.println("Opcion No Valida");
          }   
        }
        
    }
}
