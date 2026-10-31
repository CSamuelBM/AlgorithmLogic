package Cancion;

import java.util.Scanner;
import java.util.Stack;

public class Menu implements OpcionesMenu{
    private static Scanner cs= new Scanner(System.in);
    private static Stack <Cancion> listaA= new Stack<>();
    private static Stack <Cancion> listaB= new Stack<>();
    
    public void MenuPrincipal(){
        
        boolean validarEntrada= false;
        String opcS;
        int opc;
        
        while(!validarEntrada){
            try{
                System.out.println("1.-Registrar");
                System.out.println("2.-Eliminar");
                System.out.println("3.-Estado");
                System.out.println("4.-Ver Elemento");
                System.out.println("5.-Buscar Elemento");
                System.out.println("6.-Mover Elemento De Lista A -> B");
                System.out.println("7.-Mover Elemento De Lista B -> A");
                System.out.println("8.-Salir");
                 opcS= cs.nextLine();
                opc= Integer.parseInt(opcS);
              switch(opc){
                  case 1 ->{
                      Registrar();
                  }
                  
                  case 2 ->{
                      Eliminar();
                  }
                  
                  case 3 ->{
                      Estado();
                  }
                  
                  case 4 ->{
                      verElemento();
                  }
                  
                  case 5 ->{
                      buscarElemento();
                  }
                  
                  case 6 ->{
                      moverElementoAb();
                  }
                  
                  case 7 ->{
                      moverElementoBa();
                  }
                  
                  case 8 ->{
                      System.out.println("Saliste--->");
                      validarEntrada= true;
                  }
                  
                  default -> System.err.println("Opcion No Valida");
              }   
            }catch(NumberFormatException e){
                System.err.println("Ingresa Una Opcion Valida (1-8)");
            }
        }
    }
    
    @Override
    public void Registrar() {
        String nombreCancion, nombreArtista, genero, fecha, duracion;
        
        System.out.println("Ingresa El Nombre De La Cancion");
         nombreCancion= cs.nextLine();
        System.out.println("Ingresa El Nombre Del Artista");
         nombreArtista= cs.nextLine();
        System.out.println("Ingresa En Genero Musical");
         genero= cs.nextLine();
        System.out.println("Ingresa La Fecha De Creacion De La Cacion");
         fecha= cs.nextLine();
        System.out.println("Ingresa La Duracion En Minutos De La Cancion");
         duracion= cs.nextLine();
        
        listaA.push(new Cancion(nombreCancion, nombreArtista, genero, fecha, duracion));
        System.out.println("Accion Exitosa!!");
    }

    @Override
    public void Eliminar() {
        System.out.println("1.-Eliminar Cancion En Lista A");
        System.out.println("2.-Eliminar Cancion En Lista B");
         String opcS= cs.nextLine();
         int opc= Integer.parseInt(opcS);
        switch(opc){
            case 1-> {
                if(!listaA.empty()){
                   listaA.pop();
                   System.out.println("Accion Exitosa!!");
                }else System.out.println("No Hay Canciones En La Lista A");
            }
            case 2-> {
                if(!listaB.empty()){
                    listaB.pop();
                    System.out.println("Accion Exitosa!!");
                }else System.out.println("No Hay Canciones En La Lista B");
            }
        }
        
    }

    @Override
    public void Estado() {
        System.out.println("1.-Ver Estado De Lista A");
        System.out.println("2.-Ver Estado De Lista B");
         String opcS= cs.nextLine();
         int opc= Integer.parseInt(opcS);
        switch(opc){
            case 1->{
                if(!listaA.empty())System.out.println("Si Hay Canciones En La Lista A");
                else System.out.println("No Hay Canciones En La Lista A");
            }
            case 2->{
                if(!listaB.empty())System.out.println("Si Hay Canciones En La Lista B");
                else System.out.println("No Hay Canciones En La Lista B");
            }
            default-> System.err.println("Opcion No Valida");
        } 
        
    }

    @Override
    public void verElemento() {
        System.out.println("1.-Ver Elemento De Lista A");
        System.out.println("2.-Ver Elemento De Lista B");
         String opcS= cs.nextLine();
         int opc= Integer.parseInt(opcS);
        switch(opc){
            case 1-> {
                if(!listaA.empty()) System.out.println("La Ultima Cancion Ingresada Fue: "+ listaA.peek());
                else System.out.println("No Hay Canciones En La Lista A");
            }
            case 2-> {
                if(!listaB.empty()) System.out.println("La Ultima Cancion Ingresada Fue: "+ listaB.peek());
                else System.out.println("No Hay Canciones En La Lista B");
            }
        } 
    }

    @Override
    public void buscarElemento() {
        System.out.println("1.-Buscar Elemento En Lista A");
        System.out.println("2.-Buscar Elemento En Lista B");
         String opcS= cs.nextLine();
         int opc= Integer.parseInt(opcS);
        switch(opc){
            case 1-> {
                if(!listaA.empty()){
                   System.out.println("Ingresa El Nombre De La Cancion A Buscar");
                   String nombreBuscar= cs.nextLine();
            
                  Cancion cancionEncontrada= buscarCancion(listaA, nombreBuscar);
            
                  if(cancionEncontrada!= null) System.out.println("Se Encontro La Cancion: "+ cancionEncontrada);
                  else System.out.println("No Se Encontro La Cancion");
             
                }else System.out.println("No Hay Canciones En La Lista A");
            }
            case 2-> {
                if(!listaB.empty()){
                    System.out.println("Ingresa El Nombre De La Cacion A Buscar");
                    String nombreBuscar= cs.nextLine();
                    
                    Cancion cancionEncontrada= buscarCancion(listaB, nombreBuscar);
                    
                    if(cancionEncontrada!= null) System.out.println("Se Encontro La Cancion"+ cancionEncontrada);
                    else System.out.println("No Se Encontro La Cancion");
                    
                }else System.out.println("No Hay Canciones En La Lista B");
            }
        }  
    }

    @Override
    public void moverElementoAb() {
        if(!listaA.empty()){
            Cancion cancionMovida= listaA.pop();
            listaB.push(cancionMovida);
            
            System.out.println("Cancion Movida Exitosa Mente");
        }else System.out.println("No Hay Canciones En La Lista A");
    }
    
    @Override
    public void moverElementoBa() {
         if(!listaB.empty()){
             Cancion cancionMovida= listaB.pop();
             listaA.push(cancionMovida);
             
             System.out.println("Cancion Movida Exitosa Mente");
         }else System.out.println("No Hay Canciones En La Lista B");
    }
    
    public static Cancion buscarCancion(Stack<Cancion> lista, String nombreBuscar){
        for(Cancion c: lista){
            if(c.getNombreCancion().equalsIgnoreCase(nombreBuscar)){
                return c;
            }
        }
        return null;
    }
    
}
