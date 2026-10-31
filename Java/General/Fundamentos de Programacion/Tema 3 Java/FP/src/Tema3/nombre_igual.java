package Tema3;
    import java.util.Scanner;
public class nombre_igual {
    public static void main(String[]args){
        Scanner cs = new Scanner(System.in);

        String nom1 = "samuel", nomA = " ";  
            
      while(nomA.compareToIgnoreCase(nom1)!= 0){
        System.out.println("Ingresa Tu Nombre");
            nomA = cs.next();
      }
      System.out.println("El Nombres Es: " + nomA);
    }
}
