package Modularidad;

   import java.util.Scanner;

public class Suma {
    
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int val1, val2, res;
        
        System.out.println("Ingresa Primer Numero");
         val1= cs.nextInt();
        System.out.println("Ingresa Segundo Numero");
         val2= cs.nextInt();
        System.out.println("La Suma Es: "+ suma(val1, val2));
    }
    
    public static int suma(int val1, int val2){
        int res= val1+ val2;
         return res;
    }
}
