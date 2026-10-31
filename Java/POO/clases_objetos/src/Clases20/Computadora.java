package Clases20;

public class Computadora {
    
    String pantalla, teclado, mause;
    int memoria;
    
    public Computadora(){
        pantalla= " ";
        teclado= " ";
        mause= " ";
        memoria= 0;
      }
    
    public Computadora(String pantalla, String teclado, String mause, int memoria){
        setPantalla(pantalla);
        setTeclado(teclado);
        setMause(mause);
        setMemoria(memoria);
    }
    
    public String getPantalla(){
        return pantalla;
    }
    public void setPantalla(String pantalla){
        this.pantalla= pantalla;
    }
    
    public String getTeclado(){
        return teclado;
    }
    public void setTeclado(String teclado){
        this.teclado= teclado;
    }
    
    public String getMause(){
        return mause;
    }
    public void setMause(String mause){
        this.mause= mause;
    }
    
    public int getMemoria(){
        return memoria;
    }
    public void setMemoria(int memoria){
        this.memoria= memoria;
    }
            
}
