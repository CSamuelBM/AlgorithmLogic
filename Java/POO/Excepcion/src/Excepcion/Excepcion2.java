package Excepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion2 {
   public static void main(String[]args){
       int arr[]= new int[5];
       Scanner cs= new Scanner(System.in);
    try{   
       for(int i= 0; i<= arr.length; i++){
           System.out.println("Num: "+ (i+1));
           arr[i]= cs.nextInt();
       }
       
     }catch(InputMismatchException ex){
         System.out.println("Ingresa Solo Numeros Enteros: "+ ex.getMessage());
     }catch(NullPointerException ex){
         System.out.println("Referencia Nula Detectada: "+ ex);
     }catch(ArrayIndexOutOfBoundsException ex){
         System.out.println("Numero Fuera Del Arr: "+ ex.getLocalizedMessage()); //Es Objeto 
     }
    
    
   }
}
