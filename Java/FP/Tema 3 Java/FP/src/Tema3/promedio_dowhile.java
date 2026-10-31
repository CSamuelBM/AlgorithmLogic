package Tema3;

import java.util.Scanner;

public class promedio_dowhile {
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
         int  i = 1, cal, res, acu = 0;
          System.out.println("Promedio");
         do{
             System.out.println("Ingresa Calificacion: " + i);
              cal = Leer.nextInt();
                acu += cal;
               i ++;
         }while(i != 6); 
          res = acu / 5;
           System.out.println("Tu Promedio Es: " + res);
    }
}
