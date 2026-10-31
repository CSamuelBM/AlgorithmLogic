package Cine;

import java.util.Scanner;

public class MenuA {
    private static Scanner cs= new Scanner(System.in);
    
    public static int MenuSecundario(){
        System.out.println("1.- Registrar");
        System.out.println("2.- Mostrar");
        System.out.println("3.- Buscar");
        System.out.println("4.- Actualizar");
        System.out.println("5.- Volver");
        return cs.nextInt();
    }
    
     public static int MenuCartelera(){
        System.out.println("2.- Mostrar");
        System.out.println("3.- Buscar");
        System.out.println("4.- Actualizar");
        System.out.println("5.- Volver");
        return cs.nextInt();
    }
    
}
