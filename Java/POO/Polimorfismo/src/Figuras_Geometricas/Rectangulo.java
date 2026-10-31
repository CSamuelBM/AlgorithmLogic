package Figuras_Geometricas;

import java.util.Scanner;

public class Rectangulo implements Operaciones{
     private Scanner cs= new Scanner(System.in);
             
    double base, altura;
    
    public Rectangulo(){ base= 0; altura= 0; }
    
    public Rectangulo(double base, double altura){
        setBase(base);
        setAltura(altura);
    }
    
    public void Datos(){
        System.out.println("Ingrese Base");
         base= cs.nextDouble();
        System.out.println("Ingresa La Altura");
         altura= cs.nextDouble();
    }
    
    public double getBase(){ return base; }
    public void setBase(double base){ this.base= base; }
    
    public double getAltura(){ return altura; }
    public void setAltura(double altura){ this.altura= altura; }
    
    @Override
     public double cArea(){ return base*altura; }
    @Override
     public double cPerimetro(){ return 2*(base+altura); }
     
    public void Menu(){
        System.out.println("Rectangulo......3");
    }
}
