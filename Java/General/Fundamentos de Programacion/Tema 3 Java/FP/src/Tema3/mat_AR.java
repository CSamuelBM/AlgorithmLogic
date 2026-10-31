package Tema3;
    import java.util.Scanner;
public class mat_AR {
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in); 
         int i, cal, acu = 0, ConA = 0, ConR = 0;
         double res;
          for(i = 0; i < 5; i++){
              System.out.println("Ingres Tu Calificacion");
               cal = Leer.nextInt();
                  acu += cal;
            if(cal < 70){
                ConR ++;
            }else{
                ConA ++;
            }   
        }
          res = (double)acu/5;
          System.out.println("Reprobaste: " + ConR);
          System.out.println("Aprobaste: " + ConA);
          System.out.println("Tu Promedio Es: " + res);
    }
}
