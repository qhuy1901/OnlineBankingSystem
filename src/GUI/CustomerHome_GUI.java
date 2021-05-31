package GUI;

import BUS.CustomerHome_BUS;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import javax.swing.JOptionPane;

public class CustomerHome_GUI extends javax.swing.JFrame 
{
    CustomerHome_BUS busCustomer = new CustomerHome_BUS();
    Customer_DTO dtoCustomer = null; // Người đang đăng nhập hệ thống
   
    public CustomerHome_GUI(Customer_DTO customer) 
    {
        initComponents();
        setLocationRelativeTo(null);
        setSize(1064, 650);
        setVisible(true);
        dtoCustomer = customer;
        lblHelloCustomer.setText("         Hello " + dtoCustomer.getFirstName() + " " + dtoCustomer.getLastName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        lblHelloCustomer = new javax.swing.JLabel();
        pnlBackground_Customer = new javax.swing.JPanel();
        btnMyWallet = new javax.swing.JButton();
        btnTransfer = new javax.swing.JButton();
        btnSaving = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Home");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/MenuIcon_118px.png"))); // NOI18N
        getContentPane().add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 120, 130));

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
        lblHelloCustomer.setText("          Customer Portal");
        lblHelloCustomer.setOpaque(true);
        getContentPane().add(lblHelloCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 35, 980, 80));

        pnlBackground_Customer.setBackground(new java.awt.Color(239, 250, 252));

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("VietcomBank");
        jLabel6.setPreferredSize(new java.awt.Dimension(250, 44));
        jPanel2.add(jLabel6);

        javax.swing.GroupLayout pnlBackground_CustomerLayout = new javax.swing.GroupLayout(pnlBackground_Customer);
        pnlBackground_Customer.setLayout(pnlBackground_CustomerLayout);
        pnlBackground_CustomerLayout.setHorizontalGroup(
            pnlBackground_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackground_CustomerLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(pnlBackground_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMyWallet, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaving, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(pnlBackground_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        pnlBackground_CustomerLayout.setVerticalGroup(
            pnlBackground_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackground_CustomerLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(pnlBackground_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBackground_CustomerLayout.createSequentialGroup()
                        .addGroup(pnlBackground_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMyWallet, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(pnlBackground_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSaving, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );

        getContentPane().add(pnlBackground_Customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1064, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LogIn_GUI guiLogIn = new LogIn_GUI();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnMyWalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyWalletActionPerformed
        Account_DTO dtoAccount = busCustomer.getPaymentAccount(dtoCustomer);
        this.setVisible(false);
        new MyWallet_GUI(dtoCustomer, dtoAccount);
    }//GEN-LAST:event_btnMyWalletActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        Account_DTO dtoAccount = busCustomer.getPaymentAccount(dtoCustomer);
        if(dtoAccount.getStatus().equals("Active"))
        {
            this.setVisible(false);
            new Transfer_GUI(dtoCustomer, dtoAccount);
        }
        else
            JOptionPane.showMessageDialog(this, "Your payment account is locked. You cannot make any transactions", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnTransferActionPerformed

    private void btnSavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavingActionPerformed
        Account_DTO dtoAccount = busCustomer.getPaymentAccount(dtoCustomer);
        if(dtoAccount.getStatus().equals("Active"))
        {
            this.setVisible(false);
            new Saving_GUI(dtoCustomer, dtoAccount);
        }
        else
            JOptionPane.showMessageDialog(this, "Your payment account is locked. You cannot make any transactions", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnSavingActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        Account_DTO dtoAccount = busCustomer.getPaymentAccount(dtoCustomer);
        if(dtoAccount.getStatus().equals("Active"))
        {
            this.setVisible(false);
            new Payment_GUI(dtoCustomer, dtoAccount);
        }
        else
            JOptionPane.showMessageDialog(this, "Your payment account is locked. You cannot make any transactions", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnPaymentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMyWallet;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnSaving;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblHelloCustomer;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JPanel pnlBackground_Customer;
    // End of variables declaration//GEN-END:variables
}
