package Controller;

import View.ColoresRapidos;
import View.Dibujar;
import View.Opciones;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JColorChooser;

public class Apariencia {
    private DibujarFiguras dibujarFigura;
    private ColoresRapidos coloresRapidos;
    private Opciones opciones;
    private Dibujar dibujar;
    
    public Apariencia(DibujarFiguras dibujarFigura, ColoresRapidos coloresRapidos, Opciones opciones,
            Dibujar dibujar){
        this.dibujarFigura = dibujarFigura;
        this.coloresRapidos = coloresRapidos;
        this.opciones = opciones;
        this.dibujar = dibujar;
        
        coloresRapidos();
        grosor();
        pintarFondo();
        colores();
    }
    
    private void coloresRapidos(){
        coloresRapidos.accionColor(e -> {
            dibujarFigura.setColor(e);
        });
    }
    
    private void grosor() {
        opciones.getApariencia().accionGrosor(e -> {
            int i = opciones.getApariencia().getValue();
            dibujarFigura.setGrosor(i);
            dibujar.repaint();
        });
    }
    
    private void pintarFondo(){
        opciones.getApariencia().accionFondo(e -> {
            dibujar.setColor(dibujarFigura.getColor());
        });
        
        opciones.getApariencia().accionColorFondo(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                opciones.getApariencia().setColorFondo(new Color(179, 200, 201));
            }
            @Override
            public void mouseExited(MouseEvent e){
                opciones.getApariencia().setColorFondo(new Color(207, 207, 207));
            }
        });
    }
    
    private void colores() {
        opciones.getApariencia().accionColor(e -> {
            Color colorActual = JColorChooser.showDialog(null, "Seleccionar Color", dibujarFigura.getColor());
            if (colorActual != null) 
                dibujarFigura.setColor(colorActual);
        });
        
        opciones.getApariencia().accionColorColor(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                opciones.getApariencia().setColorColor(new Color(179, 200, 201));
            }
            @Override
            public void mouseExited(MouseEvent e){
                opciones.getApariencia().setColorColor(new Color(207, 207, 207));
            }
        });
    }
    
}
