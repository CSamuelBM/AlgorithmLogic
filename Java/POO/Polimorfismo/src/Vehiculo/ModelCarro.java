package Vehiculo;

public class ModelCarro extends BaseVehiculo {
    
    private String cilindrada, capacidadTanque;
    
    public ModelCarro(){
        cilindrada= " ";
        capacidadTanque= " ";
    }
    public ModelCarro(String color, String marca, String modelo, 
                boolean arrancar, boolean mover, boolean chocar,
                 String cilindrada, String capacidadTanque){
        
        super(color, marca, modelo, arrancar, mover, chocar);
        
        setCilindrada(cilindrada);
        setCapacidadTanque(capacidadTanque);
    }
    
    public String getCilindrada(){
        return cilindrada;
    }
    public void setCilindrada(String cilindrada){
        if(cilindrada!= null && !cilindrada.isEmpty()){
            this.cilindrada= cilindrada;
        }else{
            System.out.println("No Hay Cilindrada");
        }
    }
    
    public String getCapacidadTanque(){
        return capacidadTanque;
    }
    public void setCapacidadTanque(String capacidadTanque){
        if(capacidadTanque!= null && !capacidadTanque.isEmpty()){
            this.capacidadTanque= capacidadTanque;
        }else{
            System.out.println("No Hay Capacidad De Tanque");
        }
    }
    
    @Override
     public void Arrancar(){
         if(isArrancar()){
             System.out.println("Ya Arranco!!");
         }else{
             System.out.println("No Arranco");
         }
     }
     
    @Override
     public void Mover(){
         if(isMover()){
             System.out.println("Ya Se Movio!!");
         }else{
             System.out.println("No Se A Moviodo");
         }
     }
     
    @Override
     public void Chocar(){
         if(isChocar()){
             System.out.println("Ya A Chocado");
         }else{
             System.out.println("No A Chocado");
         }
     }
    
}
