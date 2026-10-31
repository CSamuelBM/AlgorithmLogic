package Examen;

import java.util.Scanner;

public class Menu {
    
    private Scanner cs= new Scanner(System.in);
    private int opc= 0;
    private ModelPersona obPersona= new ModelPersona();
    
    public void MenuPersona(){
        while(opc!= 5){
             System.out.println("1.-Registrar");
             System.out.println("2.-Mostrar");
             System.out.println("3.-Buscar");
             System.out.println("4.-Actualizar");
             System.out.println("5.-Volver");
              opc= cs.nextInt();
            switch(opc){
                case 1:
                     obPersona.Registrar();
                    break;
                case 2:
                     obPersona.Mostrar();
                    break;
                case 3:
                     obPersona.Buscar();
                    break;
                case 4:
                     obPersona.Actualizar();
                    break;
                case 5:
                     System.out.println("Volviendo");
                    break;
                default:
                    System.out.println("Opcion No Valida");
            }
        }
    }
    
}
