package Tema4;
    
   import java.util.Scanner;
public class Suma_Val {
    public static void main(String[]args){
        Scanner cs = new Scanner(System.in);
        
        int i, n;
        int num, acu= 0;
        int arrNum[];
        
        System.out.println("Ingresa La Longitud Del Arreglo");
         n = cs.nextInt();
        arrNum = new int[n]; 
        
        for(i= 0; i< n; i++){
            System.out.println("Ingresa Un Numero");
             num = cs.nextInt();
              arrNum[i] = num;
            acu += num; 
        }
        for(i= 0; i< n; i++){
            System.out.println("["+ arrNum[i]+ "]");
        }
         System.out.println("Suma: "+ acu);
    }
}
