package GUI.AdminGUI;

import BUS.SupplierManagment_BUS;
import DTO.Admin_DTO;
import DTO.Supplier_DTO;
import GUI.AdminHome_GUI;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class SupplierManagement_GUI extends javax.swing.JFrame 
{
    SupplierManagment_BUS busSupplier = new SupplierManagment_BUS();
    Admin_DTO dtoAdmin = null;
    
    public SupplierManagement_GUI(Admin_DTO admin) 
    {
        initComponents();
        setSize(1064,650);
        setLocationRelativeTo(null);
        dtoAdmin = admin;
        createTable();
        setVisible(true);
        cboServiceType.setSelectedItem(null);
        tblSupplierSelectRow();
    }
    
    DefaultTableModel tblSupplierModel;
    public void createTable()
    {
        ArrayList<Supplier_DTO> list = busSupplier.getSupplierList();
        tblSupplierModel = new DefaultTableModel();
        String title[] = {"ID", "Supplier Name", "Service Type","Contract Singing Date", "Address", "Phone Number"};
        tblSupplierModel.setColumnIdentifiers(title);
        tblSupplierModel.setRowCount(0); 
        for(int i = 0; i < list.size(); i++)
        {
            Supplier_DTO dtoSupplier = list.get(i);
            String[] rows = {String.valueOf(dtoSupplier.getId()), dtoSupplier.getName(), dtoSupplier.getServiceName(), dtoSupplier.getContractSigningDate().toString(), dtoSupplier.getAddress(), dtoSupplier.getPhoneNumber() };
            tblSupplierModel.addRow(rows);
        }
        tblSupplier.setModel(tblSupplierModel);
        setVisible(true);
    }
    
    public void tblSupplierSelectRow()
    {
        tblSupplier.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if(!lse.getValueIsAdjusting())
                {
                    int row = tblSupplier.getSelectedRow();
                    if(row >= 0)
                    {
                        //txtSupplierName.setText(tblSupplier.getModel().getValueAt(row, 1).toString());
                        txtSupplierName.setText(tblSupplier.getValueAt(row, 1).toString());
                        cboServiceType.setSelectedItem(tblSupplier.getValueAt(row, 2).toString());
                        String contractSingingDateString = tblSupplier.getValueAt(row, 3).toString();
                        Date contractSingingDate = null;
                        DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
                        try { 
                            contractSingingDate = df.parse(contractSingingDateString);
                        } catch (ParseException ex) {
                            Logger.getLogger(SupplierManagement_GUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        dcContractSingingDate.setDate(contractSingingDate);
                        txtAddress.setText(tblSupplier.getValueAt(row, 4).toString());
                        txtPhoneNumber.setText(tblSupplier.getValueAt(row, 5).toString());
                    }
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblServiceType = new javax.swing.JPanel();
        lblImage_Supplier = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        lblSupplierManagement = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblSupplierName = new javax.swing.JLabel();
        txtSupplierName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();
        lblTransaction_type = new javax.swing.JLabel();
        btnClear_Supplier = new javax.swing.JButton();
        btnAdd_Supplier = new javax.swing.JButton();
        btnUpdate_Supplier = new javax.swing.JButton();
        cboServiceType = new javax.swing.JComboBox<>();
        btnDelete_Supplier1 = new javax.swing.JButton();
        lblAddress = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblPhoneNumber = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblTransaction_type1 = new javax.swing.JLabel();
        dcContractSingingDate = new com.toedter.calendar.JDateChooser();
        btnExportReport_Supplier = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supplier Management");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblServiceType.setBackground(new java.awt.Color(239, 250, 252));
        lblServiceType.setForeground(new java.awt.Color(32, 172, 216));
        lblServiceType.setPreferredSize(new java.awt.Dimension(1064, 650));
        lblServiceType.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage_Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Supplier_Management.png"))); // NOI18N
        lblServiceType.add(lblImage_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, 100));

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
        lblServiceType.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, 50, 57));

        lblSupplierManagement.setBackground(new java.awt.Color(32, 172, 216));
        lblSupplierManagement.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSupplierManagement.setForeground(new java.awt.Color(255, 255, 255));
        lblSupplierManagement.setText("         Supplier Management");
        lblSupplierManagement.setOpaque(true);
        lblServiceType.add(lblSupplierManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 30, 931, 58));

        lblSearch.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(32, 172, 216));
        lblSearch.setText("Search:");
        lblServiceType.add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        txtPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPhoneNumber.setForeground(new java.awt.Color(32, 172, 216));
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyTyped(evt);
            }
        });
        lblServiceType.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 310, -1));

        lblSupplierName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSupplierName.setForeground(new java.awt.Color(32, 172, 216));
        lblSupplierName.setText("Supplier name:");
        lblServiceType.add(lblSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        txtSupplierName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSupplierName.setForeground(new java.awt.Color(32, 172, 216));
        lblServiceType.add(txtSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 310, -1));

        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblSupplier);

        lblServiceType.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 890, 210));

        lblTransaction_type.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTransaction_type.setForeground(new java.awt.Color(32, 172, 216));
        lblTransaction_type.setText("Service Type:  ");
        lblServiceType.add(lblTransaction_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, -1, -1));

        btnClear_Supplier.setBackground(new java.awt.Color(32, 172, 216));
        btnClear_Supplier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClear_Supplier.setForeground(new java.awt.Color(255, 255, 255));
        btnClear_Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Supplier_Management_btnClear.png"))); // NOI18N
        btnClear_Supplier.setText("CLEAR");
        btnClear_Supplier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClear_Supplier.setIconTextGap(1);
        btnClear_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear_SupplierActionPerformed(evt);
            }
        });
        lblServiceType.add(btnClear_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 570, 110, 30));

        btnAdd_Supplier.setBackground(new java.awt.Color(32, 172, 216));
        btnAdd_Supplier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd_Supplier.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd_Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Supplier_Management_btnADD.png"))); // NOI18N
        btnAdd_Supplier.setText("ADD");
        btnAdd_Supplier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdd_Supplier.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAdd_Supplier.setIconTextGap(7);
        btnAdd_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_SupplierActionPerformed(evt);
            }
        });
        lblServiceType.add(btnAdd_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, 111, 30));

        btnUpdate_Supplier.setBackground(new java.awt.Color(32, 172, 216));
        btnUpdate_Supplier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate_Supplier.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate_Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Supplier_Management_btnUpdate.png"))); // NOI18N
        btnUpdate_Supplier.setText("UPDATE");
        btnUpdate_Supplier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUpdate_Supplier.setIconTextGap(1);
        btnUpdate_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate_SupplierActionPerformed(evt);
            }
        });
        lblServiceType.add(btnUpdate_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 570, 113, 30));

        cboServiceType.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cboServiceType.setForeground(new java.awt.Color(32, 172, 216));
        cboServiceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Water", "Internet", "Electricity", "Phone card" }));
        lblServiceType.add(cboServiceType, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 240, 30));

        btnDelete_Supplier1.setBackground(new java.awt.Color(32, 172, 216));
        btnDelete_Supplier1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete_Supplier1.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete_Supplier1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Supplier_Management_btnDelete.png"))); // NOI18N
        btnDelete_Supplier1.setText("DELETE");
        btnDelete_Supplier1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDelete_Supplier1.setIconTextGap(1);
        btnDelete_Supplier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_Supplier1ActionPerformed(evt);
            }
        });
        lblServiceType.add(btnDelete_Supplier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 111, 30));

        lblAddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(32, 172, 216));
        lblAddress.setText("Address:");
        lblServiceType.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(32, 172, 216));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        lblServiceType.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 270, -1));
        lblServiceType.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 278, 890, 20));

        lblPhoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(32, 172, 216));
        lblPhoneNumber.setText("Phone Number:");
        lblServiceType.add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(32, 172, 216));
        lblServiceType.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 720, -1));

        lblTransaction_type1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTransaction_type1.setForeground(new java.awt.Color(32, 172, 216));
        lblTransaction_type1.setText("Contract Signing Date:");
        lblServiceType.add(lblTransaction_type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        dcContractSingingDate.setBackground(new java.awt.Color(32, 172, 216));
        dcContractSingingDate.setForeground(new java.awt.Color(32, 172, 216));
        dcContractSingingDate.setDateFormatString("dd/MM/yyyy");
        dcContractSingingDate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblServiceType.add(dcContractSingingDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 170, 30));

        btnExportReport_Supplier.setBackground(new java.awt.Color(32, 172, 216));
        btnExportReport_Supplier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExportReport_Supplier.setForeground(new java.awt.Color(255, 255, 255));
        btnExportReport_Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Export.png"))); // NOI18N
        btnExportReport_Supplier.setText("EXPORT SUPPLIER REPORT");
        btnExportReport_Supplier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExportReport_Supplier.setIconTextGap(1);
        btnExportReport_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportReport_SupplierActionPerformed(evt);
            }
        });
        lblServiceType.add(btnExportReport_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, 240, 30));

        getContentPane().add(lblServiceType, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1064, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnClear_SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear_SupplierActionPerformed
        // Clear Form
        txtSupplierName.setText("");
        txtPhoneNumber.setText("");
        txtAddress.setText("");
        dcContractSingingDate.setDate(null);
        cboServiceType.setSelectedItem(null);
        txtSearch.setText("");

    }//GEN-LAST:event_btnClear_SupplierActionPerformed

    private void btnAdd_SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_SupplierActionPerformed
        if(txtPhoneNumber.getText().equals("")|| txtSupplierName.getText().equals("") ||  txtAddress.getText().equals("") || txtPhoneNumber.getText().equals("") || cboServiceType.getSelectedItem() == null)
        {
               JOptionPane.showMessageDialog(this, "Required fields are empty", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Supplier_DTO dtoSupplier = new Supplier_DTO(0, txtSupplierName.getText(), cboServiceType.getSelectedItem().toString(), dcContractSingingDate.getDate(), txtAddress.getText(), txtPhoneNumber.getText());
            if(busSupplier.insert(dtoSupplier))
            {
                JOptionPane.showMessageDialog(this, "Supplier added susccessfully...!", "Success", JOptionPane.INFORMATION_MESSAGE);
                createTable();
                
                // Clear Form
                txtSupplierName.setText("");
                txtPhoneNumber.setText("");
                txtAddress.setText("");
                dcContractSingingDate.setDate(null);
                cboServiceType.setSelectedItem(null);
            }
            else
                JOptionPane.showMessageDialog(this, "Cannot add supplier!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAdd_SupplierActionPerformed

    private void btnUpdate_SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate_SupplierActionPerformed
        int index = tblSupplier.getSelectedRow();
        if(index == -1 || txtPhoneNumber.getText().equals("")|| txtSupplierName.getText().equals("") ||  txtAddress.getText().equals("") || txtPhoneNumber.getText().equals("") || cboServiceType.getSelectedItem() == null)
        {
            JOptionPane.showMessageDialog(this, "Please select a supplier before updating", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            int ret = JOptionPane.showConfirmDialog(null, "Are you sure to update this supplier information?", "Confirm", JOptionPane.YES_NO_OPTION);
            if(ret == JOptionPane.YES_OPTION)
            {
                // Lấy dữ liệu từ form xuống
                int id = Integer.parseInt(tblSupplier.getValueAt(index, 0).toString());
                Supplier_DTO dtoSupplier = new Supplier_DTO(id, txtSupplierName.getText(), cboServiceType.getSelectedItem().toString(), dcContractSingingDate.getDate(), txtAddress.getText(), txtPhoneNumber.getText());
                if(busSupplier.update(dtoSupplier))
                {
                    createTable();
                    JOptionPane.showConfirmDialog(null, "Supplier updated susccessfully...!", "Success", JOptionPane.CLOSED_OPTION);
                }
                else
                    JOptionPane.showMessageDialog(this, "Cannot update supplier!", "Error", JOptionPane.ERROR_MESSAGE);

                // Clear Form
                txtSupplierName.setText("");
                txtPhoneNumber.setText("");
                txtAddress.setText("");
                dcContractSingingDate.setDate(null);
                cboServiceType.setSelectedItem(null);
            }
        }
    }//GEN-LAST:event_btnUpdate_SupplierActionPerformed

    private void btnDelete_Supplier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_Supplier1ActionPerformed
        int index = tblSupplier.getSelectedRow();
        if(index == -1 || txtPhoneNumber.getText().equals("")|| txtSupplierName.getText().equals("") ||  txtAddress.getText().equals("") || txtPhoneNumber.getText().equals("") || cboServiceType.getSelectedItem() == null)
        {
            JOptionPane.showMessageDialog(this, "Please select a supplier before updating", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            int ret = JOptionPane.showConfirmDialog(null, "Are you sure to delete this supplier and all bills associated with this supplier?", "Confirm", JOptionPane.YES_NO_OPTION);
            if(ret == JOptionPane.YES_OPTION) // phải chọn r ms nhập đc làm lại
            {
                int supplierId = Integer.parseInt(tblSupplier.getValueAt(index, 0).toString());
                if(busSupplier.delete(supplierId))
                {
                    tblSupplierModel.removeRow(index);
                    JOptionPane.showConfirmDialog(null, "Supplier deleted susccessfully...!", "Success", JOptionPane.CLOSED_OPTION);

                    // Clear Form
                    txtSupplierName.setText("");
                    txtPhoneNumber.setText("");
                    txtAddress.setText("");
                    dcContractSingingDate.setDate(null);
                    cboServiceType.setSelectedItem(null);
                }
                else
                    JOptionPane.showMessageDialog(this, "Cannot delete supplier!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDelete_Supplier1ActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new AdminHome_GUI(dtoAdmin);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        DefaultTableModel SearchTable = (DefaultTableModel) tblSupplier.getModel();
        String search = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(SearchTable);
        tblSupplier.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtPhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)){
            //getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPhoneNumberKeyTyped

    private void btnExportReport_SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportReport_SupplierActionPerformed
        busSupplier.showSupplierList();
    }//GEN-LAST:event_btnExportReport_SupplierActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd_Supplier;
    private javax.swing.JButton btnClear_Supplier;
    private javax.swing.JButton btnDelete_Supplier1;
    private javax.swing.JButton btnExportReport_Supplier;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnUpdate_Supplier;
    private javax.swing.JComboBox<String> cboServiceType;
    private com.toedter.calendar.JDateChooser dcContractSingingDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblImage_Supplier;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JPanel lblServiceType;
    private javax.swing.JLabel lblSupplierManagement;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JLabel lblTransaction_type;
    private javax.swing.JLabel lblTransaction_type1;
    private javax.swing.JTable tblSupplier;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSupplierName;
    // End of variables declaration//GEN-END:variables
}
