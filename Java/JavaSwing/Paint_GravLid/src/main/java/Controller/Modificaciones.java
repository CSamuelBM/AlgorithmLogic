package Controller;

import Model.GuardarFigura;
import Model.ModoFigura;
import View.Dibujar;
import View.Opciones;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Modificaciones {
    private DibujarFiguras dibujarFigura;
    
    private Dibujar dibujar;
    private Opciones opciones;
    private GuardarFigura figura;
    
    public Modificaciones(Dibujar dibujar, Opciones opciones, GuardarFigura figura, 
            DibujarFiguras dibujarFigura){
        this.dibujar = dibujar;
        this.opciones = opciones;
        this.figura = figura;
        this.dibujarFigura = dibujarFigura;
        
        limpiar();
        borrar();
    }
    
    private void limpiar() {
        opciones.getModificaciones().accionLimpiar(e -> {
            figura.limpiar();
            dibujar.limpiar();
        });
        
        opciones.getModificaciones().accionColorLimpiar(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                opciones.getModificaciones().setColorLimpiar(new Color(179, 200, 201));
            }
            @Override
            public void mouseExited(MouseEvent e){
                opciones.getModificaciones().setColorLimpiar(new Color(207, 207, 207));
            }
        });
    }

    private void borrar() {
        opciones.getModificaciones().accionbtBorrar(e -> {
            dibujarFigura.setModo(ModoFigura.BORRAR);
            dibujarFigura.setGrosor(opciones.getApariencia().getValue());
        });
        opciones.getModificaciones().accionColorbtBorrar(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                opciones.getModificaciones().setColorbtBorrar(new Color(179, 200, 201));
            }
            @Override
            public void mouseExited(MouseEvent e){
                opciones.getModificaciones().setColorbtBorrar(new Color(207, 207, 207));
            }
        });
    }
    
}
