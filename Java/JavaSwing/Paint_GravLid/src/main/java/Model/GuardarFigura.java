package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GuardarFigura implements Serializable{
    private static final long serialVersionUID  = 1L;
    
    private List<Figura> listFigura = new ArrayList<>();
    
    public void agregarFigura(Figura figura){
        listFigura.add(figura);
    }
    
    public List<Figura> getFiguras(){
        return listFigura;
    }
    
    public void limpiar(){
        listFigura.clear();
    }
    
    public void guardarEnArchivo(File archivo) throws IOException{
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))){
            oos.writeObject(listFigura);
        }
    }
    
    @SuppressWarnings("unchecked")
    public void cargarDesdeArchivo(File archivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            Object obj = ois.readObject();
            if (obj instanceof List<?>) {
                this.listFigura = (List<Figura>) obj;
            } else {
                throw new IOException("El archivo no contiene una lista de figuras válida.");
            }
        }
    }

    
}
