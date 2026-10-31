package Figuras_Geometricas;

import java.util.Scanner;

public class Decagono implements Operaciones{
      private Scanner cs= new Scanner(System.in);
    
    double longitud, apotema;
    
    public Decagono(){ longitud= 0; apotema= 0; }
    
    public Decagono(double longitud, double apotema){ setLongitud(longitud); setApotema(apotema); }

    public double getLongitud() { return longitud; }
    public void setLongitud(double longitud) { this.longitud = longitud; }

    public double getApotema() { return apotema; }
    public void setApotema(double apotema) { this.apotema = apotema; }
    
    public void Datos(){
        System.out.println("Ingresa Longitud");
         longitud= cs.nextDouble();
        System.out.println("Ingresa Apotema");
         apotema= cs.nextDouble();
    }
    
    @Override
     public double cArea(){ return 5* longitud* apotema/ 2; }
    @Override
     public double cPerimetro(){ return 10* longitud; }
    
    public void Menu(){
        System.out.println("Decagono......14");
    } 
     
}
