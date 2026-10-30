package App_Ingles;

import java.awt.*;
import java.net.URL;
import java.util.*;
import javax.swing.*;

public class PnFormulario extends JPanel{    
    private ArrayList<String> listaLetras;
    private ArrayList<JLabel> listaPreguntas = new ArrayList<>();
    private ArrayList<JTextField> listaRespuestas = new ArrayList<>();
    private ArrayList<String> listaIndices = new ArrayList<>();
    private Map<String, String> mpRespuestas = new HashMap<>();
    
    private JButton btEnviar;
    
    public PnFormulario(){
        setLayout(new GridBagLayout());
        
        iniciarRespuestasPreguntas();
        
        contenido();
    }
    
    private void contenido() {
        GridBagConstraints gbc = new GridBagConstraints();
        
        letras();
        respuestas();
        
        for(int i= 0; i< 4; i++){
            int j = i % 2;
            int k = i / 2;
            
            mostrarPreguntas(gbc, j, k, i);
        }
        
        botonEnviar(gbc);
        imagenFormulario(gbc);
    }
    
    private void botonEnviar(GridBagConstraints gbc){
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 6;
        gbc.gridheight = 4;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.insets = new Insets(10, 5, 10, 5);
        JPanel pnEnviar = new JPanel();
        pnEnviar.setBackground(new Color(81, 162, 232));
        pnEnviar.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        btEnviar = new JButton("ENVIAR");
        btEnviar.setForeground(Color.BLACK);
        btEnviar.setBackground(new Color(245, 237, 237));
        btEnviar.setPreferredSize(new Dimension(180, 25));
        btEnviar.addActionListener(e -> resultados());
        pnEnviar.add(btEnviar);
        add(pnEnviar, gbc);
    }
    
    private void imagenFormulario(GridBagConstraints gbc){
        gbc.gridx = 0;
        gbc.gridy = 26;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        JPanel pnPregunta = new JPanel(new BorderLayout());
        pnPregunta.setOpaque(false);
        add(pnPregunta, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.insets = new Insets(10, 5, 10, 5);
        JPanel pnImagen = new JPanel(new BorderLayout());
        pnImagen.setBorder(BorderFactory.createEmptyBorder(40, 5, 10, 5));
        pnImagen.setOpaque(false);
        
        JLabel lbImagen = new JLabel();
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/Recursos/imgP.png"));
        Image img = icon.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);
        ImageIcon icono = new ImageIcon(img);
        lbImagen.setIcon(icono);
        pnImagen.add(lbImagen, BorderLayout.CENTER);
        
        add(pnImagen,gbc);
    }
    
    private void mostrarPreguntas(GridBagConstraints gbc, int x, int y, int i) {
        gbc.gridx = x;
        gbc.gridy = y+3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.insets = new Insets(10, 0, 10, 0);
        
        JPanel pnPregunta = new JPanel();
        pnPregunta.setBackground(new Color(245, 237, 237));
        pnPregunta.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        
        listaPreguntas.get(i);
        listaPreguntas.get(i).setForeground(Color.BLACK);
        pnPregunta.add(listaPreguntas.get(i));
        
        listaRespuestas.get(i).setForeground(Color.BLACK);
        listaRespuestas.get(i).setOpaque(false);
        pnPregunta.add(listaRespuestas.get(i));
        
        add(pnPregunta, gbc);
    }
    
    private void resultados(){
        boolean estaVacia = false;
        int aciertos = 0;
        
        for(JTextField tf : listaRespuestas){
            if(tf.getText().trim().isEmpty()){
                estaVacia = true;
                JOptionPane.showMessageDialog(null, "Contesta todas las preguntas");
                break;
            }
        }
        
        if(!estaVacia){
            for(int i= 0; i< listaRespuestas.size(); i++)
                if(mpRespuestas.get(listaIndices.get(i)).equalsIgnoreCase(listaRespuestas.get(i).getText()))
                    aciertos++;
            
            JOptionPane.showMessageDialog(null, "Tus aciertos fueron: "+ aciertos);
            
            for(JTextField tf : listaRespuestas)
                tf.setText("");
        }
    }
    
    public void reinicio() {
        Collections.shuffle(listaLetras);

        listaIndices.clear();
        
        for(int i= 0; i< listaPreguntas.size(); i++){
            listaPreguntas.get(i).setText("Como se escribe en ingles [ " + listaLetras.get(i) + " ] ");
            listaIndices.add(listaLetras.get(i));
            listaRespuestas.get(i).setText("");
        }
    }
    
    private void iniciarRespuestasPreguntas(){
        for(int i= 0; i< 4; i++){
            listaPreguntas.add(new JLabel());
            listaRespuestas.add(new JTextField(20));
        }
    }
    
    private void letras(){
        listaLetras = new ArrayList<>(Arrays.asList("A a", "B b", "C c", "D d", "E e", "F f", "G g", "H h", 
            "I i", "J j", "K k", "L l", "M m", "N n", "O o", "P p", "Q q", "R r", "S s", "T t", "U u", "V v",
            "W w", "X x", "Y y", "Z z", "Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno", "Urano",
            "Neptuno"));
    }
    
    private void respuestas(){
        mpRespuestas.put("A a", "ei");
        mpRespuestas.put("B b", "bi");
        mpRespuestas.put("C c", "si");
        mpRespuestas.put("D d", "di");
        mpRespuestas.put("E e", "i");
        
        mpRespuestas.put("F f", "ef");
        mpRespuestas.put("G g", "gi");
        mpRespuestas.put("H h", "eich");
        mpRespuestas.put("I i", "ai");
        mpRespuestas.put("J j", "jei");
        
        mpRespuestas.put("K k", "kei");
        mpRespuestas.put("L l", "el");
        mpRespuestas.put("M m", "em");
        mpRespuestas.put("N n", "en");
        mpRespuestas.put("O o", "ou");
        
        mpRespuestas.put("P p", "pi");
        mpRespuestas.put("Q q", "kiu");
        mpRespuestas.put("R r", "ar");
        mpRespuestas.put("S s", "es");
        mpRespuestas.put("T t", "ti");
        
        mpRespuestas.put("U u", "iu");
        mpRespuestas.put("V v", "vi");
        mpRespuestas.put("W w", "dabliu");
        mpRespuestas.put("X x", "ecs");
        mpRespuestas.put("Y y", "uai");
        mpRespuestas.put("Z z", "zed");
        
        mpRespuestas.put("Mercurio", "Mercury");
        mpRespuestas.put("Venus", "Venus");
        mpRespuestas.put("Tierra", "Earth");
        mpRespuestas.put("Marte", "Mars");
        mpRespuestas.put("Jupiter", "Jupiter");
        mpRespuestas.put("Saturno", "Saturn");
        mpRespuestas.put("Urano", "Uranus");
        mpRespuestas.put("Neptuno", "Neptune");
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
