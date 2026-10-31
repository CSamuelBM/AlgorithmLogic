package Figuras_Geometricas;

import java.util.Scanner;

public class Romboide implements Operaciones{
       private Scanner cs= new Scanner(System.in);
    
    double base, altura, longitudB, longitudL;
    
    public Romboide(){ base= 0; altura= 0; longitudB= 0; longitudL= 0; }
    
    public Romboide(double base, double altura, double longitudB, double longitudL){  
             setBase(base); setAltura(altura); setLongitudB(longitudB); setLongitudL(longitudL); }

    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getLongitudB() { return longitudB; }
    public void setLongitudB(double longitudB) { this.longitudB = longitudB; }

    public double getLongitudL() { return longitudL; }
    public void setLongitudL(double longitudL) { this.longitudL = longitudL; }
    
    public void Datos(){
        System.out.println("Ingresa Base");
          base= cs.nextDouble();
        System.out.println("Ingresa Altura");
          altura= cs.nextDouble();
        System.out.println("Ingresa Longitud Base");
          longitudB= cs.nextDouble();
        System.out.println("Ingresa Longitud Lado Lateral");
          longitudL= cs.nextDouble();
    }
    
    @Override
     public double cArea(){ return 2*(longitudB+ longitudL); }
    @Override 
     public double cPerimetro(){ return base* altura; }
    
    public void Menu(){
        System.out.println("Romboide......18");
    } 
     
}
