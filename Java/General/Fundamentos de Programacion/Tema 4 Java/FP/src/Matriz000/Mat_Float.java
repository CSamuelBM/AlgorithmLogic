package Matriz000;
   import java.util.Scanner;
public class Mat_Float {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int i, j, n;
         float mat[][];
        System.out.println("Longitud En Numero");
         n= cs.nextInt();
        mat= new float[n][n];
        
        for(i= 0; i< n; i++){
            for(j= 0; j< n; j++){
                System.out.println("Fila ["+i+"] Tiempo ["+j+"] ");
                 mat[i][j]= cs.nextFloat();
            }System.out.println(" ");
        }
        
        for(i= 0; i< n; i++){
            for(j= 0; j< n; j++){
                System.out.print(mat[i][j]+ "\t");
            }System.out.println(" ");
        }
    }
}
