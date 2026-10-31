package Recursividad;

import java.util.Scanner;

public class Factorial {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int n= cs.nextInt();
        System.out.println("El facotiral es: "+ factorial(n));
    }
    
    public static int factorial(int n){
        if(n== 0) return 1;
        
        return n*factorial(n-1);
    }
}
