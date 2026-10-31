package BusHasMap;
 
   import java.util.ArrayList;

public class BubbleSort {
    
    private static void bubbleSort(ArrayList<Integer> lista) {
        int n = lista.size();
        boolean bandera;

        for (int i = 0; i < n - 1; i++) {
            bandera = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (lista.get(j) > lista.get(j + 1)) {

                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);

                    bandera = true;
                }
            }

            if (!bandera)
                break;
        }
    }
    
    public static void BubbleSort(ArrayList<Integer> lista){
        bubbleSort(lista);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(lista);
        
    }
    
}
