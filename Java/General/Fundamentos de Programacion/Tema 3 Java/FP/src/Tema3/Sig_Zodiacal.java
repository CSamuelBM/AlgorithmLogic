package Tema3;
     import java.util.Scanner;
public class Sig_Zodiacal {
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
        
        String mes;
        int dia;
        
        System.out.println("Ingresa El Mes De Tu Nacimiento");
          mes = Leer.next();
        System.out.println("Ingresa El Dia De Tu Nacimiento");
         dia = Leer.nextInt();
         
        switch(mes.toLowerCase()){
            case "enero":
               if(dia >= 20){
                   System.out.println("Acuario");
               }else{
                   System.out.println("Capricornio");
               } 
                break;
                
            case "febrero":
               if(dia >= 19){
                   System.out.println("Piscis");
               }else{
                   System.out.println("Acuario");
               } 
                break;
                
            case "marzo":
                if(dia >= 21){
                    System.out.println("Aries");
                }else {
                    System.out.println("Piscis");
                }
                break;
                
            case "abril":
                if(dia >= 20){
                    System.out.println("Tauro");
                }else {
                    System.out.println("Aries");
                }
                break;
              
            case "mayo":
                if(dia >= 21){
                    System.out.println("Geminis");
                }else {
                    System.out.println("Tauro");
                }
                break;
                
            case "junio":
                if(dia >= 21){
                    System.out.println("Cancer");
                }else {
                    System.out.println("Geminis");
                }
                break;
                
            case "julio":
                if(dia >= 23){
                    System.out.println("Leo");
                }else {
                    System.out.println("Cancer");
                }
                break;
                
            case "agosto":
                if(dia >= 23){
                    System.out.println("Virgo");
                }else {
                    System.out.println("Leo");
                }
                break;
                
            case "septiembre":
                if(dia >= 23){
                    System.out.println("Libra");
                }else {
                    System.out.println("Virgo");
                }
                break;
                
            case "octubre":
                if(dia >= 23){
                    System.out.println("Escorpion");
                }else {
                    System.out.println("Libra");
                }
                break;
                
            case "noviembre":
                if(dia >= 22){
                    System.out.println("Sagitario");
                }else {
                    System.out.println("Escorpion");
                }
                break;
                
            case "diciembre":
                if(dia >= 22){
                    System.out.println("Capricornio");
                }else {
                    System.out.println("Sagitario");
                }
                break;
                
            default:
                System.out.println("Opcion No Valida");
                break;
        } 
    }
}
