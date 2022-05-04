package proyecto_ernesto_youtube;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {
    
    private JMenuBar mb;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
    private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelApellido,
                   labelDepartamento, labelAntiguedad, labelResultado, labelfooter;
    private JTextField txtNombreTrabajador, txtApellidoTrabajador;
    private JComboBox comboDepartamento, comboAntiguedad;
    private JScrollPane scrollPane;
    private JTextArea textarea1;
    private String [] opcionesDepartamento = {"","Atencion al Cliente", "Departamento de Logistica", "Departamento de Gerencia"};
    private String [] opcionesAntiguedad = {"","1 año de servicio","2 a 6 años de servicio","7 o mas años de servicio"};
    String nombreAdministrador = "";

    public Principal() {
        setLayout(null);
        setTitle("Pantalla principal");
        getContentPane().setBackground(new Color(255,0,0));
        this.setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        Bienvenida ventanaBienvenida = new Bienvenida();
        nombreAdministrador = ventanaBienvenida.texto;

        mb = new JMenuBar();
        mb.setBackground(new Color(255,0,0));
        setJMenuBar(mb);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255,0,0));
        menuOpciones.setFont(new Font("Andale Mono",1,14));
        menuOpciones.setForeground(new Color(255,255,255));
        mb.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255,0,0));
        menuCalcular.setFont(new Font("Andale Mono",1,14));
        menuCalcular.setForeground(new Color(255,255,255));
        mb.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(255,0,0));
        menuAcercaDe.setFont(new Font("Andale Mono",1,14));
        menuAcercaDe.setForeground(new Color(255,255,255));
        mb.add(menuAcercaDe);

        menuColorFondo = new JMenu("Color de fondo");
        menuColorFondo.setFont(new Font("Andale Mono",1,14));
        menuColorFondo.setForeground(new Color(255,0,0));
        menuOpciones.add(menuColorFondo);

        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("Andale Mono",1,14));
        miCalculo.setForeground(new Color(255,0,0));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);

        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font("Andale Mono",1,14));
        miRojo.setForeground(new Color(255,0,0));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);

        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono",1,14));
        miNegro.setForeground(new Color(255,0,0));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);

        miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font("Andale Mono",1,14));
        miMorado.setForeground(new Color(255,0,0));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono",1,14));
        miNuevo.setForeground(new Color(255,0,0));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);

        miElCreador = new JMenuItem("El creador");
        miElCreador.setFont(new Font("Andale Mono",1,14));
        miElCreador.setForeground(new Color(255,0,0));
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono",1,14));
        miSalir.setForeground(new Color(255,0,0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);

        labelLogo = new JLabel();
        labelLogo.setIcon(new ImageIcon("logo-coca.png"));
        labelLogo.setBounds(5,5,250,100);
        add(labelLogo);

        labelBienvenido = new JLabel("Bienvenido " + nombreAdministrador);
        labelBienvenido.setBounds(280, 30, 300, 50);
        labelBienvenido.setFont(new Font("Andale Mono",3,32));
        labelBienvenido.setForeground(new Color(255,255,255));
        add(labelBienvenido);

        labelTitle = new JLabel("Datos del trabajador para el calculo de vacaciones");
        labelTitle.setBounds(45, 140, 900, 25);
        labelTitle.setFont(new Font("Andale Mono",0,24));
        labelTitle.setForeground(new Color(255,255,255));
        add(labelTitle);

        labelNombre = new JLabel("Nombre:");
        labelNombre.setBounds(25, 188, 180, 25);
        labelNombre.setFont(new Font("Andale Mono",1,12));
        labelNombre.setForeground(new Color(255,255,255));
        add(labelNombre);

        txtNombreTrabajador = new JTextField();
        txtNombreTrabajador.setBounds(25, 213, 150, 25);
        txtNombreTrabajador.setBackground(new Color(224,224,224));
        txtNombreTrabajador.setFont(new Font("Andale Mono",1,14));
        txtNombreTrabajador.setForeground(new Color(255,0,0));
        add(txtNombreTrabajador);

        labelApellido = new JLabel("Apellido");
        labelApellido.setBounds(25, 248, 180, 25);
        labelApellido.setFont(new Font("Andale Mono",1,12));
        labelApellido.setForeground(new Color(255,255,255));
        add(labelApellido);

        txtApellidoTrabajador = new JTextField();
        txtApellidoTrabajador.setBounds(25, 273, 150, 25);
        txtApellidoTrabajador.setBackground(new Color(224,224,224));
        txtApellidoTrabajador.setFont(new Font("Andale Mono",1,14));
        txtApellidoTrabajador.setForeground(new Color(255,0,0));
        add(txtApellidoTrabajador);

        labelDepartamento = new JLabel("Selecciona el departamento:");
        labelDepartamento.setBounds(220, 188, 180, 25);
        labelDepartamento.setFont(new Font("Andale Mono",1,12));
        labelDepartamento.setForeground(new Color(255,255,255));
        add(labelDepartamento);

        comboDepartamento = new JComboBox<>(opcionesDepartamento);
        comboDepartamento.setBounds(220, 213, 220, 25);
        comboDepartamento.setBackground(new Color(224,224,224));
        comboDepartamento.setFont(new Font("Andale Mono",1,14));
        comboDepartamento.setForeground(new Color(255,0,0));
        add(comboDepartamento);

        labelAntiguedad = new JLabel("Seleciona la antiguedad");
        labelAntiguedad.setBounds(220, 248, 180, 25);
        labelAntiguedad.setFont(new Font("Andale Mono",1,12));
        labelAntiguedad.setForeground(new Color(255,255,255));
        add(labelAntiguedad);

        comboAntiguedad = new JComboBox<>(opcionesAntiguedad);
        comboAntiguedad.setBounds(220, 273, 220, 25);
        comboAntiguedad.setBackground(new Color(224,224,224));
        comboAntiguedad.setFont(new Font("Andale Mono",1,14));
        comboAntiguedad.setForeground(new Color(255,0,0));
        add(comboAntiguedad);

        labelResultado = new JLabel("Resultado del calculo");
        labelResultado.setBounds(220, 307, 180, 25);
        labelResultado.setFont(new Font("Andale Mono",1,12));
        labelResultado.setForeground(new Color(255,255,255));
        add(labelResultado);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setBackground(new Color(224,224,224));
        textarea1.setFont(new Font("Andale Mono",1,11));
        textarea1.setForeground(new Color(255,0,0));
        textarea1.setText("\n       Aqui aparece el resultado del calculo de las vacaciones.");
        scrollPane = new JScrollPane(textarea1);
        scrollPane.setBounds(220, 333, 385, 90);
        add(scrollPane);

        labelfooter = new JLabel("©2022 The Coca-Cola Company | Todos los derechos reservados");
        labelfooter.setBounds(135, 445, 500, 30);
        labelfooter.setFont(new Font("Andale Mono",1,12));
        labelfooter.setForeground(new Color(255,255,255));
        add(labelfooter);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miCalculo) {
            
            String nombreTrabajador = txtNombreTrabajador.getText();
            String apellidoTrabajador = txtApellidoTrabajador.getText();
            String departamento = comboDepartamento.getSelectedItem().toString();
            String antiguedad = comboAntiguedad.getSelectedItem().toString();

            if (nombreTrabajador.equals("") || apellidoTrabajador.equals("") ||
                departamento.equals("") || antiguedad.equals("")) {
                    JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
                } else {
                    if(departamento.equals("Atencion al Cliente")) {
                        
                        if (antiguedad.equals("1 año de servicio")) {
                            textarea1.setText("\n     El trabajador " + nombreTrabajador + " " + apellidoTrabajador +
                                              "\n     quien labora en " + departamento + " con " + antiguedad + 
                                              "\n     recibe 6 dias de vacaciones.");
                        }
                        if (antiguedad.equals("2 a 6 años de servicio")) {
                            textarea1.setText("\n     El trabajador " + nombreTrabajador + " " + apellidoTrabajador +
                                              "\n     quien labora en " + departamento + " con " + antiguedad + 
                                              "\n     recibe 14 dias de vacaciones.");
                        }
                        if (antiguedad.equals("7 o mas años de servicio")) {
                            textarea1.setText("\n     El trabajador " + nombreTrabajador + " " + apellidoTrabajador +
                                              "\n     quien labora en " + departamento + " con " + antiguedad + 
                                              "\n     recibe 20 dias de vacaciones.");
                        }
                    }
                    if(departamento.equals("Departamento de Logistica")) {
                        if (antiguedad.equals("1 año de servicio")) {
                            textarea1.setText("\n     El trabajador " + nombreTrabajador + " " + apellidoTrabajador +
                                              "\n     quien labora en " + departamento + " con " + antiguedad + 
                                              "\n     recibe 6 dias de vacaciones.");
                        }
                        if (antiguedad.equals("2 a 6 años de servicio")) {
                            textarea1.setText("\n     El trabajador " + nombreTrabajador + " " + apellidoTrabajador +
                                              "\n     quien labora en " + departamento + " con " + antiguedad + 
                                              "\n     recibe 14 dias de vacaciones.");
                        }
                        if (antiguedad.equals("7 o mas años de servicio")) {
                            textarea1.setText("\n     El trabajador " + nombreTrabajador + " " + apellidoTrabajador +
                                              "\n     quien labora en " + departamento + " con " + antiguedad + 
                                              "\n     recibe 20 dias de vacaciones.");
                        }
                    }
                    if(departamento.equals("Departamento de Gerencia")) {
                        if (antiguedad.equals("1 año de servicio")) {
                            textarea1.setText("\n     El trabajador " + nombreTrabajador + " " + apellidoTrabajador +
                                              "\n     quien labora en " + departamento + " con " + antiguedad + 
                                              "\n     recibe 6 dias de vacaciones.");
                        }
                        if (antiguedad.equals("2 a 6 años de servicio")) {
                            textarea1.setText("\n     El trabajador " + nombreTrabajador + " " + apellidoTrabajador +
                                              "\n     quien labora en " + departamento + " con " + antiguedad + 
                                              "\n     recibe 14 dias de vacaciones.");
                        }
                        if (antiguedad.equals("7 o mas años de servicio")) {
                            textarea1.setText("\n     El trabajador " + nombreTrabajador + " " + apellidoTrabajador +
                                              "\n     quien labora en " + departamento + " con " + antiguedad + 
                                              "\n     recibe 20 dias de vacaciones.");
                        }
                    }
                }
        }
        if (e.getSource() == miRojo) {
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (e.getSource() == miNegro) {
            getContentPane().setBackground(new Color(0,0,0));
        }
        if (e.getSource() == miMorado) {
            getContentPane().setBackground(new Color(51,0,51));
        }
        if (e.getSource() == miNuevo) {
            txtNombreTrabajador.setText("");
            txtApellidoTrabajador.setText("");
            comboDepartamento.setSelectedIndex(0);
            comboAntiguedad.setSelectedIndex(0);
            textarea1.setText("\n       Aqui aparece el resultado del calculo de las vacaciones.");
        }
        if (e.getSource() == miSalir) {
            Bienvenida ventanaBienvenida = new Bienvenida();
            ventanaBienvenida.setBounds(0, 0, 350, 450);
            ventanaBienvenida.setVisible(true);
            ventanaBienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if (e.getSource() == miElCreador) {
            JOptionPane.showMessageDialog(null, "Desarrollado por Tomas D'Aureli\n"+
            "Estudiante de Ingenieria en Software en UADE.");         
        }
    }
}
