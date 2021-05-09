package GUI;

import BUS.Customer_BUS;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import GUI.CustomerGUI.MyWallet;
import GUI.CustomerGUI.Payment;
import GUI.CustomerGUI.TransferForm;

public class Customer_GUI extends javax.swing.JFrame 
{
    Customer_BUS busCustomer= new Customer_BUS();
    Customer_DTO dtoCustomer = null; // Người đang đăng nhập hệ thống
   
    public Customer_GUI(Customer_DTO customer) 
    {
        initComponents();
        setLocationRelativeTo(null);
        setSize(1064, 650);
        setVisible(true);
        dtoCustomer = customer;
        lblHelloCustomer.setText("        Hello " + dtoCustomer.getLastName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        lblHelloCustomer = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnMyWallet = new javax.swing.JButton();
        btnTransfer = new javax.swing.JButton();
        btnSaving = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/FontAwesome_f007(0)_128.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnLogOut.setBackground(new java.awt.Color(239, 250, 252));
        btnLogOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(32, 172, 210));
        btnLogOut.setText("Log out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 150, 40));

        lblHelloCustomer.setBackground(new java.awt.Color(32, 172, 210));
        lblHelloCustomer.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblHelloCustomer.setForeground(new java.awt.Color(239, 250, 252));
        lblHelloCustomer.setText("        Chúc quý khách một ngày tốt lành!");
        lblHelloCustomer.setOpaque(true);
        getContentPane().add(lblHelloCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 35, 1010, 80));

        jPanel1.setBackground(new java.awt.Color(239, 250, 252));

        btnMyWallet.setBackground(new java.awt.Color(255, 255, 255));
        btnMyWallet.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMyWallet.setForeground(new java.awt.Color(32, 172, 210));
        btnMyWallet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/customergui_vicuatoi.png"))); // NOI18N
        btnMyWallet.setText("My Wallet");
        btnMyWallet.setBorder(null);
        btnMyWallet.setBorderPainted(false);
        btnMyWallet.setDefaultCapable(false);
        btnMyWallet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMyWallet.setMargin(new java.awt.Insets(0, 14, 30, 14));
        btnMyWallet.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMyWallet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyWalletActionPerformed(evt);
            }
        });

        btnTransfer.setBackground(new java.awt.Color(255, 255, 255));
        btnTransfer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnTransfer.setForeground(new java.awt.Color(32, 172, 210));
        btnTransfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/customergui_chyentien.png"))); // NOI18N
        btnTransfer.setText("Transfer");
        btnTransfer.setBorder(null);
        btnTransfer.setBorderPainted(false);
        btnTransfer.setDefaultCapable(false);
        btnTransfer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTransfer.setMargin(new java.awt.Insets(0, 14, 30, 14));
        btnTransfer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        btnSaving.setBackground(new java.awt.Color(255, 255, 255));
        btnSaving.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSaving.setForeground(new java.awt.Color(32, 172, 210));
        btnSaving.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/customergui_tietkiem.png"))); // NOI18N
        btnSaving.setText("Saving");
        btnSaving.setBorder(null);
        btnSaving.setBorderPainted(false);
        btnSaving.setDefaultCapable(false);
        btnSaving.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSaving.setMargin(new java.awt.Insets(0, 14, 30, 14));
        btnSaving.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSaving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavingActionPerformed(evt);
            }
        });

        btnPayment.setBackground(new java.awt.Color(255, 255, 255));
        btnPayment.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPayment.setForeground(new java.awt.Color(32, 172, 210));
        btnPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/customergui_thanhtoan.png"))); // NOI18N
        btnPayment.setText("Payment");
        btnPayment.setBorder(null);
        btnPayment.setBorderPainted(false);
        btnPayment.setDefaultCapable(false);
        btnPayment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPayment.setMargin(new java.awt.Insets(0, 14, 30, 14));
        btnPayment.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(32, 172, 210));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Welcome");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel2.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("to");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setFocusTraversalPolicyProvider(true);
        jLabel5.setPreferredSize(new java.awt.Dimension(50, 190));
        jPanel2.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("NK Bank");
        jLabel6.setPreferredSize(new java.awt.Dimension(250, 44));
        jPanel2.add(jLabel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMyWallet, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaving, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMyWallet, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSaving, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1064, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        LogIn guiLogIn= new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnMyWalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyWalletActionPerformed
        new MyWallet();
        this.setVisible(false);
    }//GEN-LAST:event_btnMyWalletActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        Account_DTO dtoAccount = busCustomer.getPaymentAccount(dtoCustomer);
        TransferForm guiTransfer = new TransferForm(dtoCustomer, dtoAccount);
        this.setVisible(false);
    }//GEN-LAST:event_btnTransferActionPerformed

    private void btnSavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSavingActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        Account_DTO dtoAccount = busCustomer.getPaymentAccount(dtoCustomer);
        new Payment(dtoAccount);
        this.setVisible(false);
    }//GEN-LAST:event_btnPaymentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMyWallet;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnSaving;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblHelloCustomer;
    // End of variables declaration//GEN-END:variables
}
