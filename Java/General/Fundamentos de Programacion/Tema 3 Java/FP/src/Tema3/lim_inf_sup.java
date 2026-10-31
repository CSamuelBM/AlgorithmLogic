package Tema3;
      import java.util.Scanner;
public class lim_inf_sup {
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
          
           int lI = 0, lS = 0; 
           
             System.out.println("Ingresa El Limite Superior");
               lS = Leer.nextInt();
                
             System.out.println("Ingresa El Limite Inferior");
               lI = Leer.nextInt();
              if(lI <= lS){
                  do{
                      System.out.println("Valor: " + lI);
                       lI ++;
                  }while(lI <= lS);
              }else{
                  do{
                      System.out.println("Valor: " + lI);
                       lI --;
                  }while(lI >= lS);
              } 
  
    }
}
