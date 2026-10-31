package Recursividad;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int n= cs.nextInt();
        System.out.println("Numero de pares: "+ cantidaPar(n));
        System.out.println("Nuemro de impares: "+ cantidadImpar(n));
    }
    
    public static int cantidaPar(int n){
        if(n== 0) return 0;
        
        else if(n% 2== 0)
            return 1+cantidaPar(n-1);
        else
            return cantidaPar(n-1);
    }
    
    public static int cantidadImpar(int n){
        if(n== 0) return 0;
        
        else if(n% 2!= 0)
            return 1+cantidadImpar(n-1);
        else
            return cantidadImpar(n-1);
    }
    
}
