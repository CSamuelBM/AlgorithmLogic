package Figuras_Geometricas;

import java.util.Scanner;

public class TrapecioIsosceles implements Operaciones{
       private Scanner cs= new Scanner(System.in);
    
    double baseM, basem, altura, ladOblicuo;
    
    public TrapecioIsosceles(){ baseM= 0; basem= 0; ladOblicuo= 0; }
    
    public TrapecioIsosceles(double baseM, double basem, double ladOblicuo){ 
        setBaseM(baseM); setBasem(basem); setLadOblicuo(ladOblicuo); }

    public double getBaseM() { return baseM; }
    public void setBaseM(double baseM) { this.baseM = baseM; }

    public double getBasem() { return basem; }
    public void setBasem(double basem) { this.basem = basem; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getLadOblicuo() { return ladOblicuo; }
    public void setLadOblicuo(double ladOblicuo) { this.ladOblicuo = ladOblicuo; }
    
    public void Datos(){
        System.out.println("Ingresa Base Mayor");
         baseM= cs.nextDouble();
        System.out.println("Ingresa Base Menor");
         basem= cs.nextDouble();
        System.out.println("Ingresa Altura");
         altura= cs.nextDouble();
        System.out.println("Ingresa Lado Oblicuo");
         ladOblicuo= cs.nextDouble();
    }
    
    @Override
     public double cArea(){ return  (baseM+ basem)* altura/ 2;}
    @Override
     public double cPerimetro(){ return  baseM+ basem+ 2* ladOblicuo; }
     
    public void Menu(){
        System.out.println("Trapecio Isosceles......12");
    } 
     
}
