package BusBinaria;

public class Binaria {
    
    private static boolean search(int[] numbers, int numberSearch) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (numbers[mid] == numberSearch) {
                return true;
            }

            if (numbers[mid] < numberSearch) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
    
    public static void Busqueda(int[] arreglo, int numero){
        if(search(arreglo, numero))
            System.out.println("Se Encontro El Numero");
        else
            System.out.println("No Se Encontro EL Numero");
    }
    
}
