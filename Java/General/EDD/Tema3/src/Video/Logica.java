package Video;

import java.util.LinkedList;
import java.util.Scanner;

public class Logica implements Acciones{

    private static Scanner cs= new Scanner(System.in);
    private static LinkedList<Video> linLis= new LinkedList<>();
    
    @Override
    public void Registrar() {
        System.out.println("Ingresa El Nombre");
         String nombre= cs.next();
        System.out.println("Ingresa La Duracion");
         String duracion= cs.next();
        System.out.println("Ingresa El Genero");
         String genero= cs.next();
        System.out.println("Ingresa El Canal");
         String canal= cs.next();
        System.out.println("Ingresa La Fecha");
         String fecha= cs.next();
        
        linLis.add(new Video(nombre, duracion, genero, canal, fecha));
        System.out.println("Registro Exitoso!!");
    }

    @Override
    public void Mostrar() {
        System.out.println("Los Videos Son: "+ linLis);
    }

    @Override
    public void VerElemento() {
        System.out.println("Ingresa Numero De Video A Eliminar");
         int id= cs.nextInt();
        if(linLis.get(id)!= null)
            System.out.println("El Elemento Se Encontro: "+ linLis.get(id));
        else
            System.out.println("No Se Encontro El Elemento");
    }

    @Override
    public void Eliminar() {
        System.out.println("Ingresa Numero De Video A Eliminar");
         int id= cs.nextInt();
        linLis.remove(id);
        System.out.println("Se Elimino El Elemento");
    }

    @Override
    public void Cantidad() {
        System.out.println("La Cantidad De Videos Son: "+ linLis.size());
    }

    @Override
    public void Estado() {
        if(!linLis.isEmpty())
            System.out.println("Hay Videos");
        else
            System.out.println("No Hay Videos");
    }

    @Override
    public void EliminarTodo() {
        linLis.clear();
        System.out.println("Se Elimino Todos Los Videos");
    }

    @Override
    public void Salir() {
        System.out.println("Saliste-->");
        return;
    }
    
}
