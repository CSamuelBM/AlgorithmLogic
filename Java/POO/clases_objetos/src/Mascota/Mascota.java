package Mascota;

public class Mascota {
    
    String nombre, enfermedad, raza, tip_Sangre;
    int id_Mascota, edad;
    boolean esterilizado;
    
    public Mascota(){
        this(" ", " ", " ", " ", 0, 0, false);
    }
    
    public Mascota(String nombre, String enfermedad, String raza, String tip_Sangre, int id_Mascota, 
                       int edad, boolean esterilizado){
        setNombre(nombre);
        setEnfermedad(enfermedad);
        setRaza(raza);
        setTip_Sangre(tip_Sangre);
        setId_Mascota(id_Mascota);
        setEdad(edad);
        setEsterilizado(esterilizado);
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public String getEnfermedad(){
        return enfermedad;
    }
    public void setEnfermedad(String enfermedad){
        this.enfermedad= enfermedad;
    }
    
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza= raza;
    }
    
    public String getTip_Sangre(){
        return tip_Sangre;
    }
    public void setTip_Sangre(String tip_Sangre){
        this.tip_Sangre= tip_Sangre;
    }
    
    public int getId_Mascota(){
        return id_Mascota;
    }
    public void setId_Mascota(int id_Mascota){
        this.id_Mascota= id_Mascota;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad= edad;
    }

    public boolean getEsterilizado() {
        return esterilizado;
    }
    public void setEsterilizado(boolean esterilizado){
        this.esterilizado= esterilizado;
    }
    
    public void EstadoSalud(){
        System.out.println("Bien o Mal");
    }
    
}
