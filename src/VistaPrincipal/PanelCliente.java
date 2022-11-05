/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaPrincipal;

import Control.Cliente;
import Data.ClienteData;
import Data.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fermin
 */
public class PanelCliente extends javax.swing.JPanel {
    private Connection con;
    ClienteData cd = new ClienteData();
    private DefaultTableModel modelo;
    Statement ejecutor=null;
    
    
    public PanelCliente() {
        initComponents();
        modelo = new DefaultTableModel();
        cabezeraDeTabla();
        //llenarTablaClientes();
        this.con = Conexion.getConexion();
        //llenarComboCliente();
    }
    
    public void llenarTablaClientes(){
        modelo.setRowCount(0);
        ArrayList<Cliente> lisatarCli = (ArrayList) cd.listarAllCliente();
        
        for (Cliente cliente : lisatarCli) {
            modelo.addRow(new Object[]{cliente.getIdCliente(),cliente.getNombreCli(),cliente.getApellidoCli(),cliente.getDniCli(),cliente.isEstadoCli()});
        }
    }
    
    public void buscarDatosEnTabla(String idCliente,String apellidoCli,String dniCli){
        modelo.setRowCount(0);
        ArrayList<Cliente> listarCliente = new ArrayList<>();
        String where=" where 1=1 ";
        if(idCliente.isEmpty()==false){
            where=where+" and idCliente='"+idCliente+"' ";
        }
        if(apellidoCli.isEmpty()==false){
            where=where+" and apellidoCli='"+apellidoCli+"' ";
        }
        if(dniCli.isEmpty()==false){
            where=where+" and dniCli='"+dniCli+"' ";
        }
        
        String sql="select * from cliente "+where+" ;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNombreCli(rs.getString("nombreCli"));
                c.setApellidoCli(rs.getString("apellidoCli"));
                c.setDniCli(rs.getInt("dniCli"));
                c.setEstadoCli(rs.getBoolean("estadoCli"));
                listarCliente.add(c);
                
            }
            for (Cliente cliente : listarCliente) {
            modelo.addRow(new Object[]{cliente.getIdCliente(),cliente.getNombreCli(),cliente.getApellidoCli(),cliente.getDniCli(),cliente.isEstadoCli()});
        }
        } catch (Exception e) {
        }
    }
    
    public void cabezeraDeTabla() {
        ArrayList<Object> columna = new ArrayList<Object>();
        columna.add("IdCliente");
        columna.add("Nombre");
        columna.add("Apellido");
        columna.add("DNI");
        columna.add("Activo");
        for (Object it : columna) {
            modelo.addColumn(it);
        }
        jTableCliente.setModel(modelo);

    }
    
    public void limpiarCampos(){
        texNobre.setText("");
        texNobre1.setText("");
        
        texApellido.setText("");
        texApellido1.setText("");
        
        texDni.setText("");
        texDni1.setText("");
        
        buttonGroup1.clearSelection();
    }
    
    
    

    public void llenarComboCliente(){
        ArrayList<Cliente> listaCliente = (ArrayList<Cliente>) cd.listarCliente();
        
        for (Cliente cli : listaCliente) {
            jComboCliente.addItem(cli);
            
        }
        jComboCliente.setSelectedItem(-1);
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelEliminar = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextPorId = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextPorApellido = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextPorDni = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        panelAgregar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        texNobre = new java.awt.TextField();
        texApellido = new java.awt.TextField();
        texDni = new java.awt.TextField();
        panelModificar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboCliente = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        texNobre1 = new java.awt.TextField();
        jLabel9 = new javax.swing.JLabel();
        texApellido1 = new java.awt.TextField();
        jLabel10 = new javax.swing.JLabel();
        texDni1 = new java.awt.TextField();
        jLabel11 = new javax.swing.JLabel();
        radioBotonSi = new javax.swing.JRadioButton();
        radioBotonNo = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Buscar/Eliminar un Cliente");

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableCliente);

        jLabel13.setText("Por ID");

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel15.setText("Buscar Cliente");

        jTextPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPorIdActionPerformed(evt);
            }
        });

        jLabel16.setText("Por Apellido");

        jLabel17.setText("Por Dni");

        jLabel18.setText("Eliminar Cliente Seleccionado");

        jButton2.setText("jButton2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelEliminarLayout = new javax.swing.GroupLayout(panelEliminar);
        panelEliminar.setLayout(panelEliminarLayout);
        panelEliminarLayout.setHorizontalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelEliminarLayout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEliminarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEliminarLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEliminarLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextPorId)
                            .addComponent(jTextPorApellido)
                            .addComponent(jTextPorDni, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEliminarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );
        panelEliminarLayout.setVerticalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEliminarLayout.createSequentialGroup()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel14)
                .addGap(12, 12, 12)
                .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEliminarLayout.createSequentialGroup()
                        .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(panelEliminarLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jTextPorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(jTextPorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addGap(18, 18, 18)
                                .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(jTextPorDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jButton2)))))
        );

        add(panelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 780, 270));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar un Nuevo Cliente");

        jLabel2.setText("Nombre =");

        jLabel3.setText("Apellido =");

        jLabel4.setText("Dni =");

        jLabel5.setText("Agregar Cliente");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        texNobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texNobreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAgregarLayout = new javax.swing.GroupLayout(panelAgregar);
        panelAgregar.setLayout(panelAgregarLayout);
        panelAgregarLayout.setHorizontalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelAgregarLayout.createSequentialGroup()
                .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(texNobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(texApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(texDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelAgregarLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        panelAgregarLayout.setVerticalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAgregarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(texNobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(texApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(texDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        add(panelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 330));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Modificar un Cliente");

        jComboCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboClienteMouseClicked(evt);
            }
        });
        jComboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboClienteActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cliente =");

        jLabel8.setText("Nombre =");

        texNobre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texNobre1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Apellido =");

        jLabel10.setText("Dni =");

        jLabel11.setText("Activo = ");

        buttonGroup1.add(radioBotonSi);
        radioBotonSi.setText("Si");
        radioBotonSi.setActionCommand("si");
        radioBotonSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBotonSiActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBotonNo);
        radioBotonNo.setText("No");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Modificar");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelModificarLayout = new javax.swing.GroupLayout(panelModificar);
        panelModificar.setLayout(panelModificarLayout);
        panelModificarLayout.setHorizontalGroup(
            panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(panelModificarLayout.createSequentialGroup()
                        .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(texApellido1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(texNobre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(texDni1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(panelModificarLayout.createSequentialGroup()
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModificarLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jComboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelModificarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(radioBotonSi)
                        .addGap(18, 18, 18)
                        .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelModificarLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(radioBotonNo))))
                .addGap(0, 93, Short.MAX_VALUE))
        );
        panelModificarLayout.setVerticalGroup(
            panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelModificarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(texNobre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(texApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(texDni1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(radioBotonSi)
                    .addComponent(radioBotonNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        add(panelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 400, 330));
    }// </editor-fold>//GEN-END:initComponents

    private void texNobre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texNobre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texNobre1ActionPerformed

    private void radioBotonSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBotonSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBotonSiActionPerformed

    private void jComboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboClienteActionPerformed

        Cliente cli = (Cliente) jComboCliente.getSelectedItem();
        
        if (jComboCliente.getSelectedIndex()!= -1 || jComboCliente.getSelectedItem()!= null) {
            texNobre1.setText(cli.getNombreCli());
            texApellido1.setText(cli.getApellidoCli());
            texDni1.setText(Integer.toString(cli.getDniCli()));
            if(cli.isEstadoCli()){
                radioBotonSi.setSelected(true);
            }
        } else {
            radioBotonNo.setSelected(false);
        }
    }//GEN-LAST:event_jComboClienteActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        Cliente cli = (Cliente) jComboCliente.getSelectedItem();
        
        cli.setNombreCli(texNobre1.getText());
        cli.setApellidoCli(texApellido1.getText());
        cli.setDniCli(Integer.parseInt(texDni1.getText()));

        
        if (radioBotonNo.isSelected()) {
            cli.setEstadoCli(false);
        } else {
            cli.setEstadoCli(true);
        }
        
        cd.modificarCliente(cli);
        
        limpiarCampos();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void texNobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texNobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texNobreActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        String nombre = texNobre.getText();
        String apellido = texApellido.getText();
        int dni = Integer.parseInt(texDni.getText());

        Cliente cli = new Cliente(nombre, apellido, dni, true);

        cd.agregarCliente(cli);

        limpiarCampos();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jComboClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboClienteMouseClicked
        llenarComboCliente();
    }//GEN-LAST:event_jComboClienteMouseClicked

    private void jTextPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPorIdActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        buscarDatosEnTabla(jTextPorId.getText(),jTextPorApellido.getText(),jTextPorDni.getText());
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        int filaElegida = jTableCliente.getSelectedRow();
        int idCliente = (Integer) jTableCliente.getValueAt(filaElegida,0);
        cd.eliminarCliente(idCliente);
    }//GEN-LAST:event_jButton2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<Cliente> jComboCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField jTextPorApellido;
    private javax.swing.JTextField jTextPorDni;
    private javax.swing.JTextField jTextPorId;
    private javax.swing.JPanel panelAgregar;
    private javax.swing.JPanel panelEliminar;
    private javax.swing.JPanel panelModificar;
    private javax.swing.JRadioButton radioBotonNo;
    private javax.swing.JRadioButton radioBotonSi;
    private java.awt.TextField texApellido;
    private java.awt.TextField texApellido1;
    private java.awt.TextField texDni;
    private java.awt.TextField texDni1;
    private java.awt.TextField texNobre;
    private java.awt.TextField texNobre1;
    // End of variables declaration//GEN-END:variables
}
