package InfDoctores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Traumatologo extends Doctor implements Acciones{
    Scanner cs= new Scanner(System.in);
    
    private String ranking;
    private String nomAux;
    
    private int opc, pos= 0, i;
    
    private Traumatologo[] Ar= new Traumatologo[5];
    
    private boolean bandera, continuar;
    
    public Traumatologo(){
        ranking= "";
    }
    public Traumatologo(String nombre, int edad, boolean cedula, String ranking){
        super(nombre, edad, cedula);
        
        setRanking(ranking);
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    } 
    
    @Override
     public void Registrar(){    
         try{
           System.out.println("Nombre.");
            this.nombre= cs.next();
           System.out.println("Edad.");
            this.edad= cs.nextInt();
           System.out.println("Cedula.(true/false)");
            this.cedula= cs.nextBoolean();
         while(opc!= 5){
             System.out.println("Ranking Del(1-5)");
             System.out.println("1.- Malo.");
             System.out.println("2.- Regular.");
             System.out.println("3.- Bueno.");
             System.out.println("4.- Muy Bueno.");
             System.out.println("5.- Excelente.");
              opc= cs.nextInt();
             switch(opc){
                 case 1:
                      ranking= "Malo.";
                       this.ranking= ranking;
                     break;
                 case 2:
                      ranking= "Regular.";
                       this.ranking= ranking;
                     break;
                 case 3:
                      ranking= "Bueno.";
                       this.ranking= ranking;
                     break;
                 case 4:
                      ranking= "Muy Bueno.";
                       this.ranking= ranking;
                     break;
                 case 5:
                      ranking= "Excelente.";
                       this.ranking= ranking;
                     break;
             } 
              break;
           }
          Ar[pos]= new Traumatologo(nombre, edad, cedula, ranking);
           pos ++;
           
         }catch(InputMismatchException ex){
             System.err.println("Debe Ser Un Numero Entre(1-5)");
              cs.next();
             continuar= true; 
         }catch(NumberFormatException ex){
             System.err.println("Ingresa Un Numero Valido.");
              cs.next();
             continuar= true;
         }catch(ArrayIndexOutOfBoundsException ex){
             System.err.println("Pocision No Valida.");
              cs.next();
             continuar= true; 
         }catch(IndexOutOfBoundsException ex){
             System.err.println("Pocision Invalida.");
              cs.next();
             continuar= true; 
         }catch(NullPointerException ex){
             System.err.println("Valor No Existente.");
              cs.next();
             continuar= true; 
         }
         while(continuar);
     }
    
    @Override
     public void Mostrar(){
        if(pos== 0){
            System.out.println("No Hay Regitros.");
        }else{ 
         System.out.println("Nombre: "+ getNombre());
         System.out.println("Edad: "+ getEdad());
          if(this.cedula== true){
              System.out.println("Tiene Cedula: "+ "Si.");
          }else{
              System.out.println("Tiene Cedula: "+ "No.");
          }
         System.out.println("Tu Ranking Es: "+ getRanking());
     }
    }     
     
    @Override
     public void Buscar(){
        if(pos== 0){
            System.out.println("No Hay Regitros.");
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
              if(bandera== true){
                  System.out.println("Se Encontro A: "+ nomAux);
              }else{
                  System.out.println("No Se Encontro A: "+ nomAux);
              }
        }
     }
     
    @Override
     public void Actualizar(){
        if(pos== 0){
            System.out.println("No Hay Regitros");
        }else{
         System.out.println("Nombre A Actualizar.");
          nomAux= cs.next();
         bandera= false;
          for(i= 0; i< pos; i++){
              if(Ar[i]!= null && nomAux.equals(Ar[i].getNombre())){
                  bandera= true;
                   
                  System.out.println("Edad Nueva.");
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
