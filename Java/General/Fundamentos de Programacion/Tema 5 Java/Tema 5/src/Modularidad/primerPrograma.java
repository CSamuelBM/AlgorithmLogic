package Modularidad;

import java.util.Scanner;

public class primerPrograma {
    
  //Primer Bloke  
    public static void main(String[]args){
       String nom; 
        Scanner cs= new Scanner(System.in);
         System.out.println("Ingresa Tu Nombre");
           nom= cs.next();
        mostrar(nom);   
    }
    
  //Segundo Bloke  
    public static void mostrar(String nom){
        System.out.println("Bienvenido: "+ nom);
         System.out.println("Es Pero Que Estes Bien En ISC");
         
    }
}
