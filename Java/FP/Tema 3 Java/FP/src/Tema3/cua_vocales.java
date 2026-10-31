package Tema3;
   import java.util.Scanner;
public class cua_vocales {
    public static void main(String[]args){
        Scanner cs = new Scanner(System.in);
        
        String original = " ", nueva = " ";
        
         System.out.println("Ingresa Un Texto");
          original = cs.nextLine();
        nueva = original.replaceAll(" ", " ");
        
         int j = 0;
         char c;
        int a =0, e =0, i =0, o =0, u =0; 
        
         for(j = u; i<nueva.length(); j++){
             c = nueva.toLowerCase().charAt(j);
           if(c == 'a'){
               a++;
         }else if(c == 'e'){
             e++;
         }else if(c == 'i'){
             i++;
         }else if(c == 'o'){
             o++;
         }else if(c == 'u'){
             u++;
         }
       }
       System.out.println("Cadena Original: " + original);
        System.out.println("Nueva: " + nueva);
         System.out.println("a: " + a);
         System.out.println("e: " + e);
         System.out.println("i: " + i);
         System.out.println("o: " + o);
         System.out.println("u: " + u);
    }
}
