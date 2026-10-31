package Excepcion;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Excepcion1 {
    public static void main(String[]args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        String dato= br.readLine();
        String[] txt1= dato.split(" ");
        
        System.out.println(txt1[0]);
        System.out.println(txt1[1]);
        System.out.println(txt1[2]);
        
        try{
            String txt= null;
            System.out.println(txt.length());
        }catch(NullPointerException ex){
            System.out.println("Referencia Nula Detectada: ");
        }
       
    }

}
