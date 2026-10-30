package Model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Ovalo extends Figura{
    private static final long serialVersionUID  = 1L;
    
    private int x1, y1, x2, y2;
    private int i;
    
    public Ovalo(int x1, int y1, int x2, int y2, Color colorActual, int i) {
        super(colorActual);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.i = Math.max(1, i);
    }

    @Override
    public void dibujarFigura(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        try{
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(colorActual);
            g2.setStroke(new BasicStroke(i,
                BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND
            ));
            
            int x = Math.min(x1, x2);
            int y = Math.min(y1, y2);
            int w = Math.abs(x2 - x1);
            int h = Math.abs(y2 - y1);
        
            g2.drawOval(x, y, w, h);
        }finally {
            g2.dispose();
        }
    }
    
}
