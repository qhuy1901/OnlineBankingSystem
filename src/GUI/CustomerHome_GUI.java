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
        dtoCustomer = customer;
        
        /*Set giao diện*/
        setSize(1064, 650); // Set kích thước giao diện
        setResizable(false); // Không cho phóng to
        setTitle("Customer Home"); // Set tiêu đề
        setLocation(225,70); // Set vị trí trang
        setVisible(true); // Hiển thị giao diện
        
        // Show customer's name
        lblHelloCustomer.setText("         Hello " + dtoCustomer.getFirstName() + " " + dtoCustomer.getLastName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        lblHelloCustomer = new javax.swing.JLabel();
        pnlBackground = new javax.swing.JPanel();
        btnMyWallet = new javax.swing.JButton();
        btnTransfer = new javax.swing.JButton();
        btnSaving = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnPersonalInfo = new javax.swing.JButton();

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

        pnlBackground.setBackground(new java.awt.Color(239, 250, 252));

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

        btnPersonalInfo.setBackground(new java.awt.Color(255, 255, 255));
        btnPersonalInfo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPersonalInfo.setForeground(new java.awt.Color(32, 172, 210));
        btnPersonalInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/personalInformation_icon.png"))); // NOI18N
        btnPersonalInfo.setText("Personal Info");
        btnPersonalInfo.setBorder(null);
        btnPersonalInfo.setBorderPainted(false);
        btnPersonalInfo.setDefaultCapable(false);
        btnPersonalInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPersonalInfo.setMargin(new java.awt.Insets(0, 14, 30, 14));
        btnPersonalInfo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPersonalInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnMyWallet, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(btnSaving, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPersonalInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(btnMyWallet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTransfer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSaving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPersonalInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1064, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // Show Logout interface 
        setVisible(false);
        new LogIn_GUI();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnMyWalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyWalletActionPerformed
        // Get account information
        Account_DTO dtoAccount = busCustomer.getPaymentAccount(dtoCustomer);
        
        // Show MyWallet interface 
        setVisible(false);
        new MyWallet_GUI(dtoCustomer, dtoAccount);
    }//GEN-LAST:event_btnMyWalletActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        // Get account information
        Account_DTO dtoAccount = busCustomer.getPaymentAccount(dtoCustomer);
        
        // Check the account's status
        if(dtoAccount.getStatus().equals("Active"))
        {
            // Show Transfer interface 
            setVisible(false);
            new Transfer_GUI(dtoCustomer, dtoAccount);
        }
        else
            JOptionPane.showMessageDialog(this, "Your payment account is locked. You cannot make any transactions", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnTransferActionPerformed

    private void btnSavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavingActionPerformed
        // Get account information
        Account_DTO dtoAccount = busCustomer.getPaymentAccount(dtoCustomer);
        
        // Check the account's status
        if(dtoAccount.getStatus().equals("Active"))
        {
            // Show Saving interface
            setVisible(false);
            new Saving_GUI(dtoCustomer, dtoAccount);
        }
        else
            JOptionPane.showMessageDialog(this, "Your payment account is locked. You cannot make any transactions", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnSavingActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        // Get account information
        Account_DTO dtoAccount = busCustomer.getPaymentAccount(dtoCustomer);
        
        // Check the account's status
        if(dtoAccount.getStatus().equals("Active"))
        {
            // Show Payment interface
            setVisible(false);
            new Payment_GUI(dtoCustomer, dtoAccount);
        }
        else
            JOptionPane.showMessageDialog(this, "Your payment account is locked. You cannot make any transactions", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnPersonalInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalInfoActionPerformed
        setVisible(false);
        new PersonalInformation_GUI(dtoCustomer);
    }//GEN-LAST:event_btnPersonalInfoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMyWallet;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnPersonalInfo;
    private javax.swing.JButton btnSaving;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblHelloCustomer;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables
}
