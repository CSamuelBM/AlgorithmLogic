package Figuras_Geometricas;

import java.util.Scanner;

public class Triangulo implements Operaciones{
    private static Scanner cs= new Scanner(System.in);
    
    double base, altura, lado;
    
    public Triangulo(){ base= 0; altura= 0; lado= 0; }
    
    public Triangulo(double base, double altura, double lado){
        setBase(base);
        setAltura(altura);
        setLado(lado);
    }
    
    public double getBase(){ return base; }
    public void setBase(double base){ this.base= base; }
    
    public double getAltura(){ return altura; }
    public void setAltura(double altura){ this.altura= altura; }
    
    public double geLado(){ return lado; }
    public void setLado(double lado){ this.lado= lado; }

    public double Base(){
        System.out.println("Ingresa La Base");
         return base= cs.nextDouble();
    }
    public double Altura(){
        System.out.println("Ingresa La Altura");
         return altura= cs.nextDouble();
    }
    public double Lado(){
        System.out.println("Ingresa El Lado");
         return lado= cs.nextDouble();
    }

    @Override
     public double cArea(){ return base*altura /2; }
    @Override
     public double cPerimetro(){ return lado*3; }
     
    public void Menu(){
         System.out.println("Triangulo......1");
     }
     
}
