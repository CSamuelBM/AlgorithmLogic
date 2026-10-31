package Tema4;
  import java.util.Scanner;
public class Vocal_arr {
    public static void main(String[]args){
        Scanner cs= new Scanner(System.in);
        
        String arr[], texto, nuevoText;
      int n;
       System.out.println("Longitud");
      n= cs.nextInt();
      cs.nextLine();
      arr= new String[n];
      int i, j;
      char c;
      
      for(i= 0; i< n; i++){
          nuevoText= "";
           System.out.println("Texto");
          texto= cs.nextLine();
           for(j= 0; j< texto.length(); j++){
               c= texto.toUpperCase().charAt(j);
               if(c!= 'A' && c!= 'E' && c!= 'I' && c!= 'O' && c!= 'U'){
                   nuevoText+= texto.charAt(j);
               }
           }
            arr[i]= nuevoText;
       }
    }
}
