package Animales;

public class Gato implements Animal{
    
    @Override //Sobre Escribrir
     public void comer(){
         System.out.println("Pescado");
     }
     
    @Override
     public void hacer_Ruido(){
         System.out.println("Miau");
     }
    
}
