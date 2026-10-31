package Figuras_Geometricas;

import java.util.Scanner;

public class Cuadrado implements Operaciones{
    private static Scanner cs= new Scanner(System.in);
    
    double lado;
   
    public Cuadrado(){ lado= 0; }
    
    public Cuadrado(double lado){ setL(lado); }
    
    public double getL(){ return lado; }
    public void setL(double lado){ this.lado= lado; }
    
    public double Datos(){
        System.out.println("Ingresa El Lado");
        return lado= cs.nextDouble();
    }
    
    @Override
     public double cArea(){ return lado*lado; }
     
    @Override
     public double cPerimetro(){ return lado*4; }
     
     public void Menu(){
         System.out.println("Cuadrado......2");
     }
     
}
