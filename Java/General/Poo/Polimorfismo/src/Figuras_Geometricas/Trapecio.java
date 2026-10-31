package Figuras_Geometricas;

import java.util.Scanner;

public class Trapecio implements Operaciones{
      private Scanner cs= new Scanner(System.in);
    
    double baseM, basem, altura, lado;
    
    public Trapecio(){ baseM= 0; basem= 0; altura= 0; lado= 0; }
    
    public Trapecio(double baseM, double basem, double altura, double lado){ 
        setBaseM(baseM); setBasem(basem); setAltura(altura); setLado(lado); }

    public double getBaseM() { return baseM; }
    public void setBaseM(double baseM) { this.baseM = baseM; }

    public double getBasem() { return basem; }
    public void setBasem(double basem) { this.basem = basem; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getLado() { return lado; }
    public void setLado(double lado) { this.lado = lado; }
    
    public void Datos(){
        System.out.println("Ingresa Base Mayor");
         baseM= cs.nextDouble();
        System.out.println("Ingresa Base Menor");
         basem= cs.nextDouble();
        System.out.println("Ingresa Altura");
         altura= cs.nextDouble();
        System.out.println("Ingresa Lado");
         lado= cs.nextDouble();
    }
    
    @Override
     public double cArea(){ return (baseM+ basem)* altura /2; }
    @Override
     public double cPerimetro(){ return lado*4; } 
     
     public void Menu(){
         System.out.println("Trapecio......7");
     }
    
}
