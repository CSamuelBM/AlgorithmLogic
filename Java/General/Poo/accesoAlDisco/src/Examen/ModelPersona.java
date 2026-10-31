package Examen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ModelPersona implements Accion{
    
    private String BD= "D:\\Segundo Semestre I.S.C\\POO\\Poo\\accesoAlDisco\\src\\Examen.txt";
    private Scanner cs= new Scanner(System.in);
    File file= null;
    
    private int pos;
    private ModelPersona[] Arr= new ModelPersona[10];
    private String datos, nomAux;
    private String[] data;
    boolean bandera;
    
    String nombre, ciudad;
    int edad;
    
    public ModelPersona(){
        nombre= "";
        ciudad= "";
        edad= 0;
    }
    public ModelPersona(String nombre, String ciudad, int edad){
        setNombre(nombre);
        setCiudad(ciudad);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void Registrar() {
        try{
        FileWriter fw= new FileWriter(BD, true);
            PrintWriter pw= new PrintWriter(fw);
                    
                   if(pos> Arr.length){
                       System.out.println("Maximo De Registros");
                   }else{
                      
                    System.out.println("Nombre"); 
                      nombre= cs.next();
                    System.out.println("Ciudad");
                     ciudad= cs.next();
                    System.out.println("Edad");
                      edad= cs.nextInt();
                      
                    pw.println(nombre+","+ciudad+","+edad);

                    fw.close();
                    pw.close();
                    
                    Arr[pos]= new ModelPersona(nombre, ciudad, edad);
                    pos ++;
                    
                  }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void Mostrar() {
        try(FileReader fr= new FileReader(BD)){
                BufferedReader br= new BufferedReader(fr);
                   while((datos= br.readLine())!= null)
                        System.out.println(datos);
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }catch(IOException ex){
                System.out.println(ex.getMessage());
            }
    }

    @Override
    public void Buscar() {
        System.out.println("Nombre A Buscar");
                     nomAux= cs.next();
                    bandera= false;
                    try(FileReader fr= new FileReader(BD)){
                        BufferedReader br= new BufferedReader(fr);
                        
                        while((datos= br.readLine())!= null){
                            data= datos.split(",");
                           
                           if(data.length>= 3&& data[0].equalsIgnoreCase(nomAux)){
                               System.out.println("Se Encontro A: "+data[0]);
                                bandera= true;
                               break; 
                           } 
                        }
                        if(!bandera){
                            System.out.println("No Se Encontro");
                        }
                    } catch (FileNotFoundException ex) {
                        System.out.println(ex.getMessage());
                }catch(IOException ex){
                        System.out.println(ex.getMessage());
                }
    }

    @Override
    public void Actualizar() {
         System.out.println("Nombre A Actualizar");
                     nomAux= cs.next();
                    bandera= false;
                    StringBuilder contenidoNew= new StringBuilder();
                    
                    try(FileReader fr= new FileReader(BD)){
                        BufferedReader br= new BufferedReader(fr);
                        System.out.println("Edad A Actualizar");
                                 edad= cs.nextInt();
                                 
                        while((datos= br.readLine())!= null){
                            data= datos.split(",");
                           
                           if(data.length>= 3&& data[0].equalsIgnoreCase(nomAux)){
                                data[2]= String.valueOf(edad);
                               bandera= true;
                           } 
                              contenidoNew.append(String.join(",", data)).append("\n");
                        }
                    } catch (FileNotFoundException ex) {
                        System.out.println(ex.getMessage());
                    }catch(IOException ex){
                        System.out.println(ex.getMessage());
                    }
                    try(BufferedWriter bw= new BufferedWriter(new FileWriter(BD))){
                        bw.write(contenidoNew.toString());
                         if(bandera){
                             System.out.println("Se Actualizo");
                         }else{
                             System.out.println("No Se Actualizo");
                         }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                }
    }
 
}
