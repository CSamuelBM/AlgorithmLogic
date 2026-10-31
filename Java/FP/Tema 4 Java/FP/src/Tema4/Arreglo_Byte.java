package Tema4;

     import java.util.Scanner;
public class Arreglo_Byte {
    public static void main(String[]args){
        Scanner cs = new Scanner(System.in);
        
        int i, n;
        byte numCor;
        byte arrNumCor[];
        
         System.out.println("Longitud Del Arreglo");
          n = cs.nextByte();
         arrNumCor = new byte[n];
         
         for(i= 0; i< n; i++){
             System.out.println("Numero");
              numCor = cs.nextByte();
             arrNumCor[i] = numCor;  
         }
         
         for(i= 0; i< n; i++){
             System.out.println("["+ arrNumCor[i]+ "]");
         }
    }
}
