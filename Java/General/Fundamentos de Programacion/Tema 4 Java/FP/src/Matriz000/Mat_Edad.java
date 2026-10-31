package Matriz000;
   import java.util.Scanner;
public class Mat_Edad {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int i, j, n, eda;
        boolean mat[][];
         System.out.println("Longitud En Numero");
          n= cs.nextInt();
        mat= new boolean[n][n];  
        
        for(i= 0; i< n; i++){
            for(j= 0; j< n; j++){
                System.out.println("Fila ["+i+"] Ingresa Tu Edad ["+j+"] ");
                 eda= cs.nextInt();
                 
                 if(eda>= 18){
                    mat[i][j]= true;
                 }else{
                     mat[i][j]= false;
                 }
                 
            }  System.out.println(" ");
        }
          
        for(i= 0; i< n; i++){
            for(j= 0; j< n; j++){
                System.out.print(mat[i][j]+ "\t");
            } System.out.println(" ");
        }  
    }
}
