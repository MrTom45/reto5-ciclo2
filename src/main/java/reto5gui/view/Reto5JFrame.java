// /*
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//  * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
//  */
// package reto5gui.view;

// import javax.swing.JTable;

// import java.awt.Component;
// import java.sql.SQLException;
// import java.util.List;
// import javax.swing.JFrame;
// import javax.swing.JOptionPane;
// import javax.swing.JScrollPane;

// import reto5gui.controller.Controlador;
// import reto5gui.model.vo.*;

// public class Reto5JFrame extends javax.swing.JFrame {
    
//     static Controlador controlador;

//     public Reto5JFrame() throws SQLException {
//         Reto5JFrame.controlador = new Controlador();
//         initComponents();
//         setLocationRelativeTo(null);
//     }

//     @SuppressWarnings("unchecked")
//     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
//     private void initComponents() {

//         panel_consulta_1 = new javax.swing.JPanel();
//         jLabel2 = new javax.swing.JLabel();
//         jLabel1 = new javax.swing.JLabel();
//         jLabel3 = new javax.swing.JLabel();
//         boton_consulta_1 = new javax.swing.JButton();
//         jLabel4 = new javax.swing.JLabel();
//         jLabel5 = new javax.swing.JLabel();
//         jLabel6 = new javax.swing.JLabel();
//         panel_consulta_2 = new javax.swing.JPanel();
//         jLabel7 = new javax.swing.JLabel();
//         jLabel8 = new javax.swing.JLabel();
//         jLabel9 = new javax.swing.JLabel();
//         jLabel10 = new javax.swing.JLabel();
//         jLabel11 = new javax.swing.JLabel();
//         jLabel12 = new javax.swing.JLabel();
//         jLabel13 = new javax.swing.JLabel();
//         jLabel14 = new javax.swing.JLabel();
//         jLabel15 = new javax.swing.JLabel();
//         jLabel16 = new javax.swing.JLabel();
//         jLabel17 = new javax.swing.JLabel();
//         boton_consulta_2 = new javax.swing.JButton();
//         jLabel18 = new javax.swing.JLabel();
//         combo_clasificacion = new javax.swing.JComboBox<>();
//         jLabel19 = new javax.swing.JLabel();
//         jScrollPane1 = new javax.swing.JScrollPane();
//         lista_ciudades = new javax.swing.JList<>();
//         panel_consulta_3 = new javax.swing.JPanel();
//         jLabel20 = new javax.swing.JLabel();
//         jLabel21 = new javax.swing.JLabel();
//         jLabel22 = new javax.swing.JLabel();
//         jLabel23 = new javax.swing.JLabel();
//         jLabel24 = new javax.swing.JLabel();
//         jLabel25 = new javax.swing.JLabel();
//         jLabel26 = new javax.swing.JLabel();
//         jLabel27 = new javax.swing.JLabel();
//         combo_proveedor = new javax.swing.JComboBox<>();
//         jLabel28 = new javax.swing.JLabel();
//         combo_ciudad = new javax.swing.JComboBox<>();
//         boton_consulta_3 = new javax.swing.JButton();

//         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//         setTitle("Reto 5");
//         setBackground(new java.awt.Color(255, 255, 255));

//         panel_consulta_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

//         jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
//         jLabel2.setText("Informe 1: ");

//         jLabel1.setText("Generar un informe basándose en la tabla con la información respectiva al “Líder”. El listado debe contener: ");

//         jLabel3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
//         jLabel3.setText("ID_Lider, el Nombre, el Primer_Apellido y la Ciudad_Residencia");

//         boton_consulta_1.setText("Consultar");
//         boton_consulta_1.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 boton_consulta_1ActionPerformed(evt);
//             }
//         });

//         jLabel4.setText(". Este informe debe estar ordenado por la");

//         jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
//         jLabel5.setText("“Ciudad_Residencia”");

//         jLabel6.setText("de forma alfabética.");

