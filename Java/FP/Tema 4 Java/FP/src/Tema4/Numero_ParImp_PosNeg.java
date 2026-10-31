package Tema4;

   import java.util.Scanner;
public class Numero_ParImp_PosNeg {
    public static void main(String[]args){
        Scanner cs = new Scanner(System.in);
        
        int num, i = 0, lim= 8, toPeP= 0, toPeN= 0;
        int arrPos[] = new int[5];
        int arrNeg[] = new int[5];
      
        while(i <= lim){
            System.out.println("Ingresa Un Numero");
             num = cs.nextInt();
            if(num%2== 0){
                if(num >= 0 && toPeP < 5){
                    arrPos[toPeP]= num;
                     toPeP ++;  
                }
            }else{
                 if(num < 0 && toPeN < 5){
                       arrNeg[toPeN] = num;
                       toPeN++; 
                   }
            } 
            i++;
        }
            System.out.println("Numero Positivos Y Pares");
         for(i= 0; i< toPeP; i++){
             System.out.println("["+arrPos[i]+ "]");
         }
            
            System.out.println("Numero Negativos E Impares");
         for(i= 0; i< toPeN; i++){
               System.out.println("["+arrNeg[i]+ "]");
             }
    }
}