package PrimerArbol;

public class Arbol {
    
    Nodo raiz;
    
    public Arbol(){
        raiz= null;
    }
    
    public void Insertar(int valor){
        Nodo nuevo= new Nodo(valor);
        
        if(raiz== null){
            raiz= nuevo;
            return;
        }
        
        InsertarRecursivo(nuevo, raiz);
    }
    
    public void InsertarRecursivo(Nodo nuevoNodo, Nodo actualRaiz){
        if(nuevoNodo.valor< actualRaiz.valor){
            if(actualRaiz.izquierda== null)
                actualRaiz.izquierda= nuevoNodo;
            else
                InsertarRecursivo(nuevoNodo, actualRaiz.izquierda);
        }else{
            if(actualRaiz.derecha== null)
                actualRaiz.derecha= nuevoNodo;
            else
                InsertarRecursivo(nuevoNodo, actualRaiz.izquierda);
        }
    }
    
    public void Preorden(Nodo raiz){
        if(raiz== null)
            return;

        System.out.println(raiz.valor);
        Preorden(raiz.izquierda);
        Preorden(raiz.derecha);
        
    }
    
}
