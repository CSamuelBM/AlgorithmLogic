package BusHasMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Busqueda {
    
     public static void HasMap(ArrayList<Integer> lista){
        Scanner cs= new Scanner(System.in);
        
        Map<Integer, Integer> numMap= new HashMap<>();

        for(int i : lista){ 
            numMap.put(i, numMap.getOrDefault(i, 0)+ 1);
        }
        
        System.out.println("Numero A Buscar");
        int n= cs.nextInt();
        
        if(numMap.containsKey(n)) //O(1) 
            System.out.println("Se Encontro");
        else 
            System.out.println("No Se Encontro");
       
        System.out.println();
        System.out.println("Mapa Hash");
        System.out.println(numMap);
        
    }
    
}
