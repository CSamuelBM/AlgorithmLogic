package Animales;

public class Perro implements Animal{
    
    @Override
     public void comer(){
         System.out.println("Carne");
     }
     
     @Override
      public void hacer_Ruido(){
          System.out.println("Guau");
      }
    
}
