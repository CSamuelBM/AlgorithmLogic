package Modularidad;
  import java.util.Scanner;
public class MAdivinanza {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int i, j, n, val, num, mat[][], opr= 3, vue= 0;
          System.out.println("Ingresa Longitud En Numero");
            n= cs.nextInt();
           mat= new int[n][n]; 
        
        for(i= 0; i< n; i++){
            for(j= 0; j< n; j++){
                val= (int)(Math.random()*n)+1;
                 mat[i][j]= val;
            }
        }
        
             while(vue< opr){  
               System.out.println("Selecciona Una Opcion Del 0 a "+(n-1));
                  i= cs.nextInt();
                  j= cs.nextInt();
                
                System.out.println("Ingresa Un Numero");
                 num= cs.nextInt();
                  
                if(num== mat[i][j]){
                    System.out.println("Felicidades Acertaste");
                     break;
                }else if(num!= mat[i][j]){
                    System.out.println("Vulve A Intentar");
                }  vue++;
                
                  System.out.println(" ");
                  
                if(vue== opr){
                    System.out.println("Las Oportunidades Acabaron");
                     break;
                } 
            }
        }
}
