package App_Ingles;

import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class PnInicio extends JPanel{
    
    public PnInicio() {
        setLayout(new BorderLayout());
        
        bienvenida();
    }
    
    private void bienvenida() {
        JPanel pnBienvenida = new JPanel(new BorderLayout());
        pnBienvenida.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        pnBienvenida.setOpaque(false);
        
        JLabel lbBienvenida = new JLabel();
        
        ImageIcon iconoBienvenida1 = new ImageIcon(getClass().getResource("/Recursos/imgP.png"));
        Image imgBienvenida = iconoBienvenida1.getImage().getScaledInstance(600, 300, Image.SCALE_SMOOTH);
        ImageIcon iconoBienvenida2 = new ImageIcon(imgBienvenida);
        lbBienvenida.setIcon(iconoBienvenida2);
        pnBienvenida.add(lbBienvenida);
        
        add(pnBienvenida, BorderLayout.NORTH);
    }
    
    @Override
    public void paintComponent(Graphics g){
        URL url = getClass().getResource("/Recursos/imgF1.jpg");
        ImageIcon icono = new ImageIcon(url);
        Image img = icono.getImage();
        super.paintComponent(g);
        if(img != null)
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
    
}
