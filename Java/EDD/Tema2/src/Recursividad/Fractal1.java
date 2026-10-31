package Recursividad;

import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fractal1 extends JFrame{
    public static void main(String[]args){
        Fractal1 demo= new Fractal1();
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private final int ANCHURA= 400;
    private final int ALTURA= 480;
    private final int NIVEL_MIN= 0, NIVEL_MAX= 15;
    private Color color= Color.BLUE;
    
    private JButton cambiarColorJButton, aumentarNivelJButton, reducirNivelJButton;
    private JLabel nivelJLabel;
    private FractalJPanel espacioDibujo;
    private JPanel principalJPanel, controlJPanel;
    
    public Fractal1(){
        super("Fractal");
        controlJPanel= new JPanel();
        controlJPanel.setLayout(new FlowLayout());
        
        cambiarColorJButton= new JButton("Color");
        controlJPanel.add(cambiarColorJButton);
        cambiarColorJButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evento){
                color= JColorChooser.showDialog(Fractal1.this, "Elejir un color", color);
                
                if(color== null){
                    color= Color.BLUE;
                }
                espacioDibujo.establecerColor(color);
            }
        });
        
        reducirNivelJButton= new JButton("Reducir Nivel");
        controlJPanel.add(reducirNivelJButton);
        reducirNivelJButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evento){
                int nivel= espacioDibujo.obtenerNivel();
                nivel --;
                
                if((nivel>= NIVEL_MIN)&& (nivel<= NIVEL_MAX)){
                    nivelJLabel.setText("Nivel: "+ nivel);
                    espacioDibujo.establecerNivel(nivel);
                    repaint();
                }
            }
        });
        
        aumentarNivelJButton= new JButton("Aumentar Nivel");
        controlJPanel.add(aumentarNivelJButton);
        aumentarNivelJButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evento){
                int nivel= espacioDibujo.obtenerNivel();
                nivel ++;
                Random rand= new Random();
                if((nivel>= NIVEL_MIN)&& (nivel<= NIVEL_MAX)){
                    nivelJLabel.setText("Nivel: "+ nivel);
                    espacioDibujo.establecerNivel(nivel);
                   // int r= rand.nextInt(40, 180);
                   // int g= rand.nextInt(40, 180);
                   // int b= rand.nextInt(40, 180);
                   // espacioDibujo.establecerColor(new Color(r, g, b));
                    repaint();
                }
            }
            
        });
        
        nivelJLabel= new JLabel("Nivel: 0");
        controlJPanel.add(nivelJLabel);
        
        espacioDibujo= new FractalJPanel(0);
        
        principalJPanel= new JPanel();
        principalJPanel.add(controlJPanel);
        principalJPanel.add(espacioDibujo);
        
        add(principalJPanel);
        
        setSize(ANCHURA, ALTURA);
        setVisible(true);
        
    }
}
