package Figuras_Geometricas;

import java.util.Scanner;

public class Octagono implements Operaciones{
     private Scanner cs= new Scanner(System.in);
     
     double longitud, apotema;
     
     public Octagono(){ longitud= 0; apotema= 0; }
     
     public Octagono(double area, double long_Lado, double apotema){
                        setLongitud(longitud); setApotema(apotema); }
     
     public double getLongitud(){ return longitud; }
     public void setLongitud(double area){ this.longitud= area; }

    public Scanner getCs() { return cs; }
    public void setCs(Scanner cs) { this.cs = cs; }

    public double getApotema() { return apotema; }
    public void setApotema(double apotema) { this.apotema = apotema; }
    
    public void Datos(){
        System.out.println("Ingresa longitud");
         longitud= cs.nextDouble();
        System.out.println("Ingresa Apotema");
         apotema= cs.nextDouble();
    }
    
    @Override
     public double cArea(){ return 8*longitud*apotema/2; }
    @Override
     public double cPerimetro(){ return 8*longitud; }
     
    public void Menu(){
        System.out.println("Octagono......9");
    } 
     
}
