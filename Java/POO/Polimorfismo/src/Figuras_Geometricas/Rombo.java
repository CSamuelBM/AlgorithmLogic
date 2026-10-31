package Figuras_Geometricas;

import java.util.Scanner;

public class Rombo implements Operaciones{
      private Scanner cs= new Scanner(System.in);
    
    double diagonalM, diagonalm, lado;
    
    public Rombo(){ diagonalM= 0; diagonalm= 0; lado= 0; }
    
    public Rombo(double diagonalM, double diagonalm, double lado){ 
        setDiagonalM(diagonalM); setDiagonalm(diagonalm); setLado(lado); }

    public double getDiagonalM() { return diagonalM; }
    public void setDiagonalM(double diagonalM) { this.diagonalM = diagonalM; }

    public double getDiagonalm() { return diagonalm; }
    public void setDiagonalm(double diagonalm) { this.diagonalm = diagonalm; }
    
    public double getLado() { return lado; }
    public void setLado(double lado) { this.lado = lado; }
    
    public void Datos(){
        System.out.println("Ingresa Diagonal Mayor");
         diagonalM= cs.nextDouble();
        System.out.println("Ingresa Diagonal Menor");
         diagonalm= cs.nextDouble();
        System.out.println("Ingresa Lado");
         lado= cs.nextDouble();
    }
    
    @Override
     public double cArea(){ return diagonalM*diagonalm /2; }
    @Override
     public double cPerimetro(){ return lado*4; }
     
     public void Menu(){
        System.out.println("Rombo......4");
    }
     
}
