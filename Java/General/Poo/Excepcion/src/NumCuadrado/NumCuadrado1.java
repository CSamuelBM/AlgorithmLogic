package NumCuadrado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumCuadrado1 {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int num, cua;
        
       try{
        System.out.print("Valor--> ");
         num= cs.nextInt();
         
         cua= num* num; 
         System.out.println("El Numero Al Cuadrado De: "+ num+ " Es: "+ cua);
            }catch(InputMismatchException ex){
              System.err.println("El Valor Debe Ser Entero");
        }
    }
}
