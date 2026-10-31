package Recursividad;

import java.util.Scanner;

public class Potencia {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int n= cs.nextInt();
        int p= cs.nextInt();
        
        System.out.println(potencia(n, p));
    }
    
    public static int potencia(int n, int p){
        if(p== 0) return 1;
        
        return potencia(n, p-1)* p;
    }
}
