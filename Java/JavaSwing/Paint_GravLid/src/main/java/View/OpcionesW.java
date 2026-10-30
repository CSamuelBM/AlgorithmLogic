package View;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class OpcionesW extends JPanel{
    
    private Figuras figuras;
    
    public OpcionesW(){
        setPreferredSize(new Dimension(200, 0));
        setBackground(Color.DARK_GRAY);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        add(Box.createVerticalStrut(200));
        
        figuras = new Figuras(this);
    }
    
    public Figuras getFiguras(){
        return figuras;
    }
    
}
