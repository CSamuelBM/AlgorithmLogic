package View;

import Model.Figura;
import Model.GuardarFigura;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Dibujar extends JPanel{
    
    private GuardarFigura figura;
    private BufferedImage plantilla;
    
    public Dibujar(GuardarFigura figura){
        this.figura = figura;
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(800, 600));
        plantilla = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
        revalidate();
        repaint();
    }
    
    private void agregarMouseListener(MouseListener e){
        super.addMouseListener(e);
    }
    
    private void agregarMouseMotionListener(MouseMotionListener  e){
        super.addMouseMotionListener(e);
    } 
    
    public void setDibujar(MouseListener e1, MouseMotionListener e2){
        agregarMouseListener(e1);
        agregarMouseMotionListener(e2);
    }
    
    public void setColor(Color color){
        setBackground(color);
    }
    
    public GuardarFigura getGuardarFigura(){
        return figura;
    }
    
    public void limpiar(){
        Graphics2D g2 = plantilla.createGraphics();
        try{
            g2.setComposite(AlphaComposite.Clear);
            g2.fillRect(0, 0, plantilla.getWidth(), plantilla.getHeight());
            g2.setComposite(AlphaComposite.SrcOver);
        }finally{
            g2.dispose();
        }
        
        repaint();
    }
    
    public void aplicarFigura(Figura figura){
        Graphics2D g2 = plantilla.createGraphics();
        try{
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            figura.dibujarFigura(g2);
        }finally{
            g2.dispose();
        }
        
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawImage(plantilla, 0, 0, null);
    }
    
}
