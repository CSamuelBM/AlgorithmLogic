package Carta;

import java.util.ArrayList;
import java.util.Scanner;

public class Logica implements Acciones{

    private static Scanner cs= new Scanner(System.in);
    private static ArrayList<Carta> arrLis= new ArrayList<>();
    
    @Override
    public void Registrar() {
        System.out.println("Ingresa El Lugar");
          String lugar= cs.next();
        System.out.println("Ingresa La Fecha");
          String fecha= cs.next();
        System.out.println("Ingresa El Remitente"); 
          String remitente= cs.next();
        System.out.println("Ingresa El Destinatario");
          String destinatario= cs.next();
        System.out.println("Ingresa El Mensaje");
          String mensaje= cs.next();
          
        arrLis.add(new Carta(lugar, fecha, remitente, destinatario, mensaje));
        System.out.println("Registro Exitoso!!");
    }

    @Override
    public void Mostrar() {
        System.out.println("La Carta Es: "+ arrLis);
    }

    @Override
    public void VerElemento() {
        if(!arrLis.isEmpty()){
        System.out.println("Ingresa El Identificador De La Carta");
         int id= cs.nextInt();
        if(arrLis.get(id)!= null)
            System.out.println("El Elemento Es: "+ arrLis.get(id));
        else
            System.out.println("No Se Encontro");
        }else
            System.out.println("No Hay Registros");
    }

    @Override
    public void Eliminar() {
        System.out.println("Ingresa El Identificador De La Carta A Eliminar");
         int idE= cs.nextInt();
        arrLis.remove(idE);
        System.out.println("Se Elimino La Carta");
    }

    @Override
    public void Cantidad() {
        System.out.println("La Cantidad De Cartas Es: "+ arrLis.size());
    }

    @Override
    public void Estado() {
        if(!arrLis.isEmpty())
            System.out.println("Hay Cartas");
        else
            System.out.println("No Hay Cartas");
    }

    @Override
    public void EliminarTodo() {
        arrLis.clear();
        System.out.println("Se Elimino Todo");
    }

    @Override
    public void Salir() {
        System.out.println("Saliste-->");
        return;
    }
    
}
