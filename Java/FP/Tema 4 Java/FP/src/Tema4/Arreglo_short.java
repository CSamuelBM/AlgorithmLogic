package Tema4;
  
   import java.util.Scanner;
public class Arreglo_Short {
    public static void main(String[]args){
       Scanner cs = new Scanner(System.in);
       
       int i, n;
       short num;
       short arrLarg[];
       
       System.out.println("Longitu Del Arreglo");
        n = cs.nextInt();
       arrLarg = new short[n]; 
       
       for(i= 0; i< n; i++){
           System.out.println("Ingresa Un Numero Largo");
            num = cs.nextShort();
           arrLarg[i] = num; 
       }
       
       for(i= 0; i< n; i++){
           System.out.println("["+ arrLarg[i]+ "]");
       }
    }
}
