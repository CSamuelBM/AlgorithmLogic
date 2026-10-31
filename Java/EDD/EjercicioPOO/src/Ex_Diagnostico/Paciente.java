package Ex_Diagnostico;

import java.util.Scanner;

public class Paciente extends Persona implements Operaciones{
    private static Scanner cs= new Scanner(System.in);
    
    private String name;
    private boolean bandera;
    private int pos;
    private Paciente[] Arr= new Paciente[5];
    
    private String tipoSangre, enfermedad, alergia, sexo;
    private int edad;
    
    public Paciente(){
        tipoSangre= "";
        enfermedad= "";
        alergia= "";
        sexo= "";
        edad= 0;
    }
    
    public Paciente(String nombre, long telefono, String tipoSangre, String enfermedad, String alergia, String sexo, int edad){
        super(nombre, telefono);
        setTipoSangre(tipoSangre);
        setEnfermedad(enfermedad);
        setAlergia(alergia);
        setSexo(sexo);
        setEdad(edad);
    }

    public String getTipoSangre() {
        return tipoSangre;
    }
    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getEnfermedad() {
        return enfermedad;
    }
    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getAlergia() {
        return alergia;
    }
    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String isSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void Registrar() {
       if(pos> Arr.length){
           System.out.println("Maximo de registros");
       }else{ 
        System.out.println("Nombre");
         nombre= cs.next();
        System.out.println("Teléfono");
         telefono= cs.nextLong();
        System.out.println("Edad");
         edad= cs.nextInt();
        System.out.println("Sexo");
         sexo= cs.next();
        System.out.println("Tipo De Sangre");
         tipoSangre= cs.next();
        System.out.println("Enfermedad");
         enfermedad= cs.next();
        System.out.println("Alegrias");
         alergia= cs.next(); 
         
        Arr[pos]= new Paciente(nombre, telefono, tipoSangre, enfermedad, alergia, sexo, edad);
        pos++;
       }
    }

    @Override
    public void Actualizar() {
      if(pos== 0){
          System.out.println("No Hay Registros");
      }else{  
        System.out.println("Ingresa Tu Nombre");
         name= cs.next();
         bandera= false;
       for(int i= 0; i< pos; i++){
           if(name.equalsIgnoreCase(nombre)){
                System.out.println("Cambio De Telefono");
                 telefono= cs.nextLong();
                bandera= true; 
           }
       }
       if(!bandera){
           System.out.println("No Se Actualizo");
       }else{
           System.out.println("Se Actualizo");
       }
      }
    }

    @Override
    public void Buscar() {
      if(pos== 0){
          System.out.println("No Hay Registros");
      }else{
        System.out.println("Ingresa Tu Nombre");
         name= cs.next();
         bandera= false;
       for(int i= 0; i< pos; i++){
           if(name.equalsIgnoreCase(nombre)){
               bandera= true;
           }
       }
       if(!bandera){
           System.out.println("No Se Encontro");
       }else{
           System.out.println("Se Encontro");
       }
      }
    }
    
}
