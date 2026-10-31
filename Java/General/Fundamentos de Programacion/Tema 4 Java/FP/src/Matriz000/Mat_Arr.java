package Matriz000;
    import java.util.Scanner;
public class Mat_Arr {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
       int i, j, n, k, l= 0, val, arr[], mat[][];
         System.out.println("Longitud En Numero");
          n= cs.nextInt();
         mat= new int[n][n];
          k= 3*3*n;
         arr= new int[k]; 
         
         for(i= 0; i< n; i++){
             for(j= 0; j< n; j++){
                 System.out.println("Ingresa Numeros");
                  val= cs.nextInt();
                  mat[i][j]= val;
               if(l< k){
                   arr[l]= i;
                    l++;
                   arr[l]= j; 
                    l++;
                   arr[l]= val;
                    l++;
               }
             }  System.out.println(" ");
         }
         
         for(i= 0; i< n; i++){
             for(j= 0; j< n; j++){
                 System.out.print(mat[i][j]+"\t");
             } System.out.println(" ");
         }
        for(l= 0; l< k; l++){
            System.out.print("["+ arr[l]+ "]");
        } System.out.println(" ");
    }
}
