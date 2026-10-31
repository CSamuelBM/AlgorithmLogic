package Tema3;
   import java.util.Scanner;
public class Dia_Semana {
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
         String nom;
         
         System.out.println("Ingresa El Nombre Del Dia");
            nom = Leer.next();
            
         switch(nom.toLowerCase()){
             case "lunes":
                System.out.println("El Dia Corresponde 1");
                 break;
                 
             case "martes":
                System.out.println("El Dia Corresponde 2");
                 break;
                 
             case "miercoles":
                System.out.println("El Dia Corresponde 3");
                 break;
                 
             case "jueves":
                System.out.println("El Dia Corresponde 4");
                 break;
                 
             case "viernes":
                System.out.println("El Dia Corresponde 5");
                 break;
                 
             case "sabado":
                System.out.println("El Dia Coresponde 6");
                 break;
                 
             case "domingo":
                System.out.println("El Dia Coresponde 7");
                 break;
                 
             default:
                 System.out.println("Opcion No Valida");
                  break;
         }
         
    }
}
