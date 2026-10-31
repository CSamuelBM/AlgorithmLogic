package Animales;

import java.util.Scanner;

public class Main {     
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        int opc= 0;
        Gato obGato= new Gato();
        Perro obPerro= new Perro();
        Pato obPato= new Pato();
        Cotorro obCotorro= new Cotorro();
        Pollo obPollo= new Pollo();
        Gallo obGallo= new Gallo();        
        
       while(opc!= 7){ 
        System.out.println("<--Menu-->");
         System.out.println("1.- Gato");
         System.out.println("2.- Perro");
         System.out.println("3.- Pato");
         System.out.println("4.- Cotorro");
         System.out.println("5.- Pollo");
         System.out.println("6.- Gallo");
         System.out.println("7.- Salir");
        switch(opc= cs.nextInt()){
            case 1:
                obGato.comer();
                obGato.hacer_Ruido();
             break;
                
            case 2:
                obPerro.comer();
                obPerro.hacer_Ruido();
             break;
                
            case 3:
                obPato.comer();
                obPato.hacer_Ruido();
             break; 
                
            case 4:
                obCotorro.comer();
                obCotorro.hacer_Ruido();
             break;
                
            case 5:
                obPollo.comer();
                obPollo.hacer_Ruido();
             break;
                
            case 6:
                obGallo.comer();
                obGallo.hacer_Ruido();
             break;
                
            case 7:
                System.out.println("Saliendo--->");
             break;   
                
            default:
                System.out.println("Opcion No Valida");
         }  
       } 
    
    }
    
}
