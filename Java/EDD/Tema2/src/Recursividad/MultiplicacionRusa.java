package Recursividad;

import java.util.Scanner;

public class MultiplicacionRusa {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int a= cs.nextInt();
        int b= cs.nextInt();
        
        System.out.println(metodoRuso(a, b));
    }
    
    public static int metodoRuso(int a, int b){
        if(b== 0) return a;
        
        return metodoRuso(a* 2, b/ 2) + ((b%2!= 0)? a: 0);
    }
}
