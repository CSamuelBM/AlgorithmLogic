package View;

import Model.ColorSeleccionado;
import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ColoresRapidos extends JPanel{
    
    private ColorSeleccionado colorActual;
    private JButton btColor;
    
    public ColoresRapidos(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setBackground(new Color(207, 207, 207));
        menuColores();
    }
    
    private void menuColores(){
        add(crearColores(Color.BLACK));
        add(crearColores(Color.RED));
        add(crearColores(Color.BLUE));
        add(crearColores(Color.GREEN));
    }
    
    private JButton crearColores(Color colorBoton){
        btColor = new JButton();
        btColor.setBackground(colorBoton);
        btColor.setPreferredSize(new Dimension(20, 20));
        btColor.setBorder(BorderFactory.createEmptyBorder(2, 1, 2, 1));
        btColor.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        btColor.setFocusPainted(false);
        
        btColor.addActionListener(e -> colorActual.ColorSeleccionado(colorBoton));
        
        return btColor;
    }
    
    public void accionColor(ColorSeleccionado e){
        colorActual = e;
    }
    
}
