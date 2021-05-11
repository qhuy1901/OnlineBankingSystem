package DAL;

import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.UserLogin_DTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Customer_DAL extends DBConnection
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
            String SQL = "DELETE FROM CUSTOMER WHERE CUSTOMER_ID = ?";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setLong(1, ct.getId());
            prest.executeUpdate();
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
            String SQL = "SELECT * FROM CUSTOMER WHERE CUSTOMER_ID = " + id;
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
    
    public Account_DTO getPaymentAccount(Customer_DTO dtoCustomer)
    {
        try
        {
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT * FROM Account WHERE Customer_ID = ? AND Account_Type_ID = 'PA'";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setLong(1, dtoCustomer.getId());
            ResultSet rs = ps.executeQuery();
            Account_DTO dtoAccount = null;
            while(rs.next())
                dtoAccount = new Account_DTO(rs.getLong(1), rs.getLong(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getLong(6));
            con.close();
            return dtoAccount;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return null; 
    }
    
    public UserLogin_DTO getUserLogin(Customer_DTO dtoCustomer)
    {
        try
        {
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT * FROM User_Login WHERE UserLogin_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setLong(1, dtoCustomer.getUserLoginID());
            ResultSet rs = ps.executeQuery();
            UserLogin_DTO dtoUserLogin = null;
            while(rs.next())
                dtoUserLogin = new UserLogin_DTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
            con.close();
            return dtoUserLogin;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return null; 
    }
    
    public ArrayList<Customer_DTO> getCustomersList()
    {
        ArrayList<Customer_DTO> customersList = new ArrayList<Customer_DTO>();
        try
        {
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT * FROM CUSTOMER";
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
}
