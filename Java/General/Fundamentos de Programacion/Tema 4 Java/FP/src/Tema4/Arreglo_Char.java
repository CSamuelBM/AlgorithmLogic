package Tema4;
   import java.util.Scanner;
public class Arreglo_Char {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int i, n;
        char arr[], let;
       
       System.out.println("Longitud");
        n= cs.nextInt();
       arr= new char[n];
       
       for(i= 0; i< n; i++){
           System.out.println("Ingresa Una Letra");
             let= cs.next(). charAt(0);
              arr[i]= let;
       }
       
       for(i= 0; i< n; i++){
           System.out.println("["+ arr[i]+ "]");
       }
    }
}
