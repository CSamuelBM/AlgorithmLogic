package BusHasMap;

import java.util.ArrayList;

public class CombSort {

    private static int SiguienteIntervalo(int intervalo) {
        intervalo = (intervalo * 10) / 13;
        if (intervalo < 1) {
            return 1;
        }
        return intervalo;
    }

    private static void ordenar(ArrayList<Integer> lista) {
        int n = lista.size();
        int intervalo = n;
        boolean intercambio = true;
        while (intervalo != 1 || intercambio) {
            intervalo = SiguienteIntervalo(intervalo);
            intercambio = false;
            for (int i = 0; i < n - intervalo; i++) {
                if (lista.get(i).compareTo(lista.get(i+intervalo))>0) {
                    int cambio = lista.get(i);
                    lista.set(i, lista.get(i+intervalo));
                    lista.set(i+intervalo, cambio);
                    intercambio = true;
                }
            }
        }
    }
    
    public static void CombSort(ArrayList<Integer> lista){
        ordenar(lista);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(lista);
        
    }
    
}
