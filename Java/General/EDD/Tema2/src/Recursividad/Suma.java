package Recursividad;

import java.util.Scanner;

public class Suma {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int n= cs.nextByte();
        
        System.out.println("La Suma: "+ suma(n));
    }
    
    public static int suma(int n){
        if(n== 0) return 0;
        
        return n+suma(n-1);
    }
    
}
