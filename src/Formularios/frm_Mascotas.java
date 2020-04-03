package Formularios;

import Entidades.*;

public class frm_Mascotas extends javax.swing.JFrame {

    Ave ave;
    Gato gato;
    Perro perro;
    Pez pez;
    Hamster hamster;

    public frm_Mascotas() {
        initComponents();
        this.startFrame();
        this.ave = new Ave();
        this.gato = new Gato();
        this.perro = new Perro();
        this.pez = new Pez();
        this.hamster = new Hamster();
    }

    private void startFrame() {
        this.setEnabled(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Mascotas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboAnimales = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtSubTIpo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        spnEdad = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnComerAve = new javax.swing.JButton();
        btnDormirAve = new javax.swing.JButton();
        btnVolarAVe = new javax.swing.JButton();
        btnCantarAve = new javax.swing.JButton();
        btnCajaArena = new javax.swing.JButton();
        btnComerGato = new javax.swing.JButton();
        btnDormirAVe = new javax.swing.JButton();
        btnAruñarGatp = new javax.swing.JButton();
        btnComerPerro = new javax.swing.JButton();
        btnDormirPerro = new javax.swing.JButton();
        btnMorderPerro = new javax.swing.JButton();
        btnLadra = new javax.swing.JButton();
        btnCOmerPez = new javax.swing.JButton();
        btnDormirPez = new javax.swing.JButton();
        btnSaltarPez = new javax.swing.JButton();
        btnNadarPez = new javax.swing.JButton();
        btnEsconderseHamster = new javax.swing.JButton();
        btnRodarHamster = new javax.swing.JButton();
        btnComerHamster = new javax.swing.JButton();
        btnDormirHamster = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtAccion = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(250, 501));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel1.setText("Agregar Mascota");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel2.setText("Tipo");

        cboAnimales.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        cboAnimales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ave", "Gato", "Perro", "Pez", "Hamster" }));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel3.setText("Subtipo");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel4.setText("Edad");

        spnEdad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel5.setText("Nombre");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSubTIpo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar)
                            .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSubTIpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel6.setText("Ave");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel7.setText("Gato");

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel8.setText("Perro");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel9.setText("Pez");

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel10.setText("Hamster");

