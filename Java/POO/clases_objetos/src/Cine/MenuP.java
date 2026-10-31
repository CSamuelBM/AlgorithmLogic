package Cine;

import java.util.Scanner;

public class MenuP {
    private static Scanner cs = new Scanner(System.in);
    
    public static int MenuPrincipal(){
        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("1.- Cliente");
        System.out.println("2.- Dulceria");
        System.out.println("3.- Pelicula");
        System.out.println("4.- Producto");
        System.out.println("5.- Trabajador");
        System.out.println("6.- Cartelera");
        System.out.println("7.- Salir");
        return cs.nextInt();
    }
}
