package Vendedor_Cliente;

public class Cliente extends Persona{
    
    String id_Cliente, saldo, fecha_Registro, credito;
    
    public Cliente(){
        id_Cliente= " ";
        saldo= " ";
        fecha_Registro= " ";
        credito= " ";
    }
    
    public Cliente(String nombre, String edad, String peso, String sexo, String curp, 
                     String id_Cliente, String saldo, String fecha_Registro, String credito){
        super(nombre, edad, peso, sexo, curp);
        setId_Cliente(id_Cliente);
        setSaldo(saldo);
        setFecha_Registro(fecha_Registro);
        setCredito(credito);
    }

    public String getId_Cliente() {
        return id_Cliente;
    }
    public void setId_Cliente(String id_Cliente) {
        this.id_Cliente = id_Cliente;
    }
    
    public String getSaldo() {
        return saldo;
    }
    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
    
    public String getFecha_Registro() {
        return fecha_Registro;
    }
    public void setFecha_Registro(String fecha_Registro) {
        this.fecha_Registro = fecha_Registro;
    }
    
    public String getCredito() {
        return credito;
    }
    public void setCredito(String credito) {
        this.credito = credito;
    }
    
    public void Mostrar(){
        System.out.println("Mostrando");
    }
    
}
