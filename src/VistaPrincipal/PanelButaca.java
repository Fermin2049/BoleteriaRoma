/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaPrincipal;

import Control.Butaca;
import Control.Sala;
import Data.ButacaData;
import Data.SalaData;
import java.util.ArrayList;

/**
 *
 * @author Fermin
 */
public class PanelButaca extends javax.swing.JPanel {

    ButacaData bd = new ButacaData();
    SalaData sd = new SalaData();
    public PanelButaca() {
        initComponents();
    }
    
    public void limpiarCampos(){
        texFila.setText("");
        //texNobre1.setText("");
        
        texColumna.setText("");
        //texApellido1.setText("");
        
        //texDni1.setText("");
        
        //buttonGroup1.clearSelection();
    }

    public void llenarComboSala(){
        ArrayList<Sala> listaSala = (ArrayList<Sala>) sd.listarSala();
        
        for (Sala sal : listaSala) {
            jComboSala.addItem(sal);
            
        }
        jComboSala.setSelectedItem(-1);
        
    }
    
    public void llenarComboSala1(){
        ArrayList<Sala> listaSala = (ArrayList<Sala>) sd.listarSala();
        
        for (Sala sal : listaSala) {
            jComboSala1.addItem(sal);
            
        }
        jComboSala1.setSelectedItem(-1);
        
    }
    
    public void llenarComboButaca(){
        ArrayList<Butaca> listaSala = (ArrayList<Butaca>) bd.listarButaca();
        
        for (Butaca but : listaSala) {
            jComboButaca.addItem(but);
            
        }
        jComboButaca.setSelectedItem(-1);
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        texFila = new java.awt.TextField();
        texColumna = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jAgregarButaca = new javax.swing.JLabel();
        jComboSala = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboButaca = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jModificar = new javax.swing.JLabel();
        jComboSala1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        texFila1 = new java.awt.TextField();
        texColumna1 = new java.awt.TextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(780, 560));
        setPreferredSize(new java.awt.Dimension(774, 558));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Butaca");

        texFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texFilaActionPerformed(evt);
            }
        });

        jLabel4.setText("Columna :");

        jLabel3.setText("Fila =");

        jLabel2.setText("Sala =");

        jAgregarButaca.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jAgregarButaca.setText("Agregar Butaca");
        jAgregarButaca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jAgregarButaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAgregarButacaMouseClicked(evt);
            }
        });

        jComboSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboSalaMouseClicked(evt);
            }
        });
        jComboSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboSalaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(texColumna, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(texFila, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboSala, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jAgregarButaca, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jComboSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(texFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(texColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jAgregarButaca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 280));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Modificar Butaca");

        jComboButaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboButacaMouseClicked(evt);
            }
        });
        jComboButaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboButacaActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Butaca =");

        jModificar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jModificar.setText("Modificar");
        jModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jModificarMouseClicked(evt);
            }
        });

        jComboSala1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboSala1MouseClicked(evt);
            }
        });

        jLabel5.setText("Sala =");

        jLabel8.setText("Fila =");

        jLabel9.setText("Columna :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboButaca, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(texColumna1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(texFila1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboSala1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboButaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jComboSala1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(texFila1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(texColumna1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel6)
                    .addContainerGap(246, Short.MAX_VALUE)))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 390, 280));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 780, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void jAgregarButacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAgregarButacaMouseClicked
        Sala cli = (Sala) jComboSala.getSelectedItem();
        String fila = texFila.getText();
        int columna = Integer.parseInt(texColumna.getText());

        Butaca but = new Butaca(cli, fila, columna);

        bd.agregarButaca(but);

        limpiarCampos();
    }//GEN-LAST:event_jAgregarButacaMouseClicked

    private void jComboSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboSalaMouseClicked
        llenarComboSala();
    }//GEN-LAST:event_jComboSalaMouseClicked

    private void jComboButacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboButacaMouseClicked
        llenarComboButaca();
    }//GEN-LAST:event_jComboButacaMouseClicked

    private void jComboButacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboButacaActionPerformed

        Butaca but = (Butaca) jComboButaca.getSelectedItem();
        

        if (jComboButaca.getSelectedIndex()!= -1 || jComboButaca.getSelectedItem()!= null) {
            texFila1.setText(but.getFila());
            texColumna1.setText(Integer.toString(but.getColumna()));
        }
    }//GEN-LAST:event_jComboButacaActionPerformed

    private void jModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jModificarMouseClicked
        Butaca but = (Butaca) jComboButaca.getSelectedItem();


        Sala cli = (Sala) jComboSala1.getSelectedItem();
        but.setIdSala(cli);
        but.setFila(texFila1.getText());
        but.setColumna(Integer.parseInt(texColumna1.getText()));

        

        bd.modificarButaca(but);

        limpiarCampos();
    }//GEN-LAST:event_jModificarMouseClicked

    private void jComboSala1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboSala1MouseClicked
        llenarComboSala1();
    }//GEN-LAST:event_jComboSala1MouseClicked

    private void jComboSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboSalaActionPerformed

    private void texFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texFilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texFilaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAgregarButaca;
    private javax.swing.JComboBox<Butaca> jComboButaca;
    private javax.swing.JComboBox<Sala> jComboSala;
    private javax.swing.JComboBox<Sala> jComboSala1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private java.awt.TextField texColumna;
    private java.awt.TextField texColumna1;
    private java.awt.TextField texFila;
    private java.awt.TextField texFila1;
    // End of variables declaration//GEN-END:variables
}
