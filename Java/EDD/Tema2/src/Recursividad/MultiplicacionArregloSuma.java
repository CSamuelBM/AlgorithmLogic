package Recursividad;

import java.util.Scanner;

public class MultiplicacionArregloSuma {
    
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int n[]= new int[]{1, 2, 3};
         
        System.out.println(arreglo(n, n.length));
        
    }
    
    public static int arreglo(int n[], int i){
        
       if(i== 0) return 0;
       
       return arreglo(n, i-1)+ (n[i-1]* i);
        
    }
    
}
