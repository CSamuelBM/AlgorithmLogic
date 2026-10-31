package Recursividad;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[]args){
       Scanner cs= new Scanner(System.in);
       
       String palabra= cs.next();
       
       if(palabra.equalsIgnoreCase(reversa(palabra))) System.out.println("Es Palindromo");
       else System.out.println("No Es Palindromo");
       
    }
    
    public static String reversa(String palabra){
        if(palabra.length()< 1) return palabra;
        
        return reversa(palabra.substring(1))+ palabra.charAt(0);
    }
    
}
