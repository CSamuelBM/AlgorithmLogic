package BusHasMap;

import java.util.ArrayList;

public class Intercalacion {
    
    private static ArrayList<Integer> intercalar(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {

        ArrayList<Integer> lista = new ArrayList<>();
        int i = 0, j = 0;

        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) <= lista2.get(j)) {
                lista.add(lista1.get(i));
                i++;
            } else {
                lista.add(lista2.get(j));
                j++;
            }
        }

        while (i < lista1.size()) {
            lista.add(lista1.get(i));
            i++;
        }

        while (j < lista2.size()) {
            lista.add(lista2.get(j));
            j++;
        }

        return lista;
    }
    
    private static ArrayList<Integer> mergeSort(ArrayList<Integer> lista){
        int n = lista.size();
        
        if(n<= 1) 
            return lista;
        
        int mitad = n/ 2;

        ArrayList<Integer> izq= new ArrayList<>(lista.subList(0, mitad));
        ArrayList<Integer> der= new ArrayList<>(lista.subList(mitad, n));
        
        izq= mergeSort(izq);
        der= mergeSort(der);
        
        return intercalar(izq, der);
            
    }
    
    public static void Intercalacion(ArrayList<Integer> lista){
        ArrayList<Integer> ordenada = mergeSort(lista);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(ordenada);
        
    }
    
}
