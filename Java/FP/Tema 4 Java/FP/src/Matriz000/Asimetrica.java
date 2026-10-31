package Matriz000;
   import java.util.Scanner;
public class Asimetrica {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int i, j, n, val, mat[][];
        boolean banderaA= true;
         
        System.out.println("Longitud En Numero");
         n= cs.nextInt();
        mat= new int[n][n];
        
        for(i= 0; i< n; i++){
            for(j= 0; j< n; j++){
                System.out.println("Fila ["+i+"] Ingresa Numero ["+j+"] ");
                 val= cs.nextInt();
               if(val>= 0 && val< 2){
                    mat[i][j]= val;
               }else{
                     j--;
                  }
               }System.out.println(" ");
            }
        
          for(i= 0; i< n; i++){
             for(j= 0; j< n; j++){
                 if(i!= j && mat[i][j]== mat[j][i]){
                     banderaA= false;
                    break; 
                 }
             }
         }
        
        if(banderaA){
             System.out.println("Es Asimetrica");
          }else{
            System.out.println("No Es Asimetrica");
         }
        
        for(i= 0; i< n; i++){
            for(j= 0; j< n; j++){
                System.out.print(mat[i][j]+ "\t");
            }System.out.println(" ");
        }
     }
  }
