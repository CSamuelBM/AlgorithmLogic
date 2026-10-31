package Recursividad;

import java.awt.*;
import javax.swing.*;

public class FractalJPanel extends JPanel{
    private Color color;
    private int nivel;
    
    private final int ANCHURA= 400;
    private final int ALTURA= 400;
    
    public FractalJPanel(int nivelActual){
        color= Color.BLUE;
        nivel= nivelActual;
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(ANCHURA, ALTURA));
    }
    
    public void dibujarFractal(int nivel, int xA, int yA, int xB, int yB, Graphics g){
        if(nivel== 0){
            g.drawLine(xA, yA, xB, yB);
        }else{
            int xC= (xA+ xB)/ 2;
            int yC= (yA+ yB)/ 2;
            
            int xD= xA+ (xC- xA)/ 2- (yC- yA)/ 2;
            int yD= yA+ (yC- yA)/ 2- (xC- xA)/ 2;
            
            dibujarFractal(nivel- 1, xD, yD, xA, yA, g);
            dibujarFractal(nivel- 1, xD, yD, xC, yC, g);
            dibujarFractal(nivel- 1, xD, yD, xB, yB, g);
        }
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(color);
        dibujarFractal(nivel, 100, 90, 290, 200, g);
    }
    public void establecerColor(Color c){
        color= c;
    }
    public void establecerNivel(int nivelActual){
        nivel= nivelActual;
    }
    public int obtenerNivel(){
        return nivel;
    }
}
