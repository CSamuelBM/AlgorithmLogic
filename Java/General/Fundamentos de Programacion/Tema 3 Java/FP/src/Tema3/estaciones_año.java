package Tema3;
   import java.util.Scanner;
public class estaciones_año {
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
      String mes;
      int dia;
      
      System.out.println("Ingresa El Mes");
       mes = Leer.next();
       
      System.out.println("Ingresa El Dia");
       dia = Leer.nextInt();
       
       switch(mes.toLowerCase()){
           
           case "diciembre":
               if(dia >= 21){
                   System.out.println("Invierno");
               }else{
                   System.out.println("Otoño");
               }
               break;
               
             case "enero":
               
                 System.out.println("Invierno");
                
               break;
               
             case "febrero":
               
                 System.out.println("Invierno");
               
                break;
             
             case "marzo":
                 if(dia >= 21){
                     System.out.println("Primavera");
                 }else{
                     System.out.println("Invierno");
                 }
                 break;
                
             case "abril":
               
                     System.out.println("Primavera");
              
                 break;
                 
             case "mayo":
                 
                     System.out.println("Primavera");
              
                 break;
                 
             case "junio":
                 if(dia >= 21){
                     System.out.println("Verano");
                 }else{
                     System.out.println("Primavera");
                 }
                 break;
                 
             case "julio":
                 
                     System.out.println("Verano");
              
                 break;
                 
             case "agosto":
                 
                     System.out.println("Verano");
               
                 break;
                 
             case "septiembre":
                 if(dia >= 21){
                     System.out.println("Otoño");
                 }else{
                     System.out.println("verano");
                 }
                 break;
                 
             case "octubre":
                
                     System.out.println("Otoño");
               
                 break;
                 
             case "noviembre":
                
                     System.out.println("Otoño");
              
                 break;
                 
             default:
                 System.out.println("Opcion No Valida");
                 break;   
       
       }
    }
}

