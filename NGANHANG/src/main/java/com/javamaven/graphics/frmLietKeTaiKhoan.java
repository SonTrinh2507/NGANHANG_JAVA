/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.javamaven.graphics;

import com.javamaven.dao.LietKeDao;
import com.javamaven.function.LietKeTaiKhoan;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class frmLietKeTaiKhoan extends javax.swing.JFrame {

    DefaultTableModel tableKH;

    /**
     * Creates new form frmLietKeKhachHang
     */
    public frmLietKeTaiKhoan() {
        initComponents();
        tableKH = (DefaultTableModel) tbl_kh.getModel();
        setExtendedState(frmLietKeTaiKhoan.MAXIMIZED_BOTH);

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
        btnLIETKE = new javax.swing.JButton();
        dateTUNGAY = new com.toedter.calendar.JDateChooser();
        dateDENNGAY = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLIETKE1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnLKALL = new javax.swing.JButton();
        btnIN = new javax.swing.JButton();
        pn_in = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_kh = new javax.swing.JTable();
        lb_ten = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        btnLIETKE.setText("LIỆT KÊ TẠI CHI NHÁNH");
        btnLIETKE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLIETKEActionPerformed(evt);
            }
        });

        dateTUNGAY.setDateFormatString("yyyy-MM-dd");

        dateDENNGAY.setDateFormatString("yyyy-MM-dd");

        jLabel2.setText("ĐẾN NGÀY:");

        jLabel3.setText("TỪ  NGÀY:");

        btnLIETKE1.setText("RESET");
        btnLIETKE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLIETKE1ActionPerformed(evt);
            }
        });

        jButton5.setText("HOME");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnLKALL.setText("LIỆT KÊ TẤT CẢ CHI NHÁNH");
        btnLKALL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLKALLActionPerformed(evt);
            }
        });

        btnIN.setText("IN");
        btnIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINActionPerformed(evt);
            }
        });

        pn_in.setBackground(new java.awt.Color(204, 255, 255));

        tbl_kh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "SOTK", "NGAYMOTK", "MACN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_kh);

        lb_ten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_ten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_ten.setText("LIỆT KÊ TÀI KHOẢN KHÁCH HÀNG");

        javax.swing.GroupLayout pn_inLayout = new javax.swing.GroupLayout(pn_in);
        pn_in.setLayout(pn_inLayout);
        pn_inLayout.setHorizontalGroup(
            pn_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_inLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_inLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(pn_inLayout.createSequentialGroup()
                        .addComponent(lb_ten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(172, 172, 172))))
        );
        pn_inLayout.setVerticalGroup(
            pn_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_inLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(dateTUNGAY, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel2)
                                        .addGap(40, 40, 40)
                                        .addComponent(dateDENNGAY, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(209, 209, 209)
                                        .addComponent(btnLIETKE)
                                        .addGap(38, 38, 38)
                                        .addComponent(btnLKALL))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(590, 590, 590)
                                .addComponent(btnLIETKE1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 487, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pn_in, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(487, 487, 487)
                    .addComponent(btnIN, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(798, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dateTUNGAY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateDENNGAY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLIETKE, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLKALL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnLIETKE1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(522, Short.MAX_VALUE)
                    .addComponent(btnIN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(261, 261, 261)))
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

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLIETKEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLIETKEActionPerformed
        String TUNGAY = new SimpleDateFormat("yyyy-MM-dd").format(dateTUNGAY.getDate());
        String DENNGAY = new SimpleDateFormat("yyyy-MM-dd").format(dateDENNGAY.getDate());
        List<LietKeTaiKhoan> list = LietKeDao.exec_SaoKeGD(TUNGAY, DENNGAY, 0);
        tableKH.setRowCount(0);
        int dem = 1;
        if(lb_ten.getText() != null){
            lb_ten.setText("SAO KÊ TÀI KHOẢN TỪ NGÀY " + TUNGAY + " ĐẾN NGÀY " + DENNGAY);
        }
        for (LietKeTaiKhoan sk : list) {
            tableKH.addRow(new Object[]{dem++, sk.getSOTK(), sk.getNGAYMOTK(), sk.getMACN()});
        }
        btnLIETKE.setEnabled(false);
        btnLKALL.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btnLIETKEActionPerformed

    private void btnLIETKE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLIETKE1ActionPerformed
       DefaultTableModel model = (DefaultTableModel) tbl_kh.getModel();
       model.setRowCount(0);
       dateDENNGAY.setDate(null);
       dateTUNGAY.setDate(null);
       btnLIETKE.setEnabled(true);
       btnLKALL.setEnabled(true);
       lb_ten.setText("LIỆT KÊ TÀI KHOẢN");
 // TODO add your handling code here:
    }//GEN-LAST:event_btnLIETKE1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        frmHome home = new frmHome();
        home.setLocationRelativeTo(null);
        home.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnLKALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLKALLActionPerformed
 String TUNGAY = new SimpleDateFormat("yyyy-MM-dd").format(dateTUNGAY.getDate());
        String DENNGAY = new SimpleDateFormat("yyyy-MM-dd").format(dateDENNGAY.getDate());
        List<LietKeTaiKhoan> list = LietKeDao.exec_SaoKeGD(TUNGAY, DENNGAY, 1);
        tableKH.setRowCount(0);
        int dem = 1;
        if(lb_ten.getText() != null){
            lb_ten.setText("SAO KÊ TÀI KHOẢN TỪ NGÀY " + TUNGAY + " ĐẾN NGÀY " + DENNGAY);
        }
        for (LietKeTaiKhoan sk : list) {
            tableKH.addRow(new Object[]{dem++, sk.getSOTK(), sk.getNGAYMOTK(), sk.getMACN()});
        }
        btnLKALL.setEnabled(false); 
btnLIETKE.setEnabled(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnLKALLActionPerformed

    private void btnINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINActionPerformed
 PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Print Data");

        job.setPrintable(new Printable() {
            public int print(Graphics pg, PageFormat pf, int pageNum) {
                pf.setOrientation(PageFormat.LANDSCAPE);
                if (pageNum > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                double panelWidth = pn_in.getWidth();
                double panelHeight = pn_in.getHeight();
                double pageWidth = pf.getImageableWidth();
                double pageHeight = pf.getImageableHeight();

                // Tính toán tỷ lệ in dựa trên chiều dài và chiều rộng của pn_in và pf.getImageableHeight()
                double scale = Math.min(pageHeight / panelHeight, pageWidth / panelWidth);

                Graphics2D g2 = (Graphics2D) pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(scale - 0.1, scale);

                pn_in.paint(g2);

                return Printable.PAGE_EXISTS;
            }
        });

        boolean ok = job.printDialog();
        if (ok) {
            try {
                job.print();
            } catch (PrinterException ex) {
                // Xử lý ngoại lệ in
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnINActionPerformed

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
            java.util.logging.Logger.getLogger(frmLietKeTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLietKeTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLietKeTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLietKeTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLietKeTaiKhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIN;
    private javax.swing.JButton btnLIETKE;
    private javax.swing.JButton btnLIETKE1;
    private javax.swing.JButton btnLKALL;
    private com.toedter.calendar.JDateChooser dateDENNGAY;
    private com.toedter.calendar.JDateChooser dateTUNGAY;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_ten;
    private javax.swing.JPanel pn_in;
    private javax.swing.JTable tbl_kh;
    // End of variables declaration//GEN-END:variables
}
