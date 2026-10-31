package Tema2;

import java.util.Scanner;

public class Registro_Alumnos {
    public static void main(String[]args){
        Scanner Leer = new Scanner (System.in);
         String Nombre, ApellidoP, ApellidoM, Correo, Carrera, Matricula;
         int Edad, Telefono, TelefonoAux;
         long Nss;
         double Promedio;
         
          //Seccion Uno
       System.out.println("Ingresa Tu Nombre");
        Nombre = Leer.next();
       System.out.println("Ingresa Tu Apellido Paterno");
        ApellidoP = Leer.next();
       System.out.println("Ingresa Tu Apellido Materno");
        ApellidoM = Leer.next();
       System.out.println("Ingresa Tu Gmail");
        Correo = Leer.next();
       System.out.println("Ingresa Tu Carrera");
        Carrera = Leer.next();
       System.out.println("Ingresa Tu Matricula");
        Matricula = Leer.next();
        
         //Seccion Dos
        System.out.println("Ingresa Tu Edad");
         Edad = Leer.nextInt();
        System.out.println("Ingresa Tu Telefono");
         Telefono = Leer.nextInt();
        System.out.println("Ingresa Tu Telefono Auxiliar");
         TelefonoAux = Leer.nextInt();
         
         //Seccion Tres
        System.out.println("Ingresa Tu Numero De Seguridad Social");
         Nss = Leer.nextLong();
        
         //Seccion Cuatro
        System.out.println("Ingresa Tu Promedio");
         Promedio = Leer.nextDouble();
         
         //Resultados Del Registro 1
          System.out.println("Nombre: " + Nombre);
          System.out.println("Apellido Paterno: " + ApellidoP);
          System.out.println("Apellido Materno: " + ApellidoM);
          System.out.println("Gmail: " + Correo);
          System.out.println("Carrera: " + Carrera);
          System.out.println("Matricula: " + Matricula);
          
         //Resultados Del Registro 2
          System.out.println("Edad: " + Edad);
          System.out.println("Telefono: " + Telefono);
          System.out.println("Telefono Auxiliar: " + TelefonoAux);
          
         //Resultados Del Registro 3
          System.out.println("Numero De Seguro Social: " + Nss);
          
         //Resultados Del Registro 4
         System.out.println("Promedio: " + Promedio);
          
    }
}
