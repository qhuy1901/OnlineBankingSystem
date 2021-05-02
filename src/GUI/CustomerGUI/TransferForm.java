package GUI.CustomerGUI;

import BUS.Account_BUS;
import DTO.Account_DTO;
import GUI.Customer_GUI;
import GUI.LogIn;
import javax.swing.JOptionPane;

public class TransferForm extends javax.swing.JFrame 
{
    Account_BUS busAccount = new Account_BUS();
    
    public TransferForm() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setSize(1064, 650);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblImage_Transfer = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblImage_Description = new javax.swing.JLabel();
        lblBeneficiary_Account = new javax.swing.JLabel();
        llblBeneficiary_Name = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        lblFee = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        CbB_Bank = new javax.swing.JComboBox<>();
        txtBeneficiaryAccount = new javax.swing.JTextField();
        txtBeneficiary_name = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        lbltienVND = new javax.swing.JLabel();
        txtFee = new javax.swing.JTextField();
        lblphiVND = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        btnContinue = new javax.swing.JButton();
        lblBank = new javax.swing.JLabel();
        lblImage_Bank = new javax.swing.JLabel();
        lblImage_BAccount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 250, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage_Transfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Transfer_transfer.png"))); // NOI18N
        jPanel1.add(lblImage_Transfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, 100));

        btnHome.setBackground(new java.awt.Color(32, 172, 216));
        btnHome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setToolTipText("");
        btnHome.setBorder(null);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setIconTextGap(0);
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 30, 50, 57));

        btnLogout.setBackground(new java.awt.Color(32, 172, 216));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorder(null);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setIconTextGap(0);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, 50, 57));

        jLabel1.setBackground(new java.awt.Color(32, 172, 216));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 29)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("         Transfer");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 30, 931, 58));

        lblImage_Description.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblImage_Description.setForeground(new java.awt.Color(51, 51, 51));
        lblImage_Description.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Transfer_Description.png"))); // NOI18N
        jPanel1.add(lblImage_Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 40, -1));

        lblBeneficiary_Account.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBeneficiary_Account.setForeground(new java.awt.Color(51, 51, 51));
        lblBeneficiary_Account.setText("Beneficiary account");
        jPanel1.add(lblBeneficiary_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        llblBeneficiary_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        llblBeneficiary_Name.setForeground(new java.awt.Color(51, 51, 51));
        llblBeneficiary_Name.setText("Beneficiary name");
        jPanel1.add(llblBeneficiary_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        lblAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(51, 51, 51));
        lblAmount.setText("Amount");
        jPanel1.add(lblAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        lblFee.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFee.setForeground(new java.awt.Color(51, 51, 51));
        lblFee.setText("Fee");
        jPanel1.add(lblFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        lblDescription.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(51, 51, 51));
        lblDescription.setText("Description");
        jPanel1.add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));

        CbB_Bank.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        CbB_Bank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACB Bank", "VP Bank", "Saccombank", " " }));
        CbB_Bank.setSelectedIndex(-1);
        jPanel1.add(CbB_Bank, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 422, -1));

        txtBeneficiaryAccount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txtBeneficiaryAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 422, -1));

        txtBeneficiary_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txtBeneficiary_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 422, -1));

        txtAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 250, -1));

        lbltienVND.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbltienVND.setText("VND");
        jPanel1.add(lbltienVND, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, -1, 30));

        txtFee.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txtFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 120, -1));

        lblphiVND.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblphiVND.setForeground(new java.awt.Color(153, 153, 153));
        lblphiVND.setText("VND");
        jPanel1.add(lblphiVND, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, 30));

        txtDescription.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 422, 90));

        btnContinue.setBackground(new java.awt.Color(32, 172, 216));
        btnContinue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnContinue.setForeground(new java.awt.Color(255, 255, 255));
        btnContinue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Transfer_btnContinue.png"))); // NOI18N
        btnContinue.setText("Continue");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, -1, -1));

        lblBank.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBank.setForeground(new java.awt.Color(51, 51, 51));
        lblBank.setText("Bank");
        jPanel1.add(lblBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        lblImage_Bank.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblImage_Bank.setForeground(new java.awt.Color(51, 51, 51));
        lblImage_Bank.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Transfer_Bank.png"))); // NOI18N
        jPanel1.add(lblImage_Bank, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, -1, -1));

        lblImage_BAccount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblImage_BAccount.setForeground(new java.awt.Color(51, 51, 51));
        lblImage_BAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Transfer_BeneficiaryAccount.png"))); // NOI18N
        jPanel1.add(lblImage_BAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 40, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LogIn guiLogIn = new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        if(txtBeneficiaryAccount.getText().equals("")|| txtBeneficiary_name.getText().equals("")|| txtAmount.getText().equals("")|| txtFee.getText().equals("") || txtDescription.getText().equals(""))
        {
            JOptionPane.showConfirmDialog(null, "Required fields are empty", "Please fill all required fields...!", JOptionPane.CLOSED_OPTION);
        }
        else
        {
            ConfirmationForm confirmationForm = new ConfirmationForm();
            if(confirmationForm.isCorrectPassword)
            {
                Account_DTO tkNguoiNhan = new Account_DTO(Long.parseLong(txtBeneficiaryAccount.getText()));
                if(busAccount.isValidAccount(tkNguoiNhan))
                {
                    if(busAccount.increase(tkNguoiNhan, Long.parseLong(txtAmount.getText())))
                    JOptionPane.showConfirmDialog(null, "Money transfer is successful", "Successful", JOptionPane.CLOSED_OPTION);    
                }
                else       
                    JOptionPane.showConfirmDialog(null, "Beneficiary account is blocked or not exist", "Error", JOptionPane.CLOSED_OPTION);
            }
        }
    }//GEN-LAST:event_btnContinueActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new Customer_GUI();
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbB_Bank;
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblBank;
    private javax.swing.JLabel lblBeneficiary_Account;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblFee;
    private javax.swing.JLabel lblImage_BAccount;
    private javax.swing.JLabel lblImage_Bank;
    private javax.swing.JLabel lblImage_Description;
    private javax.swing.JLabel lblImage_Transfer;
    private javax.swing.JLabel lblphiVND;
    private javax.swing.JLabel lbltienVND;
    private javax.swing.JLabel llblBeneficiary_Name;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBeneficiaryAccount;
    private javax.swing.JTextField txtBeneficiary_name;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtFee;
    // End of variables declaration//GEN-END:variables
}
