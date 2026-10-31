package Tema4;
  import java.util.Scanner;
public class Detecta_Vocale {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
         int i= 0;
         String arr[]= new String[5];
         String nom;
         char car= 0;
         
         while(i< 5){
             System.out.println("Ingresa Un Nombre");
              nom= cs.next();
               if(car== 'A' && i== 0){
                   arr[i++]= nom;
               }else if(car== 'E' && i==1){
                   arr[i++]= nom;
               }else if(car== 'I' && i==2){
                   arr[i++]= nom;
               }else if(car== 'O' && i==3){
                   arr[i++]= nom;
               }else if(car== 'U' && i==4){
                   arr[i++]= nom;
               }
               i++;
         }        
    }
}
