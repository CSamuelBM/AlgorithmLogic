package Recursividad;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int n= cs.nextInt();
        
        for(int i= 0; i< n; i++){
            System.out.println(fibonacci(i));
        }
        
    }
    
    public static int fibonacci(int n){
        if(n<= 1) return n;
        
        return fibonacci(n-1)+ fibonacci(n-2);
    }
}
