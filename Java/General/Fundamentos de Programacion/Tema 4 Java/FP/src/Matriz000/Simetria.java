package Matriz000;
   import java.util.Scanner;
public class Simetria {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int i, j, n, val, mat[][];
        boolean banderaS= true;
        
        System.out.println("Longitud En Numero");
         n= cs.nextInt();
        mat= new int [n][n]; 
        
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
                 if(mat[i][j]!= mat[j][i]){
                     banderaS= false;
                    break; 
                 }
             }
         }
         
         if(banderaS){
             System.out.println("Es Simetrica");
         }else{
             System.out.println("No Es Sinetrica");
         }
         
         for(i= 0; i< n; i++){
             for(j= 0; j< n; j++){
                 System.out.print(mat[i][j] + "\t");
             }System.out.println(" ");
         }
    }    
}
