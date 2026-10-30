package Controller;

import Model.GuardarFigura;
import Model.ModoFigura;
import View.ColoresRapidos;
import View.Dibujar;
import View.Opciones;
import View.OpcionesW;

public class MainController {
    private DibujarFiguras dibujarFigura ;
    
    public MainController(ColoresRapidos coloresRapidos, Opciones opciones, 
            Dibujar dibujar, GuardarFigura figura, ModoFigura modoF, OpcionesW opcionesW){
        dibujarFigura = new DibujarFiguras(figura, dibujar, modoF);
        Accion accion = new Accion(dibujarFigura, coloresRapidos, opciones, dibujar, figura, opcionesW);
    }
    
    public DibujarFiguras getDibujarFigura(){
        return dibujarFigura;
    }
    
}
