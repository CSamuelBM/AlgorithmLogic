package BusHasMap;

   import java.util.ArrayList;
   import java.util.Arrays;

public class PigeonholeSort{

    private static void pigeonholeSort(ArrayList<Integer> lista) {

        int min = lista.get(0);
        int max = lista.get(0);

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) < min) min = lista.get(i);
            if (lista.get(i) > max) max = lista.get(i);
        }

        int rango = max - min + 1;

        int[] phole = new int[rango];
        Arrays.fill(phole, 0);
        
        for (int i = 0; i < lista.size(); i++) {
            phole[lista.get(i) - min]++;
        }

        int indice = 0;
        for (int j = 0; j < rango; j++) {
            while (phole[j]-- > 0) {
                lista.set(indice++, j + min);
            }
        }

    }
    
    public static void PigeonholeSort(ArrayList<Integer> lista){
        pigeonholeSort(lista);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(lista);
        
    }
    
}
