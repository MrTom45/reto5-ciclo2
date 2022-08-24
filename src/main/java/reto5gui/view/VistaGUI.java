package reto5gui.view;

import javax.swing.*;
import javax.swing.border.Border;

import reto5gui.controller.ControladorGUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;

public class VistaGUI extends JFrame {

    JComboBox<String> combo_clasificacion;
    JList<String> lista_ciudades;
    JComboBox<String> combo_proveedor;
    JComboBox<String> combo_ciudad;
    private static ControladorGUI controlador;



    public VistaGUI() throws SQLException{
        controlador = new ControladorGUI();
        initComponents();

    }

    public void initComponents() throws SQLException{
        //Controlador controlador = new Controlador();

        JFrame frame = new JFrame("<<< Reto 5 >>>");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 540);
        frame.setLocationRelativeTo(null); // la ventana aparece en el centro de la pantalla

        //Panel principal
        JPanel contenedor = new JPanel();
        // Layout principal
        FlowLayout layout = new FlowLayout();
        layout.setVgap(20);
        contenedor.setLayout(layout);

        //array de ciudaddes para ComboBox y JList (informe 2 y 3):
        String[] listado_ciudades = controlador.listarCiudades();

        // Panel 1
        JPanel panel_1 = new JPanel();
        Border borde_titulo_1 = BorderFactory.createTitledBorder("Informe 1");        
        panel_1.setBorder(borde_titulo_1);
        FlowLayout layout_1 = new FlowLayout(FlowLayout.LEADING, 30,10);
        panel_1.setLayout(layout_1);
        panel_1.setPreferredSize(new Dimension(700, 100));
        // Componentes panel 1
        JLabel label_1 = new JLabel("<html><p>Generar un informe basándose en la tabla con la información respectiva al <i>Líder</i>. El listado <br>debe contener: <i>el ID_Lider</i>, el <i>Nombre</i>, el <i>Primer_Apellido</i> y la <i>Ciudad_Residencia</i>. Este <br>informe debe estar ordenado por la <i>Ciudad_Residencia</i> de forma alfabética.</p></html>");
        JButton boton_1 = new JButton("Consultar");
        // añadir los componentes en el panel local
        panel_1.add(label_1);
        panel_1.add(boton_1);


        // Panel 2
        JPanel panel_2 = new JPanel();
        Border borde_titulo_2 = BorderFactory.createTitledBorder("Informe 2");
        panel_2.setBorder(borde_titulo_2);
        FlowLayout layout_2 = new FlowLayout(FlowLayout.LEADING, 30,10);
        panel_2.setLayout(layout_2);
        panel_2.setPreferredSize(new Dimension(700, 200));
        // Componentes panel 2
        JLabel label_2 = new JLabel("<html>Realizar un informe basándose en la información de los proyectos cuya clasificación sea <i>'Casa Campestre'</i><br> y que estén ubicados en las ciudades de <i>Santa Marta</i>, <i>Cartagena</i> y <i>Barranquilla</i>. Este informe debe contener: <br>el <i>ID_Proyecto</i>, la <i>Constructora</i>, el <i>Nùmero_Habitaciones</i> y la respectiva <i>Ciudad</i>.</html>");
        JLabel label_clasificacion = new JLabel("Clasificación: ");
        combo_clasificacion = new JComboBox<String>(controlador.listarClasificaciones());
        JLabel label_ciudades = new JLabel("Ciudades: ");
        lista_ciudades = new JList<>(listado_ciudades);
        JScrollPane scroll_ciudades = new JScrollPane(lista_ciudades);
        scroll_ciudades.setPreferredSize(new Dimension(140, 90));
        JButton boton_2 = new JButton("Consultar");
        // añadir los componentes en el panel local
        panel_2.add(label_2);
        panel_2.add(label_clasificacion);
        panel_2.add(combo_clasificacion);
        panel_2.add(label_ciudades);
        panel_2.add(scroll_ciudades);
        panel_2.add(boton_2);

