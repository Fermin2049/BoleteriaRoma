/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaPrincipal;

import Control.Pelicula;
import Control.Proyeccion;
import Control.Sala;
import Data.PeliculaData;
import Data.ProyeccionData;
import Data.SalaData;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class PanelProyeccion extends javax.swing.JPanel {

    SalaData sd = new SalaData();
    ProyeccionData pd = new ProyeccionData();
    PeliculaData pd2 = new PeliculaData();

    public PanelProyeccion() {
        initComponents();
    }

    public void llenarComboSala(){
        ArrayList<Sala> listaSala = (ArrayList<Sala>) sd.listarSala();
        
        for (Sala sala : listaSala) {
            jComboSala.addItem(sala);
        }
        jComboSala.setSelectedItem(-1);
    }
    
    public void llenarComboSala1(){
        ArrayList<Sala> listaSala = (ArrayList<Sala>) sd.listarSala();
        
        for (Sala sala : listaSala) {
            jComboSala1.addItem(sala);
        }
        jComboSala1.setSelectedItem(-1);
    }
    
    public void llenarComboPelicula(){
        ArrayList<Pelicula> listarPelicula = (ArrayList<Pelicula>) pd2.listarPelicula();
        
        for (Pelicula pelicula : listarPelicula) {
            jComboPelicula.addItem(pelicula);
        }
        jComboPelicula.setSelectedItem(-1);
    }
    
    public void llenarComboPelicula1(){
        ArrayList<Pelicula> listarPelicula = (ArrayList<Pelicula>) pd2.listarPelicula();
        
        for (Pelicula pelicula : listarPelicula) {
            jComboPelicula1.addItem(pelicula);
        }
        jComboPelicula1.setSelectedItem(-1);
    }
    
    public void llenarComboProyeccion(){
        ArrayList<Proyeccion> listaCliente = (ArrayList<Proyeccion>) pd.listarProyeccion();
        
        for (Proyeccion cli : listaCliente) {
            jComboProyeccion.addItem(cli);
            
        }
        jComboProyeccion.setSelectedItem(-1);
        
    }
    
    public void limpiarCampos(){
        jComboSala.setSelectedItem(-1);
        jComboPelicula.setSelectedItem(-1);
        jDateInico.setDate(null);
        jDateFin.setDate(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboSala = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboPelicula = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jDateInico = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        horaFin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jDateFin = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        horaIni = new javax.swing.JTextField();
        jAgregarButaca = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboSala1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboPelicula1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jDateInico1 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        horaIni1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jDateFin1 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        horaFin1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        radioBotonSi = new javax.swing.JRadioButton();
        radioBotonNo = new javax.swing.JRadioButton();
        jAgregarButaca1 = new javax.swing.JLabel();
        jComboProyeccion = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setViewportView(jTextPane1);

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(780, 560));
        setPreferredSize(new java.awt.Dimension(774, 558));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(390, 280));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar una  Proyeccion");

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

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sala =");

        jComboPelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboPeliculaMouseClicked(evt);
            }
        });
        jComboPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPeliculaActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pelicula =");

        jDateInico.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Inicio de Proyeccion =");

        jLabel5.setText("Hora =");

        horaFin.setBackground(new java.awt.Color(255, 255, 255));
        horaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaFinActionPerformed(evt);
            }
        });

        jLabel6.setText("Fin de la Proyeccion =");

        jLabel7.setText("Hora =");

        horaIni.setBackground(new java.awt.Color(255, 255, 255));
        horaIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaIniActionPerformed(evt);
            }
        });

        jAgregarButaca.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jAgregarButaca.setText("Agregar  Proyeccion");
        jAgregarButaca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jAgregarButaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAgregarButacaMouseClicked(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("hh:mm:ss");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("hh:mm:ss");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboSala, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jDateInico, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(horaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(horaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(150, 150, 150)
                                        .addComponent(jAgregarButaca)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jDateInico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(horaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(horaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jAgregarButaca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 300));

        jPanel2.setPreferredSize(new java.awt.Dimension(390, 280));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Modificar una  Proyeccion");

        jComboSala1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboSala1MouseClicked(evt);
            }
        });
        jComboSala1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboSala1ActionPerformed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Sala =");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Pelicula =");

        jComboPelicula1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboPelicula1MouseClicked(evt);
            }
        });
        jComboPelicula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPelicula1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Inicio de Proyeccion =");

        jDateInico1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setText("Hora =");

        horaIni1.setBackground(new java.awt.Color(255, 255, 255));
        horaIni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaIni1ActionPerformed(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("hh:mm:ss");

        jLabel16.setText("Fin de la Proyeccion =");

        jLabel17.setText("Hora =");

        horaFin1.setBackground(new java.awt.Color(255, 255, 255));
        horaFin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaFin1ActionPerformed(evt);
            }
        });

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("hh:mm:ss");

        jLabel19.setText("Eleminar ? = ");

        buttonGroup1.add(radioBotonSi);
        radioBotonSi.setText("No");
        radioBotonSi.setActionCommand("si");
        radioBotonSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBotonSiActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBotonNo);
        radioBotonNo.setText("Si");
        radioBotonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBotonNoActionPerformed(evt);
            }
        });

        jAgregarButaca1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jAgregarButaca1.setText("Modificar Proyeccion");
        jAgregarButaca1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jAgregarButaca1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAgregarButaca1MouseClicked(evt);
            }
        });

        jComboProyeccion.setMaximumSize(new java.awt.Dimension(31, 24));
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

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Proyecciones =");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jAgregarButaca1)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(radioBotonSi)
                            .addGap(18, 18, 18)
                            .addComponent(radioBotonNo))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jDateInico1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(horaIni1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboSala1, javax.swing.GroupLayout.Alignment.LEADING, 0, 254, Short.MAX_VALUE)
                                        .addComponent(jComboProyeccion, javax.swing.GroupLayout.Alignment.LEADING, 0, 254, Short.MAX_VALUE))
                                    .addComponent(jComboPelicula1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateFin1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(horaFin1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboProyeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboSala1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboPelicula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jDateInico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(horaIni1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateFin1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(horaFin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(radioBotonSi)
                    .addComponent(radioBotonNo)
                    .addComponent(jAgregarButaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 410, 300));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 780, 250));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboSalaMouseClicked
        llenarComboSala();
    }//GEN-LAST:event_jComboSalaMouseClicked

    private void jComboSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboSalaActionPerformed

    }//GEN-LAST:event_jComboSalaActionPerformed

    private void jComboPeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboPeliculaMouseClicked
        llenarComboPelicula();
    }//GEN-LAST:event_jComboPeliculaMouseClicked

    private void jComboPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPeliculaActionPerformed

    }//GEN-LAST:event_jComboPeliculaActionPerformed

    private void horaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaFinActionPerformed

    private void horaIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaIniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaIniActionPerformed

    private void jAgregarButacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAgregarButacaMouseClicked
        Sala cli = (Sala) jComboSala.getSelectedItem();
        Pelicula pel = (Pelicula) jComboPelicula.getSelectedItem();

        LocalTime horaInicio = LocalTime.parse(horaIni.getText());
        LocalDate fechaNueva = jDateInico.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDateTime local = LocalDateTime.of(fechaNueva,horaInicio);
        Timestamp diaHoraincio = Timestamp.valueOf(local);
        
        LocalTime horafin = LocalTime.parse(horaFin.getText());
        LocalDate fechaNueva2 = jDateFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDateTime local2 = LocalDateTime.of(fechaNueva2, horafin);
        Timestamp diaHorafin = Timestamp.valueOf(local2);
        

        Proyeccion p = new Proyeccion(cli, pel, diaHoraincio,diaHorafin , true);

        pd.agregarProyeccion(p);

        limpiarCampos();
    }//GEN-LAST:event_jAgregarButacaMouseClicked

    private void jComboSala1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboSala1MouseClicked
        llenarComboSala1();
    }//GEN-LAST:event_jComboSala1MouseClicked

    private void jComboSala1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboSala1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboSala1ActionPerformed

    private void jComboPelicula1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboPelicula1MouseClicked
        llenarComboPelicula1();
    }//GEN-LAST:event_jComboPelicula1MouseClicked

    private void jComboPelicula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPelicula1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboPelicula1ActionPerformed

    private void horaIni1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaIni1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaIni1ActionPerformed

    private void horaFin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaFin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaFin1ActionPerformed

    private void radioBotonSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBotonSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBotonSiActionPerformed

    private void radioBotonNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBotonNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBotonNoActionPerformed

    private void jAgregarButaca1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAgregarButaca1MouseClicked
        Sala cli = (Sala) jComboSala1.getSelectedItem();
        Pelicula pel = (Pelicula) jComboPelicula1.getSelectedItem();
        Proyeccion pro = (Proyeccion)jComboProyeccion.getSelectedItem();
        
        LocalTime horaInicio = LocalTime.parse(horaIni1.getText());
        LocalDate fechaNueva = jDateInico1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDateTime local = LocalDateTime.of(fechaNueva,horaInicio);
        Timestamp diaHoraincio = Timestamp.valueOf(local);
        
        LocalTime horafin = LocalTime.parse(horaFin1.getText());
        LocalDate fechaNueva2 = jDateFin1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDateTime local2 = LocalDateTime.of(fechaNueva2, horafin);
        Timestamp diaHorafin = Timestamp.valueOf(local2);
        
        

        pd.modificarProyeccion(cli.getIdSala(), pel.getIdPelicula(), diaHoraincio, diaHorafin, true,pro.getIdProyeecion());

        limpiarCampos();
    }//GEN-LAST:event_jAgregarButaca1MouseClicked

    private void jComboProyeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboProyeccionActionPerformed
        Proyeccion pro = (Proyeccion) jComboProyeccion.getSelectedItem();
        
        if (jComboProyeccion.getSelectedIndex()!= -1 || jComboProyeccion.getSelectedItem()!= null) {
            Date ini = pro.getIncioProy();
            Date fin = pro.getFinProy();
            int horaini = pro.getIncioProy().getHours();
            int miniIni = pro.getIncioProy().getMinutes();
            int minifin = pro.getIncioProy().getMinutes();
            int horafin = pro.getFinProy().getHours();
            horaIni1.setText(String.valueOf(horaini)+":"+String.valueOf(miniIni));
            horaFin1.setText(String.valueOf(horafin)+":"+String.valueOf(minifin));
            jDateInico1.setDate(ini);
            jDateFin1.setDate(fin);
            if(pro.isEstadoProy()){
                radioBotonSi.setSelected(true);
            }
        } else {
            radioBotonNo.setSelected(false);
        }
    }//GEN-LAST:event_jComboProyeccionActionPerformed

    private void jComboProyeccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboProyeccionMouseClicked
        llenarComboProyeccion();
    }//GEN-LAST:event_jComboProyeccionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField horaFin;
    private javax.swing.JTextField horaFin1;
    private javax.swing.JTextField horaIni;
    private javax.swing.JTextField horaIni1;
    private javax.swing.JLabel jAgregarButaca;
    private javax.swing.JLabel jAgregarButaca1;
    private javax.swing.JComboBox<Pelicula> jComboPelicula;
    private javax.swing.JComboBox<Pelicula> jComboPelicula1;
    private javax.swing.JComboBox<Proyeccion> jComboProyeccion;
    private javax.swing.JComboBox<Sala> jComboSala;
    private javax.swing.JComboBox<Sala> jComboSala1;
    private com.toedter.calendar.JDateChooser jDateFin;
    private com.toedter.calendar.JDateChooser jDateFin1;
    private com.toedter.calendar.JDateChooser jDateInico;
    private com.toedter.calendar.JDateChooser jDateInico1;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JRadioButton radioBotonNo;
    private javax.swing.JRadioButton radioBotonSi;
    // End of variables declaration//GEN-END:variables
}
