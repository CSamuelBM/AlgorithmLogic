package App_Ingles;

import java.awt.*;
import javax.swing.*;

public class PnBotones extends JPanel{
    
    private JButton btAbecedario, btPlanetas, btFormulario;
    //private JButton btInicio;
    private PnContenido pnContenido;
    private Vista vista;
    
    public PnBotones(PnContenido pnContenido, Vista vista){
        this.pnContenido = pnContenido;
        this.vista = vista;
        
        botones();
        acciones();
    }
    
    private void botones() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        setBackground(new Color(117, 173, 255));
        
       /* btInicio = new JButton();
        btInicio.setText("INICIO");
        btInicio.setForeground(Color.BLACK);
        btInicio.setBackground(new Color(100, 149, 237));
        btInicio.setOpaque(false);
        btInicio.setBorderPainted(false);
        btInicio.setFocusPainted(false);
        btInicio.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        btInicio.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(btInicio);
        add(Box.createVerticalStrut(20)); */
        
        btAbecedario = new JButton();
        btAbecedario.setText("ABECEDARIO");
        btAbecedario.setBackground(new Color(100, 149, 237));
        btAbecedario.setOpaque(false);
        btAbecedario.setBorderPainted(false);
        btAbecedario.setFocusPainted(false);
        btAbecedario.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        btAbecedario.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(btAbecedario);
        add(Box.createVerticalStrut(20));
        
        btPlanetas = new JButton();
        btPlanetas.setText("PLANETAS");
        btPlanetas.setForeground(Color.BLACK);
        btPlanetas.setBackground(new Color(100, 149, 237));
        btPlanetas.setOpaque(false);
        btPlanetas.setBorderPainted(false);
        btPlanetas.setFocusPainted(false);
        btPlanetas.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        btPlanetas.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(btPlanetas);
        add(Box.createVerticalStrut(10));
        
        btFormulario = new JButton();
        btFormulario.setText("FORMULARIO");
        btFormulario.setForeground(Color.BLACK);
        btFormulario.setBackground(new Color(100, 149, 237));
        btFormulario.setOpaque(false);
        btFormulario.setBorderPainted(false);
        btFormulario.setFocusPainted(false);
        btFormulario.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        btFormulario.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(btFormulario);
        add(Box.createVerticalStrut(20));
        
    }

    private void acciones() {
       /* btInicio.addActionListener(e -> {
            vista.setTitulo("Learn the basics of ENGLISH");
            pnContenido.conexion("INICIO");
        } ); */
        
        btAbecedario.addActionListener(e -> {
            vista.setTitulo("Abecedario en ENGLISH");
            pnContenido.conexion("ABECEDARIO");
        } );
        
        btPlanetas.addActionListener(e -> {
            vista.setTitulo("Planetas en ENGLISH");
            pnContenido.conexion("PLANETAS");
        } );
        
        btFormulario.addActionListener(e -> {
            vista.setTitulo("Formulario de ENGLISH Abecedario & Planetas");
            pnContenido.reinicioFormulario();
            pnContenido.conexion("FORMULARIO");
        } );
    }
    
}
