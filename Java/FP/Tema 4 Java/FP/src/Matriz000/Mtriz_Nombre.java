package Matriz000;
   import java.util.Scanner;
public class Mtriz_Nombre {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        String matNom[][]= new String[3][3];
        int i, j; 
         
         for(i= 0; i< 3; i++){
             for(j= 0; j< 3; j++){
                 System.out.println("Fila ["+i+"] Ingresa Nombre ["+j+"]");
                matNom[i][j]= cs.next();
             }System.out.println(" ");
         }
         
         for(i= 0; i< 3; i++){
             for(j= 0; j< 3; j++){
                 System.out.print(matNom[i][j]+" ");
             }System.out.println(" ");
         }
    }
}
