package BusHasMap;

import java.util.ArrayList;

public class CocktailSort {

    private static void cocktailSort(ArrayList<Integer> lista) {
        boolean cambiar = true;
        int inicio = 0;
        int fin = lista.size();

        while (cambiar) {
            cambiar = false;

            for (int i = inicio; i < fin - 1; i++) {
                if (lista.get(i) > lista.get(i + 1)) {
                    int temp = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, temp);
                    cambiar = true;
                }
            }

            if (!cambiar) {
                break;
            }

            cambiar = false;
            fin = fin - 1; 

            for (int i = fin - 1; i >= inicio; i--) {
                if (lista.get(i) > lista.get(i + 1)) {
                    int temp = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, temp);
                    cambiar = true;
                }
            }

            inicio = inicio + 1;
        }
    }
    
    public static void CoctailSort(ArrayList<Integer> lista){
        cocktailSort(lista);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(lista);
        
    }
    
}
