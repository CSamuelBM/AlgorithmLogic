package Animales;

public class Pollo implements Animal{
    
    @Override
     public void comer(){
         System.out.println("Maiz");
     }
     
    @Override
      public void hacer_Ruido(){
          System.out.println("Pio");
      }
    
}
