package Matriz000;
  import java.util.Scanner;
public class Matriz001 {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int mat[][];
        int n;
        System.out.println("Longitud En Numero");
         n= cs.nextInt();
        mat= new int[n][n];
        
      //Valores
         for(int i= 0; i< n; i++){
             for(int j= 0; j< n; j++){
                 System.out.println("Ingresa En Fila ["+i+"] Ingresa Numero ["+j+"] ");
                 mat[i][j]= cs.nextInt();
             }System.out.println(" ");
         }
         
       //Mostrar
         for(int i= 0; i< n; i++){
             for(int j= 0; j< n; j++){
                 System.out.print(mat[i][j]+" ");
             }System.out.println(" ");
         }
    }
}
