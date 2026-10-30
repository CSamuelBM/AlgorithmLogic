package Controller;

import Model.ModoFigura;
import View.Opciones;
import View.OpcionesW;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Figuras {
    private DibujarFiguras dibujarFigura;
    private Opciones opciones;
    private OpcionesW opcionesW;
    
    public Figuras(DibujarFiguras dibujarFigura, Opciones opciones, OpcionesW opcionesW){
        this.dibujarFigura = dibujarFigura;
        this.opciones = opciones;
        this.opcionesW = opcionesW;
        
        linea();
        ovalo();
        ovalorRelleno();
        lapiz();
    }
    
    private void linea(){
        opcionesW.getFiguras().accionLinea(e -> {
            dibujarFigura.setModo(ModoFigura.LINEA);
            dibujarFigura.setGrosor(opciones.getApariencia().getValue());
        });
         
        opcionesW.getFiguras().accionColorLinea(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                opcionesW.getFiguras().setColorLinea(new Color(33, 33, 33));
            }
            @Override
            public void mouseExited(MouseEvent e){
                opcionesW.getFiguras().setColorLinea(new Color(61, 61, 61));
            }
        });
    }
    
    private void ovalo(){
        opcionesW.getFiguras().accionOvalo(e -> {
            dibujarFigura.setModo(ModoFigura.OVALO);
            dibujarFigura.setGrosor(opciones.getApariencia().getValue());
        });
        
        opcionesW.getFiguras().accionColorOvalo(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                opcionesW.getFiguras().setColorOvalo(new Color(33, 33, 33));
            }
            @Override
            public void mouseExited(MouseEvent e){
                opcionesW.getFiguras().setColorOvalo(new Color(61, 61, 61));
            }
        });
    }
    
    private void ovalorRelleno(){
        opcionesW.getFiguras().accionOvaloRelleno(e -> {
            dibujarFigura.setModo(ModoFigura.OVALORELLENO);
            dibujarFigura.setGrosor(opciones.getApariencia().getValue());
        });
        
        opcionesW.getFiguras().accionColorOvaloRelleno(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                opcionesW.getFiguras().setColorOvaloRelleno(new Color(33, 33, 33));
            }
            @Override
            public void mouseExited(MouseEvent e){
                opcionesW.getFiguras().setColorOvaloRelleno(new Color(61, 61, 61));
            }
        });
    }
    
    private void lapiz(){
        opcionesW.getFiguras().accionLapiz(e -> {
            dibujarFigura.setModo(ModoFigura.LAPIZ);
            dibujarFigura.setGrosor(opciones.getApariencia().getValue());
        });
        
        opcionesW.getFiguras().accionColorLapiz(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                opcionesW.getFiguras().setColorLapiz(new Color(33, 33, 33));
            }
            @Override
            public void mouseExited(MouseEvent e){
                opcionesW.getFiguras().setColorLapiz(new Color(61, 61, 61));
            }
        });
    }
    
}
