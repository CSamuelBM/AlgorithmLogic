package Recursividad;
    import java.util.Scanner;
public class Serie1_10 {
    
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        System.out.println("Ingresa Numero");
         int n= cs.nextInt();
        
        System.out.println("Serie Recursiva");
        sucesion(n);
        
    }
        
     public static int sucesion(int n){
        System.out.println(n);
        if(n== 1) return 1;
        
          return sucesion(n-1);
    } 
        
}
