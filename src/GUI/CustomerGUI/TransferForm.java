package GUI.CustomerGUI;

import BUS.Transfer_BUS;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.UserLogin_DTO;
import GUI.Customer_GUI;
import GUI.LogIn;
import javax.swing.*;

public class TransferForm extends javax.swing.JFrame 
{
    Transfer_BUS busTransfer = new Transfer_BUS();
    
    Account_DTO dtoAccount = null; // Tài khoản của người chuyển tiền
    Customer_DTO dtoCustomer = null; //Người chuyển tiền
    
    public TransferForm(Customer_DTO customer, Account_DTO account) 
    {
        initComponents();
        setLocationRelativeTo(null);
        setSize(1064, 650);
        setVisible(true);
        dtoAccount = account;
        dtoCustomer = customer;
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
        lblAmount = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        cbb_Bank = new javax.swing.JComboBox<>();
        txtReceiverAccount = new javax.swing.JTextField();
        lbltienVND = new javax.swing.JLabel();
        btnContinue = new javax.swing.JButton();
        lblImage_Bank = new javax.swing.JLabel();
        lblImage_BAccount = new javax.swing.JLabel();
        lblBank2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtContent = new javax.swing.JTextPane();
        lblBank3 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();

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
        jPanel1.add(lblImage_Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 40, -1));

        lblBeneficiary_Account.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblBeneficiary_Account.setForeground(new java.awt.Color(32, 172, 216));
        lblBeneficiary_Account.setText("Receiver account ");
        jPanel1.add(lblBeneficiary_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        lblAmount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(32, 172, 216));
        lblAmount.setText("Amount");
        jPanel1.add(lblAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        lblDescription.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(32, 172, 216));
        lblDescription.setText("Content");
        jPanel1.add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        cbb_Bank.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        cbb_Bank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACB Bank", "VP Bank", "Saccombank", " " }));
        cbb_Bank.setSelectedIndex(-1);
        jPanel1.add(cbb_Bank, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 422, -1));

        txtReceiverAccount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txtReceiverAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 422, -1));

        lbltienVND.setBackground(new java.awt.Color(32, 172, 216));
        lbltienVND.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbltienVND.setForeground(new java.awt.Color(32, 172, 216));
        lbltienVND.setText("VND");
        jPanel1.add(lbltienVND, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, -1, 30));

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
        jPanel1.add(btnContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, -1, -1));

        lblImage_Bank.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblImage_Bank.setForeground(new java.awt.Color(51, 51, 51));
        lblImage_Bank.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Transfer_Bank.png"))); // NOI18N
        jPanel1.add(lblImage_Bank, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, -1, -1));

        lblImage_BAccount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblImage_BAccount.setForeground(new java.awt.Color(51, 51, 51));
        lblImage_BAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Transfer_BeneficiaryAccount.png"))); // NOI18N
        jPanel1.add(lblImage_BAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 40, -1));

        lblBank2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBank2.setForeground(new java.awt.Color(32, 172, 216));
        lblBank2.setText("Receiver Information");
        jPanel1.add(lblBank2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, 20));

        jScrollPane1.setViewportView(txtContent);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 430, 60));

        lblBank3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblBank3.setForeground(new java.awt.Color(32, 172, 216));
        lblBank3.setText("Bank");
        jPanel1.add(lblBank3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, 20));

        txtAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        jPanel1.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 250, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LogIn guiLogIn = new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    // Hàm này chỉ có chức năng tạo ra 1 window để nhập mật khẩu và trả về mật khẩu của khách hàng đã nhập
    private String confirmPassword()
    {
        // Create Password JOptionPane
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Please enter your password:");
        JPasswordField pass = new JPasswordField(10);
        panel.add(label);
        panel.add(pass);
        String[] options = new String[]{"Confirm", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, panel, "Verify by password", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
        String password = "";
        if(option == 0) // pressing OK button
        {
            char[] pw = pass.getPassword();
            password = new String(pw);
        }
        else
            return "cancel";
        return password;
    }
    
    
    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        if(txtReceiverAccount.getText().equals("")||  txtAmount.getText().equals("")|| txtContent.getText().equals(""))
        {
            JOptionPane.showConfirmDialog(null, "Required fields are empty", "Please fill all required fields...!", JOptionPane.CLOSED_OPTION);
        }
        else
        {
            Account_DTO dtoReceiverAccount = new Account_DTO(Long.parseLong(txtReceiverAccount.getText())); // Tạo tài khoản của người nhận
            if(busTransfer.isValidAccount(dtoReceiverAccount)) // Kiểm tra tài khoản người nhận có tồn tại hay không
            {
                UserLogin_DTO dtoUserLogIn = busTransfer.getUserLogin(dtoCustomer); // Lấy password của người chuyển tiền
                if(confirmPassword().equals(dtoUserLogIn.getPassword()))// // So sánh password với password người dùng nhập
                {
                    if(busTransfer.transfer(dtoAccount, dtoReceiverAccount, "CT01", Long.parseLong(txtAmount.getText())))
                    {
                        JOptionPane.showConfirmDialog(null, "Money transfer is successful", "Successful", JOptionPane.CLOSED_OPTION);
                        
                        //Clear Form
                        cbb_Bank.setSelectedItem(null);
                        txtReceiverAccount.setText("");
                        txtAmount.setText("");
                        txtContent.setText("");
                    }
                }
                else if(confirmPassword().equals("cancel"))
                {
                    
                }
                else
                    JOptionPane.showMessageDialog(this, "Password is incorrect", "Incorrect details", JOptionPane.ERROR_MESSAGE);
            }
            else       
                JOptionPane.showConfirmDialog(null, "Beneficiary account is blocked or not exist", "Error", JOptionPane.CLOSED_OPTION);
            
        }
    }//GEN-LAST:event_btnContinueActionPerformed

    
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new Customer_GUI(dtoCustomer);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed

    }//GEN-LAST:event_txtAmountActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> cbb_Bank;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblBank2;
    private javax.swing.JLabel lblBank3;
    private javax.swing.JLabel lblBeneficiary_Account;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblImage_BAccount;
    private javax.swing.JLabel lblImage_Bank;
    private javax.swing.JLabel lblImage_Description;
    private javax.swing.JLabel lblImage_Transfer;
    private javax.swing.JLabel lbltienVND;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextPane txtContent;
    private javax.swing.JTextField txtReceiverAccount;
    // End of variables declaration//GEN-END:variables
}
