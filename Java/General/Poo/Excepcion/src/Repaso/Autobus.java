package Repaso;

import java.util.Scanner;

public class Autobus extends Vehiculo implements Accion{
     Scanner cs= new Scanner(System.in);
    
    private String nomRuta;
    private int catPasaje;
    
    private String plaAux;
    private int i, pos;
    Autobus[] Ar= new Autobus[5];
    private boolean bandera, continuar;
    
    public Autobus(){
        nomRuta= "";
        catPasaje= 0;
    }
    public Autobus(String placa, String fechaFabricacion, boolean asegurado, String nomRuta, int catPasaje){
        super(placa, fechaFabricacion, asegurado);
        
        setNomRuta(nomRuta);
        setCatPasaje(catPasaje);
    }

    public String getNomRuta() {
        return nomRuta;
    }
    public void setNomRuta(String nomRuta) {
        this.nomRuta = nomRuta;
    }

    public int getCatPasaje() {
        return catPasaje;
    }
    public void setCatPasaje(int catPasaje) {
        this.catPasaje = catPasaje;
    }
    
    @Override
    public void Registrar() {
        if(pos< Ar.length){
            try{
                continuar= false;
                 
                System.out.println("Placa");
                 this.placa= cs.next();
                System.out.println("Fecha De Fabricacion.(dd/mm/aaaa)");
                 this.fechaFabricacion= cs.next();
                System.out.println("Esta Asegurado.(true/false)");
                 this.asegurado= cs.nextBoolean();
                System.out.println("Nombre De La Ruta"); 
                 this.nomRuta= cs.next();
                System.out.println("Cantidad De Pasajeros");
                 this.catPasaje= cs.nextInt();
                 
                Ar[pos]= new Autobus(placa, fechaFabricacion, asegurado, nomRuta, catPasaje); 
                 pos++;
                 
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
            System.out.println("No Hay Registros");
        }else{
            System.out.println("Placa: "+ getPlaca());
            System.out.println("Fecha De Fabricacion: "+ getFechaFabricacion());
            if(this.asegurado== true){
                System.out.println("Esta Asegurado: "+ "Si");
            }else{
                System.out.println("Esta Asegurado: "+ "No");
            }
            System.out.println("Nombre De La Ruta: "+ getNomRuta());
            System.out.println("Cantidad De Pasajeros: "+ getCatPasaje());
        }
    }

    @Override
    public void Buscar() {
       if(pos== 0){
           System.out.println("No Hay Registros");
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
             if(bandera== true){
                 System.out.println("Se Encontro A: "+ plaAux);
             }else{
                 System.out.println("No Se Encontro A: "+ plaAux);
             }
       }
    }

    @Override
    public void Actualizar() {
       if(pos== 0){
           System.out.println("No Hay Registro");
       }else{
           System.out.println("Placa A Actualizar");
            plaAux= cs.next();
             bandera= false;
            for(i= 0; i< pos; i++){
                if(Ar[i]!= null && plaAux.equals(Ar[i].getPlaca())){
                    bandera= true;
                    
                    System.out.println("Nuevo Nombre De Ruta");
                     nomRuta= cs.next();
                    Ar[i].setNomRuta(nomRuta);
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
