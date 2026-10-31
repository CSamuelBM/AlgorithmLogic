package Tema3;
   import java.util.Scanner;
public class promedio_while {
    public static void main(String[] args){
       Scanner cs = new Scanner(System.in);
    int i = 0, n, c, nA = 0, sA = 0, ac = 0;
    double p;

     System.out.println("Ingresa Cuantas Calificaciones");                                                                      
        n = cs.nextInt();

     while(i < n){
        System.out.println("Ingresa Calificacion");
          c = cs.nextInt();
           ac = ac + c;
         if(c < 70){
             nA ++;
           }else{
             sA ++;
           }
          i ++;         
     }

       p = (double) ac/n;
     System.out.println("Promedio: " + p);
      System.out.println("No Acreditadas: " + nA);
      System.out.println("Si Acreditadas: " + sA);
  }
}
