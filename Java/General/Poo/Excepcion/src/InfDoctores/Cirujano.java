package InfDoctores;

import java.util.Scanner;

public class Cirujano extends Doctor implements Acciones{
     Scanner cs=  new Scanner(System.in);
    
    private String subEspecialidad, vacaciones;
    private String nomAux;
    
    private int opcE= 0, opcV= 0, i, pos= 0;
    
    private Cirujano[] Ar= new Cirujano[5];
    
    private boolean bandera, continuar;
    
    public Cirujano(){
        subEspecialidad= "";
        vacaciones= "";
    }
    public Cirujano(String nombre, int edad, boolean cedula, String subEspecialidad, String vacaciones){
        super(nombre, edad, cedula);
        
        setSubEspecialidad(subEspecialidad);
        setVacaciones(vacaciones);
    }

    public String getSubEspecialidad() {
        return subEspecialidad;
    }

    public void setSubEspecialidad(String subEspecialidad) {
        this.subEspecialidad = subEspecialidad;
    }

    public String getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(String vacaciones) {
        this.vacaciones = vacaciones;
    }
    
    @Override
     public void Registrar(){
       try{  
           continuar= false;
        if(pos< Ar.length){ 
            System.out.println("Nombre.");
             this.nombre= cs.next();
            System.out.println("Edad.");
             this.edad= cs.nextInt();
            System.out.println("Cedula.(true/false)");
             this.cedula= cs.nextBoolean();
         while(true){
            System.out.println("<-Selecciona Tu Especialidad->");
            System.out.println("1.- Cirujano General.");
            System.out.println("2.- Cirujano Plastica.");
            System.out.println("3.- Cirujano Cardiotoracica.");
             opcE= cs.nextInt();
            switch(opcE){
                case 1:
                     subEspecialidad= "General.";
                      this.subEspecialidad= subEspecialidad;
                    break;
                case 2:
                     subEspecialidad= "Plastica.";
                      this.subEspecialidad= subEspecialidad;
                    break;
                case 3:
                     subEspecialidad= "Cardiotoracica.";
                      this.subEspecialidad= subEspecialidad;
                    break;
                default:
                    System.out.println("Deber Ser Un Numero Entre(1-3)");
            }
              break;
         }
         while(true){
             System.out.println("<-Selecciona Tus Vacaciones->");
             System.out.println("1.- Semana Santa.");
             System.out.println("2.- Verano.");
             System.out.println("3.- Diciembre.");
              opcV= cs.nextInt();
             switch(opcV){
                 case 1:
                      vacaciones= "En Semana Santa.";
                       this.vacaciones= vacaciones;
                     break;
                 case 2:
                      vacaciones= "En Verano.";
                       this.vacaciones= vacaciones;
                     break;
                 case 3:
                      vacaciones= "En Diciembre.";
                       this.vacaciones= vacaciones;
                     break;
                 default:
                     System.out.println("Deber Ser Un Numero Entre(1-3)");

             }
              break;
      }
         Ar[pos]= new Cirujano(nombre, edad, cedula, subEspecialidad, vacaciones);
          pos ++;
    }else{
            System.out.println("Maximo De Registros.");
        }
       }catch(ArrayIndexOutOfBoundsException ex){
           System.err.println("Pocision No Valida.");
            cs.next();
           continuar= true; 
       }catch(NumberFormatException ex){
           System.err.println("Ingresa Un Numero Valido.");
            cs.next();
           continuar= true; 
       }catch(NullPointerException ex){
           System.err.println("Valor No Existente.");
            cs.next();
           continuar= true; 
       }catch(IndexOutOfBoundsException ex){
           System.err.println("Pocision Invalida.");
            cs.next();
           continuar= true; 
       }
       while(continuar);
   }
    
    @Override
     public void Mostrar(){
           if(pos== 0){
               System.out.println("No Hay Registro.");
           }else{
             System.out.println("Nombre: "+ getNombre());
             System.out.println("Edad: "+ getEdad());
             if(this.cedula== true){
                 System.out.println("Tiene Cedula: "+ "Si");
             }else{
                 System.out.println("Tiene Cedula: "+ "No");
             }
             System.out.println("Cirujano: "+ getSubEspecialidad());
             System.out.println("Vacaciones: "+ getVacaciones());
           }
     }
     
    @Override 
     public void Buscar(){
         if(pos== 0){
             System.out.println("No Hay Registros.");
       }else{
            System.out.println("Nombre A Buscar.");
             nomAux= cs.next();
              bandera= false;
            for(i= 0; i< pos; i++){
              if(Ar[i]!= null && nomAux.equals(Ar[i].getNombre())){
                bandera= true;
                 break;
              }
        }
        if(bandera){
            System.out.println("Se Encontro A: "+ nomAux);
        }else{
            System.out.println("No Se Encontro A: "+ nomAux);
        }
       }
     }
     
    @Override
     public void Actualizar(){
         if(pos== 0){
             System.out.println("No Hay Regitros.");
         }else{
         System.out.println("Nombre A Actualizar.");
           nomAux= cs.next();
          bandera= false;
           for(i= 0; i< pos; i ++){
               if(Ar[i]!= null && nomAux.equals(Ar[i].getNombre())){
                   bandera = true;
                   
                   System.out.println("Nueva Edad.");
                     edad= cs.nextInt();
                    Ar[i].setEdad(edad);
               }
           }
           if(bandera== true){
               System.out.println("Se Actualizo: "+ nomAux);
           }else{
               System.out.println("No Se Actualizo: "+ nomAux);
           }
        }
     }   
     
}
