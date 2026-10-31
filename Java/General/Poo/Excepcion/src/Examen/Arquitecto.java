package Examen;

import java.util.Scanner;

public class Arquitecto extends Persona implements Accion{
     Scanner cs= new Scanner(System.in);
     
    private String zona;
    private double presupuesto;
    
    private int pos, i, idAux;
    Arquitecto[] Ar= new Arquitecto[5];
    private boolean bandera, continuar;
    
    public Arquitecto(){
        zona= "";
        presupuesto= 0;
    }
    public Arquitecto(int id, String nombre, String zona, double presupuesto){
         super(id, nombre);
        setZona(zona);
        setPresupuesto(presupuesto);
    }

    public String getZona() {
        return zona;
    }
    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public void Registrar() {
     do{
       try{
           continuar= false;
        if(pos< Ar.length){
            System.out.println("Id");
             this.id= cs.nextInt();
            System.out.println("Nombre");
             this.nombre= cs.next();
            System.out.println("Zona");
             this.zona= cs.next();
            System.out.println("Presupuesto");
             this.presupuesto= cs.nextDouble();
            Ar[pos]= new  Arquitecto(id, nombre, zona, presupuesto);
             pos ++;
        }else{
            System.out.println("Maximo De Registros");
        }
       }catch(ArrayIndexOutOfBoundsException ex){
           System.err.println("Posicion No Valida");
            cs.next();
           continuar= true; 
       }catch(IndexOutOfBoundsException ex){
           System.err.println("Pocision Invalida.");
            cs.next();
           continuar= true; 
       }catch(NullPointerException ex){
           System.err.println("Valor Nulo.");
            cs.next();
           continuar= true; 
       }
     }while(continuar);
    }

    @Override
    public void Mostrar() {
        if(pos== 0){
            System.out.println("No Hay Registros");
        }else{
            System.out.println("Id: "+ getId());
            System.out.println("Nombre: "+ getNombre());
            System.out.println("Zona: "+ getZona());
            System.out.print("Presupuesto: "+ getPresupuesto());
        }
    }

    @Override
    public void Buscar() {
       if(pos== 0){
           System.out.println("No Hay Registros");
       }else{
           System.out.println("Id A Buscar");
            idAux= cs.nextInt();
             bandera= false;
            for(i= 0; i< pos; i++){
                if(Ar[i]!= null && idAux==Ar[i].getId()){
                    bandera= true;
                     break;
                }
            }
             if(bandera== true){
                 System.out.println("Se Encontro");
             }else{
                 System.out.println("No Se Encontro");
             }
       }
    }

    @Override
    public void Actualizar() {
      if(pos== 0){
           System.out.println("No Hay Registros");
       }else{
           System.out.println("Id A Buscar");
            idAux= cs.nextInt();
             bandera= false;
            for(i= 0; i< pos; i++){
                if(Ar[i]!= null && idAux==Ar[i].getId()){
                    bandera= true;
                     
                    System.out.println("Zona Nueva");
                     zona= cs.next();
                    Ar[i].setZona(zona);
                }
            }
             if(bandera== true){
                 System.out.println("Se Actualizo");
             }else{
                 System.out.println("No Se Actualizo");
             }
       }
    }
    
}