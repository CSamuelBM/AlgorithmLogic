package BusHasMap;

import java.util.ArrayList;

public class RadixSort {
    
    private static int numMax(ArrayList<Integer> lista){
        
        int max = lista.get(0);
        
        for(int val : lista){
            if(val > max) 
                max = val;
        }
        
        return max;
    }

    private static void RadixSort(ArrayList<Integer> lista, int maxVal){

        int[][] matDecimal = new int[10][lista.size()];
        int[] contArr = new int[10];
        
        int posDigito = 1;
        
        while(maxVal / posDigito > 0){
            
            for(int val : lista){
                int indice = (val / posDigito) % 10;
                matDecimal[indice][contArr[indice]] = val;
                contArr[indice] ++;
            }
            
            int pos = 0;
            
            for(int i = 0; i< 10; i++){
                
                for(int j = 0; j< contArr[i]; j++){
                    lista.set(pos, matDecimal[i][j]);
                    pos ++;
                }
                contArr[i] = 0;
            }
            posDigito *= 10;
        }

    }

    public static void RadixSort(ArrayList<Integer> lista){
        int maxVal = numMax(lista);
        RadixSort(lista, maxVal);
        
        Busqueda.HasMap(lista);
        
        System.out.println();
        System.out.println("Lista Ordenada");
        System.out.println(lista);
        
    }
    
}
