package Persona;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
      Scanner cs= new Scanner(System.in);
      
        String nombre, sexo;
        int edad;
        boolean bandera= false;
        int opc= 0, pos= 0;
        
        Persona Person;
        Persona arrPerson[]= new Persona[20];
        
        do{
            System.out.println("1.- Registrar");
            System.out.println("2.- Mostrar");
            System.out.println("3.- Buscar");
            System.out.println("4.- Actualizar Edad");
            System.out.println("5.- Salir");
              opc= cs.nextInt();  
        switch(opc){
             case 1:
                System.out.println("Tu Nombre");
                 nombre= cs.next();
                System.out.println("Tu Sexo");
                 sexo= cs.next();
                System.out.println("Tu Edad");
                 edad= cs.nextInt();
                   Person= new Persona(nombre, sexo, edad);
                   arrPerson[pos]= Person;
                    pos++;
                break;
             case 2:
                for(int i= 0; i< pos; i++){
                    System.out.println("Nombre: "+ arrPerson[i].getNombre());
                    System.out.println("Sexo: "+ arrPerson[i].getSexo());
                    System.out.println("Edad: "+ arrPerson[i].getEdad());
                } 
               break;   
             case 3:
                 System.out.println("Nombre A Buscar");
                   nombre= cs.next();
                for(int i= 0; i< pos; i++){
                    if(nombre.equals(arrPerson[i].getNombre())){
                      bandera= true;
                    break;
                    }
                }
                  if(bandera== true){
                      System.out.println("Se Encontro A:"+ nombre);
                  }else{
                      System.out.println("No Se Encontro A:"+ nombre);
                  }
                    break;
             case 4:
                  System.out.println("Nombre A Buscar");
                   nombre= cs.next();
                for(int i= 0; i< pos; i++){
                    if(nombre.equals(arrPerson[i].getNombre())){
                      bandera= true;
                    System.out.println("Edad A Actualizada");
                      edad= cs.nextInt();
                     arrPerson[i].setEdad(edad);
                    }
                }
                  if(bandera== true){
                      System.out.println("Se Actualizo A:"+ nombre);
                  }else{
                      System.out.println("No Se Actualizo A:"+ nombre);
                  }
                 break;
             case 5:
                 System.out.println("Bay, Bay");
                  break;
             default: 
                 System.out.println("Opcion No Valida");
        }
      }while(opc!= 5); 
    }
}