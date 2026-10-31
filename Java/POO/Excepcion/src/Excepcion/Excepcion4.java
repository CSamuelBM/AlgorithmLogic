package Excepcion;

import java.io.IOException;
import java.util.Scanner;

public class Excepcion4 {
    public static void main(String[]args) throws IOException{
        Scanner cs= new Scanner(System.in);
        
         String nom, sex;
         int eda;
         
         try{
             
            System.out.println("Nombre");
             nom= cs.next();
            System.out.println("Edad");
             eda= cs.nextInt();
            System.out.println("Sexo");
             sex= cs.next();
             
            System.out.println("Nombre: "+ nom);
            System.out.println("Edad: "+ eda);
            System.out.println("Sexo: "+ sex); 
            
         }
         catch(IllegalThreadStateException ex){
             ex.printStackTrace();
         }
         catch(StringIndexOutOfBoundsException ex){
             ex.printStackTrace();
         }
         catch(IllegalArgumentException ex){
             ex.printStackTrace();
         }
         catch(NullPointerException ex){
             ex.printStackTrace();
         }
         catch(ArithmeticException ex){
             ex.printStackTrace();
         }
         catch(NegativeArraySizeException ex){
             ex.printStackTrace();
         }
         catch(IndexOutOfBoundsException ex){
             ex.printStackTrace();
         }
         catch(SecurityException ex){
             ex.printStackTrace();
         }
         catch(RuntimeException ex){
             ex.printStackTrace();
         }
         catch(Exception ex){
             ex.printStackTrace();
         }
         
    }
}
