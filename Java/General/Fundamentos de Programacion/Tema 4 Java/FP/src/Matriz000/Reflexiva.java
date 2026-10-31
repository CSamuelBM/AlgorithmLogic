package Matriz000;

import java.util.Scanner;

public class Reflexiva {

    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);

        int i, j, n, val, mat[][];
        boolean banderaR= true;
        System.out.println("Longitud En Numero");
        n = cs.nextInt();
        mat = new int[n][n];

        for (i = 0; i< n; i++) {
            for (j = 0; j< n; j++) {
                System.out.println("Fila [" +i+ "] Ingresa Numero [" +j+ "] ");
                  val = cs.nextInt();
                if (val>= 0 && val< 2) {
                    mat[i][j]= val;
                } else {
                    j--;
                }
            }System.out.println(" ");
        }
        
        for(i= 0; i< n; i++){
            for(j= 0; j< n; j++){
                if(mat[i][i]== 0){
                     banderaR= false;
                    break;
                }
            }
        }
        
        if (banderaR) {
            System.out.println("Es Reflexiva");
        } else {
            System.out.println("Es Irreflexiva");
        }

        for (i= 0; i< n; i++) {
            for (j= 0; j< n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}
