package DAL;

import DTO.Account_DTO;
import DTO.Customer_DTO;
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
            String SQL = "UPDATE Account SET Current_Balance = Current_Balance + ? WHERE Account_ID = ?";
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
    
    public boolean deduct(Account_DTO dtoAccount, long money)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "UPDATE Account SET Current_Balance = Current_Balance - ? WHERE Account_ID = ?";
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
            String SQL = "SELECT Account_ID, Status FROM Account WHERE Account_ID = ?";
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
    
    public long getTotalSavingAccount(Customer_DTO dtoCustomer)
    {
        long totalSavingAccount = 0;
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT SUM(CURRENT_BALANCE) FROM Account WHERE CUSTOMER_ID = ? AND ACCOUNT_TYPE_ID = 'SA'";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setLong(1, dtoCustomer.getId());
            ResultSet rs = prest.executeQuery();
            while(rs.next())
            {
                totalSavingAccount = rs.getLong(1);
            } 
            con.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);    
        }
        return totalSavingAccount;
    }
    
    public boolean transfer(Account_DTO senderAccount, Account_DTO receiverAccount, String transactionType, long Amount)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "BEGIN\n"
                            + "transfer(?, ?, ?, ?);\n" +
                         "END;";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setLong(1, senderAccount.getId());
            prest.setLong(2, receiverAccount.getId());
            prest.setString(3, transactionType);
            prest.setLong(4, Amount);
            prest.executeUpdate();
            return true;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);    
        }
        return false;
    }
}
