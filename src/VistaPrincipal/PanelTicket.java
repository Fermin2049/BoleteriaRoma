/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaPrincipal;

import Control.Butaca;
import Control.Cliente;
import Control.Proyeccion;
import Control.Sala;
import Control.Ticket;
import Data.ButacaData;
import Data.ClienteData;
import Data.ProyeccionData;
import Data.TicketData;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fermin
 */
public class PanelTicket extends javax.swing.JPanel {

    ClienteData cd = new ClienteData();
    ProyeccionData pd = new ProyeccionData();
    TicketData td = new TicketData();
    ButacaData db = new ButacaData();
    private DefaultTableModel modelo;
    public PanelTicket() {
        initComponents();
        modelo = new DefaultTableModel();
        cabezeraDeTabla();
    }
    
    public void cabezeraDeTabla() {
        ArrayList<Object> columna = new ArrayList<Object>();
        columna.add("IdButaca");
        columna.add("idSala");
        columna.add("Fila");
        columna.add("Columna");
        
        for (Object it : columna) {
            modelo.addColumn(it);
        }
        jTableButaca.setModel(modelo);

    }
    
    public void llenarTablaButaca(){
        modelo.setRowCount(0);
        
        
//        LocalTime horaInicio = LocalTime.parse(horaIni.getText());
//        LocalDate fechaNueva = jDateInico.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        LocalDateTime local = LocalDateTime.of(fechaNueva,horaInicio);
//        Timestamp diaHoraincio = Timestamp.valueOf(local);
        
//        LocalTime horafin = LocalTime.parse(horaFin.getText());
//        LocalDate fechaNueva2 = jDateFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        LocalDateTime local2 = LocalDateTime.of(fechaNueva2, horafin);
//        Timestamp diaHorafin = Timestamp.valueOf(local2);
        
        Proyeccion p = (Proyeccion) jComboProyeccion.getSelectedItem();
//        Sala sala = p.getIdSala();
        Proyeccion pro = (Proyeccion)jComboProyeccion.getSelectedItem();
//        int filaElegida = jTableButaca.getSelectedRow();
//        int idSala = (Integer) jTableButaca.getValueAt(filaElegida,1);
        
        ArrayList<Butaca> lisatarButaca = (ArrayList) td.butacasLibre(pro.getIdSala().getIdSala(), pro.getIncioProy());
        
        for (Butaca but : lisatarButaca) {
            modelo.addRow(new Object[]{but.getIdButaca(),but.getIdSala().getIdSala(),but.getFila(),but.getColumna()});
        }
    }

    public void llenarComboCliente(){
        ArrayList<Cliente> listaCliente = (ArrayList<Cliente>) cd.listarCliente();
        
        for (Cliente cli : listaCliente) {
            jComboCliente.addItem(cli);
            
        }
        jComboCliente.setSelectedItem(-1);
        
    }
    
    public void llenarComboProyeccion(){
        ArrayList<Proyeccion> listaProyeecion = (ArrayList<Proyeccion>) pd.listarProyeccion();
        
        for (Proyeccion proy : listaProyeecion) {
            jComboProyeccion.addItem(proy);
            
        }
        jComboProyeccion.setSelectedItem(-1);
        
    }
    
    public void limpiarDatos(){
        jComboCliente.setSelectedItem(-1);
        jComboProyeccion.setSelectedItem(-1);
        jComboPago.setSelectedItem(-1);
        jTextPrecio.setText("");
        jTextPrecio.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboCliente = new javax.swing.JComboBox<>();
        jComboProyeccion = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButtonButaca = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboPago = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableButaca = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextPrecio = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(780, 560));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Generar Nuevo Ticket");

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

        jComboProyeccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboProyeccionMouseClicked(evt);
            }
        });
        jComboProyeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboProyeccionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccionar Butaca Libre");

        jButtonButaca.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButtonButaca.setText("Buscar Butaca Libre");
        jButtonButaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonButacaMouseClicked(evt);
            }
        });

        jLabel10.setText("Forma de Pago =");

        jComboPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta Credito", "Tarjeta Debito", "BitCoins" }));

        jTableButaca.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableButaca);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton1.setText("Generar Ticket");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Seleccione un Cliente");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Selecione una Proyeccion");

        jLabel14.setText("Precio Entrada =");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboProyeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jComboPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextPrecio))))
                .addGap(0, 76, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jButtonButaca)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(8, 8, 8)
                .addComponent(jComboProyeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonButaca)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboClienteMouseClicked
        llenarComboCliente();
    }//GEN-LAST:event_jComboClienteMouseClicked

    private void jComboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboClienteActionPerformed

        
    }//GEN-LAST:event_jComboClienteActionPerformed

    private void jComboProyeccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboProyeccionMouseClicked
        llenarComboProyeccion();
    }//GEN-LAST:event_jComboProyeccionMouseClicked

    private void jComboProyeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboProyeccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboProyeccionActionPerformed

    private void jButtonButacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonButacaMouseClicked
        llenarTablaButaca();
    }//GEN-LAST:event_jButtonButacaMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        Cliente cli = (Cliente)jComboCliente.getSelectedItem();
        Proyeccion sal = (Proyeccion)jComboProyeccion.getSelectedItem();
        int filaElegida = jTableButaca.getSelectedRow();
        int idButaca = (Integer) jTableButaca.getValueAt(filaElegida,0);
        
        Timestamp compra = Timestamp.valueOf(LocalDateTime.now());
        double precio = Double.parseDouble(jTextPrecio.getText());
        String pago = (String)jComboPago.getSelectedItem();
        
        Ticket t = new Ticket(cli, sal,db.buscarButaca(idButaca) , compra, precio, pago, true);
        
        td.agregarTick(t);
        limpiarDatos();
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonButaca;
    private javax.swing.JComboBox<Cliente> jComboCliente;
    private javax.swing.JComboBox<String> jComboPago;
    private javax.swing.JComboBox<Proyeccion> jComboProyeccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableButaca;
    private javax.swing.JTextField jTextPrecio;
    // End of variables declaration//GEN-END:variables
}
