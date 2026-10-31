package Examen;

import java.util.Scanner;

public class Main {
   public static void main(String[]args){
       Scanner cs= new Scanner(System.in);
       
       int id_Ad;
    String nombre, fecha_Contrato;
    double salario;
    
     String area, jefe, horario;
     
      String zona;
    int nivel;
    boolean seguridad;
    
    Secretario ObSecretario;
    Intendente ObIntendente;
    
    Secretario ArSecretario[]= new Secretario[5];
    Intendente ArIntendente[]= new Intendente[5];
    
    int i, opcP= 0, opcA= 0, opcB= 0;
    boolean bandera;
    
    do{
        System.out.println("1.- Ingresar");
        System.out.println("2.- Salir");
         opcP= cs.nextInt();
        switch(opcP){
            case Const.Ingresar:
                do{
                    System.out.println("1.- Secretario");
                    System.out.println("2.- Intendente");
                    System.out.println("3.- Artas");
                     opcB= cs.nextInt();
                  switch(opcB){
                      case Const.Secretario:
                          do{
                              System.out.println("1.- Registrar");
                              System.out.println("2.- Buscar");
                              System.out.println("3.- Actualizar");
                              System.out.println("4.- Mostrar");
                              System.out.println("5.- Volver");
                               opcA= cs.nextInt();
                            switch(opcA){
                                case Const.Registrar:
                                      System.out.println("Identificador");
                                       id_Ad= cs.nextInt();
                                      System.out.println("Nombre");
                                       nombre= cs.next();
                                      System.out.println("Fecha De Contrato");
                                       fecha_Contrato= cs.next();
                                      System.out.println("Salario");
                                       salario= cs.nextDouble(); 
                                      System.out.println("Area");
                                       area= cs.next(); 
                                      System.out.println("Jefe");
                                       jefe= cs.next(); 
                                      System.out.println("Horario");
                                       horario= cs.next();  
                                     ObSecretario= new Secretario(id_Ad, nombre, fecha_Contrato, salario, area, jefe, horario);
                                     ArSecretario[Const.pos_Secretario]= ObSecretario;
                                      Const.pos_Secretario ++;
                                    break;
                                case Const.Buscar:
                                    break;
                                case Const.Actualizar:
                                    break;
                                case Const.Mostrar:
                                    break;
                                case Const.Volver:
                                    break;
                                default:
                                    System.out.println("Opc No Valida");
                            }
                             
                          }while(opcA!= 5);
                          break;
                          
                      case Const.Intendente:
                          do{
                              System.out.println("1.- Registrar");
                              System.out.println("2.- Buscar");
                              System.out.println("3.- Actualizar");
                              System.out.println("4.- Mostrar");
                              System.out.println("5.- Volver");
                               opcA= cs.nextInt();
                            switch(opcA){
                                case Const.Registrar:
                                    System.out.println("Identificador");
                                       id_Ad= cs.nextInt();
                                    System.out.println("Nombre");
                                       nombre= cs.next();
                                    System.out.println("Fecha De Contrato");
                                       fecha_Contrato= cs.next();
                                    System.out.println("Salario");
                                     salario= cs.nextDouble();
                                    System.out.println("Zona");
                                       zona= cs.next();
                                    System.out.println("nivel");
                                       nivel= cs.nextInt();
                                    System.out.println("Seguridad");
                                       seguridad= cs.nextBoolean();
                                     ObIntendente= new Intendente(id_Ad, nombre, fecha_Contrato, salario, zona, nivel, seguridad);
                                     ArIntendente[Const.pos_Intendente]= ObIntendente;
                                      Const.pos_Intendente ++;  
                                    break;
                                case Const.Buscar:
                                    break;
                                case Const.Actualizar:
                                    break;
                                case Const.Mostrar:
                                    break;
                                case Const.Volver:
                                    break;
                                default:
                                    System.out.println("Opc No Valida");
                            }   
                          }while(opcA!= 5);
                          
                          break;
                      case Const.Atras:
                          System.out.println("Atras");
                          break;
                      default:
                          System.out.println("Opc No Valida");
                  }

                }while(opcB!= 3);
                   break;
            
            case Const.Salir:
                System.out.println("Saliendo");
                break;
                
            default:
                System.out.println("Opc No Valida");
        } 
    }while(opcP!= 2);
    
   }
}
