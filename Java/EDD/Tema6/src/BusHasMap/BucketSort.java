package BusHasMap;

   import java.util.ArrayList;

public class BucketSort {

    private static void insertionSort(ArrayList<Integer> bucket) {
        for (int i = 1; i < bucket.size(); ++i) {
            int key = bucket.get(i);
            int j = i - 1;
            while (j >= 0 && bucket.get(j) > key) {
                bucket.set(j + 1, bucket.get(j));
                j--;
            }
            bucket.set(j + 1, key);
        }
    }

    private static ArrayList<Integer> bucketSort(ArrayList<Integer> lista) {
        int n = lista.size();
        int max = lista.stream().max(Integer::compare).get();

        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            buckets.add(new ArrayList<>());
        }

        for (Integer num : lista) {
            int bi = (int) (((double) num / max) * (n - 1));
            buckets.get(bi).add(num);
        }

        for (ArrayList<Integer> bucket : buckets) {
            insertionSort(bucket);
        }

        ArrayList<Integer> sortedList = new ArrayList<>();
        for (ArrayList<Integer> bucket : buckets) {
            sortedList.addAll(bucket);
        }
        
        return sortedList;
        
    }

    public static void BucketSort(ArrayList<Integer> lista){
        ArrayList<Integer> ordenado= bucketSort(lista);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(ordenado);
        
    }
    
}
