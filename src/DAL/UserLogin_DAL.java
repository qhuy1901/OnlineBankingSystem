package DAL;

import DTO.UserLogin_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UserLogin_DAL extends DBConnection
{
     public boolean check(UserLogin_DTO dtoUserLogin)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT ID FROM UserLogins WHERE Username = ? AND Password = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, dtoUserLogin.getUsername());
            ps.setString(2, dtoUserLogin.getPassword());
            ResultSet rs = ps.executeQuery();
            int LoginID = 0;
            while(rs.next())
                LoginID = rs.getInt(1);
            con.close();
                
            if(LoginID == 0)
                return false;
            else 
                return true;
            
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;    
    }
    
    public boolean isAdmin(UserLogin_DTO dtoUserLogin)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT Role FROM UserLogins WHERE Username = ? AND Password = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, dtoUserLogin.getUsername());
            ps.setString(2, dtoUserLogin.getPassword());
            ResultSet rs = ps.executeQuery();
            String role = "";
            while(rs.next())
                role = rs.getString(1);
            con.close();
            if(role.equals("Admin"))
                return true;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return false; 
    }
}


