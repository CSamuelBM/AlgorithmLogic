package BusHasMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lector {
    
    public static ArrayList<Integer> LeerTxt(){
      ArrayList<Integer> lista = new ArrayList<>();
      
      try (Scanner sc = new Scanner(new File("C:\\Users\\balle\\Downloads\\Ejemplo.txt"))) {
           while (sc.hasNextInt())
               lista.add(sc.nextInt());
      } catch (FileNotFoundException e) {
          System.err.println("error");
      }
      
      return lista;
    }
    
}
