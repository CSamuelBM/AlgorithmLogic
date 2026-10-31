package BusHasMap;

import java.util.ArrayList;

public class CycleSort {

    private static void cycleSort(ArrayList<Integer> lista) {
        int n = lista.size();

        for (int ciclo = 0; ciclo < n - 1; ciclo++) {
            int item = lista.get(ciclo);
            int pos = ciclo;

            for (int i = ciclo + 1; i < n; i++) {
                if (lista.get(i) < item) {
                    pos++;
                }
            }

            if (pos == ciclo) {
                continue;
            }

            while (item == lista.get(pos)) {
                pos++;
            }

            int temp = lista.get(pos);
            lista.set(pos, item);
            item = temp;

            while (pos != ciclo) {
                pos = ciclo;

                for (int i = ciclo + 1; i < n; i++) {
                    if (lista.get(i) < item) {
                        pos++;
                    }
                }

                while (item == lista.get(pos)) {
                    pos++;
                }

                temp = lista.get(pos);
                lista.set(pos, item);
                item = temp;
            }
        }
    }
    
    public static void CycleSort(ArrayList<Integer> lista){
        cycleSort(lista);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(lista);
        
    }
    
}
