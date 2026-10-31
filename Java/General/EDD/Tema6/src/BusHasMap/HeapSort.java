package BusHasMap;

   import java.util.ArrayList;

public class HeapSort{

    private static void heapSort(ArrayList<Integer> lista) {
        int n = lista.size();

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(lista, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = lista.get(0);
            lista.set(0, lista.get(i));
            lista.set(i, temp);

            heapify(lista, i, 0);
        }
    }

    private static void heapify(ArrayList<Integer> lista, int n, int i) {
        int mayor = i;
        int izq = 2 * i + 1;
        int der = 2 * i + 2;

        if (izq < n && lista.get(izq) > lista.get(mayor)) {
            mayor = izq;
        }

        if (der < n && lista.get(der) > lista.get(mayor)) {
            mayor = der;
        }

        if (mayor != i) {
            int temp = lista.get(i);
            lista.set(i, lista.get(mayor));
            lista.set(mayor, temp);

            heapify(lista, n, mayor);
        }
    }
    
    public static void HeapSort(ArrayList<Integer> lista){
        heapSort(lista);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(lista);
        
    }
    
}
