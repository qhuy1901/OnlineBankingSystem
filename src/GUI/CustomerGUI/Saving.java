package GUI.CustomerGUI;

import BUS.Saving_BUS;
import DTO.Customer_DTO;
import GUI.Customer_GUI;
import GUI.LogIn;

public class Saving extends javax.swing.JFrame 
{
    Saving_BUS busSaving = new Saving_BUS();
    Customer_DTO dtoCustomer = null;
    
    public Saving(Customer_DTO customer) 
    {
        initComponents();
        setLocationRelativeTo(null);
        setSize(1064, 650);
        setVisible(true);
        dtoCustomer = customer;
        txtTotalSavingAccount.setText(String.valueOf(busSaving.getTotalSavingAccount(dtoCustomer)));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        WithdrawOnlineSavings = new javax.swing.JPanel();
        btnLogout1 = new javax.swing.JButton();
        btnHome1 = new javax.swing.JButton();
        lblIcon = new javax.swing.JLabel();
        lblTit = new javax.swing.JLabel();
        btnConfirm_Water = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblDebitAccount2 = new javax.swing.JLabel();
        txtTotalSavingAccount = new javax.swing.JFormattedTextField();
        OpenOnlineSavings = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblIcon1 = new javax.swing.JLabel();
        lblTit1 = new javax.swing.JLabel();
        lblDebitAccount = new javax.swing.JLabel();
        lblTerm = new javax.swing.JLabel();
        lblAvailableBalanceDataBase = new javax.swing.JLabel();
        lblVND = new javax.swing.JLabel();
        jcbChooseTerm = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jcbChooseTerm1 = new javax.swing.JComboBox<>();
        tbtConfirm2 = new javax.swing.JButton();
        btnAdd3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lblDebitAccount3 = new javax.swing.JLabel();
        lblDebitAccount5 = new javax.swing.JLabel();
        lblDebitAccount6 = new javax.swing.JLabel();
        lblDebitAccount7 = new javax.swing.JLabel();
        lblDebitAccount8 = new javax.swing.JLabel();
        lblDebitAccount9 = new javax.swing.JLabel();
        lblDebitAccount10 = new javax.swing.JLabel();
        lblDebitAccount4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        WithdrawOnlineSavings.setBackground(new java.awt.Color(239, 250, 252));
        WithdrawOnlineSavings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout1.setBackground(new java.awt.Color(32, 172, 216));
        btnLogout1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLogout1.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Logout.png"))); // NOI18N
        btnLogout1.setText("Logout");
        btnLogout1.setToolTipText("");
        btnLogout1.setBorder(null);
        btnLogout1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout1.setIconTextGap(0);
        btnLogout1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });
        WithdrawOnlineSavings.add(btnLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 77, 58));

        btnHome1.setBackground(new java.awt.Color(32, 172, 216));
        btnHome1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome1.setForeground(new java.awt.Color(255, 255, 255));
        btnHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
        btnHome1.setText("Home");
        btnHome1.setToolTipText("");
        btnHome1.setBorder(null);
        btnHome1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome1.setIconTextGap(1);
        btnHome1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome1ActionPerformed(evt);
            }
        });
        WithdrawOnlineSavings.add(btnHome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 76, 58));
        WithdrawOnlineSavings.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 100, 110));

        lblTit.setBackground(new java.awt.Color(32, 172, 216));
        lblTit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTit.setForeground(new java.awt.Color(255, 255, 255));
        lblTit.setText("         Withdrawal Online Savings");
        lblTit.setOpaque(true);
        lblTit.setPreferredSize(new java.awt.Dimension(34, 50));
        WithdrawOnlineSavings.add(lblTit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 940, 66));

        btnConfirm_Water.setBackground(new java.awt.Color(32, 172, 216));
        btnConfirm_Water.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnConfirm_Water.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm_Water.setText("Settlement");
        btnConfirm_Water.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirm_WaterActionPerformed(evt);
            }
        });
        WithdrawOnlineSavings.add(btnConfirm_Water, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 130, 40));

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

        WithdrawOnlineSavings.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 160, 750, 260));

        lblDebitAccount2.setBackground(new java.awt.Color(32, 172, 216));
        lblDebitAccount2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblDebitAccount2.setForeground(new java.awt.Color(32, 172, 216));
        lblDebitAccount2.setText("Total Saving Account:");
        WithdrawOnlineSavings.add(lblDebitAccount2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        txtTotalSavingAccount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        WithdrawOnlineSavings.add(txtTotalSavingAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 230, 30));

        jTabbedPane1.addTab("View Online Savings Information", WithdrawOnlineSavings);

        OpenOnlineSavings.setBackground(new java.awt.Color(239, 250, 252));
        OpenOnlineSavings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setBackground(new java.awt.Color(32, 172, 216));
        btnHome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setToolTipText("");
        btnHome.setBorder(null);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setIconTextGap(1);
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        OpenOnlineSavings.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 76, 58));

        btnLogout.setBackground(new java.awt.Color(32, 172, 216));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setToolTipText("");
        btnLogout.setBorder(null);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setIconTextGap(0);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        OpenOnlineSavings.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 77, 58));

        lblIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/customergui_tietkiem.png"))); // NOI18N
        OpenOnlineSavings.add(lblIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 110));

        lblTit1.setBackground(new java.awt.Color(32, 172, 216));
        lblTit1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTit1.setForeground(new java.awt.Color(255, 255, 255));
        lblTit1.setText("         Open Online Savings Account");
        lblTit1.setOpaque(true);
        lblTit1.setPreferredSize(new java.awt.Dimension(34, 50));
        OpenOnlineSavings.add(lblTit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 970, 66));

        lblDebitAccount.setBackground(new java.awt.Color(32, 172, 216));
        lblDebitAccount.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        lblDebitAccount.setForeground(new java.awt.Color(32, 172, 216));
        lblDebitAccount.setText("Deposits:");
        OpenOnlineSavings.add(lblDebitAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        lblTerm.setBackground(new java.awt.Color(32, 172, 216));
        lblTerm.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        lblTerm.setForeground(new java.awt.Color(32, 172, 216));
        lblTerm.setText("Term:");
        OpenOnlineSavings.add(lblTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        lblAvailableBalanceDataBase.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblAvailableBalanceDataBase.setForeground(new java.awt.Color(1, 1, 1));
        OpenOnlineSavings.add(lblAvailableBalanceDataBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 260, 30));

        lblVND.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblVND.setForeground(new java.awt.Color(32, 172, 216));
        lblVND.setText("VND");
        OpenOnlineSavings.add(lblVND, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, -1, -1));

        jcbChooseTerm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbChooseTerm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Term Savings Account", "Non-term Savings Account" }));
        OpenOnlineSavings.add(jcbChooseTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 170, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(1, 1, 1));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        OpenOnlineSavings.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 310, -1));

        jcbChooseTerm1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbChooseTerm1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 month", "3 months", "6 months" }));
        jcbChooseTerm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbChooseTerm1ActionPerformed(evt);
            }
        });
        OpenOnlineSavings.add(jcbChooseTerm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 170, -1));

        tbtConfirm2.setBackground(new java.awt.Color(32, 172, 216));
        tbtConfirm2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbtConfirm2.setForeground(new java.awt.Color(255, 255, 255));
        tbtConfirm2.setText("Find Suitable Product");
        tbtConfirm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtConfirm2ActionPerformed(evt);
            }
        });
        OpenOnlineSavings.add(tbtConfirm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, -1, 30));

        btnAdd3.setBackground(new java.awt.Color(32, 172, 216));
        btnAdd3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd3.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/plus_25px.png"))); // NOI18N
        btnAdd3.setText("Open Account");
        btnAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd3ActionPerformed(evt);
            }
        });
        OpenOnlineSavings.add(btnAdd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(873, 170, 160, -1));
        OpenOnlineSavings.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 710, 10));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDebitAccount3.setBackground(new java.awt.Color(32, 172, 216));
        lblDebitAccount3.setFont(new java.awt.Font("Segoe UI", 2, 17)); // NOI18N
        lblDebitAccount3.setForeground(new java.awt.Color(32, 172, 216));
        lblDebitAccount3.setText("Maturity date:");
        jPanel1.add(lblDebitAccount3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        lblDebitAccount5.setBackground(new java.awt.Color(32, 172, 216));
        lblDebitAccount5.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        lblDebitAccount5.setForeground(new java.awt.Color(32, 172, 216));
        lblDebitAccount5.setText("Suitable Product Details:");
        jPanel1.add(lblDebitAccount5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblDebitAccount6.setBackground(new java.awt.Color(32, 172, 216));
        lblDebitAccount6.setFont(new java.awt.Font("Segoe UI", 2, 17)); // NOI18N
        lblDebitAccount6.setForeground(new java.awt.Color(32, 172, 216));
        lblDebitAccount6.setText("Interest rate:");
        jPanel1.add(lblDebitAccount6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        lblDebitAccount7.setBackground(new java.awt.Color(32, 172, 216));
        lblDebitAccount7.setFont(new java.awt.Font("Segoe UI", 2, 17)); // NOI18N
        lblDebitAccount7.setForeground(new java.awt.Color(32, 172, 216));
        lblDebitAccount7.setText("Total: ");
        jPanel1.add(lblDebitAccount7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        lblDebitAccount8.setBackground(new java.awt.Color(32, 172, 216));
        lblDebitAccount8.setFont(new java.awt.Font("Segoe UI", 2, 17)); // NOI18N
        lblDebitAccount8.setForeground(new java.awt.Color(32, 172, 216));
        lblDebitAccount8.setText("Start day:");
        jPanel1.add(lblDebitAccount8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        lblDebitAccount9.setBackground(new java.awt.Color(32, 172, 216));
        lblDebitAccount9.setFont(new java.awt.Font("Segoe UI", 2, 17)); // NOI18N
        lblDebitAccount9.setForeground(new java.awt.Color(32, 172, 216));
        lblDebitAccount9.setText("NAME");
        jPanel1.add(lblDebitAccount9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        lblDebitAccount10.setBackground(new java.awt.Color(32, 172, 216));
        lblDebitAccount10.setFont(new java.awt.Font("Segoe UI", 2, 17)); // NOI18N
        lblDebitAccount10.setForeground(new java.awt.Color(32, 172, 216));
        lblDebitAccount10.setText("Anticipated Interest:");
        jPanel1.add(lblDebitAccount10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        OpenOnlineSavings.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 710, 200));

        lblDebitAccount4.setBackground(new java.awt.Color(32, 172, 216));
        lblDebitAccount4.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        lblDebitAccount4.setForeground(new java.awt.Color(32, 172, 216));
        lblDebitAccount4.setText("Saving Account Type:");
        OpenOnlineSavings.add(lblDebitAccount4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jTabbedPane1.addTab("Open Online Savings", OpenOnlineSavings);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
        LogIn guiLogIn= new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogout1ActionPerformed

    private void btnHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome1ActionPerformed
        new Customer_GUI(dtoCustomer);
        this.setVisible(false);
    }//GEN-LAST:event_btnHome1ActionPerformed

    private void btnConfirm_WaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirm_WaterActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnConfirm_WaterActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        new Customer_GUI(dtoCustomer);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LogIn guiLogIn= new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void tbtConfirm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtConfirm2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtConfirm2ActionPerformed

    private void btnAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd3ActionPerformed

    private void jcbChooseTerm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbChooseTerm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbChooseTerm1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OpenOnlineSavings;
    private javax.swing.JPanel WithdrawOnlineSavings;
    private javax.swing.JButton btnAdd3;
    private javax.swing.JButton btnConfirm_Water;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHome1;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnLogout1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox<String> jcbChooseTerm;
    private javax.swing.JComboBox<String> jcbChooseTerm1;
    private javax.swing.JLabel lblAvailableBalanceDataBase;
    private javax.swing.JLabel lblDebitAccount;
    private javax.swing.JLabel lblDebitAccount10;
    private javax.swing.JLabel lblDebitAccount2;
    private javax.swing.JLabel lblDebitAccount3;
    private javax.swing.JLabel lblDebitAccount4;
    private javax.swing.JLabel lblDebitAccount5;
    private javax.swing.JLabel lblDebitAccount6;
    private javax.swing.JLabel lblDebitAccount7;
    private javax.swing.JLabel lblDebitAccount8;
    private javax.swing.JLabel lblDebitAccount9;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblTerm;
    private javax.swing.JLabel lblTit;
    private javax.swing.JLabel lblTit1;
    private javax.swing.JLabel lblVND;
    private javax.swing.JButton tbtConfirm2;
    private javax.swing.JFormattedTextField txtTotalSavingAccount;
    // End of variables declaration//GEN-END:variables
}
