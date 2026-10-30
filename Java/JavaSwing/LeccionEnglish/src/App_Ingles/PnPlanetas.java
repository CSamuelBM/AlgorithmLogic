package App_Ingles;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class PnPlanetas extends JPanel{
    
    private ArrayList<JLabel> lbPlanetas = new ArrayList<>();
    private ArrayList<JButton> btPronunciacion = new ArrayList<>();
    private ArrayList<JLabel> lbImagenes = new ArrayList<>();
    
    private ArrayList<String> listaPlanetas;
    private ArrayList<String> listaImagenes;
    private ArrayList<String> listaAudios;
    
    public PnPlanetas(){
        setLayout(new GridBagLayout());
        
        llenarListas();
        
        Contenido();
    }
    
    private void Contenido(){
        GridBagConstraints gbc = new GridBagConstraints();
        
        for(int i= 0; i< 8; i++){
            int x = i % 4;
            int y = i / 4;
            
            acomodo(gbc, x, y, i);
        }
        gbc.gridx = 0;
        gbc.gridy = 26;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        JPanel pnPlaneta = new JPanel(new BorderLayout());
        pnPlaneta.setOpaque(false);
        add(pnPlaneta, gbc);
    }
    
    private void acomodo(GridBagConstraints gbc, int x, int y, int i){
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.insets = new Insets(10, 5, 10, 5);
        
        JPanel pnPlaneta = new JPanel(new BorderLayout());
        pnPlaneta.setBackground(new Color(245, 237, 237));
        pnPlaneta.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        
        lbPlanetas.get(i).setForeground(Color.BLACK);
        pnPlaneta.add(lbPlanetas.get(i), BorderLayout.NORTH);
        
        URL url = getClass().getResource(listaImagenes.get(i));
        ImageIcon icon = new ImageIcon(url);
        Image img = icon.getImage().getScaledInstance(150, 160, Image.SCALE_SMOOTH);
        ImageIcon icono = new ImageIcon(img);
        
        lbImagenes.get(i).setIcon(icono);
        lbImagenes.get(i).setBackground(Color.WHITE);
        pnPlaneta.add(lbImagenes.get(i), BorderLayout.CENTER);
        
        btPronunciacion.get(i).setBackground(new Color(81, 162, 232));
        btPronunciacion.get(i).setForeground(Color.BLACK);
        btPronunciacion.get(i).setForeground(Color.BLACK);
        btPronunciacion.get(i).setBorderPainted(false);
        btPronunciacion.get(i).setFocusPainted(false);
        btPronunciacion.get(i).addActionListener(e -> reproducirAudios(listaAudios.get(i)));
        pnPlaneta.add(btPronunciacion.get(i), BorderLayout.SOUTH);
        
        add(pnPlaneta, gbc);
    }
    
    private void llenarListas(){
        planetas();
        audios();
                
        for(int i= 0; i< 8; i++){
            lbPlanetas.add(new JLabel(listaPlanetas.get(i), SwingConstants.CENTER));
            btPronunciacion.add(new JButton("Pronunciacion"));
            lbImagenes.add(new JLabel());
        }
    }
    
    private void reproducirAudios(String url){
        try{
            AudioInputStream audio = AudioSystem.getAudioInputStream(getClass().getResource(url));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        }catch(IOException | LineUnavailableException | UnsupportedAudioFileException ex){            
        }
    }
    
    private void planetas(){
        listaPlanetas = new ArrayList<>(Arrays.asList(" [ Mercurio ]  [ Mercury ] ", " [ Venus ] [ Venus ] ", 
                " [ Tierra ] [ Earth ] ", " [ Marte ] [ Mars ] ", " [ Júpiter ] [ Jupiter] ", 
                " [ Saturno ] [ Saturn] ", " [ Urano ] [ Uranus ] ", " [ Neptuno ] [ Neptune ] "));
        
        listaImagenes = new ArrayList<>(Arrays.asList("/Recursos/Planetas/Mercurio.png",
            "/Recursos/Planetas/Venus.png", "/Recursos/Planetas/Tierra.png", "/Recursos/Planetas/Mercurio.png",
            "/Recursos/Planetas/Jupiter.png", "/Recursos/Planetas/Saturno.png", "/Recursos/Planetas/Urano.png",
            "/Recursos/Planetas/Neptuno.png"));
    }
    
    private void audios(){
        listaAudios = new ArrayList<>(Arrays.asList("/Recursos/AudiosPlanetas/Mercurio.wav", "/Recursos/AudiosPlanetas/Venus.wav", 
        "/Recursos/AudiosPlanetas/Tierra.wav", "/Recursos/AudiosPlanetas/Marte.wav", "/Recursos/AudiosPlanetas/Jupiter.wav", 
        "/Recursos/AudiosPlanetas/Saturno.wav", "/Recursos/AudiosPlanetas/Urano.wav", "/Recursos/AudiosPlanetas/Neptuno.wav"));
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
