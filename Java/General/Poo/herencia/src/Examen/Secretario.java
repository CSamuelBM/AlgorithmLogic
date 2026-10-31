package Examen;

public class Secretario extends Admon{
    
    String area, jefe, horario;
    
    public Secretario(){
       area= " ";
       jefe= " ";
       horario= " ";
    }
    public Secretario(int id_Ad, String nombre, String fecha_Contrato, double salario, String area, String jefe, String horario){
        super(0, " ", " ", 0);
        setArea(area);
        setJefe(jefe);
        setHorario(horario);
    }

    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    
    public String getJefe() {
        return jefe;
    }
    public void setJefe(String jefe) {
        this.jefe = jefe;
    } 

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public void Mostrar(){
        System.out.println("Area "+ getArea());
        System.out.println("Jefe "+ getJefe());
        System.out.println("Horario "+ getHorario());
    }
    
}
