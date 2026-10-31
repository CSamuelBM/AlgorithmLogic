package Figuras_Geometricas;

import java.util.Scanner;

public class Elipse implements Operaciones{
       private Scanner cs= new Scanner(System.in);
    
    double distanciaM, distanciam;
    
    public Elipse(){ distanciaM= 0; distanciam= 0; }
    
    public Elipse(double distanciaM, double distanciam){ setDistanciaM(distanciaM); setDistanciam(distanciam); }

    public double getDistanciaM() { return distanciaM; }
    public void setDistanciaM(double distanciaM) { this.distanciaM = distanciaM; }

    public double getDistanciam() { return distanciam; }
    public void setDistanciam(double distanciam) { this.distanciam = distanciam; }
    
    public void Datos(){
        System.out.println("Ingresa Distancia Mayor");
         distanciaM= cs.nextDouble();
        System.out.println("Ingresa Distancia Menor");
         distanciam= cs.nextDouble();
    }
    
    @Override
     public double cArea(){ return Math.PI*distanciaM*distanciam; }
    @Override
      public double cPerimetro(){ return Math.PI* (3* (distanciaM+ distanciam)- 
                                   Math.sqrt(3* distanciaM+ distanciam)* (distanciaM+ 3* distanciam)); }
     
    public void Menu(){
        System.out.println("Elipse......11");
    }  
      
}
