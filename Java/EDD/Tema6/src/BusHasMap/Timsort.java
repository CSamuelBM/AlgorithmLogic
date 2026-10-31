package BusHasMap;

  import java.util.ArrayList;

public class Timsort {
    
    private static int run = 20;
    
    private static void insert(ArrayList<Integer> lista, int L, int r) {
        for (int i = L + 1; i <= r; i++) {
            int temp = lista.get(i);
            int j = i - 1;

            while (j >= L && lista.get(j) > temp) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, temp);
        }
    }
    
    private static void merge(ArrayList<Integer> lista, int l, int m, int R) {
        int len1 = m - l + 1;
        int len2 = R - m;
        ArrayList<Integer> L = new ArrayList<>(len1);
        ArrayList<Integer> Rlist = new ArrayList<>(len2);

        for (int x = 0; x < len1; x++) {
            L.add(lista.get(l + x));
        }
        for (int x = 0; x < len2; x++) {
            Rlist.add(lista.get(m + 1 + x));
        }
        int i = 0, j = 0, k = l;
        while (i < len1 && j < len2) {
            if (L.get(i) <= Rlist.get(j)) {
                lista.set(k, L.get(i));
                i++;
            } else {
                lista.set(k, Rlist.get(j));
                j++;
            }
            k++;
        }
        while (i < len1) {
            lista.set(k, L.get(i));
            k++;
            i++;
        }
        while (j < len2) {
            lista.set(k, Rlist.get(j));
            k++;
            j++;
        }
    }
    
    private static void timSort(ArrayList<Integer> lista) {
        int n = lista.size();
        for (int i = 0; i < n; i += run) {
            insert(lista, i, Math.min(i + run - 1, n - 1));
        }
        for (int size = run; size < n; size = size * 2) {
            for (int L = 0; L < n; L += 2 * size) {
                int mid = L + size - 1;
                int R = Math.min(L + 2 * size - 1, n - 1);

                if (mid < R) {
                    merge(lista, L, mid, R);
                }
            }
        }
    }
    
    public static void TimSort(ArrayList<Integer> lista){
        timSort(lista);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(lista);
        
    }
    
}
