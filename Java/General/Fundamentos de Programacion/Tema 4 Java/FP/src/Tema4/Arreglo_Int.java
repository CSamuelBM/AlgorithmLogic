package Tema4;

import java.util.Scanner;
public class Arreglo_Int {
    public static void main(String[]args){
        Scanner cs = new Scanner(System.in);
        
        int i, var, n;
        int arregloInt[];
        
         System.out.println("Ingresa La Longitud Del Arreglo");
          n = cs.nextInt(); 
         arregloInt = new int[n]; 
         
          for(i= 0; i< n; i++){
              System.out.println("Ingresa Valor");
               var= cs.nextInt();
              arregloInt[i]= var; 
          }
          
            for(i= 0; i< n; i++){
              System.out.println("["+arregloInt[i]+ "]");
          }
          
    }
}
