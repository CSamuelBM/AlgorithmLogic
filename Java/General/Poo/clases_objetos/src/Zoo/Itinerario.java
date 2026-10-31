package Zoo;

public class Itinerario {
    
    String zona;
    int codigo, tim_Recorrido, tamaño, num_Visitantes, num_Especie;
    
    public Itinerario(){
        this(" ", 0, 0, 0, 0, 0);
    }
    
    public Itinerario(String zona, int codigo, int tim_Recorrido, int tamaño, int num_Visitantes, int num_Especie){
        setZona(zona);
        setCodigo(codigo);
        setTim_Recorrido(tim_Recorrido);
        setTamaño(tamaño);
        setNum_Visitantes(num_Visitantes);
        setNum_Especies(num_Especie);
    }
    
    public String getZona(){
        return zona;
    }
    public void setZona(String zona){
        this.zona= zona;
    }
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo= codigo;
    }
    
    public int getTim_Recorrido(){
        return tim_Recorrido;
    }
    public void setTim_Recorrido(int tim_Recorrido){
        this.tim_Recorrido= tim_Recorrido;
    }
    
    public int getTamaño(){
        return tamaño;
    }
    public void setTamaño(int tamaño){
        this.tamaño= tamaño;
    }
    
    public int getNum_Visitantes(){
        return num_Visitantes;
    }
    public void setNum_Visitantes(int num_Visitantes){
        this.num_Visitantes= num_Visitantes;
    }
    
    public int getNum_Especies(){
        return num_Especie;
    }
    public void setNum_Especies(int num_Especie){
        this.num_Especie= num_Especie;
    }
    
}
