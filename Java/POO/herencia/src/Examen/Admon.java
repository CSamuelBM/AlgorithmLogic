package Examen;

public class Admon {
    int id_Ad;
    String nombre, fecha_Contrato;
    double salario;
    
    public Admon(){
        this(0, " ", " ", 0);
    }
    
    public Admon(int id_Ad, String nombre, String fecha_Contrato, double salario){
        setId_Ad(id_Ad);
        setNombre(nombre);
        setFecha_Contrato(fecha_Contrato);
        setSalario(salario);
    }

    public int getId_Ad() {
        return id_Ad;
    }
    public void setId_Ad(int id_Ad) {
        this.id_Ad = id_Ad;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getFecha_Contrato() {
        return fecha_Contrato;
    }
    public void setFecha_Contrato(String fecha_Contrato) {
        this.fecha_Contrato = fecha_Contrato;
    }
    
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
