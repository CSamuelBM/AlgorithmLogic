package Tema4;

   import java.util.Scanner;
public class Arreglo_Double {
    public static void main(String[]args){
        Scanner cs = new Scanner(System.in);
        
        int i, n;
        double time;
        double arrTime[];
        
        System.out.println("Longitud Del Arreglo");
         n = cs.nextInt();
        arrTime = new double[n];  
        
        for(i= 0; i< n; i++){
            System.out.println("Tiempo Record");
             time = cs.nextDouble();
            arrTime[i] = time; 
        }
        
        for(i= 0; i< n; i++){
            System.out.println("["+ arrTime[i]+ "]");
        }
    }
}
