package BusHasMap;

   import java.util.ArrayList;

public class MergeSort{

    private static void divideOrdena(ArrayList<Integer> lista, int ptInicial, int ptFinal) {
        if (ptInicial < ptFinal) {
            int ptMedio = (ptInicial + ptFinal) / 2;

            divideOrdena(lista, ptInicial, ptMedio);
            divideOrdena(lista, ptMedio + 1, ptFinal);
            mezcla(lista, ptInicial, ptMedio, ptFinal);
        }
    }

    private static void mezcla(ArrayList<Integer> lista, int ptInicial, int ptMedio, int ptFinal) {

        int nIzq = ptMedio - ptInicial + 1;
        int nDer = ptFinal - ptMedio;

        ArrayList<Integer> izq = new ArrayList<>();
        ArrayList<Integer> der = new ArrayList<>();

        for (int i = 0; i < nIzq; i++) {
            izq.add(lista.get(ptInicial + i));
        }

        for (int j = 0; j < nDer; j++) {
            der.add(lista.get(ptMedio + 1 + j));
        }

        int i = 0, j = 0;
        int k = ptInicial;

        while (i < nIzq && j < nDer) {
            if (izq.get(i) <= der.get(j)) {
                lista.set(k, izq.get(i));
                i++;
            } else {
                lista.set(k, der.get(j));
                j++;
            }
            k++;
        }

        while (i < nIzq) {
            lista.set(k, izq.get(i));
            i++;
            k++;
        }

        while (j < nDer) {
            lista.set(k, der.get(j));
            j++;
            k++;
        }
    }
    
    public static void MergeSort(ArrayList<Integer> lista){
        int ini = 0;
        int fin = lista.size() - 1;
        
        divideOrdena(lista, ini, fin);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(lista);
        
    }
    
}
