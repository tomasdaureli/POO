package jframe;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
//import javax.swing.ImageIcon;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;

public class myFrame extends JFrame implements ActionListener{
    
    private JButton boton1 = new JButton("Open");
    private JButton boton2 = new JButton("Close");
    private JButton boton3 = new JButton("Read");
    private JLabel label = new JLabel();

    public myFrame() {
        this.setTitle("JFrame title goes here"); // set title of frame
        this.setSize(600,600); // set dimensions
        this.setVisible(true); // make frame visible
        // this.setLocation(400, 40); // set intial position 
        this.setLocationRelativeTo(null);
        
        // ImageIcon image = new ImageIcon("ID_1012509.jpg"); // create an image icon
        // this.setIconImage(image.getImage()); // change a icon image
        // this.getContentPane().setBackground(Color.BLUE);
        iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // stop to run process
    }

    public void iniciarComponentes() {
        JPanel panel = new JPanel(); // creamos un panel
        panel.setBackground(Color.YELLOW); // establecemos color al panel
        panel.setLayout(null);
        this.getContentPane().add(panel); // agregamos el panel a la ventana

        // JLabel etiqueta = new JLabel("Hola mundo"); // creamos un a etiqueta
        // panel.add(etiqueta); // agregamos la etiqueta al panel
        // etiqueta.setForeground(Color.RED);
        // etiqueta.setBounds(50, 50, 100, 70); // establecemos las dimensiones de la etiqueta
        //boton1.setLayout(null);
        boton1.setBounds(50, 50, 100, 30);
        panel.add(boton1);
        boton1.addActionListener(this);

        boton2.setBounds(150, 50, 100, 30);
        panel.add(boton2);
        boton2.addActionListener(this);

        boton3.setBounds(250, 50, 100, 30);
        panel.add(boton3);
        boton3.addActionListener(this);

        label.setBounds(10, 10, 300, 30);
        panel.add(label);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            label.setText("Programa abierto.");
        }
        if (e.getSource() == boton2) {
            label.setText("Programa cerrado.");
        }
        if (e.getSource() == boton3) {
            label.setText("Lectura iniciada.");
        } 
    }

}
