package PrimerArbol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        Arbol arbol= new Arbol();
        
        int limite= cs.nextInt();
        
        for(int i= 0; i< limite; i++){
            int pesos= cs.nextInt();
            arbol.Insertar(pesos);
        }
        
        System.out.println("");
        arbol.Preorden(arbol.raiz);
        
    }
}
