package com.praktikum.pertemuan_9_soal1;

public class AplikasiKalkulator extends javax.swing.JFrame {
    String angka;
    int jumlahI, bil1I, bil2I;
    double jumlahD,bil1D, bil2D;
    boolean cek1, cek2;
    int pilih;
    
    public AplikasiKalkulator() {
        initComponents();
        angka = "";
        setTitle("Aplikasi Kalkulator");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tampilkanHasil = new javax.swing.JTextField();
        angka7 = new javax.swing.JButton();
        angka4 = new javax.swing.JButton();
        angka1 = new javax.swing.JButton();
        koma = new javax.swing.JButton();
        angka8 = new javax.swing.JButton();
        angka5 = new javax.swing.JButton();
        angka2 = new javax.swing.JButton();
        angka0 = new javax.swing.JButton();
        angka9 = new javax.swing.JButton();
        angka6 = new javax.swing.JButton();
        angka3 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        modulus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        hasil = new javax.swing.JButton();
        hapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        tampilkanHasil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tampilkanHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilkanHasilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(tampilkanHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tampilkanHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        angka7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        angka7.setText("7");
        angka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka7ActionPerformed(evt);
            }
        });

        angka4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        angka4.setText("4");
        angka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka4ActionPerformed(evt);
            }
        });

        angka1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        angka1.setText("1");
        angka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka1ActionPerformed(evt);
            }
        });

        koma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        koma.setText(".");
        koma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                komaActionPerformed(evt);
            }
        });

        angka8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        angka8.setText("8");
        angka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka8ActionPerformed(evt);
            }
        });

        angka5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        angka5.setText("5");
        angka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka5ActionPerformed(evt);
            }
        });

        angka2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        angka2.setText("2");
        angka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka2ActionPerformed(evt);
            }
        });

        angka0.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        angka0.setText("0");
        angka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka0ActionPerformed(evt);
            }
        });

        angka9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        angka9.setText("9");
        angka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka9ActionPerformed(evt);
            }
        });

        angka6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        angka6.setText("6");
        angka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka6ActionPerformed(evt);
            }
        });

        angka3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        angka3.setText("3");
        angka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka3ActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        kurang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });

        bagi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bagi.setText("/");
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });

        modulus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        modulus.setText("%");
        modulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modulusActionPerformed(evt);
            }
        });

        keluar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        keluar.setText("E");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        tambah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        kali.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kali.setText("*");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });

        hasil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hasil.setText("=");
        hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilActionPerformed(evt);
            }
        });

        hapus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hapus.setText("B");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(koma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(angka0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modulus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(koma, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(angka0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(modulus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        // TODO add your handling code here:
        // konfrimasi apakah angka berbentuk double atau integer
        cek1 = angka.contains(".") ? false : true;
        if(cek1){
            bil1I = Integer.parseInt(angka);
        }else{
            bil1D = Double.parseDouble(angka);
        }
        tampilkanHasil.setText("*");
        angka = "";
        pilih = 3;
    }//GEN-LAST:event_kaliActionPerformed

    private void angka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka0ActionPerformed
        // TODO add your handling code here:
        angka += "0";
        tampilkanHasil.setText(angka);
    }//GEN-LAST:event_angka0ActionPerformed

    private void angka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka1ActionPerformed
        // TODO add your handling code here:
        angka += "1";
        tampilkanHasil.setText(angka);
    }//GEN-LAST:event_angka1ActionPerformed

    private void angka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka2ActionPerformed
        // TODO add your handling code here:
        angka += "2";
        tampilkanHasil.setText(angka);
    }//GEN-LAST:event_angka2ActionPerformed

    private void angka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka3ActionPerformed
        // TODO add your handling code here:
        angka += "3";
        tampilkanHasil.setText(angka);
    }//GEN-LAST:event_angka3ActionPerformed

    private void angka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka4ActionPerformed
        // TODO add your handling code here:
        angka += "4";
        tampilkanHasil.setText(angka);
    }//GEN-LAST:event_angka4ActionPerformed

    private void angka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka5ActionPerformed
        // TODO add your handling code here:
        angka += "5";
        tampilkanHasil.setText(angka);
    }//GEN-LAST:event_angka5ActionPerformed

    private void angka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka6ActionPerformed
        // TODO add your handling code here:
        angka += "6";
        tampilkanHasil.setText(angka);
    }//GEN-LAST:event_angka6ActionPerformed

    private void angka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka7ActionPerformed
        // TODO add your handling code here:
        angka += "7";
        tampilkanHasil.setText(angka);
    }//GEN-LAST:event_angka7ActionPerformed

    private void angka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka8ActionPerformed
        // TODO add your handling code here:
        angka += "8";
        tampilkanHasil.setText(angka);
    }//GEN-LAST:event_angka8ActionPerformed

    private void angka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka9ActionPerformed
        // TODO add your handling code here:
        angka += "9";
        tampilkanHasil.setText(angka);
    }//GEN-LAST:event_angka9ActionPerformed

    private void komaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_komaActionPerformed
        // TODO add your handling code here:
        angka += ".";
        tampilkanHasil.setText(angka);
    }//GEN-LAST:event_komaActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        bil1D = 0.0;
        bil2D = 0.0;
        jumlahD = 0.0;
        bil1I = 0;
        bil2I = 0;
        jumlahI = 0;
        angka = "";
        tampilkanHasil.setText(angka);
    }//GEN-LAST:event_clearActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        // konfrimasi apakah angka berbentuk double atau integer
        cek1 = angka.contains(".") ? false : true;
        if(cek1){
            bil1I = Integer.parseInt(angka);
        }else{
            bil1D = Double.parseDouble(angka);
        }
        tampilkanHasil.setText("+");
        angka = "";
        pilih = 1;
    }//GEN-LAST:event_tambahActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        // TODO add your handling code here:
        // konfrimasi apakah angka berbentuk double atau integer
        cek1 = angka.contains(".") ? false : true;
        if(cek1){
            bil1I = Integer.parseInt(angka);
        }else{
            bil1D = Double.parseDouble(angka);
        }
        tampilkanHasil.setText("-");
        angka = "";
        pilih = 2;
    }//GEN-LAST:event_kurangActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        // TODO add your handling code here:
        // konfrimasi apakah angka berbentuk double atau integer
        cek1 = angka.contains(".") ? false : true;
        if(cek1){
            bil1I = Integer.parseInt(angka);
        }else{
            bil1D = Double.parseDouble(angka);
        }
        tampilkanHasil.setText("/");
        angka = "";
        pilih = 4;
    }//GEN-LAST:event_bagiActionPerformed

    private void modulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modulusActionPerformed
        // TODO add your handling code here:
        // konfrimasi apakah angka berbentuk double atau integer
        cek1 = angka.contains(".") ? false : true;
        if(cek1){
            bil1I = Integer.parseInt(angka);
        }else{
            bil1D = Double.parseDouble(angka);
        }
        tampilkanHasil.setText("%");
        angka = "";
        pilih = 5;
    }//GEN-LAST:event_modulusActionPerformed

    private void hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilActionPerformed
        // TODO add your handling code here:
        switch (pilih){
            case 1:
                // konfrimasi apakah angka berbentuk double atau integer
                cek2 = angka.contains(".") ? false : true;
                if(cek2){
                    bil2I = Integer.parseInt(angka);
                    if(cek1){
                        jumlahI = bil1I + bil2I;
                        angka = Integer.toString(jumlahI);
                    }else{
                        jumlahD = bil1D + bil2I;
                        angka = Double.toString(jumlahD);
                    }
                }else{
                    bil2D = Double.parseDouble(angka);
                    if(cek1){
                        jumlahD = bil1I + bil2D;
                        angka = Double.toString(jumlahD);
                    }else{
                        jumlahD = bil1D + bil2D;
                        angka = Double.toString(jumlahD);
                        // jika hasil pertambahan sesama double menghasilkan ".0"
                        // maka diubah hasilnya menjadi int
                        if(angka.contains(".0")){
                            jumlahI = (int) jumlahD;
                            angka = Integer.toString(jumlahI);
                        }
                    }
                }
                break;
            case 2:
                cek2 = angka.contains(".") ? false : true;
                if(cek2){
                    bil2I = Integer.parseInt(angka);
                    if(cek1){
                        jumlahI = bil1I - bil2I;
                        angka = Integer.toString(jumlahI);
                    }else{
                        jumlahD = bil1D - bil2I;
                        angka = Double.toString(jumlahD);
                    }
                }else{
                    bil2D = Double.parseDouble(angka);
                    if(cek1){
                        jumlahD = bil1I - bil2D;
                        angka = Double.toString(jumlahD);
                    }else{
                        jumlahD = bil1D - bil2D;
                        angka = Double.toString(jumlahD);
                        if(angka.contains(".0")){
                            jumlahI = (int) jumlahD;
                            angka = Integer.toString(jumlahI);
                        }
                    }
                }
                break;
            case 3:
                cek2 = angka.contains(".") ? false : true;
                if(cek2){
                    bil2I = Integer.parseInt(angka);
                    if(cek1){
                        jumlahI = bil1I * bil2I;
                        angka = Integer.toString(jumlahI);
                    }else{
                        jumlahD = bil1D * bil2I;
                        angka = Double.toString(jumlahD);
                        if(angka.contains(".0")){
                            jumlahI = (int) jumlahD;
                            angka = Integer.toString(jumlahI);
                        }
                    }
                }else{
                    bil2D = Double.parseDouble(angka);
                    if(cek1){
                        jumlahD = bil1I * bil2D;
                        angka = Double.toString(jumlahD);
                        if(angka.contains(".0")){
                            jumlahI = (int) jumlahD;
                            angka = Integer.toString(jumlahI);
                        }
                    }else{
                        jumlahD = bil1D * bil2D;
                        angka = Double.toString(jumlahD);
                        if(angka.contains(".0")){
                            jumlahI = (int) jumlahD;
                            angka = Integer.toString(jumlahI);
                        }
                    }
                }
                break;
            case 4:
                cek2 = angka.contains(".") ? false : true;
                if(cek2){
                    bil2I = Integer.parseInt(angka);
                    if(cek1){
                        bil1D = (double) bil1I;
                        bil2D = (double) bil2I;
                        jumlahD = bil1D / bil2D;
                        angka = Double.toString(jumlahD);
                        if(angka.contains(".0")){
                            jumlahI = (int) jumlahD;
                            angka = Integer.toString(jumlahI);
                        }
                    }else{
                        jumlahD = bil1D /  bil2I;
                        angka = Double.toString(jumlahD);
                        if(angka.contains(".0")){
                            jumlahI = (int) jumlahD;
                            angka = Integer.toString(jumlahI);
                        }
                    }
                }else{
                    bil2D = Double.parseDouble(angka);
                    if(cek1){
                        jumlahD = bil1I /  bil2D;
                        angka = Double.toString(jumlahD);
                        if(angka.contains(".0")){
                            jumlahI = (int) jumlahD;
                            angka = Integer.toString(jumlahI);
                        }
                    }else{
                        jumlahD = bil1D /  bil2D;
                        angka = Double.toString(jumlahD);
                        if(angka.contains(".0")){
                            jumlahI = (int) jumlahD;
                            angka = Integer.toString(jumlahI);
                        }
                    }
                }
                break;
            case 5:
                cek2 = angka.contains(".") ? false : true;
                if(cek2){
                    bil2I = Integer.parseInt(angka);
                    if(cek1){
                        jumlahI = bil1I % bil2I;
                        angka = Integer.toString(jumlahI);
                    }else{
                        jumlahD = bil1D % bil2I;
                        angka = Double.toString(jumlahD);
                    }
                }else{
                    bil2D = Double.parseDouble(angka);
                    if(cek1){
                        jumlahD = bil1I % bil2D;
                        angka = Double.toString(jumlahD);
                    }else{
                        jumlahD = bil1D % bil2D;
                        angka = Double.toString(jumlahD);
                    }
                }
                break;
            default:
                break;
        }
        tampilkanHasil.setText(angka);
    }//GEN-LAST:event_hasilActionPerformed

    private void tampilkanHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilkanHasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tampilkanHasilActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        if (!angka.isEmpty()) {
            angka = angka.substring(0, angka.length() - 1);
            tampilkanHasil.setText(angka);
        }else{
            tampilkanHasil.setText("");
        }
    }//GEN-LAST:event_hapusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplikasiKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiKalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton angka0;
    private javax.swing.JButton angka1;
    private javax.swing.JButton angka2;
    private javax.swing.JButton angka3;
    private javax.swing.JButton angka4;
    private javax.swing.JButton angka5;
    private javax.swing.JButton angka6;
    private javax.swing.JButton angka7;
    private javax.swing.JButton angka8;
    private javax.swing.JButton angka9;
    private javax.swing.JButton bagi;
    private javax.swing.JButton clear;
    private javax.swing.JButton hapus;
    private javax.swing.JButton hasil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton kali;
    private javax.swing.JButton keluar;
    private javax.swing.JButton koma;
    private javax.swing.JButton kurang;
    private javax.swing.JButton modulus;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField tampilkanHasil;
    // End of variables declaration//GEN-END:variables
}