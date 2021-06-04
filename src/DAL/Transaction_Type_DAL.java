package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TreeMap;

public class Transaction_Type_DAL 
{
    public TreeMap<String, String> getTransactionTypeList()
    {
        TreeMap<String, String> transactionTypeList = new TreeMap<String, String>();
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT TRANSACTION_TYPE_ID, NAME FROM TRANSACTION_TYPE";
            PreparedStatement prest = con.prepareStatement(SQL);
            ResultSet rs = prest.executeQuery();
            while(rs.next())
            {
                transactionTypeList.put(rs.getString(1), rs.getString(2));
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return transactionTypeList;
    }
}
