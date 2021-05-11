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
        jcbOnlineSavingsAccount = new javax.swing.JComboBox<>();
        jcbCreditAccount = new javax.swing.JComboBox<>();
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
        jcbChooseDebitAccount = new javax.swing.JComboBox<>();
        lblAvailableBalance = new javax.swing.JLabel();
        lblSavingIn4 = new javax.swing.JLabel();
        lblTerm = new javax.swing.JLabel();
        lblMaturityMethod = new javax.swing.JLabel();
        lblAvailableBalanceDataBase = new javax.swing.JLabel();
        lblVND = new javax.swing.JLabel();
        tbtConfirm1 = new javax.swing.JButton();
        jcbChooseTerm = new javax.swing.JComboBox<>();
        jcbChooseMaturityMethod = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        lblSavingAmount1 = new javax.swing.JLabel();
        lblVND1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

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

        jcbOnlineSavingsAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbOnlineSavingsAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOnlineSavingsAccountActionPerformed(evt);
            }
        });
        WithdrawOnlineSavings.add(jcbOnlineSavingsAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, 220, -1));

        jcbCreditAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        WithdrawOnlineSavings.add(jcbCreditAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 570, 220, -1));

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
        lblDebitAccount.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblDebitAccount.setForeground(new java.awt.Color(32, 172, 216));
        lblDebitAccount.setText("Debit Account:");
        OpenOnlineSavings.add(lblDebitAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jcbChooseDebitAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OpenOnlineSavings.add(jcbChooseDebitAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 470, -1));

        lblAvailableBalance.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblAvailableBalance.setForeground(new java.awt.Color(1, 1, 1));
        lblAvailableBalance.setText("Available Balance");
        OpenOnlineSavings.add(lblAvailableBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        lblSavingIn4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblSavingIn4.setForeground(new java.awt.Color(1, 1, 1));
        lblSavingIn4.setText("Saving information");
        OpenOnlineSavings.add(lblSavingIn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        lblTerm.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblTerm.setForeground(new java.awt.Color(1, 1, 1));
        lblTerm.setText("Term");
        OpenOnlineSavings.add(lblTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        lblMaturityMethod.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblMaturityMethod.setForeground(new java.awt.Color(1, 1, 1));
        lblMaturityMethod.setText("Maturity method");
        OpenOnlineSavings.add(lblMaturityMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        lblAvailableBalanceDataBase.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblAvailableBalanceDataBase.setForeground(new java.awt.Color(1, 1, 1));
        OpenOnlineSavings.add(lblAvailableBalanceDataBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 260, 30));

        lblVND.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblVND.setForeground(new java.awt.Color(1, 1, 1));
        lblVND.setText("VND");
        OpenOnlineSavings.add(lblVND, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, -1, -1));

        tbtConfirm1.setBackground(new java.awt.Color(32, 172, 216));
        tbtConfirm1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbtConfirm1.setForeground(new java.awt.Color(255, 255, 255));
        tbtConfirm1.setText("Confirm");
        tbtConfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtConfirm1ActionPerformed(evt);
            }
        });
        OpenOnlineSavings.add(tbtConfirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, -1, -1));

        jcbChooseTerm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OpenOnlineSavings.add(jcbChooseTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 170, -1));

        jcbChooseMaturityMethod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OpenOnlineSavings.add(jcbChooseMaturityMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 170, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(1, 1, 1));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        OpenOnlineSavings.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 310, -1));

        lblSavingAmount1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblSavingAmount1.setForeground(new java.awt.Color(1, 1, 1));
        lblSavingAmount1.setText("Saving amount");
        OpenOnlineSavings.add(lblSavingAmount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        lblVND1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblVND1.setForeground(new java.awt.Color(1, 1, 1));
        lblVND1.setText("VND");
        OpenOnlineSavings.add(lblVND1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, -1, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(1, 1, 1));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        OpenOnlineSavings.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 310, -1));

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

    private void tbtConfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtConfirm1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tbtConfirm1ActionPerformed

    private void jcbOnlineSavingsAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOnlineSavingsAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbOnlineSavingsAccountActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OpenOnlineSavings;
    private javax.swing.JPanel WithdrawOnlineSavings;
    private javax.swing.JButton btnConfirm_Water;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHome1;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnLogout1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox<String> jcbChooseDebitAccount;
    private javax.swing.JComboBox<String> jcbChooseMaturityMethod;
    private javax.swing.JComboBox<String> jcbChooseTerm;
    private javax.swing.JComboBox<String> jcbCreditAccount;
    private javax.swing.JComboBox<String> jcbOnlineSavingsAccount;
    private javax.swing.JLabel lblAvailableBalance;
    private javax.swing.JLabel lblAvailableBalanceDataBase;
    private javax.swing.JLabel lblDebitAccount;
    private javax.swing.JLabel lblDebitAccount2;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblMaturityMethod;
    private javax.swing.JLabel lblSavingAmount1;
    private javax.swing.JLabel lblSavingIn4;
    private javax.swing.JLabel lblTerm;
    private javax.swing.JLabel lblTit;
    private javax.swing.JLabel lblTit1;
    private javax.swing.JLabel lblVND;
    private javax.swing.JLabel lblVND1;
    private javax.swing.JButton tbtConfirm1;
    private javax.swing.JFormattedTextField txtTotalSavingAccount;
    // End of variables declaration//GEN-END:variables
}
