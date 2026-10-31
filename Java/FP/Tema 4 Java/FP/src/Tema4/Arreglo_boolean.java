package Tema4;

    import java.util.Scanner;
public class Arreglo_Boolean {
    public static void main(String[]args){
        Scanner cs = new Scanner(System.in);
        
        int i, n;
        boolean mayor;
        boolean arrMayor[];
        
         System.out.println("Longitud Del Arreglo");
          n = cs.nextInt();
         arrMayor = new boolean[n];
         
         for(i= 0; i< n; i++){
             System.out.println("False O True");
              mayor = cs.nextBoolean();
             arrMayor[i] = mayor;  
         }
         
         for(i= 0; i< n; i++){
             System.out.println("["+ arrMayor[i]+ "]");
         }
        
    }
}
