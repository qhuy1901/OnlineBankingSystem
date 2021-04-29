package DAL;

import DTO.Customer_DTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Customer_DAL extends DBConnection
{
    public boolean insert(Customer_DTO ct)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "INSERT INTO CUSTOMER VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setLong(1, ct.getId());
            prest.setString(2, ct.getName());
            prest.setString(3, ct.getGender());
            prest.setString(4,  ct.getAddress());
            prest.setString(5, ct.getPhoneNumber());
            prest.setString(6, ct.getIDCard());
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
            String SQL = "DELETE FROM CUSTOMER WHERE ID = ?";
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
            String SQL = "UPDATE CUSTOMER SET NAME = ?, GENDER = ? WHERE ID = ?";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setString(1, ct.getName());
            prest.setString(2, ct.getGender());
            prest.setLong(3, ct.getId());
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
            String SQL = "SELECT * FROM CUSTOMER WHERE ID = " + id;
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery(SQL);
            while(rs.next())
                dotCustomer = new Customer_DTO(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6));
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
            String SQL = "SELECT * FROM CUSTOMER";
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery(SQL);
            while(rs.next())
            {
                Customer_DTO  ct = new Customer_DTO(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6));
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
