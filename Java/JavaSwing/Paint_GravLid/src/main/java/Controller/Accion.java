package Controller;

import Model.GuardarFigura;
import View.ColoresRapidos;
import View.Dibujar;
import View.Opciones;
import View.OpcionesW;

public class Accion {
    
    public Accion(DibujarFiguras dibujarFigura, ColoresRapidos coloresRapidos, Opciones opciones, 
            Dibujar dibujar, GuardarFigura figura, OpcionesW opcionesW){
        
        Figuras figuras = new Figuras(dibujarFigura, opciones, opcionesW);
        Persistencia persistencia = new Persistencia(opciones, dibujar, figura);
        Apariencia apariencia = new Apariencia(dibujarFigura, coloresRapidos, opciones, dibujar);  
        Modificaciones modificaciones = new Modificaciones(dibujar, opciones, figura, dibujarFigura);
    }
    
}
