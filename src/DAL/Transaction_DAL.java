package DAL;

import DTO.Account_DTO;
import DTO.Transaction_DTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Transaction_DAL extends DBConnection
{
    public boolean insert(Transaction_DTO dtoTransaction)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "INSERT INTO Transaction VALUES (TransactionID_Sequence.nextval, ?, ?, ?, ?, ?, ?)";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setString(1, dtoTransaction.getTransactionTypeID());
            Date sqlTrasactionDate = new java.sql.Date(dtoTransaction.getTrasactionDate().getTime());
            prest.setDate(2, sqlTrasactionDate); // TO_DATE(?, 'MON DD, YYYY')
            prest.setLong(3,  dtoTransaction.getTotalTransactionAmount());
            prest.setInt(4, dtoTransaction.getAccountID());
            //prest.setString(7, dtoTransaction.getIDCard());
            prest.executeUpdate();
            return true;
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);    
        }
        return false;
    }
    
    public String getLatestTransactionDate(Account_DTO dtoAccount)
    {
        String latestTransactionDate = "";
        try
        {
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT TRANSACTION_DATE\n" +
                        "FROM TRANSACTION\n" +
                        "WHERE ACCOUNT_ID = ?\n" +
                        "AND ROWNUM = 1\n" +
                        "ORDER BY TRANSACTION_ID DESC";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setLong(1, dtoAccount.getId());
            ResultSet rs = prest.executeQuery();
            while(rs.next())
                latestTransactionDate = rs.getString(1);
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return latestTransactionDate;
    }
    
    public ArrayList<Transaction_DTO> getTransactionHistory(Account_DTO dtoAccount)
    {
        ArrayList<Transaction_DTO> transactionList = new ArrayList<Transaction_DTO>();
        try
        {
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT *\n" +
                        "FROM (SELECT * FROM TRANSACTION WHERE account_id = ? ORDER BY transaction_id DESC)\n" +
                        "WHERE ROWNUM <= 15 "; //Hiển thị 15 giao dịch gần nhất
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setLong(1, dtoAccount.getId());
            ResultSet rs = prest.executeQuery();
            while(rs.next())
            {
                Transaction_DTO dtoTransaction = new Transaction_DTO(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getLong(4), rs.getInt(5));
                transactionList.add(dtoTransaction);
            } 
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return transactionList; 
    }
}
