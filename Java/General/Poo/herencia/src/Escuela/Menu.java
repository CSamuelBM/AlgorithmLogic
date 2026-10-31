package Escuela;

import java.util.Scanner;

public class Menu {
    private static Scanner cs= new Scanner(System.in);
    
    public static int LoginP(){
       System.out.println("<-----Menu Principal----->");
        System.out.println("1.- Ingresar......");
        System.out.println("2.- Cerrar......");
         return cs.nextInt();
    }
    
    public static int LoginA(){
       System.out.println("<-----Menu Secundario----->");
        System.out.println("1.- Iniciar sesion.....");
        System.out.println("2.- Cerrar sesion.....");
         return cs.nextInt();
    }
    
    //Menu Auxiliar
      public static int Menu(){    
        System.out.println("1.- Registrar....");
        System.out.println("2.- Mostrar....");
        System.out.println("3.- Buscar....");
        System.out.println("4.- Actualizar....");
        System.out.println("5.- Salir....");
         return cs.nextInt();
    }
    
}
