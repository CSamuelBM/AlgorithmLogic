package Animales;

public class Pato implements Animal{

    @Override
     public void comer(){
         System.out.println("Pan");
     }
     
     @Override
      public void hacer_Ruido(){
          System.out.println("Cuak");
      }
    
}
