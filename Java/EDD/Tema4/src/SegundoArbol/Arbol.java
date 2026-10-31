package SegundoArbol;

public class Arbol {
    
    Nodo raiz;
    
    public Arbol(){
        raiz= null;
    }
    
    public void IngresarValor(int valor){
        Nodo nuevaRaiz= new Nodo(valor);
        
        if(raiz== null){
            raiz= nuevaRaiz;
            return;
        }
        
        InsertarRecursiva(nuevaRaiz, raiz);
        
    }
    
    private void InsertarRecursiva(Nodo nuevaRaiz, Nodo raiz){
        
        if(nuevaRaiz.valor< raiz.valor){
            if(raiz.izquierda== null)
                raiz.izquierda= nuevaRaiz;
            else
                InsertarRecursiva(nuevaRaiz, raiz.izquierda);
        }else{
            if(raiz.derecha== null)
                raiz.derecha= nuevaRaiz;
            else
                InsertarRecursiva(nuevaRaiz, raiz.derecha);
        }
        
    }
    
    public void Preorden(){
        PreordenRecursivo(raiz);
    }
    private void PreordenRecursivo(Nodo raiz){
        
        if(raiz== null)
            return;
        
        System.out.println(raiz.valor);
        PreordenRecursivo(raiz.izquierda);
        PreordenRecursivo(raiz.derecha);
        
    }
    
    public void Hojas(){
        HojasRecursivo(raiz);
    }
    private void HojasRecursivo(Nodo raiz){
        if(raiz== null)
            return;
        
        if(raiz.izquierda== null && raiz.derecha== null){
           System.out.println(raiz.valor);
           return;
        }
        
        HojasRecursivo(raiz.izquierda);
        HojasRecursivo(raiz.derecha);
        
    }
    
    public void BusquedaBinaria(int valor){
        BusquedaRecursiva(valor, raiz);
    }
    private boolean BusquedaRecursiva(int valor, Nodo raiz){
        if(raiz== null){
            System.out.println("No Se Encontro");
            return false;
        }
        if(raiz.valor== valor){
            System.out.println("Se Encontro");
            return true;
        }
        
        if(valor< raiz.valor)
            return BusquedaRecursiva(valor, raiz.izquierda);
        else
            return BusquedaRecursiva(valor, raiz.derecha);
        
    }
    
}
