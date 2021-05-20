package DAL;

import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.TransferDetail_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Account_DAL 
{
    public boolean openPaymentAccount(long customerId, long initialAmount)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "INSERT INTO ACCOUNT VALUES (ACCOUNT_ID_SEQUENCE.NEXTVAL, 'PA', ?, SYSDATE, NULL, NULL, 'Active',?)";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setLong(1, initialAmount);
            prest.setLong(2, customerId);
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
    
    public boolean lockAccount(long accountId)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "UPDATE ACCOUNT SET STATUS = 'Locked' WHERE ACCOUNT_ID = ?";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setLong(1, accountId);
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
    
    public boolean unlockAccount(long accountId)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "UPDATE ACCOUNT SET STATUS = 'Active' WHERE ACCOUNT_ID = ?";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setLong(1, accountId);
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
    
    public ArrayList<Account_DTO> getAccountList()
    {
            ArrayList<Account_DTO> accountList = new ArrayList<Account_DTO>();
        try
        {
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT * FROM ACCOUNT";
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery(SQL);
            while(rs.next())
            {
                Account_DTO  ac = new Account_DTO(rs.getLong(1), rs.getString(2), rs.getLong(3), rs.getDate(4), rs.getDate(5), rs.getLong(6),rs.getString(7), rs.getLong(8));
                accountList.add(ac);
            } 
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return accountList; 
    }
     
    /*public Account_DTO getInformation(long id)
      {
        Account_DTO dotAccount = null;
        try
        {
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT * , AT.NAME"
                    + "FROM ACCOUNT A JOIN ACCOUNT_TYPE AT ON A.ACCOUNT_TYPE_ID = AT.ACCOUNT_TYPE_ID"
                    + " WHERE ACCOUNT _ID = " + id;
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery(SQL);
            while(rs.next())
                 dotAccount = new Account_DTO(rs.getLong(1), rs.getLong(2), rs.getDate(3), rs.getString(4),rs.getString(5), rs.getLong(6));
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return dotAccount;
    }*/

    /*public boolean openSavingsAccount(Customer_DTO dtoCustomer, AccountType_DTO dtoAccountType, long amount)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "BEGIN\n"
                            + "SAVINGS_ACCOUNT(?, ?, ?);\n" +
                         "END;";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setLong(1, dtoCustomer.getId());
            prest.setString(2, dtoAccountType.getId());
            prest.setLong(3, amount);
            prest.executeUpdate();
            
            return true;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);    
        }
        return false;
    }
    
    public int openSavingsAccount3(Customer_DTO dtoCustomer, AccountType_DTO dtoAccountType, long amount)
    {
        int savingAccountId = 1;
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "{call SAVINGS_ACCOUNT2(?, ?, ?, ?)}";
            CallableStatement cstmt = con.prepareCall(SQL);
            cstmt.setLong(1, dtoCustomer.getId());
            cstmt.setString(2, dtoAccountType.getId());
            cstmt.setLong(3, amount);
            cstmt.registerOutParameter(4, java.sql.Types.NUMERIC);
            cstmt.execute();
            JOptionPane.showConfirmDialog(null, dtoAccountType.getId() + " " + cstmt.getInt(4), "hi", JOptionPane.CLOSED_OPTION);
            savingAccountId = cstmt.getInt(4);
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);    
        }
        return savingAccountId;
    }*/
    
    public boolean openSavingsAccount(Account_DTO dtoNewSavingAccount)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String strCall = "{call OPEN_SAVINGS_ACCOUNT(?, ?, ?, ?, ?)}";
            CallableStatement caSt = con.prepareCall(strCall);
            caSt.setLong(1, dtoNewSavingAccount.getCustomerID());
            caSt.setString(2, dtoNewSavingAccount.getAccountTypeID());
            caSt.setLong(3, dtoNewSavingAccount.getCurrentBalance());
            Date sqlMaturityDate = new java.sql.Date(dtoNewSavingAccount.getMaturityDate().getTime());
            caSt.setDate(4, sqlMaturityDate);
            caSt.setLong(5, dtoNewSavingAccount.getAnticipatedInterest());
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
    
    public boolean isValidPaymentAccount(Account_DTO dtoAccount)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT Account_ID, Status FROM Account WHERE Account_ID = ? AND Account_Type_ID = 'PA'";
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
            String SQL = "SELECT SUM(CURRENT_BALANCE) FROM Account WHERE CUSTOMER_ID = ? AND ACCOUNT_TYPE_ID LIKE '%SA%' AND STATUS = 'Active'";
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

    /*public boolean transfer(TransferDetail_DTO dtoTransferDetail)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String strCall = "{call transfer(?, ?, ?, ?, ?)}";
            CallableStatement caSt = con.prepareCall(strCall);
            caSt.setLong(1, dtoTransferDetail.getSenderAccount());
            caSt.setLong(2, dtoTransferDetail.getReceiverAccount());
            caSt.setString(3, dtoTransferDetail.getReceiverBank());
            caSt.setLong(4, dtoTransferDetail.getAmount());
            caSt.setString(5, dtoTransferDetail.getContent());
            caSt.execute();
            con.close();
            return true;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);    
        }
        return false;
    }*/
    
    public int transfer(TransferDetail_DTO dtoTransferDetail)
    {
        int transactionID = 0;
        try{
            Connection con = DBConnection.ConnectDb();
            String strCall = "{call transfer2(?, ?, ?, ?, ?, ?)}";
            CallableStatement caSt = con.prepareCall(strCall);
            caSt.setLong(1, dtoTransferDetail.getSenderAccount());
            caSt.setLong(2, dtoTransferDetail.getReceiverAccount());
            caSt.setString(3, dtoTransferDetail.getReceiverBank());
            caSt.setLong(4, dtoTransferDetail.getAmount());
            caSt.setString(5, dtoTransferDetail.getContent());
            caSt.registerOutParameter(6, java.sql.Types.NUMERIC);
            caSt.executeUpdate();
            transactionID = caSt.getInt(6);
            con.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);    
        }
        return transactionID;
    }
    
    public ArrayList<Account_DTO> getSavingsAccountList(Customer_DTO dtoCustomer)
    {
        ArrayList<Account_DTO> accountList = new ArrayList<Account_DTO>();
        try
        {
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT * FROM ACCOUNT WHERE CUSTOMER_ID = ? AND ACCOUNT_TYPE_ID LIKE '%SA%' AND STATUS = 'Active'";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setLong(1, dtoCustomer.getId());
            ResultSet rs = prest.executeQuery();
            while(rs.next())
            {
                Account_DTO dtoAccount = new Account_DTO(rs.getLong(1), rs.getString(2), rs.getLong(3), rs.getDate(4), rs.getDate(5), rs.getLong(6),rs.getString(7), rs.getLong(8));
                accountList.add(dtoAccount);
            } 
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return accountList; 
    }
    
    public boolean settle(Account_DTO dtoSavingAccount)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String strCall = "{call settlement(?)}";
            CallableStatement caSt = con.prepareCall(strCall);
            caSt.setLong(1, dtoSavingAccount.getId());
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
}
