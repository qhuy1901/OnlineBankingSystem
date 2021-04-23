/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.UserLogin_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class UserLogin_DAL extends DBConnection
{
    public boolean check(UserLogin_DTO login)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT ID FROM UserLogins WHERE Username = ? AND Password = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, login.getUsername());
            ps.setString(2, login.getPassword());
            Statement stat = con.createStatement();
            ResultSet rs = ps.executeQuery();
            String LoginID = "";
            while(rs.next())
            {
                LoginID = rs.getString(1);
            }
            
            if(LoginID.equals(""))
                return false;
            else 
                return true;
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;    
    }
}
