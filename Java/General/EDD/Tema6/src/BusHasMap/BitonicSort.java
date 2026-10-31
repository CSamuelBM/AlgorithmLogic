package BusHasMap;

import java.util.ArrayList;

public class BitonicSort {

    private static void compAndSwap(ArrayList<Integer> lista, int i, int j, int dir) {
        if ((lista.get(i) > lista.get(j) && dir == 1) ||
            (lista.get(i) < lista.get(j) && dir == 0)) {

            int temp = lista.get(i);
            lista.set(i, lista.get(j));
            lista.set(j, temp);
        }
    }

    
    private static void bitonicMerge(ArrayList<Integer> lista, int low, int cnt, int dir) {
        if (cnt > 1) {
            int k = cnt / 2;
            for (int i = low; i < low + k; i++) {
                compAndSwap(lista, i, i + k, dir);
            }
            bitonicMerge(lista, low, k, dir);
            bitonicMerge(lista, low + k, k, dir);
        }
    }

    
    private static void bitonicSort(ArrayList<Integer> lista, int low, int cnt, int dir) {
        if (cnt > 1) {
            int k = cnt / 2;

            bitonicSort(lista, low, k, 1);         
            bitonicSort(lista, low + k, k, 0);     

            bitonicMerge(lista, low, cnt, dir);    
        }
    }

    public static void BitonicSort(ArrayList<Integer> lista) {
        bitonicSort(lista, 0, lista.size(), 1);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(lista);
        
    }

}
