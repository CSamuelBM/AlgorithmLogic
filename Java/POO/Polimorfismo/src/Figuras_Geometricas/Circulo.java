package Figuras_Geometricas;

import java.util.Scanner;

public class Circulo implements Operaciones{
      private Scanner cs= new Scanner(System.in);
    
    double radio;
    
    public Circulo(){ radio= 0; }
    
    public Circulo(double radio){ setRadio(radio); }
    
    public double getRadio(){ return radio; }
    public void setRadio(double radio){ this.radio= radio; }
    
    public void Datos(){
        System.out.println("Ingresa Rdio");
         radio= cs.nextDouble();
    }
    
    @Override
     public double cArea(){ return Math.PI*radio*radio; }
    @Override
     public double cPerimetro(){ return 2*Math.PI*radio; }
     
     public void Menu(){
         System.out.println("Circulo......6");
     }
     
}
