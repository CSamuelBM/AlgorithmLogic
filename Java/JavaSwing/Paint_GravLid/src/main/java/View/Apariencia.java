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
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

public class Apariencia {
    
    private JButton btColores, btFondo;
    private JSlider sGrosor;
    private int i = 5;
        
    public Apariencia(JPanel pnPanel, ColoresRapidos coloresRapidos){
                
        coloresRapidos.setAlignmentX(CENTER_ALIGNMENT);
        pnPanel.add(coloresRapidos);
        
        btColores = new JButton("Colores");
        
        URL urlC = getClass().getResource("/Resources/colores.png");
        ImageIcon iconoC = new ImageIcon(urlC);
        Image imgC = iconoC.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconC = new ImageIcon(imgC);
        
        btColores.setIcon(iconC);
        btColores.setBackground(new Color(207, 207, 207));
        btColores.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        btColores.setAlignmentX(CENTER_ALIGNMENT);
        btColores.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        pnPanel.add(btColores);
        
        btFondo = new JButton("Fondo");
        
        URL urlF = getClass().getResource("/Resources/fondo-color.png");
        ImageIcon iconoF = new ImageIcon(urlF);
        Image imgF = iconoF.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconF = new ImageIcon(imgF);
        
        btFondo.setIcon(iconF);
        btFondo.setBackground(new Color(207, 207, 207));
        btFondo.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        btFondo.setAlignmentX(CENTER_ALIGNMENT);
        btFondo.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        pnPanel.add(btFondo);
        
        sGrosor = new JSlider(1, 50, i);
        sGrosor.setBackground(new Color(207, 207, 207));
        sGrosor.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        sGrosor.setAlignmentX(CENTER_ALIGNMENT);
        sGrosor.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        pnPanel.add(sGrosor);
    }
    
    public void accionFondo(ActionListener e){
        btFondo.addActionListener(e);
    }
    public void accionColorFondo(MouseListener e){
        btFondo.addMouseListener(e);
    }
    public void setColorFondo(Color color){
        btFondo.setBackground(color);
    }
    
    public void accionColor(ActionListener e){
        btColores.addActionListener(e);
    }
    public void accionColorColor(MouseListener e){
        btColores.addMouseListener(e);
    }
    public void setColorColor(Color color){
        btColores.setBackground(color);
    }
    
    public void accionGrosor(ChangeListener e){
        for(ChangeListener l : sGrosor.getChangeListeners())
            sGrosor.removeChangeListener(l);
        
        sGrosor.addChangeListener(lis -> {
            i = sGrosor.getValue();
            e.stateChanged(lis);
        });
    }
    
    public int getValue(){
        return i;
    }
    
}
