package BusHasMap;

import java.util.ArrayList;

public class MergeSortDirect {
    
    private static void mergeSort(ArrayList<Integer> lista, ArrayList<Integer> izq, ArrayList<Integer> der){
        int i=0, j=0, k=0;
        
        while(i < izq.size() && j < der.size()){
            if(izq.get(i) <= der.get(j)){ 
                lista.set(k, izq.get(i));
                i++;
            }else{
                lista.set(k, der.get(j));
                j++;
            }
            k++;
        }
        
        while(i < izq.size()){
            lista.set(k, izq.get(i));
            i++;
            k++;
        }
       
        while(j < der.size()){
            lista.set(k, der.get(j));
            j++;
            k++;
        }
    }
    
    private static void mergeSortDirect(ArrayList<Integer> lista){
        int n = lista.size();
        
        if(n<= 1) return;
        
        int mitad = n/ 2;

        ArrayList<Integer> izq= new ArrayList<>(lista.subList(0, mitad));
        ArrayList<Integer> der= new ArrayList<>(lista.subList(mitad, n));
        
        mergeSortDirect(izq);
        mergeSortDirect(der);
        
        mergeSort(lista, izq, der);
            
    }
    
    public static void MergeSorDirect(ArrayList lista){
        mergeSortDirect(lista);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(lista);
    }
    
}
