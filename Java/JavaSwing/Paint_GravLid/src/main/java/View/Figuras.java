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

public class Figuras {
    
    private JButton btLinea, btOvalo, btOvaloRelleno;
    private JButton btLapiz;
    
    public Figuras(JPanel pnPanel){
        btLinea = new JButton("Linea");
        
        URL urlL = getClass().getResource("/Resources/linea.png");
        ImageIcon iconoL = new ImageIcon(urlL);
        Image imgL = iconoL.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconL = new ImageIcon(imgL);
        
        btLinea.setIcon(iconL);
        btLinea.setBackground(new Color(61, 61, 61));
        btLinea.setForeground(Color.WHITE);
        btLinea.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        btLinea.setAlignmentX(CENTER_ALIGNMENT);
        btLinea.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        pnPanel.add(btLinea);
        
        btOvalo = new JButton("Ovalo");
        
        URL urlO = getClass().getResource("/Resources/oval.png");
        ImageIcon iconoO = new ImageIcon(urlO);
        Image imgO = iconoO.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconO = new ImageIcon(imgO);
        
        btOvalo.setIcon(iconO);
        btOvalo.setBackground(new Color(61, 61, 61));
        btOvalo.setForeground(Color.WHITE);
        btOvalo.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        btOvalo.setAlignmentX(CENTER_ALIGNMENT);
        btOvalo.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        pnPanel.add(btOvalo);
        
        btOvaloRelleno = new JButton("Ovalo Relleno");
        
        URL urlOr = getClass().getResource("/Resources/oval-relleno.png");
        ImageIcon iconoOr = new ImageIcon(urlOr);
        Image imgOr = iconoOr.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconOr = new ImageIcon(imgOr);
        
        btOvaloRelleno.setIcon(iconOr);
        btOvaloRelleno.setBackground(new Color(61, 61, 61));
        btOvaloRelleno.setForeground(Color.WHITE);
        btOvaloRelleno.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        btOvaloRelleno.setAlignmentX(CENTER_ALIGNMENT);
        btOvaloRelleno.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        pnPanel.add(btOvaloRelleno);
        
        btLapiz = new JButton("Lapiz");
        
        URL urlLa = getClass().getResource("/Resources/lapiz.png");
        ImageIcon iconoLa = new ImageIcon(urlLa);
        Image imgLa = iconoLa.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconLa = new ImageIcon(imgLa);
        
        btLapiz.setIcon(iconLa);
        btLapiz.setBackground(new Color(61, 61, 61));
        btLapiz.setForeground(Color.WHITE);
        btLapiz.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        btLapiz.setAlignmentX(CENTER_ALIGNMENT);
        btLapiz.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        pnPanel.add(btLapiz);
    }
    
    public void accionLinea(ActionListener e){
        btLinea.addActionListener(e);
    }
    public void accionColorLinea(MouseListener e){
        btLinea.addMouseListener(e);
    }
    public void setColorLinea(Color color){
        btLinea.setBackground(color);
    }
    
    public void accionOvalo(ActionListener e){
        btOvalo.addActionListener(e);
    }
    public void accionColorOvalo(MouseListener e){
        btOvalo.addMouseListener(e);
    }
    public void setColorOvalo(Color color){
        btOvalo.setBackground(color);
    }
    
    public void accionOvaloRelleno(ActionListener e){
        btOvaloRelleno.addActionListener(e);
    }
    public void accionColorOvaloRelleno(MouseListener e){
        btOvaloRelleno.addMouseListener(e);
    }
    public void setColorOvaloRelleno(Color color){
        btOvaloRelleno.setBackground(color);
    }
    
    public void accionLapiz(ActionListener e){
        btLapiz.addActionListener(e);
    }
    public void accionColorLapiz(MouseListener e){
        btLapiz.addMouseListener(e);
    }
    public void setColorLapiz(Color color){
        btLapiz.setBackground(color);
    }
    
}
