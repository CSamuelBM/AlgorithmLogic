package Tema6;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Binario {
    public static void main(String[]args){
        String binario= "D:\\Segundo Semestre I.S.C\\POO\\Poo\\accesoAlDisco\\src\\Binario.txt";
        Scanner cs= new Scanner(System.in);
        
        FileOutputStream fos= null;
        DataOutputStream salida= null;
        
        int n;
        
        try{
            fos= new FileOutputStream(binario, true);
            salida= new DataOutputStream(fos);
            
            System.out.println("Un Numero Entero");
            System.out.println("Usa -1 Para Salir");
             n= cs.nextInt();
            while(n!= -1){
                salida.writeInt(n);
                System.out.println("Un Numero Entero");
                System.out.println("Usa -1 Para Salir");
                 n= cs.nextInt();
            } 
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                if(fos!= null)
                    fos.close();
                if(salida!= null)
                    salida.close();
            }catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        
    }
}
