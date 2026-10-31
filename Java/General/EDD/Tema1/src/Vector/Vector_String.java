package Vector;
  import java.util.Collections;
  import java.util.Scanner;
  import java.util.Vector;
public class Vector_String {
    public static void main(String[]args){
        Vector <String> obVs= new Vector<> ();
        Scanner cs= new Scanner(System.in);
        
       int opc= 0;
       String nom, eliminarNom;
       
       while(opc!= 6){
           System.out.println("1.-Agregar");
           System.out.println("2.-Eliminar");
           System.out.println("3.-Tamaño");
           System.out.println("4.-Mostar");
           System.out.println("5.-Limpiar");
           System.out.println("6.-Salir");
            opc= cs.nextInt();
          switch(opc){
              case 1:
                  System.out.println("Ingresa Un Nombre");
                   nom= cs.next();
                  obVs.add(nom);
                   System.out.println("Accion Exitosa!!");
                break;
              case 2:
                  System.out.println("Nombre A Eliminar"); 
                   eliminarNom= cs.next();
                  obVs.removeAll(Collections.singleton(eliminarNom));
                  System.out.println("Accion Exitosa!!");
                break;
              case 3:
                  System.out.println("El Tamaño Del Vector Es: "+ obVs.size()+ " Posiciones");
                break;
              case 4:
                  System.out.println("Los Nombres: "+ obVs);
                break;
              case 5:
                  obVs.clear();
                   System.err.println("Accion Exitosa!!");
                break;
              case 6:
                  System.out.println("Saliste");
                return;
              default:
                  System.err.println("Opcion No Valida");
          }  
       }
        
    }
}
