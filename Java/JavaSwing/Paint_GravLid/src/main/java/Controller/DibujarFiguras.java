package Controller;

import Model.Borrar;
import Model.GuardarFigura;
import Model.Lapiz;
import Model.Linea;
import Model.ModoFigura;
import static Model.ModoFigura.BORRAR;
import static Model.ModoFigura.LAPIZ;
import static Model.ModoFigura.LINEA;
import static Model.ModoFigura.OVALO;
import static Model.ModoFigura.OVALORELLENO;
import Model.Ovalo;
import Model.OvaloRelleno;
import View.Dibujar;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DibujarFiguras extends MouseAdapter{
    
    private int x1, y1, x2, y2;
    private int pX, pY;
    private int grosor;
    private Color colorActual = Color.BLACK;
    
    private ModoFigura modoF;
    private GuardarFigura guardarF;
    
    private Dibujar dibujar;
    
    public DibujarFiguras(GuardarFigura guardarF, Dibujar dibujar, ModoFigura modoF){
        this.guardarF = guardarF;
        this.dibujar = dibujar;
        this.modoF = modoF;
    } 
    
    @Override
    public void mousePressed(MouseEvent e){
        x1 = e.getX();
        y1 = e.getY();
        x2 = x1;
        y2 = y1;
        
        pX = x1;
        pY = y1;
    }
    
    @Override
    public void mouseDragged(MouseEvent e){
        x2 = e.getX();
        y2 = e.getY();
        
        switch(modoF){
            case LAPIZ:
                Lapiz dibujarLapiz = new Lapiz(pX, pY, x2, y2, colorActual, grosor);
                dibujar.aplicarFigura(dibujarLapiz);
                guardarF.agregarFigura(dibujarLapiz);
            break;
            case BORRAR:
                Borrar borrar = new  Borrar(pX, pY, x2, y2, grosor);
                dibujar.aplicarFigura(borrar);
                guardarF.agregarFigura(borrar);
            break;
        }
        
        pX = x2;
        pY = y2;
    }
    
    @Override
    public void mouseReleased(MouseEvent e){
        x2 = e.getX();
        y2 = e.getY();
        
        switch(modoF){
            case LINEA:
                Linea dibujarLinea = new Linea(x1, y1, x2, y2, colorActual, grosor);
                dibujar.aplicarFigura(dibujarLinea);
                guardarF.agregarFigura(dibujarLinea);
            break;
            case OVALO:
                Ovalo dibujarOvalo = new Ovalo(x1, y1, x2, y2, colorActual, grosor);
                dibujar.aplicarFigura(dibujarOvalo);
                guardarF.agregarFigura(dibujarOvalo);
            break;
            case OVALORELLENO:
                OvaloRelleno dibujarOvaloRelleno = new OvaloRelleno(x1, y1, x2, y2, colorActual, grosor);
                dibujar.aplicarFigura(dibujarOvaloRelleno);
                guardarF.agregarFigura(dibujarOvaloRelleno);
            break;
            case BORRAR:
                Borrar borrar = new  Borrar(pX, pY, x2, y2, grosor);
                dibujar.aplicarFigura(borrar);
                guardarF.agregarFigura(borrar);
            break;
        }
        dibujar.repaint();
    }
    
    public void setModo(ModoFigura modo){
        this.modoF = modo;
    }
    
    public void setColor(Color color){
        this.colorActual = color;
    }
    
    public Color getColor(){
        return colorActual;
    }
    
    public void setGrosor(int grosor){
        this.grosor = grosor;
    }
    
}
