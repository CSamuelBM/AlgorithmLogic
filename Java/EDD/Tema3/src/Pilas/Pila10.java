package Pilas;

import java.util.Scanner;
import java.util.Stack;

public class Pila10 {
    
    private static Scanner cs= new Scanner(System.in);
    private static Stack<String> pila= new Stack<>();
    private static Stack<String> pilaE= new Stack<>();

    public static void main(String[]args){

        menu();

    }

    public static void menu(){
        boolean entradaValida= false;
        String opcS;
        int opc;

        while(!entradaValida){

            try{
                System.out.println("1.- Registrar");
                System.out.println("2.- Eliminar");
                System.out.println("3.- Esta Vacia");
                System.out.println("4.- Ver Elemento");
                System.out.println("5.- Buscar Elemento");
                System.out.println("7.- Mover Elemento De A->B");
                System.out.println("8.- Mover Elemento De B->A");
                System.out.println("9.- Salir");
                 opcS= cs.nextLine();
                 opc= Integer.parseInt(opcS);

            switch(opc){
               case 1:
                    registro();
                 break;
               case 2:
                    eliminar();
                 break;
               case 3:
                    pilaVacia();
                 break;
               case 4:
                   verElemeto();
                 break;
               case 5:
                   buscarElemento();
                 break;
               case 7:
                   moverElementoAb();
                 break;
               case 8:
                   moverElementoBa();
                 break;
               case 9:
                    System.out.println("Saliste...>>");
                    entradaValida= true;
                 break;
               default:
                   System.err.println("Opcion No Valida");
            }   

         }catch(NumberFormatException e){
            System.err.println("Ingresa Numeros Enteros");  
         } 

       }
    }

    public static void registro(){

        System.out.println("Ingresa Tu Nombre");
         String nombre= cs.nextLine();
        pila.push(nombre);
        System.out.println("Accion Exitosa!!");

    }

    public static void eliminar(){

       if(pila.empty()== false){
           pila.pop();
           System.out.println("Accion Exitosa!!");
       }
       else System.err.println("No Hay Registro");
        
    }

    public static void pilaVacia(){

        if(pila.empty()== false)
            System.out.println("Hay Elemnetos En Pila");
        else
            System.out.println("No Hay Elemnetos En Pila");

    }

    public static void verElemeto(){

        if(pila.empty()== false)
            System.out.println("El Elemento Superior Es: "+ pila.peek());
        else System.out.println("No Hay Registro");

    }

    public static void buscarElemento(){

        if(pila.empty()== false){
            System.out.println("Ingresa Nombre A Buscar");
                String nombre= cs.nextLine();

          if(pila.search(nombre)== -1){ 
              System.out.println("No Se Encontro El Nombre"); 
                return;
         }    

            System.out.println("Esta En La Posicion: "+ pila.search(nombre));

        }
        else System.out.println("No Hay Registro");

    }
    
    public static void moverElementoAb(){
        if(!pila.empty()){
            pilaE.push(pila.pop());
            System.out.println("Accion Exitosa!!");
        }else System.out.println("No Hay Elementos");
    }
    
    public static void moverElementoBa(){
        if(!pilaE.empty()){
            pila.push(pilaE.pop());
            System.out.println("Accion Exitosa!!");
        }else System.out.println("No Hay Elementos");
    }
    
}