        btnComerAve.setText("Comer");
        btnComerAve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComerAveActionPerformed(evt);
            }
        });

        btnDormirAve.setText("Dormir");
        btnDormirAve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDormirAveActionPerformed(evt);
            }
        });

        btnVolarAVe.setText("Volar");
        btnVolarAVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolarAVeActionPerformed(evt);
            }
        });

        btnCantarAve.setText("Cantar");
        btnCantarAve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantarAveActionPerformed(evt);
            }
        });

        btnCajaArena.setText("Caja Arena");
        btnCajaArena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajaArenaActionPerformed(evt);
            }
        });

        btnComerGato.setText("Comer");
        btnComerGato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComerGatoActionPerformed(evt);
            }
        });

        btnDormirAVe.setText("Dormir");
        btnDormirAVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDormirAVeActionPerformed(evt);
            }
        });

        btnAruñarGatp.setText("Aruñar");
        btnAruñarGatp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAruñarGatpActionPerformed(evt);
            }
        });

        btnComerPerro.setText("Comer");
        btnComerPerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComerPerroActionPerformed(evt);
            }
        });

        btnDormirPerro.setText("Dormir");
        btnDormirPerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDormirPerroActionPerformed(evt);
            }
        });

        btnMorderPerro.setText("Morder");
        btnMorderPerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMorderPerroActionPerformed(evt);
            }
        });

        btnLadra.setText("Ladrar");
        btnLadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLadraActionPerformed(evt);
            }
        });

        btnCOmerPez.setText("Comer");
        btnCOmerPez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOmerPezActionPerformed(evt);
            }
        });

        btnDormirPez.setText("Dormir");
        btnDormirPez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDormirPezActionPerformed(evt);
            }
        });

        btnSaltarPez.setText("Saltar");
        btnSaltarPez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaltarPezActionPerformed(evt);
            }
        });

        btnNadarPez.setText("Nadar");
        btnNadarPez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNadarPezActionPerformed(evt);
            }
        });

        btnEsconderseHamster.setText("Esconderse");
        btnEsconderseHamster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsconderseHamsterActionPerformed(evt);
            }
        });

        btnRodarHamster.setText("Rodar");
        btnRodarHamster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRodarHamsterActionPerformed(evt);
            }
        });

        btnComerHamster.setText("Comer");
        btnComerHamster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComerHamsterActionPerformed(evt);
            }
        });

        btnDormirHamster.setText("Dormir");
        btnDormirHamster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDormirHamsterActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel11.setText("Acción:");

        txtAccion.setEditable(false);
        txtAccion.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnComerAve)
                                    .addComponent(btnDormirAve)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnVolarAVe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCantarAve, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCajaArena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnComerGato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDormirAVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAruñarGatp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel7)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMorderPerro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLadra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnComerPerro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDormirPerro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnSaltarPez, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNadarPez, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCOmerPez)
                            .addComponent(btnDormirPez))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEsconderseHamster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRodarHamster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDormirHamster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnComerHamster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addGap(26, 26, 26))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(12, 12, 12)
                        .addComponent(btnCOmerPez)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDormirPez)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNadarPez)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSaltarPez))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnComerAve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDormirAve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVolarAVe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCantarAve))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnComerGato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDormirAVe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAruñarGatp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCajaArena))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnComerPerro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDormirPerro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLadra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMorderPerro))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnComerHamster)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDormirHamster)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRodarHamster)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEsconderseHamster)))))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComerGatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComerGatoActionPerformed
        this.txtAccion.setText(this.gato.comer());
    }//GEN-LAST:event_btnComerGatoActionPerformed

    private void btnComerHamsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComerHamsterActionPerformed
        this.txtAccion.setText(this.hamster.comer());
    }//GEN-LAST:event_btnComerHamsterActionPerformed

    private void btnCantarAveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantarAveActionPerformed
        this.txtAccion.setText(this.ave.cantar());
    }//GEN-LAST:event_btnCantarAveActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        switch(this.cboAnimales.getSelectedIndex()){
            case 0:
                this.ave.setNombre(this.txtNombre.getText());
                break;
            case 1:
                this.gato.setNombre(this.txtNombre.getText());
                break;
            case 2:
                this.perro.setNombre(this.txtNombre.getText());
                break;
            case 3:
                this.pez.setNombre(this.txtNombre.getText());
                break;
            case 4:
                this.hamster.setNombre(this.txtNombre.getText());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnComerAveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComerAveActionPerformed
        this.txtAccion.setText(this.ave.comer());
    }//GEN-LAST:event_btnComerAveActionPerformed

    private void btnDormirAveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDormirAveActionPerformed
        this.txtAccion.setText(this.ave.dormir());
    }//GEN-LAST:event_btnDormirAveActionPerformed

    private void btnVolarAVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolarAVeActionPerformed
       this.txtAccion.setText(this.ave.volar());
    }//GEN-LAST:event_btnVolarAVeActionPerformed

    private void btnDormirAVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDormirAVeActionPerformed
        this.txtAccion.setText(this.gato.dormir());
    }//GEN-LAST:event_btnDormirAVeActionPerformed

    private void btnAruñarGatpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAruñarGatpActionPerformed
        this.txtAccion.setText(this.gato.aruñar());
    }//GEN-LAST:event_btnAruñarGatpActionPerformed

    private void btnCajaArenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajaArenaActionPerformed
        this.txtAccion.setText(this.gato.cajaArena());
    }//GEN-LAST:event_btnCajaArenaActionPerformed

    private void btnComerPerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComerPerroActionPerformed
        this.txtAccion.setText(this.perro.comer());
    }//GEN-LAST:event_btnComerPerroActionPerformed

    private void btnDormirPerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDormirPerroActionPerformed
       this.txtAccion.setText(this.perro.dormir());
    }//GEN-LAST:event_btnDormirPerroActionPerformed

    private void btnLadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLadraActionPerformed
        this.txtAccion.setText(this.perro.ladrar());
    }//GEN-LAST:event_btnLadraActionPerformed

    private void btnMorderPerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMorderPerroActionPerformed
        this.txtAccion.setText(this.perro.morder());
    }//GEN-LAST:event_btnMorderPerroActionPerformed

    private void btnCOmerPezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOmerPezActionPerformed
        this.txtAccion.setText(this.pez.comer());
    }//GEN-LAST:event_btnCOmerPezActionPerformed

    private void btnDormirPezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDormirPezActionPerformed
       this.txtAccion.setText(this.pez.dormir());
    }//GEN-LAST:event_btnDormirPezActionPerformed

    private void btnNadarPezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNadarPezActionPerformed
       this.txtAccion.setText(this.pez.nadar());
    }//GEN-LAST:event_btnNadarPezActionPerformed

    private void btnSaltarPezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaltarPezActionPerformed
        this.txtAccion.setText(this.pez.saltar());
    }//GEN-LAST:event_btnSaltarPezActionPerformed

    private void btnDormirHamsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDormirHamsterActionPerformed
       this.txtAccion.setText(this.hamster.dormir());
    }//GEN-LAST:event_btnDormirHamsterActionPerformed

    private void btnRodarHamsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRodarHamsterActionPerformed
        this.txtAccion.setText(this.hamster.rodar());
    }//GEN-LAST:event_btnRodarHamsterActionPerformed

    private void btnEsconderseHamsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsconderseHamsterActionPerformed
      this.txtAccion.setText(this.hamster.esconderse());
    }//GEN-LAST:event_btnEsconderseHamsterActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAruñarGatp;
    private javax.swing.JButton btnCOmerPez;
    private javax.swing.JButton btnCajaArena;
    private javax.swing.JButton btnCantarAve;
    private javax.swing.JButton btnComerAve;
    private javax.swing.JButton btnComerGato;
    private javax.swing.JButton btnComerHamster;
    private javax.swing.JButton btnComerPerro;
    private javax.swing.JButton btnDormirAVe;
    private javax.swing.JButton btnDormirAve;
    private javax.swing.JButton btnDormirHamster;
    private javax.swing.JButton btnDormirPerro;
    private javax.swing.JButton btnDormirPez;
    private javax.swing.JButton btnEsconderseHamster;
    private javax.swing.JButton btnLadra;
    private javax.swing.JButton btnMorderPerro;
    private javax.swing.JButton btnNadarPez;
    private javax.swing.JButton btnRodarHamster;
    private javax.swing.JButton btnSaltarPez;
    private javax.swing.JButton btnVolarAVe;
    private javax.swing.JComboBox<String> cboAnimales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JTextField txtAccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSubTIpo;
    // End of variables declaration//GEN-END:variables
}
