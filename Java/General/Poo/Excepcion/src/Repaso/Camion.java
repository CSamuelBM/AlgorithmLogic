package Repaso;

import java.util.Scanner;

public class Camion extends Vehiculo implements Accion{
     Scanner cs= new Scanner(System.in);
    
    private int capacidad;
    private boolean perecedero;
    
    private String plaAux;
    private int pos, i;
    private Camion[] Ar= new Camion[5];
    private boolean bandera, continuar;
    
    public Camion(){
        perecedero= false;
        capacidad= 0;
    }
    public Camion(String placa, String fechaFabricacion, boolean asegurado, boolean perecedero, int capacidad){
        super(placa, fechaFabricacion, asegurado);
        
        setPerecedero(perecedero);
        setCapacidad(capacidad);
    }

    public boolean isPerecedero() {
        return perecedero;
    }
    public void setPerecedero(boolean perecedero) {
        this.perecedero = perecedero;
    }

    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void Registrar() {
        if(pos< Ar.length){
            try{
                continuar= false;
                
                System.out.println("Placa.");
                 this.placa= cs.next();
                System.out.println("Fecha De Fabricacion.(dd/mm/aaaa)");
                 this.fechaFabricacion= cs.next();
                System.out.println("Esta Asegurado.(true/false)");
                 this.asegurado= cs.nextBoolean();
                System.out.println("Es Perecedero El Producto.(true/false)");
                 this.perecedero= cs.nextBoolean();
                System.out.println("Capacidad De Carga En Toneladas.");
                 this.capacidad= cs.nextInt();
                 
                Ar[pos]= new Camion(placa, fechaFabricacion, asegurado, perecedero, capacidad); 
                 pos ++;
                 
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
            }
        }else{
            System.out.println("Maximo De Registros.");
        }while(continuar);
    }

    @Override
    public void Mostrar() {
        if(pos== 0){
            System.out.println("No Hay Registros.");
        }else{
            System.out.println("Placa: "+ getPlaca());
            System.out.println("Fecha De Fabricacion: "+ getFechaFabricacion());
            if(this.asegurado== true){
                System.out.println("Esta Asegurado: "+ "Si");
            }else{
                System.out.println("Esta Asegurado: "+ "No");
            }
            if(this.perecedero== true){
                System.out.println("Es Perecedero: "+ "Si");
            }else{
                System.out.println("Es Perecedero: "+ "No");
            }
            System.out.println("Capacidad De Toneladas: "+ getCapacidad());
        }
    }

    @Override
    public void Buscar() {
       if(pos== 0){
           System.out.println("No Hay Regitros");
       }else{
           System.out.println("Placa A Buscar");
            plaAux= cs.next();
             bandera= false;
           for(i= 0; i< pos; i++){
               if(Ar[i]!= null && plaAux.equals(Ar[i].getPlaca())){
                   bandera= true;
                    break;
               }
           } 
       }
        if(bandera== true){
            System.out.println("Se Encontro A: "+ plaAux);
        }else{
            System.out.println("No Se Encontro A: "+ plaAux);
        }
    }

    @Override
    public void Actualizar() {
       if(pos== 0){
           System.out.println("No Hay Registros");
       }else{
           System.out.println("Placa A Actualizar");
            plaAux= cs.next();
             bandera= false;
            for(i= 0; i< pos; i++){
                if(Ar[i]!= null && plaAux.equals(Ar[i].getPlaca())){
                    bandera= true;
                     
                    System.out.println("Nueva Capacidad");
                     capacidad= cs.nextInt();
                    Ar[i].setCapacidad(capacidad);
                }
            }
             if(bandera== true){
                 System.out.println("Se Actualizo: "+ plaAux);
             }else{
                 System.out.println("No Se Actualizo: "+ plaAux);
             }
       }
    }
    
}
