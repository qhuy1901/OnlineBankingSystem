package GUI.CustomerGUI;

import BUS.Payment_BUS;
import DTO.Account_DTO;
import DTO.Bill_DTO;
import DTO.Customer_DTO;
import DTO.Supplier_DTO;
import DTO.UserLogin_DTO;
import GUI.Customer_Menu_GUI;
import GUI.LogIn;
import GUI.Report.Report;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class Payment extends javax.swing.JFrame 
{
    Payment_BUS busPayment = new Payment_BUS();
    Account_DTO dtoAccount = null; // Tài khoản của người chuyển tiền
    Customer_DTO dtoCustomer = null;
    
    public Payment(Customer_DTO customer, Account_DTO account) 
    {
        initComponents();
        setLocationRelativeTo(null);
        setSize(1064, 650);
        setVisible(true);
        cboServiceType.setSelectedItem(null);
        dtoCustomer = customer;
        dtoAccount = account; 
    }
    
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblImage_Transfer = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSupplier = new javax.swing.JLabel();
        cboServiceType = new javax.swing.JComboBox<>();
        lblSupplier1 = new javax.swing.JLabel();
        cboSupplierName = new javax.swing.JComboBox<>();
        txtCustomerID_Water = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnConfirm_Water = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Online Banking System");

        jPanel1.setBackground(new java.awt.Color(239, 250, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage_Transfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Payment_Water.png"))); // NOI18N
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
        jLabel1.setText("         Bill Payment");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 30, 931, 58));

        lblSupplier.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblSupplier.setForeground(new java.awt.Color(32, 172, 216));
        lblSupplier.setText("Service Type:");
        jPanel1.add(lblSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        cboServiceType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboServiceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Water bill payment", "Internet bill payment", "Electricity bill payment" }));
        cboServiceType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboServiceTypeActionPerformed(evt);
            }
        });
        jPanel1.add(cboServiceType, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 270, -1));

        lblSupplier1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblSupplier1.setForeground(new java.awt.Color(32, 172, 216));
        lblSupplier1.setText("Supplier Name:");
        jPanel1.add(lblSupplier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        cboSupplierName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboSupplierName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dong Nai Water Supplier", "Thu Duc Water Supplier", "Ben Thanh Water Supplier", "Da Nang Water Supplier", "Clean Water Ha Noi (Hawacom)" }));
        jPanel1.add(cboSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 270, -1));

        txtCustomerID_Water.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtCustomerID_Water, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 270, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(32, 172, 216));
        jLabel19.setText("Customer ID:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        btnConfirm_Water.setBackground(new java.awt.Color(32, 172, 216));
        btnConfirm_Water.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConfirm_Water.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm_Water.setText("Payment");
        btnConfirm_Water.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirm_WaterActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirm_Water, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new Customer_Menu_GUI(dtoCustomer);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LogIn guiLogIn = new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnConfirm_WaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirm_WaterActionPerformed
        long customerId = Long.parseLong(txtCustomerID_Water.getText());
        String supplierName = cboSupplierName.getSelectedItem().toString();
        Bill_DTO dtoWaterBill = busPayment.getBill(new Customer_DTO(customerId), new Supplier_DTO(supplierName));
        if(dtoWaterBill != null) // Hóa đơn tồn tại
        {
            UserLogin_DTO dtoUserLogIn = busPayment.getUserLogin(dtoCustomer); // Lấy password người dùng
            String EnteredPassword = confirmPassword();
            if(EnteredPassword.equals(dtoUserLogIn.getPassword()))// // So sánh password với password người dùng nhập
            {
                if(busPayment.payment(dtoWaterBill, dtoAccount))
                {
                    JOptionPane.showConfirmDialog(null, "Payment is successful", "Successful", JOptionPane.CLOSED_OPTION);

                    Report r = new Report();
                    r.showPaymentBill(dtoWaterBill.getId());
                    //Clear form
                    cboServiceType.setSelectedItem(null);
                    txtCustomerID_Water.setText("");
                }
            }
            else if(EnteredPassword.equals("cancel"))
            {
                // Không làm gì hết
            }
            else
                JOptionPane.showMessageDialog(this, "Password is incorrect", "Incorrect details", JOptionPane.ERROR_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(this, "This bill is not exist", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnConfirm_WaterActionPerformed

    private void cboServiceTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboServiceTypeActionPerformed
        //Chọn loại dịch vụ cần thanh toán
        if(cboServiceType.getSelectedItem() == null)
            cboSupplierName.setSelectedItem(null);
        else if(cboServiceType.getSelectedItem().toString().equals("Water bill payment"))
        {
            cboSupplierName.setModel(new DefaultComboBoxModel<>(new String[]{
                "Dong Nai Water Supplier", "Thu Duc Water Supplier", "Ben Thanh Water Supplier", "Da Nang Water Supplier", "Clean Water Ha Noi"
            }));
        }
        else if(cboServiceType.getSelectedItem().toString().equals("Electricity bill payment"))
        {
            cboSupplierName.setModel(new DefaultComboBoxModel<>(new String[]{
                "Nothern Power Corp", "Southern Power Corp", "Central Power Corp"
            }));
        }
        else // (cboServiceType.getSelectedItem().toString().equals("Internet bill payment"))
        {
            cboSupplierName.setModel(new DefaultComboBoxModel<>(new String[]{
                "FPT Telecom", "Viettel", "VNPT"
            }));
        }
    }//GEN-LAST:event_cboServiceTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm_Water;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> cboServiceType;
    private javax.swing.JComboBox<String> cboSupplierName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImage_Transfer;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JLabel lblSupplier1;
    private javax.swing.JTextField txtCustomerID_Water;
    // End of variables declaration//GEN-END:variables
}
