package View;

import Controller.MainController;
import Model.MainModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame{
    private Dibujar dibujar;
    private Opciones opciones;
    private OpcionesW opcionesW;
    private OpcionesE opcionesE;
    
    private MainModel model;
    private MainController controller;
    
    public MainView(){
        model = new MainModel();
        
        ColoresRapidos coloresRapidos = new ColoresRapidos();
        opciones = new Opciones(coloresRapidos);
        opcionesW = new OpcionesW();
        opcionesE = new OpcionesE();
        dibujar = new Dibujar(model.getGuardarFigura());
        
        controller = new MainController(coloresRapidos, opciones, dibujar, 
                    model.getGuardarFigura(), model.getModoFigura(), opcionesW);
        
        contenido(); 
    }

    private void contenido() {
        setMinimumSize(new Dimension(500, 500));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setCursor(Cursor.getPredefinedCursor(CROSSHAIR_CURSOR));
        setLayout(new BorderLayout());
        
        URL url = getClass().getResource("/Resources/gota.png");
        ImageIcon icono = new ImageIcon(url);
        Image img = icono.getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH);        
        setIconImage(img);
        
        setTitle("GravLid");
        
        panelesPrincipales();
    }
    
    public void panelesPrincipales(){
        JPanel pnCont = new JPanel(new BorderLayout());
        
        dibujar.setDibujar(controller.getDibujarFigura(), controller.getDibujarFigura());
        
        JPanel pnCentro = new JPanel(new GridBagLayout());
        pnCentro.setBackground(Color.BLACK);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 0; 
        gbc.weightx = 1.0; gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        pnCentro.add(dibujar, gbc);
        
        pnCont.add(pnCentro, BorderLayout.CENTER);
        pnCont.add(opcionesW, BorderLayout.WEST);
        pnCont.add(opcionesE, BorderLayout.EAST);
        
        add(opciones, BorderLayout.NORTH);
        add(pnCont, BorderLayout.CENTER);
    }
    
}
