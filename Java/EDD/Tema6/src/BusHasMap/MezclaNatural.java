package BusHasMap;

import java.util.ArrayList;

public class MezclaNatural {
    
    private static void mezclaNatural(ArrayList<Integer> lista) {
        boolean ordenado = false;
        int ronda = 1;

        while (!ordenado) {

            int[][] runs = detectarRuns(lista);

            if (runs.length <= 1) {
                ordenado = true;
                break;
            }

            int[][] nuevasRuns = new int[(runs.length + 1) / 2][];
            int k = 0;
            for (int i = 0; i < runs.length; i += 2) {
                if (i + 1 < runs.length) {
                    nuevasRuns[k++] = mezclar(runs[i], runs[i + 1]);
                } else {
                    nuevasRuns[k++] = runs[i];
                }
            }

            int pos = 0;
            for (int i = 0; i < k; i++) {
                for (int num : nuevasRuns[i]) {
                    lista.set(pos++, num);
                }
            }
            
            ronda++;
        }
    }

    private static int[][] detectarRuns(ArrayList<Integer> lista) {
        ArrayList<int[]> listaRuns = new ArrayList<>();
        int inicio = 0;

        for (int i = 1; i <= lista.size(); i++) {
            if (i == lista.size() || lista.get(i) < lista.get(i- 1)) {
                int[] run = new int[i - inicio];
                for (int j = 0; j < run.length; j++) {
                    run[j] = lista.get(inicio+ j);
                }
                listaRuns.add(run);
                inicio = i;
            }
        }

        return listaRuns.toArray(new int[listaRuns.size()][]);
    }

    private static int[] mezclar(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] mezcla = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                mezcla[k++] = a[i++];
            } else {
                mezcla[k++] = b[j++];
            }
        }

        while (i < a.length) mezcla[k++] = a[i++];
        while (j < b.length) mezcla[k++] = b[j++];

        return mezcla;
    }
    
    public static void MezclaNatural(ArrayList<Integer> lista){
        mezclaNatural(lista);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(lista);
        
    }
    
}
