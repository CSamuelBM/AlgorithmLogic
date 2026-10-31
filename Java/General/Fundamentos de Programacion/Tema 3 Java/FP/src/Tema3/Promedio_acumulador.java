package Tema3;
     import java.util.Scanner;
public class Promedio_acumulador {
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
          int i, cal, acu = 0;
          double res;
         for(i = 0; i < 5; i++){
             System.out.println("Ingresa Tu Calificacion");
              cal = Leer.nextInt();
               acu += cal;
         } 
           res = (double)acu / 5; 
          System.out.println("Tu Promedio Es: " + res);
    }
}
