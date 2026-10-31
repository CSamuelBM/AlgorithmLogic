package BusHasMap;

import java.util.ArrayList;

public class SelectionSort {

    private static void selectionSort(ArrayList<Integer> lista) {
        int min;

        for (int i = 0; i < lista.size() - 1; i++) {
            min = i;
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(j) < lista.get(min)) {
                    min = j;
                }
            }
            
            int temp = lista.get(i);
            lista.set(i, lista.get(min));
            lista.set(min, temp);
        }
    }
    
    public static void SelectionSort(ArrayList<Integer> lista){
        selectionSort(lista);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(lista);
        
    }
    
}
