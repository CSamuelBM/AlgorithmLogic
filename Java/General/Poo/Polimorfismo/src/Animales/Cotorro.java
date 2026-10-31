package Animales;

public class Cotorro implements Animal{
    
    @Override
     public void comer(){
         System.out.println("Semillas");
     }
     
    @Override
      public void hacer_Ruido(){
          System.out.println("Hola");
      }
    
}
