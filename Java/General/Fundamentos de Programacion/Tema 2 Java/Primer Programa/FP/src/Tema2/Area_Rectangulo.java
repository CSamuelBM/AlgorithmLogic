package Tema2;

import java.util.Scanner;

public class Area_Rectangulo {
    public static void main(String[]args){
       Scanner Leer = new Scanner (System.in);
       int b, h, res;
        System.out.println("Ingresa La Base Del Rectangulo");
        b = Leer.nextInt();
        System.out.println("Ingresa La Altura Del Rectangulo");
        h = Leer.nextInt();
        res = b*h;
        System.out.println("El Resultado Del Area Es: " + res);
    }
}
