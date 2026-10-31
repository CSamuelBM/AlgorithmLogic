package SegundoArbol;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        Arbol arbol= new Arbol();
        
        int numeroNodos= cs.nextInt();
        
        for(int i= 0; i< numeroNodos; i++){
            int valorNodos= cs.nextInt();
            arbol.IngresarValor(valorNodos);
        }
        
        System.out.println("Preorden Del Arbol");
        arbol.Preorden();
        System.out.println("Hojas Del Arbol");
        arbol.Hojas();
        System.out.println("Ingresa Un Valor A Buscar");
        int valor= cs.nextInt();
        arbol.BusquedaBinaria(valor);
        
    }
    
}
