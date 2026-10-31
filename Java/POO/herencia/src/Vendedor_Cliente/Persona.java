package Vendedor_Cliente;

public class Persona {
    
    String nombre, edad, peso, sexo, curp;
    
    public Persona(){
        this(" ", " ", " ", " ", " ");
    }
    
    public Persona(String nombre, String edad, String peso, String sexo, String curp){
        setNombre(nombre);
        setEdad(edad);
        setPeso(peso);
        setSexo(sexo);
        setCurp(curp);
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public String getEdad(){
        return edad;
    }
    public void setEdad(String edad){
        this.edad= edad;
    }
    
    public String getPeso(){
        return peso;
    }
    public void setPeso(String peso){
        this.peso= peso;
    }
    
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo= sexo;
    }
    
    public String getCurp(){
        return curp;
    }
    public void setCurp(String curp){
        this.curp= curp;
    }
    
    public void Mostrar(){
        System.out.println("Mostrando");
    }
}
