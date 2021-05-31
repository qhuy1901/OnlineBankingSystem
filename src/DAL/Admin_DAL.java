package DAL;

import DTO.Admin_DTO;
import DTO.UserLogin_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Admin_DAL extends DBConnection
{
    public Admin_DTO getAdminInfo(UserLogin_DTO dtoUserLogin) // Từ password và username --> trả về thông tin người dùng
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
            Admin_DTO dtoAdmin = null;
            String SQL2 = "SELECT * FROM EMPLOYEE WHERE UserLogin_ID = ?"; 
            PreparedStatement ps2 = con.prepareStatement(SQL2);
            ps2.setLong(1, UserLoginID);
            ResultSet rs2 = ps2.executeQuery();
            while(rs2.next())
                dtoAdmin = new Admin_DTO(rs2.getInt(1), rs2.getString(2), rs2.getString(3), rs2.getInt(4)); 
            con.close();
            return dtoAdmin;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return null; 
    }
}
