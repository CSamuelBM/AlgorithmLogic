package Tema2;

import java.util.Scanner;

public class Ingresar {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("Ingresa Tu Nombre");
        nombre= leer.next();
        System.out.println("Ingresa Tu Edad");
        edad= leer.nextInt();
    }
}
