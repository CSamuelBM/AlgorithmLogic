package Modularidad;

  import java.util.Scanner;

public class Nom_Edad {
    
    public static void main(String[]args){  
        Scanner cs= new Scanner(System.in);
          String nom;
          int eda;
        
        System.out.println("Ingresa Tu Nombre");
         nom= cs.next();
        System.out.println("Ingresa Tu Edad");
         eda= cs.nextInt();
        mostrar(nom, eda);
    }
    
    public static void mostrar(String nom, int eda){
        System.out.println("Hola: "+ nom);
        System.out.println("Tu Edad Es: "+ eda);
    }
    
}
