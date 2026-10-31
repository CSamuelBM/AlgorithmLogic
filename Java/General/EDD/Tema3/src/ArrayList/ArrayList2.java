package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        ArrayList<Byte> arrLis= new ArrayList<>();
        
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
                      System.out.println("Ingresa Tu Edad");
                       byte edad= cs.nextByte();
                      arrLis.add(edad);
                      System.out.println("Registro Exitoso!!");
                    break;
                case 2:
                      System.out.println("Los Elementos Son: "+ arrLis);
                    break;
                case 3:
                      System.out.println("Indice Del Elemento");
                       int indice1= cs.nextInt();
                      System.out.println("La Edad Es: "+ arrLis.get(indice1)); 
                    break;
                case 4:
                      System.out.println("Indice Del Elemento A Actualizar");
                       int indice2= cs.nextInt();
                      System.out.println("Ingresa Nuevo Elemento");
                        byte edadN= cs.nextByte();
                      arrLis.set(indice2, edadN);
                    break;
                case 5:
                       System.out.println("Indice Del Elemento A Eliminar");
                        int indice3= cs.nextInt();
                       arrLis.remove(indice3);
                       System.out.println("Eliminado");
                    break;
                case 6:
                      System.out.println("Cantidad De Elementos: "+ arrLis.size());
                    break;
                case 7:
                      System.out.println("Elementos A Buscar");
                       byte edadB= cs.nextByte();
                      if(arrLis.contains(edadB))
                          System.out.println("Se Encontro El Elemento");
                      else
                          System.out.println("No Se Encontro El Elemento");
                    break;
                case 8:
                      if(!arrLis.isEmpty())
                          System.out.println("Hay Elementos");
                      else
                          System.out.println("No Hay Elementos");
                    break;
                case 9:
                      arrLis.clear();
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
