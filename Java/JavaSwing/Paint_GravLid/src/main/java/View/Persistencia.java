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

public class Persistencia {
    
    private JButton btGuardar, btCargar;
    
    public Persistencia(JPanel pnPanel){
        btGuardar = new JButton("Guardar");
        
        URL urlG = getClass().getResource("/Resources/salvado.png");
        ImageIcon iconoG = new ImageIcon(urlG);
        Image imgG = iconoG.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconG = new ImageIcon(imgG);
        
        btGuardar.setIcon(iconG);
        btGuardar.setBackground(new Color(207, 207, 207));
        btGuardar.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        btGuardar.setAlignmentX(CENTER_ALIGNMENT);
        btGuardar.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        pnPanel.add(btGuardar);
        
        btCargar = new JButton("Cargar");
        
        URL urlC = getClass().getResource("/Resources/importar.png");
        ImageIcon iconoC = new ImageIcon(urlC);
        Image imgC = iconoC.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconC = new ImageIcon(imgC);
        
        btCargar.setIcon(iconC);
        btCargar.setBackground(new Color(207, 207, 207));
        btCargar.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        btCargar.setAlignmentX(CENTER_ALIGNMENT);
        btCargar.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        pnPanel.add(btCargar);
    }
    
    public void accionGuardar(ActionListener e){
        btGuardar.addActionListener(e);
    }
    public void accionColorGuardar(MouseListener e){
        btGuardar.addMouseListener(e);
    }
    public void setColorGuardar(Color color){
        btGuardar.setBackground(color);
    }
    
    public void accionCargar(ActionListener e){
        btCargar.addActionListener(e);
    }
    public void accionColorCargar(MouseListener e){
        btCargar.addMouseListener(e);
    }
    public void setColorCargar(Color color){
        btCargar.setBackground(color);
    }
    
}
