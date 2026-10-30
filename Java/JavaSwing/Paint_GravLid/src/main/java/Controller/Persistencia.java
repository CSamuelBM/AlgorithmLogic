package Controller;

import Model.Figura;
import Model.GuardarFigura;
import View.Dibujar;
import View.Opciones;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Persistencia {
    
    private Opciones opciones;
    private Dibujar dibujar;
    private GuardarFigura figura;
    
    public Persistencia(Opciones opciones, Dibujar dibujar, GuardarFigura figura){
        this.opciones = opciones;
        this.dibujar = dibujar;
        this.figura = figura;
        
        guardar();
        cargar();
    }
    
    private void guardar() {
        opciones.getPersistencia().accionGuardar(e -> {
            JFileChooser ch = new JFileChooser();
            ch.setDialogTitle("Guardar lista de figuras (serializado)");
            if (ch.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                File f = asegurarExtension(ch.getSelectedFile(), ".fig");
                try {
                    figura.guardarEnArchivo(f);
                    JOptionPane.showMessageDialog(null, "Guardado en:\n" + f.getAbsolutePath());
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al guardar: " + ex.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        opciones.getPersistencia().accionColorGuardar(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                opciones.getPersistencia().setColorGuardar(new Color(179, 200, 201));
            }
            @Override
            public void mouseExited(MouseEvent e){
                opciones.getPersistencia().setColorGuardar(new Color(207, 207, 207));
            }
        });
    }

    private void cargar() {
        opciones.getPersistencia().accionCargar(e -> {
            JFileChooser ch = new JFileChooser();
            ch.setDialogTitle("Cargar lista de figuras (serializado)");
            if (ch.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File f = ch.getSelectedFile();
                try {
                    figura.cargarDesdeArchivo(f);
                    
                    for(Figura fig : figura.getFiguras())
                        dibujar.aplicarFigura(fig);
                    
                    JOptionPane.showMessageDialog(null, "Cargado desde:\n" + f.getAbsolutePath());
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al cargar: " + ex.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        });
        
        opciones.getPersistencia().accionColorCargar(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                opciones.getPersistencia().setColorCargar(new Color(179, 200, 201));
            }
            @Override
            public void mouseExited(MouseEvent e){
                opciones.getPersistencia().setColorCargar(new Color(207, 207, 207));
            }
        });
    }
    
    private File asegurarExtension(File original, String extension) {
        String path = original.getAbsolutePath();
        if (!path.toLowerCase().endsWith(extension)) {
            return new File(path + extension);
        }
        return original;
    }
    
}
