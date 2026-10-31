package Tema2;

import java.util.Scanner;

public class Area_Rombo{
    public static void main(String[]args){
       Scanner Leer = new Scanner (System.in);   
        int L1, L2, res;
       System.out.println("Ingresa Lo Que Mide El Lado Mayor Del Rombo");
       L1 = Leer.nextInt();
       System.out.println("Ingresa Lo Que Mide El Lado Menor Del Rombo");
       L2 = Leer.nextInt();
       res = (L1*L2) / 2;
       System.out.println("El Area Del Rombo Es: " + res);
    }
}
