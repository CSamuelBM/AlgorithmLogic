package Modularidad;

import java.util.Scanner;

public class MCalculadora {

    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int opc= 0, num1, num2, res1;
        double num3, num4, res2;
        
        do{
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Divicion");
            System.out.println("5.- Salir");
             opc= cs.nextInt();
          switch(opc){
              case 1:
                   System.out.println("Ingresa Numero 1");
                      num1= cs.nextInt();
                   System.out.println("Ingresa Numero 2");
                     num2= cs.nextInt();
                System.out.println("La Suma Es: "+ Suma(num1, num2));
                  break;
              case 2:
                   System.out.println("Ingresa Numero 1");
                       num1= cs.nextInt();
                   System.out.println("Ingresa Numero 2");
                       num2= cs.nextInt();
                System.out.println("La Resta Es: "+ Resta(num1, num2));
                  break; 
              case 3:
                   System.out.println("Ingresa Numero 1");
                       num3= cs.nextDouble();
                   System.out.println("Ingresa Numero 2");
                       num4= cs.nextDouble();
                System.out.println("La Multiplicacion Es: "+ Multiplicacion(num3, num4));
                  break;     
              case 4:
                   System.out.println("Ingresa Numero 1");
                       num3= cs.nextDouble();
                   System.out.println("Ingresa Numero 2");
                       num4= cs.nextDouble();
                System.out.println("La Divicion Es: "+ Divicion(num3, num4));  
                  break;     
              default:
                  System.out.println("Saliste");
                break;  
          }  
        }while(opc!= 5); 
         
    }
    
    public static int Suma(int num1, int num2){
        int res1= num1+ num2;
          return res1;
    }
    
    public static int Resta(int num1, int num2){
        int res1= num1- num2;
         return res1;
    }
    
    public static double Multiplicacion(double num3, double num4){
        double res2= num3* num4;
         return res2;
    }
    
    public static double Divicion(double num3, double num4){
        double res2= num3/ num4;
         return res2;
    }
    
}