//         javax.swing.GroupLayout panel_consulta_1Layout = new javax.swing.GroupLayout(panel_consulta_1);
//         panel_consulta_1.setLayout(panel_consulta_1Layout);
//         panel_consulta_1Layout.setHorizontalGroup(
//             panel_consulta_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(panel_consulta_1Layout.createSequentialGroup()
//                 .addContainerGap()
//                 .addGroup(panel_consulta_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                     .addGroup(panel_consulta_1Layout.createSequentialGroup()
//                         .addGroup(panel_consulta_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                             .addGroup(panel_consulta_1Layout.createSequentialGroup()
//                                 .addComponent(jLabel3)
//                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                 .addComponent(jLabel4))
//                             .addGroup(panel_consulta_1Layout.createSequentialGroup()
//                                 .addComponent(jLabel5)
//                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                 .addComponent(jLabel6)))
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                         .addComponent(boton_consulta_1))
//                     .addGroup(panel_consulta_1Layout.createSequentialGroup()
//                         .addGroup(panel_consulta_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                             .addComponent(jLabel2)
//                             .addComponent(jLabel1))
//                         .addGap(0, 0, Short.MAX_VALUE)))
//                 .addContainerGap())
//         );
//         panel_consulta_1Layout.setVerticalGroup(
//             panel_consulta_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(panel_consulta_1Layout.createSequentialGroup()
//                 .addContainerGap()
//                 .addComponent(jLabel2)
//                 .addGap(7, 7, 7)
//                 .addComponent(jLabel1)
//                 .addGroup(panel_consulta_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                     .addGroup(panel_consulta_1Layout.createSequentialGroup()
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                         .addGroup(panel_consulta_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                             .addComponent(jLabel3)
//                             .addComponent(jLabel4))
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                         .addGroup(panel_consulta_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                             .addComponent(jLabel5)
//                             .addComponent(jLabel6))
//                         .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_consulta_1Layout.createSequentialGroup()
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                         .addComponent(boton_consulta_1)
//                         .addGap(30, 30, 30))))
//         );

//         panel_consulta_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

//         jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
//         jLabel7.setText("Informe 2:");

//         jLabel8.setText("Realizar un informe basándose en la información de los proyectos cuya clasificación sea");

//         jLabel9.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
//         jLabel9.setText("“Casa Campestre”");

//         jLabel10.setText("y que estén ubicados");

//         jLabel11.setText("en las ciudades de:");

//         jLabel12.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
//         jLabel12.setText("“Santa Marta”, “Cartagena” y “Barranquilla”. ");

//         jLabel13.setText("Este informe debe contener:");

//         jLabel14.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
//         jLabel14.setText("ID_Proyecto, Constructora,");

//         jLabel15.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
//         jLabel15.setText(" Nùmero_Habitaciones ");

//         jLabel16.setText(" y la respectiva");

//         jLabel17.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
//         jLabel17.setText(" Ciudad.");

//         boton_consulta_2.setText("Consultar");
//         boton_consulta_2.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 boton_consulta_2ActionPerformed(evt);
//             }
//         });

//         jLabel18.setText("Clasificación:");

//         combo_clasificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

//         jLabel19.setText("Ciudad:");

//         lista_ciudades.setModel(new javax.swing.AbstractListModel<String>() {
//             String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
//             public int getSize() { return strings.length; }
//             public String getElementAt(int i) { return strings[i]; }
//         });
//         jScrollPane1.setViewportView(lista_ciudades);

//         javax.swing.GroupLayout panel_consulta_2Layout = new javax.swing.GroupLayout(panel_consulta_2);
//         panel_consulta_2.setLayout(panel_consulta_2Layout);
//         panel_consulta_2Layout.setHorizontalGroup(
//             panel_consulta_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(panel_consulta_2Layout.createSequentialGroup()
//                 .addContainerGap()
//                 .addGroup(panel_consulta_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                     .addGroup(panel_consulta_2Layout.createSequentialGroup()
//                         .addGroup(panel_consulta_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//                             .addGroup(panel_consulta_2Layout.createSequentialGroup()
//                                 .addComponent(jLabel18)
//                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                 .addComponent(combo_clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                             .addGroup(panel_consulta_2Layout.createSequentialGroup()
//                                 .addComponent(jLabel15)
//                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                 .addComponent(jLabel16)
//                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                 .addComponent(jLabel17)))
//                         .addGap(27, 27, 27)
//                         .addComponent(jLabel19)
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                         .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                         .addComponent(boton_consulta_2))
//                     .addGroup(panel_consulta_2Layout.createSequentialGroup()
//                         .addGroup(panel_consulta_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                             .addComponent(jLabel7)
//                             .addGroup(panel_consulta_2Layout.createSequentialGroup()
//                                 .addComponent(jLabel8)
//                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                 .addComponent(jLabel9)
//                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                 .addComponent(jLabel10))
//                             .addGroup(panel_consulta_2Layout.createSequentialGroup()
//                                 .addComponent(jLabel11)
//                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                 .addComponent(jLabel12)
//                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                 .addComponent(jLabel13)
//                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                 .addComponent(jLabel14)))
//                         .addGap(0, 14, Short.MAX_VALUE)))
//                 .addContainerGap())
//         );
//         panel_consulta_2Layout.setVerticalGroup(
//             panel_consulta_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(panel_consulta_2Layout.createSequentialGroup()
//                 .addContainerGap()
//                 .addComponent(jLabel7)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                 .addGroup(panel_consulta_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                     .addComponent(jLabel8)
//                     .addComponent(jLabel9)
//                     .addComponent(jLabel10))
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                 .addGroup(panel_consulta_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                     .addComponent(jLabel12)
//                     .addComponent(jLabel13)
//                     .addComponent(jLabel14)
//                     .addComponent(jLabel11))
//                 .addGroup(panel_consulta_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                     .addGroup(panel_consulta_2Layout.createSequentialGroup()
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                         .addGroup(panel_consulta_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                             .addComponent(jLabel17)
//                             .addComponent(jLabel16)
//                             .addComponent(jLabel15))
//                         .addGap(14, 14, 14)
//                         .addGroup(panel_consulta_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                             .addComponent(jLabel18)
//                             .addComponent(combo_clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                             .addComponent(jLabel19))
//                         .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_consulta_2Layout.createSequentialGroup()
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
//                         .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
//                         .addContainerGap())))
//             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_consulta_2Layout.createSequentialGroup()
//                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                 .addComponent(boton_consulta_2)
//                 .addContainerGap())
//         );

//         panel_consulta_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

//         jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
//         jLabel20.setText("Informe 3:");

//         jLabel21.setText("Realizar un informe basándose en las compras realizadas por los proyectos con el proveedor");

//         jLabel22.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
//         jLabel22.setText("“Homecenter”");

//         jLabel23.setText("y para la ciudad ");

//         jLabel24.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
//         jLabel24.setText("“Salento”.");

//         jLabel25.setText("Este informe debe incluir:");

//         jLabel26.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
//         jLabel26.setText("ID_Compra, Constructora y Banco_Vinculado.");

//         jLabel27.setText("Proveedor:");

//         combo_proveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

//         jLabel28.setText("Ciudad:");

//         combo_ciudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

//         boton_consulta_3.setText("Consultar");
//         boton_consulta_3.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 boton_consulta_3ActionPerformed(evt);
//             }
//         });

//         javax.swing.GroupLayout panel_consulta_3Layout = new javax.swing.GroupLayout(panel_consulta_3);
//         panel_consulta_3.setLayout(panel_consulta_3Layout);
//         panel_consulta_3Layout.setHorizontalGroup(
//             panel_consulta_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(panel_consulta_3Layout.createSequentialGroup()
//                 .addContainerGap()
//                 .addGroup(panel_consulta_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                     .addComponent(jLabel20)
//                     .addGroup(panel_consulta_3Layout.createSequentialGroup()
//                         .addComponent(jLabel21)
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                         .addComponent(jLabel22)
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                         .addComponent(jLabel23))
//                     .addGroup(panel_consulta_3Layout.createSequentialGroup()
//                         .addComponent(jLabel24)
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                         .addComponent(jLabel25)
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                         .addComponent(jLabel26)))
//                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//             .addGroup(panel_consulta_3Layout.createSequentialGroup()
//                 .addGap(121, 121, 121)
//                 .addComponent(jLabel27)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                 .addComponent(combo_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addGap(41, 41, 41)
//                 .addComponent(jLabel28)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                 .addComponent(combo_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                 .addComponent(boton_consulta_3)
//                 .addContainerGap())
//         );
//         panel_consulta_3Layout.setVerticalGroup(
//             panel_consulta_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(panel_consulta_3Layout.createSequentialGroup()
//                 .addContainerGap()
//                 .addComponent(jLabel20)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                 .addGroup(panel_consulta_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                     .addComponent(jLabel21)
//                     .addComponent(jLabel22)
//                     .addComponent(jLabel23))
//                 .addGroup(panel_consulta_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                     .addGroup(panel_consulta_3Layout.createSequentialGroup()
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                         .addGroup(panel_consulta_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                             .addComponent(jLabel24)
//                             .addComponent(jLabel25)
//                             .addComponent(jLabel26))
//                         .addGap(18, 18, 18)
//                         .addGroup(panel_consulta_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                             .addComponent(jLabel27)
//                             .addComponent(combo_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                             .addComponent(jLabel28)
//                             .addComponent(combo_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                         .addContainerGap(30, Short.MAX_VALUE))
//                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_consulta_3Layout.createSequentialGroup()
//                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                         .addComponent(boton_consulta_3)
//                         .addContainerGap())))
//         );

//         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//         getContentPane().setLayout(layout);
//         layout.setHorizontalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(layout.createSequentialGroup()
//                 .addGap(30, 30, 30)
//                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                     .addComponent(panel_consulta_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                     .addComponent(panel_consulta_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                     .addComponent(panel_consulta_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                 .addContainerGap(30, Short.MAX_VALUE))
//         );
//         layout.setVerticalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(layout.createSequentialGroup()
//                 .addGap(40, 40, 40)
//                 .addComponent(panel_consulta_1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
//                 .addComponent(panel_consulta_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                 .addComponent(panel_consulta_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addGap(40, 40, 40))
//         );

//         pack();
//     }// </editor-fold>//GEN-END:initComponents

//     private void boton_consulta_1ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
//         //JOptionPane.showMessageDialog(this, "Information", "Information", JOptionPane.INFORMATION_MESSAGE);
//         try {
//             JFrame ventana_tabla = new JFrame();
//             ventana_tabla.setTitle("Consulta 1: Listado de lideres");
//             String [][] tabla_lideres = Reto5JFrame.controlador.listarLideres();
//             String[] header = {"ID", "NOMBRE","CIUDAD"};
//             JTable tabla = new JTable(tabla_lideres, header);
//             JScrollPane sp = new JScrollPane(tabla);
//             ventana_tabla.add(sp);
//             ventana_tabla.pack();
//             ventana_tabla.setLocationRelativeTo(null);
//             ventana_tabla.setVisible(true);
//             //add(tabla);
//         } catch (SQLException e){
//             e.printStackTrace();
//         }  
        
//     }

//     private void boton_consulta_2ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
//         try {
//             JFrame ventana_tabla = new JFrame();
//             ventana_tabla.setTitle("Consulta 2: Listado de Proyectos");
//             int index_clasificacion = combo_clasificacion.getSelectedIndex();
//             String clasificacion = controlador.listarClasificaciones()[index_clasificacion];
//             List<String> array_ciudades = lista_ciudades.getSelectedValuesList();
//             int total_ciudades = array_ciudades.size();
//             String[] ciudades = new String[total_ciudades]; // convertir la lista de strings a un array primitivo de strings.
//             for (int i = 0; i < ciudades.length; i++) {
//                 ciudades[i] = array_ciudades.get(i);
//             }
//             String [][] tabla_proyectos = Reto5JFrame.controlador.listarProyectos(clasificacion, ciudades);
//             String[] header = {"ID", "CONSTRUCTORA", "N° HABITACIONES", "CIUDAD"};
//             JTable tabla = new JTable(tabla_proyectos, header);
//             JScrollPane sp = new JScrollPane(tabla);
//             ventana_tabla.add(sp);
//             ventana_tabla.pack();
//             ventana_tabla.setLocationRelativeTo(null);
//             ventana_tabla.setVisible(true);
//             //add(tabla);
//         } catch (SQLException e){
//             e.printStackTrace();
//         }
//     }

//     private void boton_consulta_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_consulta_3ActionPerformed
//         try {
//             JFrame ventana_tabla = new JFrame();
//             ventana_tabla.setTitle("Consulta 3: Listado de Compras");
//             int index_proveedor = combo_proveedor.getSelectedIndex();
//             String proveedor = controlador.listarProveedores()[index_proveedor];
//             int index_ciudad = combo_ciudad.getSelectedIndex();
//             String ciudad = controlador.listarCiudades()[index_ciudad];
//             //JOptionPane.showMessageDialog(this, ciudad + proveedor, "Informacion", JOptionPane.INFORMATION_MESSAGE);
//             String [][] tabla_compras = Reto5JFrame.controlador.listarCompras(proveedor, ciudad);
//             String[] header = {"ID", "PROVEEDOR", "BANCO VINCULADO"};
//             JTable tabla = new JTable(tabla_compras, header);
//             JScrollPane sp = new JScrollPane(tabla);
//             ventana_tabla.add(sp);
//             ventana_tabla.pack();
//             ventana_tabla.setLocationRelativeTo(null);
//             ventana_tabla.setVisible(true);
//             //add(tabla);
//         } catch (SQLException e){
//             e.printStackTrace();
//         }
//     }//GEN-LAST:event_boton_consulta_3ActionPerformed


//     public static void main(String args[]) {
//         /* Set the Nimbus look and feel */
//         //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//         /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//          * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//          */
//         try {
//             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                 if ("Nimbus".equals(info.getName())) {
//                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                     break;
//                 }
//             }
//         } catch (ClassNotFoundException ex) {
//             java.util.logging.Logger.getLogger(Reto5JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (InstantiationException ex) {
//             java.util.logging.Logger.getLogger(Reto5JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (IllegalAccessException ex) {
//             java.util.logging.Logger.getLogger(Reto5JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//             java.util.logging.Logger.getLogger(Reto5JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         }
//         //</editor-fold>

//         /* Create and display the form */
//         java.awt.EventQueue.invokeLater(new Runnable() {
//             public void run() {
//                 try {
//                     new Reto5JFrame().setVisible(true);
//                 } catch (SQLException e) {
//                     // TODO Auto-generated catch block
//                     e.printStackTrace();
//                 }
//             }
//         });
//     }

//     // Variables declaration - do not modify//GEN-BEGIN:variables
//     private javax.swing.JButton boton_consulta_1;
//     private javax.swing.JButton boton_consulta_2;
//     private javax.swing.JButton boton_consulta_3;
//     private javax.swing.JComboBox<String> combo_ciudad;
//     private javax.swing.JComboBox<String> combo_clasificacion;
//     private javax.swing.JComboBox<String> combo_proveedor;
//     private javax.swing.JLabel jLabel1;
//     private javax.swing.JLabel jLabel10;
//     private javax.swing.JLabel jLabel11;
//     private javax.swing.JLabel jLabel12;
//     private javax.swing.JLabel jLabel13;
//     private javax.swing.JLabel jLabel14;
//     private javax.swing.JLabel jLabel15;
//     private javax.swing.JLabel jLabel16;
//     private javax.swing.JLabel jLabel17;
//     private javax.swing.JLabel jLabel18;
//     private javax.swing.JLabel jLabel19;
//     private javax.swing.JLabel jLabel2;
//     private javax.swing.JLabel jLabel20;
//     private javax.swing.JLabel jLabel21;
//     private javax.swing.JLabel jLabel22;
//     private javax.swing.JLabel jLabel23;
//     private javax.swing.JLabel jLabel24;
//     private javax.swing.JLabel jLabel25;
//     private javax.swing.JLabel jLabel26;
//     private javax.swing.JLabel jLabel27;
//     private javax.swing.JLabel jLabel28;
//     private javax.swing.JLabel jLabel3;
//     private javax.swing.JLabel jLabel4;
//     private javax.swing.JLabel jLabel5;
//     private javax.swing.JLabel jLabel6;
//     private javax.swing.JLabel jLabel7;
//     private javax.swing.JLabel jLabel8;
//     private javax.swing.JLabel jLabel9;
//     private javax.swing.JScrollPane jScrollPane1;
//     private javax.swing.JList<String> lista_ciudades;
//     private javax.swing.JPanel panel_consulta_1;
//     private javax.swing.JPanel panel_consulta_2;
//     private javax.swing.JPanel panel_consulta_3;
//     // End of variables declaration//GEN-END:variables
// }
