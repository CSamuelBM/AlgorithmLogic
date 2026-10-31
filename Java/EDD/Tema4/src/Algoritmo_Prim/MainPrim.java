package Algoritmo_Prim;

import java.util.Scanner;

public class MainPrim {
    
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        
        System.out.println("Numero De Nodos");
        int n= cs.nextInt();
        
        MatrizAdyacencia grafo= new MatrizAdyacencia(n);
     
        for(int i= 0; i< n; i++){
            char letra= (char) (65+ i);
            String nodo= Character.toString(letra);
            grafo.nuevoVertice(nodo);   
        }
        
        System.out.println("Numero De Conexiones");
        int conexion= cs.nextInt();
        
        for(int i= 1; i<= conexion; i++){
            System.out.println("Punto Origen");
              String origen= cs.next().toUpperCase();
            System.out.println("Punto Destino");
              String destino= cs.next().toUpperCase();
            System.out.println("Peso");
              int peso= cs.nextInt();
            grafo.nuevoArco(origen, destino, peso);
            System.out.println("Conexion: "+ i);
        }
        
        System.out.println("Vertices Del Grafo");
          for(int i= 0; i< n; i++)
              System.out.print("[" +grafo.getVertice()[i].getNombreVertice()+ "]");
          System.out.println("");
          
        AlgoritmoPrim arbol= new AlgoritmoPrim(grafo, grafo.getVertice());  
        
        System.out.println("Costo Minimo Del Arbol: "+ arbol.arbolExpansionPrim());
    
    }
   
}
