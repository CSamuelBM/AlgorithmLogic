package Tema2;

import java.util.Scanner;

public class Area_Circulo {
    public static void main(String[]args){
       Scanner Leer = new Scanner (System.in);
      final double Pi = 3.1416;
      double r, res;
        System.out.println("Ingresa El Radio Del Circulo");
        r = Leer.nextInt();
         res = Pi*r*r;
        System.out.println("El Resultado Del Area Es: " + res);
    }
}
