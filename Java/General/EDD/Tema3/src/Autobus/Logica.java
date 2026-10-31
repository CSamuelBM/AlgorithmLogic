package Autobus;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Logica implements Acciones{
    
    private static Scanner cs= new Scanner(System.in);
    private static Queue<Autobus> cola= new LinkedList<>();

    @Override
    public void Registrar() {
            System.out.println("Ingresa El Nombre Del Chofer");
                String nombreChofer= cs.nextLine();
            System.out.println("Ingresa El Lugar De Partida");
                String lugarPartida= cs.nextLine();
            System.out.println("Ingresa El Lugar De Llegada");
                String lugarLlegada= cs.nextLine();
            System.out.println("Ingresa La Hora De Partida");
                String horaPartida= cs.nextLine();
            System.out.println("Ingresa La Hora De Llegada");
                String horaLlegada= cs.nextLine();
            
            Autobus autobus= new Autobus(nombreChofer, lugarPartida, lugarLlegada, horaPartida, horaLlegada);   
            
            cola.offer(autobus);
            
            System.out.println("Registro Del Autbous Exitoso");
    }

    @Override
    public void Mostrar() {
        if(!cola.isEmpty())
            System.out.println("Las Autbobuses En Cola Son: "+ cola);
        else
            System.out.println("No Hay Autobuses En La Cola");
    }

    @Override
    public void VerElemento() {
        if(cola.peek()!= null)
            System.out.println("La Primera Autobus En Cola Es: "+ cola.peek());
        else
            System.out.println("No Hay Autobuses En La Cola");
    }

    @Override
    public void Cantidad() {
        if(!cola.isEmpty())
            System.out.println("La Cantidad De Autobuses En Cola Son: "+ cola.size());
        else 
            System.out.println("No Hay Autobuses En La Cola");
    }

    @Override
    public void Estado() {
        if(!cola.isEmpty())
            System.out.println("Hay Autobuses En La Cola");
        else 
            System.out.println("No Hay Autobuses En La Cola");
    }

    @Override
    public void Eliminar() {
        if(cola.poll()!= null){
            cola.poll();
            System.out.println("Se Elimino La Primera Autobus De La Cola");
        }else
            System.out.println("No Hay Autobuses En La Cola");
    }

    @Override
    public void Salir() {
        System.out.println("Saliste-->");
        return;
    }
    
}
