package Colas;

import java.util.Queue;
import java.util.LinkedList;

public class Cola0 {
    public static void main(String[]args){
        Queue<String> cola= new LinkedList<>();
        
        cola.offer("Roberto");
        cola.offer("Samuel");
        cola.offer("America");
        
        System.out.println("Cola: "+ cola);
        
        String remover= cola.poll();
        System.out.println("Nombre Eliminado: "+ remover);
        
        System.out.println("Cola Despues De Eliminar: "+ cola);
        
        cola.offer("Manuel");
        
        String verElemento= cola.peek();
        System.out.println("Primer Elemento: "+ verElemento);
        
        System.out.println("Despues De Ver Elemento: "+ cola);
        
    }
}
