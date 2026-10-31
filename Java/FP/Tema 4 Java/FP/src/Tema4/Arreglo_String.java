package Tema4;
   import java.util.Scanner;
public class Arreglo_String {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        int i, n;
        String var;
        String arrNom[];
        
        System.out.println("Longitud Del Arreglo");
         n= cs.nextInt();
          arrNom = new String[n];
          
          for(i= 0; i< n; i++){
              System.out.println("Ingresa Un Nombre");
               var= cs.next();
               arrNom[i]= var;
          }
          
          for(i= 0; i< n; i++){
              System.out.println("["+ arrNom[i]+ "]");
          }
    }
}
