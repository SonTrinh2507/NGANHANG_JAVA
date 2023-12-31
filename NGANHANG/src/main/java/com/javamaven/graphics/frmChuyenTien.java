/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.javamaven.graphics;

import com.javamaven.connect.DataConnection;
import com.javamaven.connect.LoadData;
import com.javamaven.controller.controller;
import com.javamaven.dao.GiaoDichDao;
import com.javamaven.entity.GD_CHUYENTIEN;
import com.javamaven.function.getInfo;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class frmChuyenTien extends javax.swing.JFrame {

    private DefaultTableModel tableChuyenTien;

    /**
     * Creates new form frmChuyenTien
     */
    public frmChuyenTien() {
        initComponents();
        tableChuyenTien = (DefaultTableModel) tbl_CHUYENTIEN.getModel();
        setExtendedState(frmChuyenTien.MAXIMIZED_BOTH);
        txtSOTK_CHUYEN.setEnabled(false);
        dateNGAYGD.setEnabled(false);
        txtSOTIEN.setEnabled(false);
        txtSOTK_NHAN.setEnabled(false);
        txtMANV.setEnabled(false);
        txtCMNDCHUYEN.setEnabled(false);
        txtCMNDNHAN.setEnabled(false);
        txtHOTENCHUYEN.setEnabled(false);
        txtHOTENNHAN.setEnabled(false);
        txtSODU.setEnabled(false);
        showData();
    }

    private void showData() {
        new LoadData();
        tableChuyenTien.setRowCount(0);
        int dem = 1;
        for (GD_CHUYENTIEN ct : controller.arrayListChuyenTien) {
            tableChuyenTien.addRow(new Object[]{dem++, ct.getMAGD(), ct.getSOTK_CHUYEN(), ct.getNGAYGD(), ct.getSOTIEN(), ct.getSOTK_NHAN(), ct.getMANV()});
        }

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
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_CHUYENTIEN = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSOTK_CHUYEN = new javax.swing.JTextField();
        txtSOTIEN = new javax.swing.JTextField();
        txtSOTK_NHAN = new javax.swing.JTextField();
        txtMANV = new javax.swing.JTextField();
        dateNGAYGD = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCMNDCHUYEN = new javax.swing.JTextField();
        txtHOTENCHUYEN = new javax.swing.JTextField();
        txtSODU = new javax.swing.JTextField();
        txtCMNDNHAN = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtHOTENNHAN = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GIAO DỊCH CHUYỂN TIỀN");

        jButton5.setText("HOME");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tbl_CHUYENTIEN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MAGD", "SOTK_CHUYEN", "NGAYGD", "SOTIEN", "SOTK_NHAN", "MANV"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_CHUYENTIEN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_CHUYENTIENMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_CHUYENTIEN);

        jLabel2.setText("Thông tin tài khoản gửi:");

        jLabel3.setText("SOTK_CHUYEN:");

        jLabel4.setText("SOTK_NHAN:");

        jLabel5.setText("SOTIEN:");

        jLabel6.setText("NGAYGD:");

        jLabel7.setText("MANV:");

        txtSOTK_CHUYEN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSOTK_CHUYENKeyReleased(evt);
            }
        });

        txtSOTK_NHAN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSOTK_NHANKeyReleased(evt);
            }
        });

        dateNGAYGD.setDateFormatString("yyyy-MM-dd");

        jLabel8.setText("Thông tin tài khoản nhận:");

        jLabel9.setText("CMND:");

        jLabel10.setText("HOTEN:");

        jLabel11.setText("SODU:");

        txtCMNDNHAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCMNDNHANActionPerformed(evt);
            }
        });

        jLabel12.setText("CMND:");

        jLabel13.setText("HOTEN:");

        jLabel14.setText("Thực hiện giao dịch:");

        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("THỰC HIỆN GIAO DỊCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("CHUYỂN TIỀN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(150, 150, 150)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMANV, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtSOTK_NHAN, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSOTK_CHUYEN, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtCMNDCHUYEN, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtHOTENCHUYEN, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(dateNGAYGD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(txtCMNDNHAN, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtHOTENNHAN, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSODU, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(367, 367, 367)
                                                .addComponent(jButton2)
                                                .addGap(39, 39, 39)
                                                .addComponent(jButton3)
                                                .addGap(44, 44, 44)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jLabel14)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSOTIEN, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMANV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSOTK_CHUYEN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCMNDCHUYEN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHOTENCHUYEN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSODU, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSOTK_NHAN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCMNDNHAN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHOTENNHAN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSOTIEN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateNGAYGD, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        frmHome home = new frmHome();
        home.setLocationRelativeTo(null);
        home.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtCMNDNHANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCMNDNHANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCMNDNHANActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String s = "";
        txtCMNDCHUYEN.setText(s);
        txtCMNDNHAN.setText(s);
        txtHOTENCHUYEN.setText(s);
        txtHOTENNHAN.setText(s);
        txtMANV.setText(s);
        txtSODU.setText(s);
        txtSOTIEN.setText(s);
        txtSOTK_CHUYEN.setText(s);
        txtSOTK_NHAN.setText(s);
        txtSOTK_CHUYEN.setEnabled(false);
        txtSOTK_NHAN.setEnabled(false);
        txtSOTIEN.setEnabled(false);
        dateNGAYGD.setDate(null);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_CHUYENTIENMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CHUYENTIENMousePressed
        int row = tbl_CHUYENTIEN.getSelectedRow();
        txtSOTK_CHUYEN.setText((String) tbl_CHUYENTIEN.getValueAt(row, 2));
        dateNGAYGD.setDate((Date) tbl_CHUYENTIEN.getValueAt(row, 3));
        long SOTIEN = (long) tbl_CHUYENTIEN.getValueAt(row, 4);
        String Tien = String.valueOf(SOTIEN);
        txtSOTIEN.setText(Tien );
        txtSOTK_NHAN.setText((String) tbl_CHUYENTIEN.getValueAt(row, 5));
        txtMANV.setText((String) tbl_CHUYENTIEN.getValueAt(row, 6));
        txtSOTK_CHUYEN.setEnabled(false);
        dateNGAYGD.setEnabled(false);
        txtSOTIEN.setEnabled(false);
        txtSOTK_NHAN.setEnabled(false);
        txtMANV.setEnabled(false);
        txtCMNDCHUYEN.setEnabled(false);
        txtCMNDNHAN.setEnabled(false);
        txtHOTENCHUYEN.setEnabled(false);
        txtHOTENNHAN.setEnabled(false);
        txtSODU.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_CHUYENTIENMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtSOTK_CHUYEN.setEnabled(true);
        txtSOTK_NHAN.setEnabled(true);
        txtSOTIEN.setEnabled(true);
        String s = "";
        txtCMNDCHUYEN.setText(s);
        txtCMNDNHAN.setText(s);
        txtHOTENCHUYEN.setText(s);
        txtHOTENNHAN.setText(s);
        txtMANV.setText(DataConnection.mUsername);
        txtSODU.setText(s);
        txtSOTIEN.setText(s);
        txtSOTK_CHUYEN.setText(s);
        txtSOTK_NHAN.setText(s);
        LocalDate currentDate = LocalDate.now();
        Date date = (Date) Date.from(currentDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        dateNGAYGD.setDate(date);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String tien = txtSOTIEN.getText();
        long SOTIEN = Long.parseLong(tien);       
        GiaoDichDao.exec_GDChuyenTien(txtSOTK_CHUYEN.getText(), txtSOTK_NHAN.getText(), SOTIEN, txtMANV.getText());
       int check = GiaoDichDao.getCheck();
        System.err.println("kiemtra là: " + check);
        switch (check) {
            case 0 -> JOptionPane.showMessageDialog(null, "Chuyển tiền thành công");
            case 1 -> JOptionPane.showMessageDialog(null, "Hai số tài khoản trùng nhau");
            case 2 -> JOptionPane.showMessageDialog(null, "Số tài khoản chuyển không đúng");
            case 3 -> JOptionPane.showMessageDialog(null, "Số tài khoản nhân không đúng");
            case 4 -> JOptionPane.showMessageDialog(null, "Chuyển tiền thất bại");                          
        }
         String s = "";
        txtCMNDCHUYEN.setText(s);
        txtCMNDNHAN.setText(s);
        txtHOTENCHUYEN.setText(s);
        txtHOTENNHAN.setText(s);
        txtMANV.setText(s);
        txtSODU.setText(s);
        txtSOTIEN.setText(s);
        txtSOTK_CHUYEN.setText(s);
        txtSOTK_NHAN.setText(s);
        txtSOTK_CHUYEN.setEnabled(false);
        txtSOTK_NHAN.setEnabled(false);
        txtSOTIEN.setEnabled(false);
        showData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtSOTK_CHUYENKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSOTK_CHUYENKeyReleased
        if(txtSOTK_CHUYEN.getText().equals("")){
            System.out.println("lỗi");
        }else{
        List<getInfo> list = LoadData.getCMND_SODU(txtSOTK_CHUYEN.getText());       
        for (getInfo i : list) {
            txtCMNDCHUYEN.setText(i.getCMND());
            txtHOTENCHUYEN.setText(i.getHOTEN());
            txtSODU.setText(String.valueOf(i.getSODU()));
        }   
    }// TODO add your handling code here:
    }//GEN-LAST:event_txtSOTK_CHUYENKeyReleased

    private void txtSOTK_NHANKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSOTK_NHANKeyReleased
        List<getInfo> list = LoadData.getCMND_SODU(txtSOTK_NHAN.getText());       
        for (getInfo i : list) {
            txtCMNDNHAN.setText(i.getCMND());
            txtHOTENNHAN.setText(i.getHOTEN());
          
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtSOTK_NHANKeyReleased

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
            java.util.logging.Logger.getLogger(frmChuyenTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmChuyenTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmChuyenTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmChuyenTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmChuyenTien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateNGAYGD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_CHUYENTIEN;
    private javax.swing.JTextField txtCMNDCHUYEN;
    private javax.swing.JTextField txtCMNDNHAN;
    private javax.swing.JTextField txtHOTENCHUYEN;
    private javax.swing.JTextField txtHOTENNHAN;
    private javax.swing.JTextField txtMANV;
    private javax.swing.JTextField txtSODU;
    private javax.swing.JTextField txtSOTIEN;
    private javax.swing.JTextField txtSOTK_CHUYEN;
    private javax.swing.JTextField txtSOTK_NHAN;
    // End of variables declaration//GEN-END:variables

    private void swich(int check) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
