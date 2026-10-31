package Tema4;
   import java.util.Scanner;
public class Evalur_PsEl {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
          int i, n;
          int arr[], val;
          
          System.out.println("Ingresa La Longitud");
           n= cs.nextInt();
         arr= new int[n];
         
         for(i= 0; i< n; i++){
             System.out.println("Ingresa Un Valor");
              val= cs.nextInt();
             if(val% 2== 0){
                 if(val>= 0){
                     arr[i]= val;
                 }
                 else{
                     i --;
                 }
             }
         }
        for(i= 0; i< n; i++){
            System.out.println("["+ arr[i]+ "]");
        }
    }
}
