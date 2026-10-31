package Algoritmo_Prim;

public class AlgoritmoPrim {
    
    private int [][] Pesos;
    private int n;
    private Vertice[] Vertices;
    int contador;
    
    public AlgoritmoPrim(MatrizAdyacencia mA, Vertice[] vertice){
        n= mA.numeroVertices();
        Pesos= mA.getMatrizAdyacencia();
        Vertices= vertice;
        contador= 0;
    }
    
    protected int arbolExpansionPrim(){
        int longitudMinima, menor;
        int z;
        int[] coste= new int[n];
        int[] masCerca= new int[n];
        boolean[] w= new boolean[n];
       
        for(int i= 0; i< n; i++)
            w[i]= false;
        
        longitudMinima= 0;    
        w[0]= true;
        
        for(int i= 1; i< n; i++){
            coste[i]= Pesos[0][i];
            masCerca[i]= 0;
        }
        
        for(int i= 1; i< n; i++){
            menor= MatrizAdyacencia.INFINITO;
            z= -1;
            for(int j= 1; j< n; j++)
                if(!w[j] && coste[j]< menor){
                    menor= coste[j];
                    z= j;
                }
            
            longitudMinima+= menor;
            
            System.out.println((++contador)+ " Recorrido: Vertice: "+ Vertices[masCerca[z]].getNombreVertice()
                    +" -> "+ "Vertice: "+ Vertices[z].getNombreVertice()+ " Peso: "+ coste[z]);
            
            w[z]= true;
            coste[z]= MatrizAdyacencia.INFINITO;
            
            for(int j= 1; j< n; j++)
                if((Pesos[z][j]< coste[j]) && !w[j]){
                    coste[j]= Pesos[z][j];
                    masCerca[j]= z;
                }
            
        }
        return longitudMinima;
    }
    
}
