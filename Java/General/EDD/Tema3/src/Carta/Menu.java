package Carta;

import java.util.Scanner;

public class Menu {
    
    public static void Principal(){
        Scanner cs= new Scanner(System.in);
        Logica logica= new Logica();
        
        int opc= 0;
        
        while(opc!= 8){
            System.out.println("1.- Registrar");
            System.out.println("2.- Mostrar");
            System.out.println("3.- Ver Elemento");
            System.out.println("4.- Eliminar");
            System.out.println("5.- Cantidad");
            System.out.println("6.- Estado");
            System.out.println("7.- Eliminar Todo");
            System.out.println("8.- Salir");
             opc= cs.nextInt();
            switch(opc){
                case 1:
                    logica.Registrar();
                  break;
                case 2:
                    logica.Mostrar();
                  break;
                case 3:
                    logica.VerElemento();
                  break;
                case 4:
                    logica.Eliminar();
                  break;
                case 5:
                    logica.Cantidad();
                  break;
                case 6:
                    logica.Estado();
                  break;
                case 7:
                    logica.EliminarTodo();
                  break;
                case 8:
                    logica.Salir();
                  break;
                default:
                    System.out.println("Opcion No Valida");
            } 
        }
        
    }
    
}
