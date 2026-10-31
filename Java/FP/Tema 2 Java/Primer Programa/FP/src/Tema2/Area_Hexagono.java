package Tema2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area_Hexagono {
    public static void main(String[]args){
        Scanner Leer = new Scanner(System.in);
        float L;
         System.out.println("Ingresa El Perimetro Del Hexagono");
         L = Leer.nextFloat();
         double res = (3 * Math.sqrt(3)/2)* Math.pow(L,2);
          DecimalFormat df = new DecimalFormat("#.##");
         System.out.println("El Resultado Del Area Es: " + df.format(res));
    }
}
