package View;

import java.awt.Color;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Opciones extends JPanel{
    
    private ColoresRapidos coloresRapidos;
    private Persistencia persistencia;
    private Modificaciones modificaciones;
    private Apariencia apariencia;
    
    public Opciones(ColoresRapidos coloresRapidos){
        this.coloresRapidos = coloresRapidos;
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setBackground(new Color(207, 207, 207));
        contenido();
    }
    
    private void contenido(){
        add(Box.createHorizontalStrut(40));
        
        persistencia = new Persistencia(this);
        
        add(Box.createHorizontalStrut(40));

        apariencia = new Apariencia(this, coloresRapidos);
        
        modificaciones = new Modificaciones(this);
        
        add(Box.createHorizontalStrut(300));
    }
    
    public Persistencia getPersistencia(){
        return persistencia;
    }
    
    public Modificaciones getModificaciones(){
        return modificaciones;
    }
    
    public Apariencia getApariencia(){
        return apariencia;
    }
    
}
