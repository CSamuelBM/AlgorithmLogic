package Algoritmo_Prim;

public class MatrizAdyacencia {
    
    public static int INFINITO= 0xFFFF;
    
    private int [][] matPesos;
    private Vertice[] vertices;
    private int numeroVertice;
    
    public MatrizAdyacencia(int n){
        matPesos= new int[n][n];
        vertices= new Vertice[n];
        
        for(int i= 0; i< n; i++){
            for(int j= 0; j< n; j++){
                matPesos[i][j]= INFINITO;
            }
        }
        numeroVertice= 0;
    }
    
    public void nuevoVertice(String nombreVertice){
        boolean existe= numVertice(nombreVertice) >= 0;
        if(!existe){
            Vertice vertice= new Vertice(nombreVertice);
            vertice.setNumeroVertice(numeroVertice);
            vertices[numeroVertice++]= vertice;
        }
    }
    
    public int pesoArco(String a, String b){
        int verticeA, verticeB;
        
        verticeA= numVertice(a);
        verticeB= numVertice(b);
        
        return matPesos[verticeA][verticeB];
    }
    
    public int numeroVertices(){
        return numeroVertice;
    }
    
    public Vertice[] getVertice(){
        return vertices;
    }
    
    public void nuevoArco(String a, String b, int peso){
        int verticeA, verticeB;
        
        verticeA= numVertice(a);
        verticeB= numVertice(b);
        
        if(verticeA>= 0 && verticeA< matPesos.length && verticeB>= 0 && verticeB< matPesos.length){
            matPesos[verticeA][verticeB]= peso;
            matPesos[verticeB][verticeA]= peso;
        }
    }
    
    private int numVertice(String nombresVertices){
        Vertice vertice= new Vertice(nombresVertices);
        boolean encontrado= false;
        int i= 0;
        
        for(; (i< numeroVertice) && !encontrado;){
            encontrado= vertices[i].getNombreVertice().equals(nombresVertices);
            if(!encontrado){
                i++;
            }
        }
        return (i< numeroVertice)? i: -1;
    }
    
    public int[][] getMatrizAdyacencia(){
        return matPesos;
    }
    
}
