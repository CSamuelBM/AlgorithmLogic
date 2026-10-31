package Autobus;

import java.util.Scanner;

public class MenuPrincipal {
    
    private static Scanner cs= new Scanner(System.in);
    private static int opc= 0;
    private static Logica logica= new Logica();
    
    public void MenuPrincipal(){          
        while(opc!= 7){
            System.out.println("1.- Registrar");
            System.out.println("2.- Mostrar");
            System.out.println("3.- Ver Primer Autobus");
            System.out.println("4.- Cantidad");
            System.out.println("5.- Estado");
            System.out.println("6.- Eliminar");
            System.out.println("7.- Salir");
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
                  logica.Cantidad();
                break;
              case 5:
                  logica.Estado();
                break;
              case 6:
                  logica.Eliminar();
                break;
              case 7:
                  logica.Salir();
                break;
          }     
        }
    }
    
}
