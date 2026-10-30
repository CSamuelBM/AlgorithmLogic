package Model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Lapiz extends Figura{
    private static final long serialVersionUID  = 1L;
    
    private int x1, y1, x2, y2;
    private int i;
    
    public Lapiz(int x1, int y1, int x2, int y2, Color colorActual, int i) {
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
            
            g2.drawLine(x1, y1, x2, y2);
        }finally{
            g2.dispose();
        }
    }
    
}
