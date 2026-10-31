package Examen;

public class Intendente extends Admon{
    
    String zona;
    int nivel;
    boolean seguridad;
    
    public Intendente(){
        zona= " "; 
        nivel= 0;
        seguridad= false;
    }
    
    public  Intendente(int id_Ad, String nombre, String fecha_Contrato, double salario, String zona, int nivel, boolean seguridad){
        super(0, " ", " ", 0);
        setZona(zona);
        setNivel(nivel);
        setSeguridad(seguridad);
    }

    public String getZona() {
        return zona;
    }
    public void setZona(String zona) {
        this.zona = zona;
    }
    
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public boolean getSeguridad() {
        return seguridad;
    }
    public void setSeguridad(boolean seguridad) {
        this.seguridad = seguridad;
    }
    
    public void Mostrar(){
      System.out.println("Area "+ getZona());
      System.out.println("Jefe "+ getNivel());
      System.out.println("Horario "+ getSeguridad());
    }
      
}
