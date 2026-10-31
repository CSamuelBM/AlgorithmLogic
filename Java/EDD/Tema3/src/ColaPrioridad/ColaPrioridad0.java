package ColaPrioridad;

import java.util.Scanner;
import java.util.PriorityQueue;

public class ColaPrioridad0 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        PriorityQueue<Integer> colaPrioridad= new PriorityQueue<>();
        
        colaPrioridad.offer(3);
        colaPrioridad.offer(1);
        colaPrioridad.offer(2);
        colaPrioridad.offer(5);
        colaPrioridad.offer(4);
        
        System.out.println("Cola De Prioridad: "+ colaPrioridad);
        
        System.out.println("Primer Elementos: "+ colaPrioridad.peek());
        
        colaPrioridad.poll();
        
        System.out.println("Cola De Prioridad Despues De Eliminar Elemento: "+ colaPrioridad);
        
        System.out.println("Se Encuntra El Elemento: "+ colaPrioridad.contains(3));
        
        System.out.println("Cantidad De Elementos: "+ colaPrioridad.size());
        
        colaPrioridad.clear();
        
        System.out.println("Hay Elementos En Cola: "+ !colaPrioridad.isEmpty());
        
    }
}
