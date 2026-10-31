package Cine;

public class Cliente {
    
    String nombre, tarjeta;
    int id_Cliente, num_Visita;
    
    public Cliente(){
        this(" ", 0, 0, " ");
    }
    
    public Cliente(String nombre, int id_Cliente, int num_Visita, String tarjeta){
        setNombre(nombre);
        setId_Cliente(id_Cliente);
        setNum_Visita(num_Visita);
        setTarjeta(tarjeta);
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public int getId_Cliente(){
        return id_Cliente;
    }
    public void setId_Cliente(int id_Cliente){
        this.id_Cliente= id_Cliente;
    }
    
    public int getNum_Visita(){
        return num_Visita;
    }
    public void setNum_Visita(int num_Visita){
        this.num_Visita= num_Visita;
    }
    
    public String getTarjeta(){
        return tarjeta;
    }
    public void setTarjeta(String tarjeta){
        this.tarjeta= tarjeta;
    }
    
    public void Mostrar(){
        System.out.println("Se Mostro");
    }
    public void Visita(){
        System.out.println("Se Mostro");
    }
    
}
