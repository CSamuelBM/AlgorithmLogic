package Tema2;

import java.util.Scanner;

public class Area_Cuadrado {
    public static void main(String[]args){
        Scanner Leer = new Scanner (System.in);
       int lado, res;
        System.out.println("Ingresa El Lado Del Cuadrado");
       lado = Leer.nextInt();
        res = lado*lado;
       System.out.println("El Resultado Del Area Es: " + res);
    }
}
