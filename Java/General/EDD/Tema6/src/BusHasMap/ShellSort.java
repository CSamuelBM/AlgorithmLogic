package BusHasMap;

   import java.util.ArrayList;

public class ShellSort{

    private static void ordenamientoShell(ArrayList<Integer> lista) {
        int n = lista.size();

        for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {

            for (int i = intervalo; i < n; i++) {
                int temporal = lista.get(i);
                int j;

                for (j = i; j >= intervalo && lista.get(j - intervalo) > temporal; j -= intervalo) {
                    lista.set(j, lista.get(j - intervalo));
                }
                lista.set(j, temporal);
            }
        }
    }

    public static void ShellSort(ArrayList<Integer> lista){
        
        ordenamientoShell(lista);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(lista);
        
    }
    
}
