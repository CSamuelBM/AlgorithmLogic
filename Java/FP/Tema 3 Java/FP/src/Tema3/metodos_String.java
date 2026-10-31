package Tema3;

import java.util.Scanner;

public class metodos_String {
    public static void main(String[] args){

        Scanner Leer = new Scanner(System.in);
         String txt2 = "Anillo", tx3 = "Sandia", tx4, txt3, txt1, rest, txtS, A2, ult2, vb, pr2 = "Conejo";
         String txt = "Vacio", C1 = "f", letra = "parangaricutirimicuaro", ant = " Un ", uni = " Muy ", Ce1 = "Arbol";
         String ult = "patagonia", v = "Voleibol", b = "Basquetbol", fras, rem1, rem4, rem5, rem6, rem7, pr1;
         String cad = "Yo Soy, Un Creativo!", myStr = "Buenos Dias Usted Afortunado Yo, Tabien De Tenerlo.";
         String regex = "[,\\.\\s]+";
                       
          int opc = 0, pos, res1, num1, num2;
          char res;
          
          do{
             System.out.println("Menu De Opciones");
              System.out.println(" ");
               System.out.println("1.- Ingresar Texto"); 
               System.out.println("2.- Covertir En Mayusculas");
               System.out.println("3.- Convertir En Minusculas");
               System.out.println("4.- Comparar Cadena De Texto");
               System.out.println("5.- Saca La Posicion De La Letra");
               System.out.println("6.- Comparar Dos Cadenas De Texto");
               System.out.println("7.- Completa Una Frase");
               System.out.println("8.- Adivina La Letra");
               System.out.println("9.- Adivina El Acertigo");
               System.out.println("10.- La Ultima Letra");
               System.out.println("11.- Advida La Frase");
               System.out.println("12.- Cuenta Las Letras");
               System.out.println("13.- Remplazar");
               System.out.println("14.- Remplazar Cadena De Texto");
               System.out.println("15.- Remplazo Inicial");
               System.out.println("16.- Listas Areglos");
               System.out.println("17.- La Primera Letra");
               System.out.println("18.- Cadena De Cadena");
              System.out.println("19.- Salir");
               opc = Leer.nextInt();
               
            switch(opc){
                case 1:
                    System.out.println("Ingresa Texto");
                     txt = Leer.next();
                    System.out.println("Texto Agregado Correctamente");
                 break;
                    
                case 2:
                    System.out.println("Texto En Mayusculas");
                    System.out.println(txt.toUpperCase());
                  break;  
                    
                case 3:
                    System.out.println("Texto En Minusculas");
                    System.out.println(txt.toLowerCase());
                   break;
                    
                case 4:
                    System.out.println("Brilla Y No Tiene Fin");
                      txt = Leer.next();
                    if(txt.compareTo(txt2) == 0){
                       System.out.println("Mismo Texto");
                    }else{
                        System.out.println("Textos Diferentes");
                    }
                   break;
                   
                case 5:
                    System.out.println("Señala La Posicion De La Letra De La Palabra");
                      System.out.println(" ");
                     
                    System.out.println("parangaricutirimicuaro Señala La Pocision de La M");
                      System.out.println(" "); 
                        
                    System.out.println("Ingresa La Posicion De La Letra");  
                     pos = Leer.nextInt();
                         
                        res = letra.charAt(pos);
                    System.out.println("La Letra Es: " + res);
                break;    
                
                case 6:
                    System.out.println("Verde Por Fuera Rojo Por Dentro");
                     
                     System.out.println("Ingresa Texto");
                      tx4 = Leer.next();
                      
                     res1 = tx3.compareToIgnoreCase(tx4);
                      
                      System.out.println("Comparacion: " + res1);
                    break;
                    
                case 7: 
                     System.out.println("Completa La Frase");
                      System.out.println(" ");
                       
                     System.out.println("Yo Tengo Un");
                      txt1 = Leer.next();
                     
                     System.out.println("Muy");
                      txt3 = Leer.next();
                        
                     System.out.println(rest = ant.concat(txt1).concat( uni).concat( txt3));
                    break;
                    
                case 8:
                     System.out.println("La Letra Mas Fabulosa");
                      System.out.println(" ");
                      
                     System.out.println("Ingresa Texto");
                     txtS = Leer.next();
                    
                     System.out.println(txtS.contains(C1));
                   break;
                    
                case 9:
                     System.out.println("Es Algo Verde Que Tiene Hojas");
                      System.out.println(" ");
                     
                     System.out.println("Ingresa Texto");
                      A2 = Leer.next();
                     
                     System.out.println(A2.contentEquals(Ce1));
                   break;
                    
                case 10:
                    
                     System.out.println("Solo Las Letras Que Terminan");
                      System.out.println(" ");
                         
                     System.out.println("patagonia");
                      System.out.println(" ");
                         
                     System.out.println("Ingresa La Ultimas Letras");
                      ult2 = Leer.next();
                          
                     System.out.println(ult.endsWith(ult2));
                   break;
                        
                case 11:
                    System.out.println("El Juega Voleibol o Basquetbol");
                     System.out.println(" ");
                     
                     System.out.println("Inserta Voleibol o Basquetbol");
                      vb = Leer.next();
                    
                      System.out.println(vb.equals(v));
                      
                      System.out.println(vb.equals(b));
                      break;
                      
                case 12:
                   System.out.println("Ingresa Una Frase");
                     fras = Leer.next();
                     
                     System.out.println(fras.length());
                    break;
                    
                case 13:
                     System.out.println("La Frase A Remplazar");
                      rem1 = Leer.next();
                       
                       System.out.println(rem1.replace('a', '6'));
                      break;
                      
                case 14:
                     System.out.println("Ingresa Ua Frase");
                       rem4 = Leer.next();
                       
                     System.out.println("La Parte A Remplazas");
                      rem5 = Leer.next();
                       
                     System.out.println(rem4.replaceAll(rem5, "8"));   
                    break;
                     
                case 15:
                     System.out.println("Ingresa Un Frase");
                      rem6 = Leer.next();
                     
                     System.out.println("Que Parte De La Frase Remplazas");
                       rem7 = Leer.next();
                       
                     System.out.println(rem6.replaceFirst(rem7, "7"));
                      break;
                      
                case 16:       
                        System.out.println("Palabra separada:");
                           
                           String[] myArray = myStr.split(regex);
                           
                          for (String s : myArray) {
                               System.out.println(s);
                            }
                          break;
                          
                case 17:
                     System.out.println("Solo Las Letras Primeras");
                      System.out.println(" ");
                         
                     System.out.println("Salta Mucho Y Es Blanco");
                      System.out.println(" ");
                      
                      System.out.println("Ingrese La Primera Letra");
                       pr1 = Leer.next();
                       
                       System.out.println(pr2.startsWith(pr1));
                    break;

                case 18:
                    System.out.println("Ingresa Numero Para Saber En Que Posicion Estas");
                     System.out.println(" ");
                     
                     System.out.println("Yo Soy, Un Creativo!");
                      System.out.println(" ");
                      
                      System.out.println("Ingresa Numero 1");
                       num1 = Leer.nextInt();
                       
                       System.out.println("Ingresa Numero 2");
                        num2 = Leer.nextInt();
                        
                        System.out.println(cad.substring(num1, num2));
                       break;
            }   
          }while(opc != 19);
    }
}
