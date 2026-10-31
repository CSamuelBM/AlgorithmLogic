package Modularidad;
 
   import java.util.Scanner;

public class MCuadrado {
    
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int l, res;
         System.out.println("Ingresa Lado");
          l= cs.nextInt();
         System.out.println("El Resultado Es: "+ lado(l));
    }
    
    public static int lado(int l){
        int res= l*l;
         return res;
    }
}
