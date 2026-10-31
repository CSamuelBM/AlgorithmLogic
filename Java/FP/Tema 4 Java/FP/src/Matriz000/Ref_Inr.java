package Matriz000;
  import java.util.Scanner;
public class Ref_Inr {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int i, j, n, val, mat[][], opc;
        boolean bandera= true;
         System.out.println("Longitud En Numero");
          n= cs.nextInt();
         mat= new int[n][n];
         
           for(i= 0; i< n; i++){
               for(j= 0; j< n; j++){
                   System.out.println("Ingresa Numeros");
                    val= cs.nextInt();
                  if(val>= 0 && val< 2){
                      mat[i][j]= val;
                  }   
               } System.out.println(" ");
           }
            
           for(i= 0; i< n; i++){
               for(j= 0; j< n; j++){
                   if(mat[i][i]!= 1){
                       bandera= false;
                        break;
                   }
               }
           }
           
         for(i= 0; i< n; i++){
          for(j= 0; j< n; j++){
            System.out.print(mat[i][j]+"\t");
               } System.out.println(" ");
           } 
            System.out.println(" ");
           if(bandera){
               System.out.println("Es Reflexiva");
           }else{
               System.out.println("No Es Reflexiva");
                System.out.println("Opciones");
                 System.out.println("1.- Convertirla En Reflexiva");
                 System.out.println("2.- Convertirla En No Reflexiva");
               opc= cs.nextInt();
                System.out.println(" ");
            switch(opc){
                case 1:
                  for(i= 0; i< n; i++){
                     for(j= 0; j< n; j++){
                         mat[i][i]= 1;
                       System.out.print(mat[i][j]+"\t");
               } System.out.println(" ");
           }
                    break;
                case 2:
                   for(i= 0; i< n; i++){
                     for(j= 0; j< n; j++){
                         mat[i][i]= 0;
                      System.out.print(mat[i][j]+"\t");
               } System.out.println(" ");
           }
                     break;
                default:
                    System.out.println("Saliste");
            }      
        }
    }
}
