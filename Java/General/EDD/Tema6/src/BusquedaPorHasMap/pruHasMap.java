package BusquedaPorHasMap;

import java.util.*;

public class pruHasMap {
 
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        
        Map<Integer, Integer> numMap= new HashMap<>();
        int arr[]= {100, 12, 4, 3};
        int numBus= cs.nextInt();
        
        for(int i : arr) 
            numMap.put(i, numMap.getOrDefault(i, 0) + 1);
        
        if(numMap.containsKey(numBus)) System.out.println("Se Encontro");
        else System.out.println("No Se Encontro");
        
    }
    
}
