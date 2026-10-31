package Tema4;

   import java.util.Scanner;
public class Arreglo_Long {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int i, n;
        long numLargo;
        long arrLong[];
        
        System.out.println("Longitud Del Arreglo");
         n = cs.nextInt();
        arrLong = new long[n]; 
        
        for(i= 0; i< n; i++){
             System.out.println("Ingresa Numero");
              numLargo = cs.nextLong();
              arrLong[i]= numLargo;
      }
        
        for(i= 0; i< n; i++){
            System.out.println("["+ arrLong[i] +"]");
        }
    }
}
