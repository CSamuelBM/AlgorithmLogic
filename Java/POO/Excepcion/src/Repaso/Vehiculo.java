package Repaso;

public class Vehiculo {
    
    String placa, fechaFabricacion;
    boolean asegurado;
    
    public Vehiculo(){
        placa= "";
        fechaFabricacion= "";
        asegurado= false;
    }
    public Vehiculo(String placa, String fechaFabricacion, boolean asegurado){
        setPlaca(placa);
        setFechaFabricacion(fechaFabricacion);
        setAsegurado(asegurado);        
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }
    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public boolean isAsegurado() {
        return asegurado;
    }
    public void setAsegurado(boolean asegurado) {
        this.asegurado = asegurado;
    }
    
}
