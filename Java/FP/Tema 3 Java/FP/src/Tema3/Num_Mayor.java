package Tema3;
   import java.util.Scanner;
  public class Num_Mayor{
      public static void main(String[] args){
          Scanner Leer = new Scanner(System.in);
      int a, b, c, numM;
       System.out.println("Ingresa Numero Uno");
        a = Leer.nextInt();
       System.out.println("Ingresa Numero Dos");
        b = Leer.nextInt();
       System.out.println("Ingresa Numero Tres");
        c = Leer.nextInt();
        
        if(a > b){
            numM = a;
        }else if(b > c){
            numM = b;
        }else{
            numM = c;
        }
        
        System.out.println("Numero Mayor Es: " + numM);
  }
}