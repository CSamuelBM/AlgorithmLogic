package Tema3;
    import java.util.Scanner;
public class Ing_diezNum {
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
           int i, num, acu = 0, ConP = 0, ConN = 0;      
         for(i = 0; i < 10; i++){
             System.out.println("Ingresa Un Numero Pude Ser Negativo");
              num = Leer.nextInt();
                acu += num;
             if(num < 0){
                 ConN ++;
             }else{
                 ConP ++;
             }   
         } 
          System.out.println("Los Numero Negativos Son: " + ConN);
          System.out.println("Los Numero Positivos Son: " + ConP);
    }
}
