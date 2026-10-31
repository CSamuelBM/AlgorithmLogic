package Tema3;
      import java.util.Scanner;
public class primer_while {
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
         int opc = 0;
         String nom = "Nombre No Ingresado";
          do{
              System.out.println("Selecciona una opcion");
              System.out.println("1.- Ingresa Tu Nombre");
              System.out.println("2.- Mostrar");
              System.out.println("3.- Salir");
               opc = Leer.nextInt();
             switch(opc){
                 case 1:
                    System.out.println("Ingresa Tu Nombre");
                     nom = Leer.next();
                     break;
                 case 2:
                    System.out.println("Tu Nombres Es:" + nom);
                     System.out.println(" ");
                     break;
                 case 3:
                     System.out.println("Saliste");
                     break;
                 default:
                     System.out.println("Opcion No Valida");
                      System.out.println(" ");
                     break;
             }  
          }while(opc != 3);
    }
}
