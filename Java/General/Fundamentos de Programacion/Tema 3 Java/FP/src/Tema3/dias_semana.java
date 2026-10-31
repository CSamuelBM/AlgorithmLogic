package Tema3;
    import java.util.Scanner;
public class Dias_Semana {
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
          int dia;
          
          System.out.println("Ingresa Un Dias De La Semana");
           dia = Leer.nextInt();
           
       switch(dia){
           case 1:
             System.out.println("El Dia Es Lunes");  
               break;
               
           case 2:
              System.out.println("El Dia Es Martes");
               break;
               
           case 3:
              System.out.println("El Dia Es Miercoles");
               break;
               
           case 4:
              System.out.println("El Dia Es Jueves"); 
               break;
               
           case 5:
              System.out.println("El Dia Es Viernes"); 
               break;
               
           case 6:
              System.out.println("El Dia Es Sabado");
               break;
               
           case 7:
              System.out.println("El Dias Es Domingo");
               break;
               
           default:
              System.out.println("Opcion No Valida");
               break;
       }
    }
}
