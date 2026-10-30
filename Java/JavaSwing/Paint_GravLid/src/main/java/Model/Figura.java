package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;

public abstract class Figura implements Serializable{
    
    private static final long serialVersionUID  = 1L;
    protected Color colorActual;
    
    public Figura(Color colorActual){
        this.colorActual = colorActual;
    }
    
    public Color getColorActual(){
        return colorActual;
    }
    
    public void setColorActual(Color colorActual){
        this.colorActual = colorActual;
    }
    
    public abstract void dibujarFigura(Graphics g); 
    
}
