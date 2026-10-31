package Pilas;

import java.util.Scanner;
import java.util.Stack;

public class Pila0{
  
  public static void main(String[]args){
    Scanner cs= new Scanner(System.in);  

    Stack pila= new Stack<>();

    int num= cs.nextInt();

    pila.push(num);
    pila.push("PamLi");
    
    System.out.println(pila); 
        
    pila.pop(); 
    System.out.println(pila);

    pila.pop(); 
    System.out.println(pila);

    System.out.println(pila.isEmpty());

   }

}