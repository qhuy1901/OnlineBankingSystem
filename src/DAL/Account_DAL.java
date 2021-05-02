package DAL;

import DTO.Account_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Account_DAL 
{
    public boolean increase(Account_DTO dtoAccount, long money)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "UPDATE Account SET CurrentBalance = CurrentBalance + ? WHERE ID = ?";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setLong(1, money);
            prest.setLong(2, dtoAccount.getId());
            prest.executeUpdate();
            JOptionPane.showConfirmDialog(null, "Chuyển tiền thành công 2", "Thành công", JOptionPane.CLOSED_OPTION);
            return true;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);    
        }
        return false;
    }
    
    public boolean deduct(Account_DTO dtoAccount, long money)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "UPDATE Account SET CurrentBalance = CurrentBalance - ? WHERE ID = ?";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setLong(1, money);
            prest.setLong(2, dtoAccount.getId());
            prest.executeUpdate();
            return true;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);    
        }
        return false;
    }
    
    public boolean isValidAccount(Account_DTO dtoAccount)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT ID, Status FROM Account WHERE ID = ?";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setLong(1, dtoAccount.getId());
            ResultSet rs = prest.executeQuery();
            long accountId = 0;
            String status = "";
            while(rs.next())
            {
                accountId = rs.getLong(1);
                status = rs.getString(2);
            } 
            con.close();
            if(accountId != 0 && status.equals("Active"))
                return true;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);    
        }
        return false;
    }
}
