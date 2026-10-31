package Tema6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio2 {
    public static void main(String[]args){
        String archivo= "D:\\Segundo Semestre I.S.C\\POO\\Poo\\accesoAlDisco\\src\\Ejercicio2.txt";
         File file= null;
        try{
          file = new File(archivo);  
        }catch(Exception ex){
            ex.printStackTrace();
        }
        try(FileWriter fr= new FileWriter(file)){
            PrintWriter pw= new PrintWriter(fr);
            for(int i= 0; i< 10; i++){
                pw.printf("Numero: %d%n", i+ 1);
            }
            System.out.println("Exitoso!!");
        }catch(IOException ex){ 
         }
    }
}