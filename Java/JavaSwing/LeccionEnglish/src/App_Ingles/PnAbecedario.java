package App_Ingles;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class PnAbecedario extends JPanel{
    
    private ArrayList<JLabel> lbLetras = new ArrayList<>();
    private ArrayList<JButton> btPronunciacion = new ArrayList<>();
    private ArrayList<JLabel> lbImagen = new ArrayList<>();
    
    private ArrayList<String> listaEspaniol;
    private ArrayList<String> listaImagenes;
    private ArrayList<String> listaAudios;
    
    public PnAbecedario(){
        setLayout(new GridBagLayout());
        
        llenarListas();
        
        contenido();
    }
    
    private void contenido() {
        GridBagConstraints gbc = new GridBagConstraints();
        
        for(int i= 0; i< 26; i++){
            int j = i % 4;
            int k = i / 4;
            
            acomodo(gbc, j, k, i);
        }
    }
    
    private void acomodo(GridBagConstraints gbc, int x, int y, int i){
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10, 5, 10, 5);
        
        JPanel pnLetra = new JPanel(new BorderLayout());
        pnLetra.setBackground(new Color(245, 237, 237));
        pnLetra.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        
        lbLetras.get(i).setForeground(Color.BLACK);
        pnLetra.add(lbLetras.get(i), BorderLayout.NORTH);
        
        URL url = getClass().getResource(listaImagenes.get(i));
        ImageIcon icon = new ImageIcon(url);
        Image img = icon.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
        ImageIcon icono = new ImageIcon(img);
        
        lbImagen.get(i).setIcon(icono);
        lbImagen.get(i).setBackground(Color.WHITE);
        pnLetra.add(lbImagen.get(i), BorderLayout.CENTER);
        
        btPronunciacion.get(i).setBackground(new Color(81, 162, 232));
        btPronunciacion.get(i).setForeground(Color.BLACK);
        btPronunciacion.get(i).setBorderPainted(false);
        btPronunciacion.get(i).setFocusPainted(false);
        btPronunciacion.get(i).addActionListener(e -> reproducirAudios(listaAudios.get(i)));
        pnLetra.add(btPronunciacion.get(i), BorderLayout.SOUTH);
        
        add(pnLetra, gbc);
    }
    
    private void llenarListas(){
        letras();
        audios();
        
        for(int i= 0; i< 26; i++){
            lbLetras.add(new JLabel(listaEspaniol.get(i), SwingConstants.CENTER));
            btPronunciacion.add(new JButton("PRONUNCIACION"));
            lbImagen.add(new JLabel());
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
    
    private void letras(){
        listaEspaniol = new ArrayList<>(Arrays.asList(" [ A a ] [ ei ] ", " [ B b ] [ bi ] ", " [ C c ] [ si ] ",
            " [ D d ] [ di ] ", " [ E e ] [ i ] ", " [ F f ] [ ef ] ", " [ G g ] [ gi ] ", " [ H h ] [ eich ] ", 
            " [ I i ] [ ai ] ", " [ J j ] [ jei ] ", " [ K k ] [ kei ] ", " [ L l ] [ el ] ", " [ M m ] [ em ] ",
            " [ N n ] [ en ] ", " [ O o ] [ ou ] ", " [ P p ] [ pi ] ", " [ Q q ] [ kiu ] ", " [ R r ] [ ar ] ",
            " [ S s ] [ es ] ", " [ T t ] [ ti ] ", " [ U u ] [ iu ] ", " [ V v] [ vi ] ", " [ W w] [ dabliu ] ",
            " [ X x ] [ ecs ] ", " [ Y y ] [ uai ] ", " [ Z z ] [ zed ] "));
        
        listaImagenes = new ArrayList<>(Arrays.asList("/Recursos/Abecedario/Ant.png", "/Recursos/Abecedario/Bee.png",
            "/Recursos/Abecedario/Cat.png", "/Recursos/Abecedario/Dog.png", "/Recursos/Abecedario/Elephant.png",
            "/Recursos/Abecedario/Fox.png", "/Recursos/Abecedario/Giraffe.png", "/Recursos/Abecedario/Hippopotamus.png",
            "/Recursos/Abecedario/Ice Cream.png", "/Recursos/Abecedario/Jellyfish.png", "/Recursos/Abecedario/Koala.png",
            "/Recursos/Abecedario/Lion.png", "/Recursos/Abecedario/Mouse.png", "/Recursos/Abecedario/Narwhal.png",
            "/Recursos/Abecedario/Owl.png", "/Recursos/Abecedario/Panda.png", "/Recursos/Abecedario/Ant.png",
            "/Recursos/Abecedario/Bee.png", "/Recursos/Abecedario/Cat.png", "/Recursos/Abecedario/Dog.png", 
            "/Recursos/Abecedario/Elephant.png", "/Recursos/Abecedario/Fox.png", "/Recursos/Abecedario/Giraffe.png",
            "/Recursos/Abecedario/Hippopotamus.png", "/Recursos/Abecedario/Ice Cream.png", "/Recursos/Abecedario/Jellyfish.png"));
    }
    
    private void audios(){
        listaAudios = new ArrayList<>(Arrays.asList("/Recursos/AudiosAlfabeto/A_a.wav", "/Recursos/AudiosAlfabeto/B_b.wav", 
        "/Recursos/AudiosAlfabeto/C_c.wav", "/Recursos/AudiosAlfabeto/D_d.wav", "/Recursos/AudiosAlfabeto/E_e.wav", 
        "/Recursos/AudiosAlfabeto/F_f.wav", "/Recursos/AudiosAlfabeto/G_g.wav", "/Recursos/AudiosAlfabeto/H_h.wav", 
        "/Recursos/AudiosAlfabeto/I_i.wav", "/Recursos/AudiosAlfabeto/J_j.wav", "/Recursos/AudiosAlfabeto/K_k.wav", 
        "/Recursos/AudiosAlfabeto/L_l.wav", "/Recursos/AudiosAlfabeto/M_m.wav", "/Recursos/AudiosAlfabeto/N_n.wav", 
        "/Recursos/AudiosAlfabeto/O_o.wav", "/Recursos/AudiosAlfabeto/P_p.wav", "/Recursos/AudiosAlfabeto/Q_q.wav",
        "/Recursos/AudiosAlfabeto/R_r.wav", "/Recursos/AudiosAlfabeto/S_s.wav", "/Recursos/AudiosAlfabeto/T_t.wav",
        "/Recursos/AudiosAlfabeto/U_u.wav", "/Recursos/AudiosAlfabeto/V_v.wav", "/Recursos/AudiosAlfabeto/W_w.wav",
        "/Recursos/AudiosAlfabeto/X_x.wav", "/Recursos/AudiosAlfabeto/Y_y.wav", "/Recursos/AudiosAlfabeto/Z_z.wav"));
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
