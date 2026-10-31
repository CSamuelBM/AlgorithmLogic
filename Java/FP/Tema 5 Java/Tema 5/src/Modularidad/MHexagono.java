package Modularidad;

  import java.util.Scanner;

public class MHexagono {
    
    public static void main(String[]args){
       Scanner cs= new Scanner(System.in);
         
        float l, res;
         System.out.println("Ingresa El Lado");
          l= cs.nextFloat();
         System.out.println("El Resultado Es: "+ Lado(l));
    }
    
     public static float Lado(float l){
         double res=(3*Math.sqrt(3)/2)*Math.pow(l, 2);
          return (float) res;
     }
     
}
