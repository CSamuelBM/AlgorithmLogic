package Cine;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Logica implements Acciones{

    private static Scanner cs= new Scanner(System.in);
    private static PriorityQueue<Cine> colaPrioridad= new PriorityQueue<>();
    
    @Override
    public void Registrar() {
        System.out.println("Ingresa El Nombre De La Pelicula");
          String nombrePelicula= cs.next();
        System.out.println("Ingresa El Dia");
          String dia= cs.next();
        System.out.println("Ingresa La Hora De Inicio");
          String horaInicio= cs.next();
        System.out.println("Ingresa La Hora Del Fin");
          String horaFin= cs.next();
        System.out.println("Ingresa El Precio");
          double precio= cs.nextDouble();
          
        colaPrioridad.offer(new Cine(nombrePelicula, dia, horaInicio, horaFin, precio));
        System.out.println("Registro Exitoso!!");
    }

    @Override
    public void Mostrar() {
        if(!colaPrioridad.isEmpty())
            System.out.println("Las Peliculas Son: "+ colaPrioridad);
        else
            System.out.println("No Hay Registros");
    }

    @Override
    public void VerElemento() {
        if(colaPrioridad.peek()!= null)
            System.out.println("La Pelicula Mas Barata Es: "+ colaPrioridad.peek());
        else
            System.out.println("No Hay Registros");
    }

    @Override
    public void Cantidad() {
        if(!colaPrioridad.isEmpty())
            System.out.println("La Cantidad De Peliculas Son: "+ colaPrioridad.size());
        else
            System.out.println("No Hay Registros");
    }

    @Override
    public void Estado() {
        if(!colaPrioridad.isEmpty())
            System.out.println("Si Hay Peliculas: ");
        else
            System.out.println("No Hay Registros");
    }

    @Override
    public void Eliminar() {
        if(colaPrioridad.poll()!= null){
            colaPrioridad.poll();
            System.out.println("Se Fue Una Pelicula De La Cola");
        }
        else
            System.out.println("No Hay Registros");
    }

    @Override
    public void EliminarTodo() {
        if(!colaPrioridad.isEmpty()){
            colaPrioridad.clear();
            System.out.println("Se Fueron Todas La Peliculas En Cola");
        }
        else
            System.out.println("No Hay Registros");
    }

    @Override
    public void Salir() {
        System.out.println("Saliste-->");
        return;
    }
    
}