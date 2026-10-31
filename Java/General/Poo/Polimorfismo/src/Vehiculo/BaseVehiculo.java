package Vehiculo;

public abstract class BaseVehiculo {
    
    private String color, marca, modelo;
    private boolean arrancar, mover, chocar;
    
    public BaseVehiculo(){
        this(" ", " ", " ", false, false, false);
    }
    
    public BaseVehiculo(String color, String marca, String modelo,
                    boolean arrancar, boolean mover, boolean chocar){
        setColor(color);
        setMarca(marca);
        setModelo(modelo);
        setArrancar(arrancar);
        setMover(mover);
        setChocar(chocar);
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
      if(color!= null && !color.isEmpty()){  //if color is different null and color not is empty
        this.color= color;
      }else{
          System.out.println("No Hay Color");
      }
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        if(marca!= null && !marca.isEmpty()){
            this.marca= marca;
        }else{
           System.out.println("No Hay Marca");
        }
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        if(modelo!= null && !modelo.isEmpty()){
            this.modelo= modelo;
        }else{
             System.out.println("No Hay Modelo");
        }
    }
    
    public boolean isArrancar(){
        return arrancar;
    }
    public void setArrancar(boolean arrancar){
        this.arrancar= arrancar;
    }
    
    public boolean isMover(){
        return mover;
    }
    public void setMover(boolean mover){
        this.mover= mover;
    }
    
    public boolean isChocar(){
        return chocar;
    }
    public void setChocar(boolean chocar){
        this.chocar= chocar;
    }
    
    public abstract void Arrancar();
    public abstract void Mover();
    public abstract void Chocar();
    
}
