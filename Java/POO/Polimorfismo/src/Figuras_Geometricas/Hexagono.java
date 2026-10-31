package Figuras_Geometricas;

import java.util.Scanner;

public class Hexagono implements Operaciones{
      private Scanner cs= new Scanner(System.in);
    
    double longitud, apotema, lado;
    
    public Hexagono(){ longitud= 0; apotema= 0; lado= 0; }
    
    public Hexagono(double longitud, double apotema, double lado){ setLongitud(longitud); setApotema(apotema); setLado(lado); }

    public double getLongitud() { return longitud; }
    public void setLongitud(double longitud) { this.longitud = longitud; }

    public double getApotema() { return apotema; }
    public void setApotema(double apotema) { this.apotema = apotema; }

    public double getLado() { return lado; }
    public void setLado(double lado) { this.lado = lado; }
    
    public void Datos(){
        System.out.println("Ingresa Longitud");
         longitud= cs.nextDouble();
        System.out.println("Ingresa Apotema");
         apotema= cs.nextDouble();
        System.out.println("Ingresa Lado");
         lado= cs.nextDouble();
    }
    
    @Override
     public double cArea(){ return lado*6; }
    @Override
     public double cPerimetro(){ return 3* longitud* apotema /2; } 
     
    public void Menu(){
        System.out.println("Hexagono......10");
    }
     
}
