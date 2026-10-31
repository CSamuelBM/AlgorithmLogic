package Figuras_Geometricas;

import java.util.Scanner;

public class Deltoide implements Operaciones{
       private Scanner cs= new Scanner(System.in);
    
    double diagonalM, diagonalm, longitudC, longitudL;
    
    public Deltoide(){ diagonalM= 0; diagonalm= 0; longitudC= 0; longitudL= 0; }
    
    public Deltoide(double diagonalM, double diagonalm, double longitudC, double longitudL){ 
             setDiagonalM(diagonalM); setDiagonalm(diagonalm); setLongitudC(longitudC); setLongitudL(longitudL); }
    
    public double getDiagonalM(){ return diagonalM; }
    public void setDiagonalM(double diagonalM){ this.diagonalM= diagonalM; }

    public double getDiagonalm() { return diagonalm; }
    public void setDiagonalm(double diagonalm) { this.diagonalm = diagonalm; }

    public double getLongitudC() { return longitudC; }
    public void setLongitudC(double longitudC) { this.longitudC = longitudC; }

    public double getLongitudL() { return longitudL; }
    public void setLongitudL(double longitudL) { this.longitudL = longitudL; }
    
    public void Datos(){
        System.out.println("Ingresa Diagonal Mayor");
          diagonalM= cs.nextDouble();
        System.out.println("Ingresa Diagonal Menor");
          diagonalm= cs.nextDouble();
        System.out.println("Ingresa Longitud Corta");
          longitudC= cs.nextDouble();
        System.out.println("Ingresa Longitud Larga");
          longitudL= cs.nextDouble();
    }
    
    @Override
     public double cArea(){ return diagonalM* diagonalm /2; }
    @Override
     public double cPerimetro(){ return 2*(longitudC+ longitudL); }
    
    public void Menu(){
        System.out.println("Deltoide......17");
    } 
     
}
