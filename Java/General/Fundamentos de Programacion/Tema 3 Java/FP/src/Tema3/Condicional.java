package Tema3;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
         String Nom, Sex;
         int Eda;
         
       System.out.println("Ingresa Tu Nombre");
        Nom = Leer.next();
       System.out.println("Ingresa Tu Sexo");
        Sex = Leer.next();
       System.out.println("ingresa Tu Edad");
        Eda = Leer.nextInt();
        
        if(Eda > 64){
            System.out.println("Eres Pensionado");
        }else{
            System.out.println("Sigue Trabajando");
        }
        
        System.out.println("Tu Nombre Es: " + Nom);
        System.out.println("Tu Sexo Es: " + Sex);
    }
}
