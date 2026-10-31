package Tema4;

  import java.util.Scanner;
public class Arreglo_Float {
    public static void main(String[]args){
        Scanner cs = new Scanner(System.in);
        
        int i, n;
        float prec;
        float arrPrec[];
        
        System.out.println("Logitud Del Arreglo");
         n = cs.nextInt();
        arrPrec = new float[n];
        
        for(i= 0; i< n; i++){
            System.out.println("Precios");
             prec = cs.nextFloat();
            arrPrec[i] = prec;  
        }
        
        for(i= 0; i< n; i++){
            System.out.println("["+ arrPrec[i]+ "]");
        }
    }
}
