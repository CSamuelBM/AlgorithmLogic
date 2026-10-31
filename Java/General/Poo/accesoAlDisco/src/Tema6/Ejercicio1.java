package Tema6;
 import java.io.BufferedReader;
  import java.io.FileReader;
public class Ejercicio1 {
    public static void main(String[]args){
        String archivo= "D:\\Segundo Semestre I.S.C\\POO\\Poo\\accesoAlDisco\\src\\Ejercicio1.txt";
        
        try (FileReader fr= new FileReader(archivo)){
            BufferedReader br= new BufferedReader(fr);
            String linea;
            while((linea= br.readLine())!= null)
                System.out.println(linea);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
