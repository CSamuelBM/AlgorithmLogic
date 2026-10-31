package Figuras_Geometricas;

import java.util.Scanner;

public class Pentagono implements Operaciones{
     private Scanner cs= new Scanner(System.in);
    
    double perimetro, apotema, longitud;
    
    public Pentagono(){ perimetro= 0; apotema= 0; longitud= 0; }
    
    public Pentagono(double perimetro, double apotema, double longitud){ 
        setPerimetro(perimetro); setApotema(apotema); setLongitud(longitud); }
    
    public double getPerimetro(){ return perimetro; }
    public void setPerimetro(double perimetro){ this.perimetro= perimetro; }

    public double getApotema() { return apotema; }
    public void setApotema(double apotema) { this.apotema = apotema; }
    
    public double getLongitud() { return longitud;}
    public void setLongitud(double longitud) { this.longitud = longitud; }
    
    public void Datos(){
        System.out.println("Ingresa Apotema");
         apotema= cs.nextDouble();
        System.out.println("Ingresa Longitud");
         longitud= cs.nextDouble();
    }
            
    @Override
     public double cPerimetro(){ perimetro= 5*longitud; return 5*longitud; }
    @Override
     public double cArea(){ return perimetro*apotema /2; } 
    
    public void Menu(){
        System.out.println("Pentagono......5");
    } 
     
}
