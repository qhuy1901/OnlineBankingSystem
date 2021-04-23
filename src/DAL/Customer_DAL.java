/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
            String SQL = "insert into CUSTOMER values (?, ?, ?, ?, ?, ?)";
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
