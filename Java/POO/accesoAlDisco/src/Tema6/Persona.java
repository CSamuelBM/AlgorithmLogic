package Tema6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Persona {
    public static void main(String[]args){      
        String nom= "D:\\Segundo Semestre I.S.C\\POO\\Poo\\accesoAlDisco\\src\\Persona.txt";
        Scanner cs= new Scanner(System.in);
         File file= null;
        try{
          file= new File(nom);

          ModelPerson ObPerson;
          ModelPerson[] ArPerson= new ModelPerson[10];
                                                                                                                                                                                                                                   
          int opc, pos= 0;
          String datos;
          String[] data;
          String nombre, nomAux;
          int edad;
          boolean bandera;
          
          while(true){
              System.out.println("1.- Registro");
              System.out.println("2.- Mostrar");
              System.out.println("3.- Buscar");
              System.out.println("4.- Actualizar");
              System.out.println("5.- Salir");
              System.out.print("Opcion: ");
              opc = cs.nextInt();
             switch(opc){
                case 1:    
                    FileWriter fw= new FileWriter(nom, true);
                    PrintWriter pw= new PrintWriter(fw);
                    
                   if(pos> ArPerson.length){
                       System.out.println("Maximo De Registros");
                   }else{
                      
                    System.out.println("Nombre"); 
                      nombre= cs.next();
                    System.out.println("Edad");
                      edad= cs.nextInt();
                      
                    pw.println(nombre+","+edad);

                    pw.close();
                    fw.close();
                    
                    ObPerson= new ModelPerson(nombre, edad);
                    
                    ArPerson[pos]= ObPerson;
                    pos ++;
                    
                  }
                 break;
                
                case 2:
                    try(FileReader fr= new FileReader(nom)){
                        BufferedReader br= new BufferedReader(fr);
                       while((datos= br.readLine())!= null)
                            System.out.println(datos);
                    }
                 break;
                 
                case 3:
                    System.out.println("Nombre A Buscar");
                     nomAux= cs.next();
                    bandera= false;
                    try(FileReader fr= new FileReader(nom)){
                        BufferedReader br= new BufferedReader(fr);
                        
                        while((datos= br.readLine())!= null){
                            data= datos.split(",");
                           
                           if(data.length>= 2&& data[0].equalsIgnoreCase(nomAux)){
                               System.out.println("Se Encontro A: "+data[0]+","+data[1]);
                                bandera= true;
                               break; 
                           } 
                        }
                        if(!bandera){
                            System.out.println("No Se Encontro");
                        }
                    }
                   break;
                   
                case 4:
                    System.out.println("Nombre A Actualizar");
                     nomAux= cs.next();
                    bandera= false;
                    StringBuilder contenidoNew= new StringBuilder();
                    
                    try(FileReader fr= new FileReader(nom)){
                        BufferedReader br= new BufferedReader(fr);
                        System.out.println("Edad A Actualizar");
                                 edad= cs.nextInt();
                                 
                        while((datos= br.readLine())!= null){
                            data= datos.split(",");
                           
                           if(data.length>= 2&& data[0].equalsIgnoreCase(nomAux)){
                                data[1]= String.valueOf(edad);
                               bandera= true;
                           } 
                              contenidoNew.append(String.join(",", data)).append("\n");
                        }
                    }
                    try(BufferedWriter bw= new BufferedWriter(new FileWriter(nom))){
                        bw.write(contenidoNew.toString());
                         if(bandera){
                             System.out.println("Se Actualizo");
                         }else{
                             System.out.println("No Se Actualizo");
                         }
                    }
                 break;
                 
                case 5:
                    System.out.println("Saliste");
                    return;
                default:
                    System.out.println("Opcion No Valida");
             }
          }
          
        }catch(Exception ex){
            ex.printStackTrace();
        }
      
    }
}
