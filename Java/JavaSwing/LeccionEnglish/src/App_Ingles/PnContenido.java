package App_Ingles;

import java.awt.*;
import javax.swing.*;

public class PnContenido extends JPanel{
    
    private CardLayout contenido;
    private PnFormulario pnFormulario;
    
    public PnContenido(){
        ventanas();
    }
    
    private void ventanas(){
        contenido = new CardLayout();
        setLayout(contenido);
        
        //PnInicio pnInicio = new PnInicio();
        //add(pnInicio, "INICIO");
        
        PnAbecedario pnAbecedario = new PnAbecedario();
        add(pnAbecedario, "ABECEDARIO");
        
        PnPlanetas pnPlanetas = new PnPlanetas();
        add(pnPlanetas, "PLANETAS");
        
        pnFormulario = new PnFormulario();
        add(pnFormulario, "FORMULARIO");
    }
    
    public void conexion(String id){
        contenido.show(this, id);
    }
    
    public void reinicioFormulario(){
        pnFormulario.reinicio();
    }
    
}
