package DAL;

import DTO.Customer_DTO;
import DTO.UserLogin_DTO;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Customer_DAL 
{
    public boolean insert(Customer_DTO ct)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "INSERT INTO CUSTOMER(CUSTOMER_ID, FIRST_NAME, LAST_NAME, GENDER, DATE_OF_BIRTH, ADDRESS, PHONE_NUMBER, ID_CARD) "
                    + " VALUES (CUSTOMER_ID_SEQUENCE.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setString(1, ct.getFirstName());
            prest.setString(2, ct.getLastName());
            prest.setString(3, ct.getGender());
            Date sqlDateOfBirth = new java.sql.Date(ct.getDateOfBirth().getTime());
            prest.setDate(4, sqlDateOfBirth); // TO_DATE(?, 'MON DD, YYYY')
            prest.setString(5,  ct.getAddress());
            prest.setString(6, ct.getPhoneNumber());
            prest.setString(7, ct.getIDCard());
            prest.executeUpdate();
            con.close();
            return true;
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);    
        }
        return false;
    }
    
    public boolean delete(Customer_DTO ct)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String strCall = "{call DELETE_CUSTOMER(?)}";
            CallableStatement caSt = con.prepareCall(strCall);
            caSt.setLong(1, ct.getId());
           
            caSt.execute();
            con.close();
            return true;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);    
        }
        return false;
    }
    
    public boolean update(Customer_DTO ct)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "UPDATE CUSTOMER SET FIRST_NAME = ?, LAST_NAME = ? ,GENDER = ?, DATE_OF_BIRTH = ?, ADDRESS = ?, PHONE_NUMBER = ?, ID_CARD = ? WHERE CUSTOMER_ID = ?";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setString(1, ct.getFirstName());
            prest.setString(2, ct.getLastName());
            prest.setString(3, ct.getGender());
            Date sqlDateOfBirth = new java.sql.Date(ct.getDateOfBirth().getTime());
            prest.setDate(4, sqlDateOfBirth); // TO_DATE(?, 'MON DD, YYYY')
            prest.setString(5,  ct.getAddress());
            prest.setString(6, ct.getPhoneNumber());
            prest.setString(7, ct.getIDCard());
            prest.setLong(8, ct.getId());
            prest.executeUpdate();
            con.close();
            return true;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);    
        }
        return false;
    }
    
    public Customer_DTO getInformation(long id)
    {
        Customer_DTO dotCustomer = null;
        try
        {
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT CUSTOMER_ID, FIRST_NAME, LAST_NAME, GENDER, DATE_OF_BIRTH, ADDRESS, PHONE_NUMBER, ID_CARD"
                    + " FROM CUSTOMER WHERE CUSTOMER_ID = " + id;
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery(SQL);
            while(rs.next())
                dotCustomer = new Customer_DTO(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5),rs.getString(6), rs.getString(7), rs.getString(8));
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return dotCustomer; 
    }

    public ArrayList<Customer_DTO> getCustomersList()
    {
        ArrayList<Customer_DTO> customersList = new ArrayList<Customer_DTO>();
        try
        {
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT CUSTOMER_ID, FIRST_NAME, LAST_NAME, GENDER, DATE_OF_BIRTH, ADDRESS, PHONE_NUMBER, ID_CARD"
                    + " FROM CUSTOMER ORDER BY CUSTOMER_ID DESC";
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery(SQL);
            while(rs.next())
            {
                Customer_DTO  ct = new Customer_DTO(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5),rs.getString(6), rs.getString(7), rs.getString(8));
                customersList.add(ct);
            } 
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return customersList; 
    }
    
    public Customer_DTO getCustomerInfo(UserLogin_DTO dtoUserLogin) // Từ password và username --> trả về thông tin người dùng
    {
        try{
            Connection con = DBConnection.ConnectDb();
            
            // Lấy userID từ username và password
            String SQL1 = "SELECT UserLogin_ID FROM User_Login WHERE Username = ? AND Password = ?"; 
            PreparedStatement ps1 = con.prepareStatement(SQL1);
            ps1.setString(1, dtoUserLogin.getUsername());
            ps1.setString(2, dtoUserLogin.getPassword());
            ResultSet rs1 = ps1.executeQuery();
            long UserLoginID = 0;
            while(rs1.next())
                UserLoginID = rs1.getLong(1);
            
            // Tạo người dùng, lấy thông tin thông qua userID và return thông tin người dùng
            Customer_DTO dtoCustomer = null;
            String SQL2 = "SELECT * FROM Customer WHERE UserLogin_ID = ?"; 
            PreparedStatement ps2 = con.prepareStatement(SQL2);
            ps2.setLong(1, UserLoginID);
            ResultSet rs2 = ps2.executeQuery();
            while(rs2.next())
                dtoCustomer = new Customer_DTO(rs2.getLong(1), rs2.getString(2), rs2.getString(3), rs2.getString(4), rs2.getDate(5),rs2.getString(6), rs2.getString(7), rs2.getString(8), rs2.getLong(9)); 
            con.close();
            return dtoCustomer;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return null; 
    }
}
