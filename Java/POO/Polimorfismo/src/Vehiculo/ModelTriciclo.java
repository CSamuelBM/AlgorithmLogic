package Vehiculo;

public class ModelTriciclo extends BaseVehiculo{
    
    private boolean tieneCanasta;
    
    public ModelTriciclo(){
        tieneCanasta= false;
    }
    public ModelTriciclo(String color, String marca, String modelo, 
                    boolean arrancar, boolean mover, boolean chocar,
                     boolean tieneCanasta){
        
        super(color, marca, modelo, arrancar, mover, chocar);
    }
    
    public boolean isTieneCanasta(){
        return tieneCanasta;
    }
    
    @Override
     public void Arrancar(){
         if(isArrancar()){
             System.out.println("No A Arrancado");
         }else{
             System.out.println("Ya Arranco!!");
         }
     }
    @Override
     public void Mover(){
         if(isMover()){
             System.out.println("No Se A Movido");
         }else{
             System.out.println("Ya Se Movio!!");
         }
     }
    @Override
     public void Chocar(){
         if(isChocar()){
             System.out.println("No A Chocado");
         }else{
             System.out.println("Ya A Chocado");
         }
     }
     
}
