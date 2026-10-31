package Operaciones;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int num1, num2;
        int suma, resta, multiplicacion, division;
        int opc;
        
         Operaciones resultado= new Operaciones();
                
       
             while(true){
                System.out.println("Numero 1");
                    num1= cs.nextInt();
                System.out.println("Numero 2");
                    num2= cs.nextInt(); 
                    
                System.out.println("1.- Suma");
                System.out.println("2.- Resta");
                System.out.println("3.- Multiplicacion");
                System.out.println("4.- Divicion");
                System.out.println("5.- Salir.."); 
               switch(opc= cs.nextInt()){
                   case 1:
                       suma= resultado.sumar(num1, num2);
                        System.out.println("Suma: "+ suma);
                    break;
                        
                   case 2:
                       resta= resultado.restar(num1, num2);
                        System.out.println("Resta: "+ resta);
                    break;
                       
                    case 3:
                        multiplicacion= resultado.multiplicar(num1, num2);
                          System.out.println("Multiplicacion: "+ multiplicacion);
                    break;
                       
                    case 4:
                            try{
                               division= resultado.dividir(num1, num2);
                             }catch(ArithmeticException s){
                                 division= 0;
                             System.out.println("No Se Puede Dividir Por Cero");
                            }
                            
                            if(num2!= 0){
                               System.out.println("Divicion: "+ division);
                            }
                    break;
                       
                    case 5:
                        System.out.println("Saliendo..");
                    return;

                    default:
                        System.out.println("Opcion No Valida");
               } 
         } 
                
        
    }
}
