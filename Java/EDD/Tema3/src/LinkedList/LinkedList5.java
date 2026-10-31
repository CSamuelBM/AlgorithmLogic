package LinkedList;

import java.util.Scanner;
import java.util.LinkedList;

public class LinkedList5 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        LinkedList<Double> linLis= new LinkedList<>();
        
        int opc= 0;
        
        while(opc!= 10){
            System.out.println("1.- Registrar");
            System.out.println("2.- Mostrar");
            System.out.println("3.- Ver Elemento");
            System.out.println("4.- Actualizar");
            System.out.println("5.- Eliminar");
            System.out.println("6.- Cantidad");
            System.out.println("7.- Buscar");
            System.out.println("8.- Estado");
            System.out.println("9.- Eliminar Todo");
            System.out.println("10.- Salir");
             opc= cs.nextInt();
           switch(opc){
               case 1:
                    System.out.println("Ingresa El Precio");
                     double precio= cs.nextDouble();
                    linLis.add(precio);
                    System.out.println("Registro Exitoso!!");
                   break;
               case 2:
                    System.out.println("Lo Elementos Son: "+ linLis);
                   break;
               case 3:
                    System.out.println("Ingresa Indice Del Elemento");
                     int indice1= cs.nextInt();
                    System.out.println("El Elemento Es: "+ linLis.get(indice1)); 
                   break;
               case 4:
                    System.out.println("Ingresa Indice Del Elemento");
                     int indice2= cs.nextInt();
                    System.out.println("Ingresa Nuevo Elemnto");
                     double precioN= cs.nextDouble();
                    linLis.set(indice2, precioN);
                   break;
               case 5:
                    linLis.remove();
                    System.out.println("Se Elimino Un Elemento");
                   break;
               case 6:
                    System.out.println("Cantidad De Elementos: "+ linLis.size());
                   break; 
               case 7:
                    System.out.println("Ingresa Elemento A Buscar");
                     double precioB= cs.nextDouble();
                    if(linLis.contains(precioB))
                        System.out.println("Se Encontro");
                    else
                        System.out.println("No Se Encontro");
                   break;
               case 8:
                    if(!linLis.isEmpty())
                        System.out.println("Hay Elementos");
                    else
                        System.out.println("No Hay Elementos");
                   break;
               case 9:
                    linLis.clear();
                    System.out.println("Se Elimino Todo");
                   break; 
               case 10:
                     System.out.println("Saliste-->");
                   return;
               default:
                   System.out.println("Opcion No Valida");
           }  
        }
        
    }
}
