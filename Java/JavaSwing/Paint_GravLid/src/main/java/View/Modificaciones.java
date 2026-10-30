package View;

import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Modificaciones {
    
    private JButton btLimpiar, btBorrar;
    
    public Modificaciones(JPanel pnPanel){
        btLimpiar = new JButton("Limpiar");
        
        URL urlL = getClass().getResource("/Resources/eliminar.png");
        ImageIcon iconoL = new ImageIcon(urlL);
        Image imgL = iconoL.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconL = new ImageIcon(imgL);
        
        btLimpiar.setIcon(iconL);
        btLimpiar.setBackground(new Color(207, 207, 207));
        btLimpiar.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        btLimpiar.setAlignmentX(CENTER_ALIGNMENT);
        btLimpiar.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        pnPanel.add(btLimpiar);
        
        btBorrar = new JButton("Borrar");
        
        URL urlB = getClass().getResource("/Resources/borrar.png");
        ImageIcon iconoB = new ImageIcon(urlB);
        Image imgB = iconoB.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconB = new ImageIcon(imgB);
        
        btBorrar.setIcon(iconB);
        btBorrar.setBackground(new Color(207, 207, 207));
        btBorrar.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        btBorrar.setAlignmentX(CENTER_ALIGNMENT);
        btBorrar.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        pnPanel.add(btBorrar);
    }
    
    public void accionLimpiar(ActionListener e){
        btLimpiar.addActionListener(e);
    }
    public void accionColorLimpiar(MouseListener e){
        btLimpiar.addMouseListener(e);
    }
    public void setColorLimpiar(Color color){
        btLimpiar.setBackground(color);
    }
    
    public void accionbtBorrar(ActionListener e){
        btBorrar.addActionListener(e);
    }
    public void accionColorbtBorrar(MouseListener e){
        btBorrar.addMouseListener(e);
    }
    public void setColorbtBorrar(Color color){
        btBorrar.setBackground(color);
    }
    
}
