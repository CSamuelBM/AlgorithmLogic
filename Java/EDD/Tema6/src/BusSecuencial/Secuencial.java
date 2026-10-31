package BusSecuencial;

import java.util.ArrayList;
import java.util.Scanner;

public class Secuencial {
    
    private static void busqueda(ArrayList<Integer> lista){
        Scanner sc = new Scanner(System.in);
        boolean search = true;
        
        while(search){
            boolean numExist = false;
            System.out.print("Que numero deseas buscar: ");
            int numero = sc.nextInt();
            for (int i = 0; i < lista.size(); i++) {
                if(numero == lista.get(i)){
                    numExist = true;
                }
            }
            if(numExist) 
                System.out.println("El numero " + numero + " SI se encuentra en la lista");
            else
                System.out.println("El numero " + numero + " NO se encuentra en la lista");            
            System.out.println("\nDeseas buscar otro numero? (y/n): ");
            search = (sc.next().toLowerCase().charAt(0) == 'y')? true : false;
        }        
    }

    public static void Busqueda(ArrayList<Integer> lista){
        busqueda(lista);
    }    
    
}
