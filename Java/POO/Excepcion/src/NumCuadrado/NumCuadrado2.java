package NumCuadrado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumCuadrado2 {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int num, cua;
        boolean continuar;
        
        do{
           try{
               continuar= false;
               
               System.out.println("Valor");
                num= cs.nextInt();
                
                cua= num*num;
               System.out.println("El Numero Al Cuadrado De: "+ num+ " Es: "+ cua); 

           }catch(InputMismatchException ex){
               System.out.println("El Valor Debe Ser Entero");
                cs.next();
               continuar= true;
           }
           
        }while(continuar);
        
    }
}
