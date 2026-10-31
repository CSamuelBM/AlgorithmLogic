package Modularidad;

   import java.util.Scanner;

public class MCirculo {
    
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        double r, res;
         System.out.println("Ingresa El Radio");
          r= cs.nextDouble();
         System.out.println("El Resultado Es: "+ Radio(r));  
    }
    
    public static double Radio(double r){
        double res= Math.PI*r*r;
         return res;
    }
    
}
