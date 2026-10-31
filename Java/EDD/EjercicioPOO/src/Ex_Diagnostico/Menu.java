package Ex_Diagnostico;

import java.util.Scanner;

public class Menu {
    private static Scanner cs= new Scanner(System.in);
    
    public void MenuP(){
        int opc= 0;
        Paciente obP= new Paciente();
        
        while(opc!= 4){
            System.out.println("  Paciente  ");
            System.out.println("1.-Registrar");
            System.out.println("2.-Actualizar");
            System.out.println("3.-Buscar");
            System.out.println("4.-Volver");
             opc= cs.nextInt();
            switch(opc){
                case 1:
                    obP.Registrar();
                break;
                case 2:
                    obP.Actualizar();
                break;
                case 3:
                    obP.Buscar();
                break;
                case 4:
                    System.out.println("Volviste");
                return;
                default:
                    System.err.println("Error");
            } 
        }
        
    }
    
    public void MenuD(){
        int opc= 0;
        Doctor obD= new Doctor();
        
        while(opc!= 4){
            System.out.println("  Doctor  ");
            System.out.println("1.-Registrar");
            System.out.println("2.-Actualizar");
            System.out.println("3.-Buscar");
            System.out.println("4.-Volver");
             opc= cs.nextInt();
          switch(opc){
                case 1:
                    obD.Registrar();
                break;
                case 2:
                    obD.Actualizar();
                break;
                case 3:
                    obD.Buscar();
                break;
                case 4:
                    System.out.println("Volviste");
                return;
                default:
                    System.err.println("Error");
            } 
        }
        
    }
    
}
