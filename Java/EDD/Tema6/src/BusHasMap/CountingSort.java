package BusHasMap;

import java.util.ArrayList;

public class CountingSort {

    private static void countingSort(ArrayList<Integer> lista) {
        if (lista.isEmpty())
            return;

        int min = lista.get(0);
        int max = lista.get(0);

        for (int num : lista) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        int rango = max - min + 1;
        int[] conteo = new int[rango];

        for (int num : lista) {
            conteo[num - min]++;
        }

        int index = 0;
        for (int i = 0; i < rango; i++) {
            while (conteo[i]-- > 0) {
                lista.set(index++, i + min);
            }
        }
    }
    
    public static void CountingSort(ArrayList<Integer> lista){
        countingSort(lista);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(lista);
        
    }
    
}
