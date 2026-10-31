package BusquedaPorHasMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class NewClass {

    private static void quicksort(ArrayList<Integer> lista, int begin, int end) {
        if (begin >= end)
            return;

        int pivotValue = lista.get(end); 
        int i = begin;
        int j = end - 1;

        while (i <= j) {
            while (i <= j && lista.get(i) <= pivotValue) i++;
            while (i <= j && lista.get(j) > pivotValue) j--;

            if (i < j) {
                int temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
            }
        }

        // Colocar el pivote en su posición correcta
        int temp = lista.get(i);
        lista.set(i, lista.get(end));
        lista.set(end, temp);

        // Llamadas recursivas
        quicksort(lista, begin, i - 1);
        quicksort(lista, i + 1, end);
    }

    public static void quicksort(ArrayList<Integer> lista) {
        quicksort(lista, 0, lista.size() - 1);
    }
    
    public static void busqueda(int n, ArrayList<Integer> lista){
        Map<Integer, Integer> numMap= new HashMap<>();
        
        for(int i : lista){ 
            numMap.put(i, numMap.getOrDefault(i, 0)+ 1);
        }
        //System.out.println("Mapa Hash");
        //System.out.println(numMap); //Muestra El Mapa Con Su Key Y Su La Cantidad De veces que se repite un numero
        
        if(numMap.containsKey(n)) 
            System.out.println("Se Encontro");
        else 
            System.out.println("No Se Encontro");
        
    }

    public static void main(String[] args) {
      Scanner cs= new Scanner(System.in);
      ArrayList lista = new ArrayList<>();
      
      try (Scanner sc = new Scanner(new File("C:\\Users\\balle\\Downloads\\ejemplo.txt"))) {
           while (sc.hasNextInt())
               lista.add(sc.nextInt());
      } catch (FileNotFoundException e) {
          System.err.println("error");
      }

      //System.out.println("Antes de ordenar:");
      //System.out.println(lista);

      quicksort(lista);
      
      //System.out.println("Después de ordenar:");
      //System.out.println(lista);
      
      System.out.println("Numero A Buscar");
      int n= cs.nextInt();
      
      busqueda(n, lista);
      
    }
}