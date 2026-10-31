package Tema3;
     import java.util.Scanner;
public class cien_numPI {
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
         int num, i, par = 0, imp = 0, acu = 0;
           for(i = 0; i < 100; i++){
               System.out.println("Ingresa 100 Numero");
                num = Leer.nextInt();
                 acu += num;
                if(num % 2 == 0){
                    par ++;
                }else{
                    imp ++;
                } 
           }
           System.out.println("Numero Par: " + par);
           System.out.println("Numero Impar: " + imp);
    }
}
