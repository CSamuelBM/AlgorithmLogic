package Mascota;

public class Cliente {
    
    String nombre, direccion, mascotas, celular, CURP, RFC;
    int id_Cliente, saldo;
    
    public Cliente(){
        this(" ", " ", " ", " ", " ", " ", 0, 0);
    }
    
    public Cliente(String nombre, String direccion, String mascota, String celular, String CURP, 
                        String RFC, int id_Cliente, int saldo){
        setNombre(nombre);
        setDireccion(direccion);
        setMascota(mascota);
        setCelular(celular);
        setCurp(CURP);
        setRfc(RFC);
        setId_Cliente(id_Cliente);
        setSaldo(saldo);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getMascota() {
        return mascotas;
    }
    public void setMascota(String mascotas) {
        this.mascotas = mascotas;
    }
    
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getCurp() {
        return CURP;
    }
    public void setCurp(String CURP) {
        this.CURP = CURP;
    }

    public String getRfc() {
        return RFC;
    }
    public void setRfc(String RFC) {
        this.RFC = RFC;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }
    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public double Pagar(){
        return 0;
    }
    
}
