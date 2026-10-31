package BusHasMap;

import java.util.ArrayList;

public class InsertionSort {
    
     private static void Insertion(ArrayList<Integer> lista){
        int pos;
        int aux;
        
        for(int i= 0; i< lista.size(); i++){
            pos= i;
            aux= lista.get(i);
            
            while((pos> 0) && (lista.get(pos- 1)> aux)){
                lista.set(pos, lista.get(pos- 1));
                pos --;
            }
            lista.set(pos, aux);
        }
            
    }
    
    public static void InsertionSort(ArrayList<Integer> lista){
        Insertion(lista);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(lista);
        
    }
    
}
