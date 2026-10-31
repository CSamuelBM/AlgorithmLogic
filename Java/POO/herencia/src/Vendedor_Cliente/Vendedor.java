package Vendedor_Cliente;

public class Vendedor extends Persona{
    
    String id_Vendedor, cuenta, area, venta_Dia;
    
    public Vendedor(){
        id_Vendedor= " ";
        cuenta= " ";
        area= " ";
        venta_Dia= " ";
    }
    
    public Vendedor(String nombre, String edad, String peso, String sexo, String curp, String id_Vendedor, 
                           String cuenta, String area, String venta_Dia){
        super(nombre, edad, peso, sexo, curp);
        setId_Vendedor(id_Vendedor);
        setCuenta(cuenta);
        setArea(area);
        setVenta_Dia(venta_Dia);
    }

    public String getId_Vendedor() {
        return id_Vendedor;
    }
    public void setId_Vendedor(String id_Vendedor){
        this.id_Vendedor= id_Vendedor;
    }
    
    public String getCuenta() {
        return cuenta;
    }
    public void setCuenta(String cuenta){
        this.cuenta= cuenta;
    }

    public String getArea() {
        return area;
    }
    public void setArea(String area){
        this.area= area;
    }

    public String getVenta_Dia() {
        return venta_Dia;
    }
    public void setVenta_Dia(String venta_Dia){
        this.venta_Dia= venta_Dia;
    }
    
    public void Mostrar(){
        System.out.println("Mostrando");
    }
    
}