        // Panel 3
        JPanel panel_3 = new JPanel();
        Border borde_titulo_3 = BorderFactory.createTitledBorder("Informe 3");
        panel_3.setBorder(borde_titulo_3);
        FlowLayout layout_3 = new FlowLayout(FlowLayout.LEADING, 30,10);
        panel_3.setLayout(layout_3);
        panel_3.setPreferredSize(new Dimension(700, 120));
        //Componentes panel 3
        JLabel label_3 = new JLabel("<html>Realizar un informe basándose en las compras realizadas por los proyectos con el proveedor <i>Homecenter</i> <br>y para la ciudad <i>Salento</i>. Este informe debe incluir: <i>ID_Compra</i>, <i>Constructora</i> y <i>Banco_Vinculado</i>.</html>");
        JLabel label_proveedor = new JLabel("Proveedor: ");
        combo_proveedor = new JComboBox<>(controlador.listarProveedores());
        JLabel label_ciudad = new JLabel("Ciudad: ");
        combo_ciudad = new JComboBox<>(listado_ciudades);
        JButton boton_3 = new JButton("Consultar");
        // añadir los componentes en el panel local
        panel_3.add(label_3);
        panel_3.add(label_proveedor);
        panel_3.add(combo_proveedor);
        panel_3.add(label_ciudad);
        panel_3.add(combo_ciudad);
        panel_3.add(boton_3);
            
        
        // añadir el panel principal en la ventana
        frame.add(contenedor);
        // añadir los paneles locales al panel principal
        contenedor.add(panel_1);
        contenedor.add(panel_2);
        contenedor.add(panel_3);
        //frame.pack();
        frame.setVisible(true);

        boton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_1ActionPerformed(evt);
            }
        });

        boton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_2ActionPerformed(evt);
            }
        });

        boton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_3ActionPerformed(evt);
            }
        });
    }

    protected void boton_1ActionPerformed(ActionEvent evt) {
        //JOptionPane.showMessageDialog(this, "Presionaste el botón 1");
        try {
            JFrame ventana_tabla = new JFrame();
            ventana_tabla.setTitle("Consulta 1: Listado de lideres");
            String [][] tabla_lideres = controlador.listarLideres();
            String[] header = {"ID", "NOMBRE","CIUDAD"};
            JTable tabla = new TablaNoEditable(tabla_lideres, header);
            JScrollPane sp = new JScrollPane(tabla);
            ventana_tabla.add(sp);
            ventana_tabla.pack();
            ventana_tabla.setLocationRelativeTo(null);
            ventana_tabla.setVisible(true);
            //add(tabla);
        } catch (SQLException e){
            e.printStackTrace();
        } 
    }
    protected void boton_2ActionPerformed(ActionEvent evt) {
        try {
            JFrame ventana_tabla = new JFrame();
            ventana_tabla.setTitle("Consulta 2: Listado de Proyectos");
            int index_clasificacion = combo_clasificacion.getSelectedIndex();
            String clasificacion = controlador.listarClasificaciones()[index_clasificacion];
            List<String> array_ciudades = lista_ciudades.getSelectedValuesList();
            int total_ciudades = array_ciudades.size();
            String[] ciudades = new String[total_ciudades]; // convertir la lista de strings a un array primitivo de strings.
            for (int i = 0; i < ciudades.length; i++) {
                ciudades[i] = array_ciudades.get(i);
            }
            String [][] tabla_proyectos = controlador.listarProyectos(clasificacion, ciudades);
            String[] header = {"ID", "CONSTRUCTORA", "N° HABITACIONES", "CIUDAD"};
            JTable tabla = new TablaNoEditable(tabla_proyectos, header);
            JScrollPane sp = new JScrollPane(tabla);
            ventana_tabla.add(sp);
            ventana_tabla.pack();
            ventana_tabla.setLocationRelativeTo(null);
            ventana_tabla.setVisible(true);
            //add(tabla);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    protected void boton_3ActionPerformed(ActionEvent evt) {
        try {
            JFrame ventana_tabla = new JFrame();
            ventana_tabla.setTitle("Consulta 3: Listado de Compras");
            int index_proveedor = combo_proveedor.getSelectedIndex();
            String proveedor = controlador.listarProveedores()[index_proveedor];
            int index_ciudad = combo_ciudad.getSelectedIndex();
            String ciudad = controlador.listarCiudades()[index_ciudad];
            //JOptionPane.showMessageDialog(this, ciudad + proveedor, "Informacion", JOptionPane.INFORMATION_MESSAGE);
            String [][] tabla_compras = controlador.listarCompras(proveedor, ciudad);
            String[] header = {"ID", "CONSTRUCTORA", "BANCO VINCULADO"};
            JTable tabla = new TablaNoEditable(tabla_compras, header){};
            //tabla.isCellEditable(row, column)
            JScrollPane sp = new JScrollPane(tabla);
            ventana_tabla.add(sp);
            ventana_tabla.pack();
            ventana_tabla.setLocationRelativeTo(null);
            ventana_tabla.setVisible(true);

            //add(tabla);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }


}


