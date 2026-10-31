package Excepcion;

import java.util.Scanner;

public class Excepcion3 {
    public static void main(String[]args){
     
            int eda;
            
            Scanner cs= new Scanner(System.in);
            
        try{ 
            System.out.println("Edad");
             eda= cs.nextInt();
             
            System.out.println("Edad: "+ eda);
             
            lanzarExceptionVerificada();
            
        }catch(SamuelException ex){
             System.out.println("Capturada: "+ ex);
        }
        
    }
    
    public static void lanzarExceptionVerificada() throws SamuelException{
        throw new SamuelException("Era Numero Entero");
    }
    
}
