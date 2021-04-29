package GUI;

import BUS.Customer_BUS;
import GUI.SupportFrames.Customer_Management;

public class Admin_GUI extends javax.swing.JFrame 
{
    Customer_BUS customer_BUS = new Customer_BUS();
    public Admin_GUI() 
    {
        initComponents();
        setLocationRelativeTo(null);
        //display();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnCustomerManagement = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NK Bank");
        setBackground(new java.awt.Color(239, 250, 252));
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
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, 150, 40));

        jLabel2.setBackground(new java.awt.Color(32, 172, 210));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(239, 250, 252));
        jLabel2.setText("        Admin Portal");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 35, 1010, 80));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(32, 172, 210));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/linea_1f2(0)_180.png"))); // NOI18N
        jButton3.setText("Biểu đồ thống kê");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMargin(new java.awt.Insets(0, 14, 30, 14));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 167, 230, 230));

        btnCustomerManagement.setBackground(new java.awt.Color(255, 255, 255));
        btnCustomerManagement.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCustomerManagement.setForeground(new java.awt.Color(32, 172, 210));
        btnCustomerManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/linea_2f(2)_180.png"))); // NOI18N
        btnCustomerManagement.setText("Quản lý khách hàng");
        btnCustomerManagement.setBorder(null);
        btnCustomerManagement.setBorderPainted(false);
        btnCustomerManagement.setDefaultCapable(false);
        btnCustomerManagement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCustomerManagement.setMargin(new java.awt.Insets(0, 14, 30, 14));
        btnCustomerManagement.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCustomerManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerManagementActionPerformed(evt);
            }
        });
        getContentPane().add(btnCustomerManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 167, 230, 230));

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Admin Portal!");
        jLabel6.setPreferredSize(new java.awt.Dimension(250, 44));
        jPanel2.add(jLabel6);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 167, 291, 409));

        jPanel1.setBackground(new java.awt.Color(239, 250, 252));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnCustomerManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerManagementActionPerformed
        // TODO add your handling code here:
        Customer_Management guiCustomerManagement = new Customer_Management();
        guiCustomerManagement.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCustomerManagementActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        LogIn guiLogIn= new LogIn();
        guiLogIn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogOutActionPerformed

    /*public void display()
    {
        ArrayList<Customer_DTO> list = customer_BUS.getCustomersList();
        DefaultTableModel model = (DefaultTableModel)tableCustomers.getModel();
        Object[] row = new Object[6];
        
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getGender();
            row[3] = list.get(i).getAddress();
            row[4] = list.get(i).getPhoneNumber();
            row[5] = list.get(i).getIDCard();
            model.addRow(row);
        }
    }*/
        
    /*private boolean isFormValid()
    {
            if(txtName.getText().equals("") || txtID.getText().equals("") || txtAddress.getText().equals("") || txtPhoneNumber.getText().equals("") || txtIDCard.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Required fields are empty", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
                return false;
            }    
            else
                return true;
    }*/
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerManagement;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}