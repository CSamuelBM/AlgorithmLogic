package Modularidad;

  import java.util.Scanner;

public class MTriangulo {
    
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
          
         int b, h, res;
           System.out.println("Ingresa La Base");
            b= cs.nextInt();
           System.out.println("Ingresa La Altura");
            h= cs.nextInt();
           System.out.println("El Resultado Es: "+ BH(b, h)); 
    }
    
     public static int BH(int b, int h){
         int res= (b*h)/2;
          return res;
     }
}
