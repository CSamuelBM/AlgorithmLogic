package BusBinaria;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner cs= new Scanner(System.in);
        
        int arreglo[]= {23, 32, 90, 4};
        
        System.out.println("Ingresa El Numero A Buscar");
        int numABuscar= cs.nextInt();
        
        Binaria.Busqueda(arreglo, numABuscar);
        
    }
    
}
