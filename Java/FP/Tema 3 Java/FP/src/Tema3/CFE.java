package Tema3;

import java.util.Scanner;

public class CFE {
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
         double watts, res;
         
         System.out.println("Ingresa Tu Consumo De Luz");
          watts = Leer.nextDouble();
          
          if(watts > 430){
              res = 0.45*430;
              res +=(watts - 430)*1.35;
          }else{
              res = watts*0.45;
          }
          System.out.println("Lo que hay que pagar de luz es: " + res);
    }
}
