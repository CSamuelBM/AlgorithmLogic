package BusHasMap;

import java.util.ArrayList;

    public class GnomeSort {
    
    private static void gnomesort(ArrayList<Integer> lista){
     int i=1;
     int n= lista.size();
        while(i< n){
            if(i==0|| lista.get(i)>= lista.get(i-1)){
                i++;
            }else{
                int tmp= lista.get(i);
                lista.set(i, lista.get(i-1));
                lista.set(i-1,tmp);
                i--;
            }
        }
    }

    public static void GnomeSort(ArrayList<Integer> lista){
        gnomesort(lista);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(lista);
        
    }
}
