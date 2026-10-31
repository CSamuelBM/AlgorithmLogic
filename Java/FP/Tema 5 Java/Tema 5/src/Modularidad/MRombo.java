package Modularidad;

  import java.util.Scanner;

public class MRombo {
    
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
         
        int l1, l2, res;
         System.out.println("Ingresa Lado Mayor");
          l1= cs.nextInt();
         System.out.println("Ingresa Lado Menor");
          l2= cs.nextInt();
         System.out.println("El Resultado Es: "+ Ll(l1, l2));
    }
    
    public static int Ll(int l1, int l2){
       int res= (l1*l2)/2;
        return res;
    }
    
}
