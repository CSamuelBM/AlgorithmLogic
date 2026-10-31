package Ordenamiento;

public class RadixSort {
    
    public static void main(String[] args) {
        
        int[] miArr = {170, 45, 75, 90, 802, 24, 2, 66};
        int[][] matDecimal = new int[10][miArr.length];
        int[] contArr = new int[10];
        
        int maxVal = numMax(miArr);
        int posDigito = 1;
        
        while(maxVal / posDigito > 0){
            
            for(int val : miArr){
                int indice = (val / posDigito) % 10;
                matDecimal[indice][contArr[indice]] = val;
                contArr[indice] ++;
            }
            
            int pos = 0;
            
            for(int i = 0; i< 10; i++){
                
                for(int j = 0; j< contArr[i]; j++){
                    miArr[pos] = matDecimal[i][j];
                    pos ++;
                }
                contArr[i] = 0;
            }
            posDigito *= 10;
        }
        
        for(int val : miArr)
            System.out.print(val+ " ");
        
        System.out.println();
        
    }
    
    public static int numMax(int[] arr){
        
        int max = arr[0];
        
        for(int val : arr){
            if(val > max) 
                max = val;
        }
        
        return max;
    }
    
}
