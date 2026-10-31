package Tema2;

import java.util.Scanner;

public class Area_Triangulo {
    public static void main(String[]args){
        Scanner Leer = new Scanner (System.in);
       int b,h, res;
        System.out.println("Ingresa La Base Del Triangulo");
         b = Leer.nextInt();
        System.out.println("Ingresa La Altura Del Triangulo");
         h = Leer.nextInt();
        res = (b*h) /2;
        System.out.println("El Resultado Del Area Es: " + res);
    }
}
