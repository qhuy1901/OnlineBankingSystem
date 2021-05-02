package DAL;

import DTO.Transaction_DTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}
