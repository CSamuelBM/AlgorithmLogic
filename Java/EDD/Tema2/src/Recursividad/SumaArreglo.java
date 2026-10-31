package Recursividad;

import java.util.Scanner;

public class SumaArreglo {
    
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        int n[]= new int[3];
        int i;
        
        for(i= 0; i< n.length; i++) n[i]= cs.nextInt();

        System.out.println(suma(n, i));
       
    }
    
    public static int suma(int n[], int i){
        if(i== 0) return 0;
        
        return suma(n, i-1)+n[i-1];
        
    }
    
}
