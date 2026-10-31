package Vector;
  import java.util.Vector;
public class Vector_1 {
    public static void main(String[]args){
        
        //Ceeacion del Objeto Vector
          Vector obV = new Vector();
        
        //Un vector de un tipo de dato 
          //Vector <Integer>obV = new Vector<> ();
          //Vector <String>obV = new Vector<> ();
        
        //Agrega al objeto vector
          obV.add("America");
          obV.add(8);
          System.out.println(obV);
        
        //Da el tamaño del vector
          System.out.println("Tamaño: "+ obV.size());
        
        //Limpiar vector
          obV.clear();
          System.out.println(obV);
          
        //Creear un vector con opciones registrar, actualizar, buscar, eliminar y eliminar todo.  
    }
}
