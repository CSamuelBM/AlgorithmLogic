package BusHasMap;

import java.util.ArrayList;

public class QuickSort {
    
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


        int temp = lista.get(i);
        lista.set(i, lista.get(end));
        lista.set(end, temp);
        
        quicksort(lista, begin, i - 1);
        quicksort(lista, i + 1, end);
    }

    public static void quicksort(ArrayList<Integer> lista) {
        
        quicksort(lista, 0, lista.size() - 1);
       
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(lista);
        
    }
    
}
