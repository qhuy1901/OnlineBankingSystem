package GUI;

import BUS.Deposit_BUS;
import DTO.Account_DTO;
import DTO.Admin_DTO;
import DTO.Customer_DTO;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class Deposit_GUI extends javax.swing.JFrame {

    Deposit_BUS busDeposit = new Deposit_BUS();
    Admin_DTO dtoAdmin = null;
    ButtonGroup radioGroup;
    public Deposit_GUI(Admin_DTO admin) 
    {
        initComponents();
        setSize(1064,650);
        setLocationRelativeTo(null);
        setResizable(false);
        setupRadioButtonGroup();
        dtoAdmin  = admin;
        setVisible(true);
    }

    public void setupRadioButtonGroup()
    {
        radioGroup = new ButtonGroup();
        radioGroup.add(rbAccountOpening);
        radioGroup.add(rbDepositToAccount);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Panel_OpenAccount = new javax.swing.JPanel();
        btnHome_OpenAccount = new javax.swing.JButton();
        lbCustomerID_OpenAccount = new javax.swing.JLabel();
        lbAmount_OpenAccount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        btnActivate_OpenAccount = new javax.swing.JButton();
        lbIcon_OpenAccount = new javax.swing.JLabel();
        lbOpenAccount = new javax.swing.JLabel();
        txtBeneficiaryName = new javax.swing.JTextField();
        lbCustomerID_OpenAccount1 = new javax.swing.JLabel();
        lblPaymentAccountInformation = new javax.swing.JLabel();
        lbCustomerID_OpenAccount3 = new javax.swing.JLabel();
        rbDepositToAccount = new javax.swing.JRadioButton();
        rbAccountOpening = new javax.swing.JRadioButton();
        lblPaymentAccountInformation1 = new javax.swing.JLabel();
        txtAccountID = new javax.swing.JTextField();
        lbCustomerID_OpenAccount4 = new javax.swing.JLabel();
        txtCustomer_ID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Deposit");

        Panel_OpenAccount.setBackground(new java.awt.Color(239, 250, 252));
        Panel_OpenAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome_OpenAccount.setBackground(new java.awt.Color(32, 172, 216));
        btnHome_OpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome_OpenAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnHome_OpenAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
        btnHome_OpenAccount.setText("Home");
        btnHome_OpenAccount.setToolTipText("");
        btnHome_OpenAccount.setBorder(null);
        btnHome_OpenAccount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome_OpenAccount.setIconTextGap(1);
        btnHome_OpenAccount.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome_OpenAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome_OpenAccountActionPerformed(evt);
            }
        });
        Panel_OpenAccount.add(btnHome_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 76, 58));

        lbCustomerID_OpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCustomerID_OpenAccount.setForeground(new java.awt.Color(32, 172, 216));
        lbCustomerID_OpenAccount.setText("Beneficiary name: ");
        Panel_OpenAccount.add(lbCustomerID_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        lbAmount_OpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbAmount_OpenAccount.setForeground(new java.awt.Color(32, 172, 216));
        lbAmount_OpenAccount.setText("Amount:  ");
        Panel_OpenAccount.add(lbAmount_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        txtAmount.setEditable(false);
        txtAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmountKeyTyped(evt);
            }
        });
        Panel_OpenAccount.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 370, -1));

        btnActivate_OpenAccount.setBackground(new java.awt.Color(32, 172, 216));
        btnActivate_OpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnActivate_OpenAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnActivate_OpenAccount.setText("Deposit");
        btnActivate_OpenAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivate_OpenAccountActionPerformed(evt);
            }
        });
        Panel_OpenAccount.add(btnActivate_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 140, 40));

        lbIcon_OpenAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/AccountManagement_OpenAccount.png"))); // NOI18N
        Panel_OpenAccount.add(lbIcon_OpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 120, 110));

        lbOpenAccount.setBackground(new java.awt.Color(32, 172, 216));
        lbOpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbOpenAccount.setForeground(new java.awt.Color(255, 255, 255));
        lbOpenAccount.setText("          Deposit");
        lbOpenAccount.setOpaque(true);
        lbOpenAccount.setPreferredSize(new java.awt.Dimension(34, 50));
        Panel_OpenAccount.add(lbOpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 970, 66));

        txtBeneficiaryName.setEditable(false);
        txtBeneficiaryName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Panel_OpenAccount.add(txtBeneficiaryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 370, -1));

        lbCustomerID_OpenAccount1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbCustomerID_OpenAccount1.setForeground(new java.awt.Color(32, 172, 216));
        lbCustomerID_OpenAccount1.setText("Transaction Type:");
        Panel_OpenAccount.add(lbCustomerID_OpenAccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        lblPaymentAccountInformation.setBackground(new java.awt.Color(32, 172, 216));
        lblPaymentAccountInformation.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPaymentAccountInformation.setForeground(new java.awt.Color(32, 172, 216));
        lblPaymentAccountInformation.setText("Deposit Information:");
        Panel_OpenAccount.add(lblPaymentAccountInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        lbCustomerID_OpenAccount3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCustomerID_OpenAccount3.setForeground(new java.awt.Color(32, 172, 216));
        lbCustomerID_OpenAccount3.setText("Customer ID: ");
        Panel_OpenAccount.add(lbCustomerID_OpenAccount3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        rbDepositToAccount.setBackground(new java.awt.Color(239, 250, 252));
        rbDepositToAccount.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        rbDepositToAccount.setForeground(new java.awt.Color(32, 172, 216));
        rbDepositToAccount.setText("Deposit to Account");
        rbDepositToAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDepositToAccountActionPerformed(evt);
            }
        });
        Panel_OpenAccount.add(rbDepositToAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        rbAccountOpening.setBackground(new java.awt.Color(239, 250, 252));
        rbAccountOpening.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        rbAccountOpening.setForeground(new java.awt.Color(32, 172, 216));
        rbAccountOpening.setText("Account Opening");
        rbAccountOpening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAccountOpeningActionPerformed(evt);
            }
        });
        Panel_OpenAccount.add(rbAccountOpening, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        lblPaymentAccountInformation1.setBackground(new java.awt.Color(32, 172, 216));
        lblPaymentAccountInformation1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPaymentAccountInformation1.setForeground(new java.awt.Color(32, 172, 216));
        lblPaymentAccountInformation1.setText("Beneficiary Information:");
        Panel_OpenAccount.add(lblPaymentAccountInformation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        txtAccountID.setEditable(false);
        txtAccountID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAccountID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAccountIDMouseClicked(evt);
            }
        });
        txtAccountID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountIDActionPerformed(evt);
            }
        });
        txtAccountID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAccountIDKeyTyped(evt);
            }
        });
        Panel_OpenAccount.add(txtAccountID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 370, -1));

        lbCustomerID_OpenAccount4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCustomerID_OpenAccount4.setForeground(new java.awt.Color(32, 172, 216));
        lbCustomerID_OpenAccount4.setText("Account ID: ");
        Panel_OpenAccount.add(lbCustomerID_OpenAccount4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        txtCustomer_ID.setEditable(false);
        txtCustomer_ID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCustomer_ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCustomer_IDMouseClicked(evt);
            }
        });
        txtCustomer_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomer_IDActionPerformed(evt);
            }
        });
        txtCustomer_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCustomer_IDKeyTyped(evt);
            }
        });
        Panel_OpenAccount.add(txtCustomer_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 370, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_OpenAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 1048, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Panel_OpenAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHome_OpenAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_OpenAccountActionPerformed
        new AdminHome_GUI(dtoAdmin);
        setVisible(false);
    }//GEN-LAST:event_btnHome_OpenAccountActionPerformed

    private void txtAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE))
            evt.consume();
    }//GEN-LAST:event_txtAmountKeyTyped

    private void btnActivate_OpenAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivate_OpenAccountActionPerformed
        if(rbAccountOpening.isSelected())
        {
            if(txtCustomer_ID.getText().equals("") || txtAmount.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Required fields are empty", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                if(Long.parseLong(txtAmount.getText()) > 50000)
                {
                    int reply = JOptionPane.showConfirmDialog(null, "Are you sure to open this payment account for customer?", "Confirm", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) 
                    {
                        if(busDeposit.openPaymentAccount(Long.parseLong(txtCustomer_ID.getText()), Long.parseLong(txtAmount.getText())))
                        {
                            JOptionPane.showMessageDialog(this, "Successful account opening" , "Notification", JOptionPane.INFORMATION_MESSAGE);  
                            clearForm();
                        }
                        else
                            JOptionPane.showMessageDialog(this, "Cannot account opening", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else
                   JOptionPane.showMessageDialog(this, "The initial aount must be more than 50,000 VND", "Error", JOptionPane.ERROR_MESSAGE);  
            }
        }
        if(rbDepositToAccount.isSelected())
        {
            if(txtAccountID.getText().equals("") || txtBeneficiaryName.getText().equals("") || txtAmount.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Required fields are empty", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                long amount = Long.parseLong(txtAmount.getText());
                Account_DTO dtoAccount = new Account_DTO(Long.parseLong(txtAccountID.getText()));
                if(busDeposit.deposit(dtoAccount, amount))
                {
                    JOptionPane.showMessageDialog(this, "Successful deposit to account" , "Notification", JOptionPane.INFORMATION_MESSAGE);  
                    clearForm();
                }
                else
                    JOptionPane.showMessageDialog(this, "Cannot deposit to account", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnActivate_OpenAccountActionPerformed

    private void txtAccountIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAccountIDMouseClicked
        txtBeneficiaryName.setText("");
        txtCustomer_ID.setText("");
    }//GEN-LAST:event_txtAccountIDMouseClicked

    private void txtAccountIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountIDActionPerformed
        if(txtAccountID.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Required field are empty", "Please fill required field...!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Account_DTO dtoAccount = new Account_DTO(Long.parseLong(txtAccountID.getText()));
            Customer_DTO dtoCustomer = busDeposit.getCustomerInfo(dtoAccount);
            if(dtoCustomer == null)
            {
                JOptionPane.showMessageDialog(this, "Account ID is invalid.", "Error", JOptionPane.ERROR_MESSAGE);
                clearForm();
            }
            else
            {
                txtCustomer_ID.setText(String.valueOf(dtoCustomer.getId()));
                txtBeneficiaryName.setText(dtoCustomer.getFirstName() + " " + dtoCustomer.getLastName());
            }
        }
        
    }//GEN-LAST:event_txtAccountIDActionPerformed

    private void txtAccountIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccountIDKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE))
            evt.consume();
    }//GEN-LAST:event_txtAccountIDKeyTyped

    private void txtCustomer_IDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCustomer_IDMouseClicked
        txtBeneficiaryName.setText("");
    }//GEN-LAST:event_txtCustomer_IDMouseClicked

    private void txtCustomer_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomer_IDActionPerformed
        if(txtCustomer_ID.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Required field are empty", "Please fill required field...!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Customer_DTO dtoCustomer = busDeposit.getInformation(Long.parseLong(txtCustomer_ID.getText()));
            if(dtoCustomer == null)
            {
                JOptionPane.showMessageDialog(this, "Customer ID is invalid.", "Error", JOptionPane.ERROR_MESSAGE);
                clearForm();
            }
            else
            {
                txtBeneficiaryName.setText(dtoCustomer.getFirstName() + " " + dtoCustomer.getLastName());
            }
        }
    }//GEN-LAST:event_txtCustomer_IDActionPerformed

    private void txtCustomer_IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomer_IDKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE))
            evt.consume();
    }//GEN-LAST:event_txtCustomer_IDKeyTyped

    private void clearForm()
    {
        txtAccountID.setText("");
        txtCustomer_ID.setText("");
        txtBeneficiaryName.setText("");
        txtAmount.setText("");
    }
    
    private void rbAccountOpeningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAccountOpeningActionPerformed
        clearForm();
        txtAccountID.setEditable(false);
        txtCustomer_ID.setEditable(true);
        txtBeneficiaryName.setEditable(false);
        txtAmount.setEditable(true);
    }//GEN-LAST:event_rbAccountOpeningActionPerformed

    private void rbDepositToAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDepositToAccountActionPerformed
        clearForm();
        txtAccountID.setEditable(true);
        txtCustomer_ID.setEditable(false);
        txtBeneficiaryName.setEditable(false);
        txtAmount.setEditable(true);
    }//GEN-LAST:event_rbDepositToAccountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_OpenAccount;
    private javax.swing.JButton btnActivate_OpenAccount;
    private javax.swing.JButton btnHome_OpenAccount;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lbAmount_OpenAccount;
    private javax.swing.JLabel lbCustomerID_OpenAccount;
    private javax.swing.JLabel lbCustomerID_OpenAccount1;
    private javax.swing.JLabel lbCustomerID_OpenAccount3;
    private javax.swing.JLabel lbCustomerID_OpenAccount4;
    private javax.swing.JLabel lbIcon_OpenAccount;
    private javax.swing.JLabel lbOpenAccount;
    private javax.swing.JLabel lblPaymentAccountInformation;
    private javax.swing.JLabel lblPaymentAccountInformation1;
    private javax.swing.JRadioButton rbAccountOpening;
    private javax.swing.JRadioButton rbDepositToAccount;
    private javax.swing.JTextField txtAccountID;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBeneficiaryName;
    private javax.swing.JTextField txtCustomer_ID;
    // End of variables declaration//GEN-END:variables

}
