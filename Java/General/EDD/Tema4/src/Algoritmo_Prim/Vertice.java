package Algoritmo_Prim;

public class Vertice {
    
    private String nombreVertice;
    private int numeroVertice;
    
    public Vertice(String nombreVertice){
        this.nombreVertice= nombreVertice;
        numeroVertice= -1;
    }
    
    public String getNombreVertice(){
        return nombreVertice;
    }
    
    public boolean compararVertice(Vertice actualVertice){
        return nombreVertice.equals(actualVertice.nombreVertice);
    }
    
    public int getNumeroVertice(){
        return numeroVertice;
    }
    public void setNumeroVertice(int numeroVertice){
        this.numeroVertice= numeroVertice;
    }
    
}
