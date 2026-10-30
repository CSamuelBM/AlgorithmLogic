package Model;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class Borrar extends Figura{
    private static final long serialVersionUID  = 1L;
    
    private int x1, y1, x2, y2;
    private int i;
    
    public Borrar(int x1, int y1, int x2, int y2, int i){
        super(null);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.i = Math.max(1, i);
    }

    @Override
    public void dibujarFigura(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Composite oldComp = g2.getComposite();
        Stroke oldStrk = g2.getStroke();
        
        try{
            g2.setComposite(AlphaComposite.Clear);
            g2.setStroke(new BasicStroke(i,
                BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND
            ));
            g2.fillRect(x1, y1, x2, y2);
        }finally{
            g2.setComposite(oldComp);
            g2.setStroke(oldStrk);
        }
    }
    
}
