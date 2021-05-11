package DAL;

import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.Bill_DTO;
import DTO.Supplier_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PaymentBill_DAL 
{
    public boolean payment(Bill_DTO dtoBill, Account_DTO dtoAccount)
    {
        try{
            Connection con = DBConnection.ConnectDb();
            String SQL = "BEGIN\n"
                            + "payment(? , ?);\n" +
                         "END;";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setLong(1, dtoAccount.getId());
            prest.setLong(2, dtoBill.getId());
            prest.executeUpdate();
            return true;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);    
        }
        return false;
    }
    
    public Bill_DTO getBill(Customer_DTO dtoCustomer, Supplier_DTO dtoSupplier)
    {
        Bill_DTO dotBill = null;
        try
        {
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT B.BILL_ID, B.SUPPLIER_ID, CUSTOMER_ID, BILL_AMOUNT, PAYMENT_DATE, STATUS\n"
                    + "FROM BILL B JOIN SUPPLIER S ON B.SUPPLIER_ID = S.SUPPLIER_ID\n"
                    + "WHERE CUSTOMER_ID = ? AND SUPPLIER_NAME = ? AND STATUS = 'Unpaid'";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setLong(1, dtoCustomer.getId());
            prest.setString(2, dtoSupplier.getName());
            prest.executeUpdate();
            ResultSet rs = prest.executeQuery();
            
            while(rs.next())
            {
                dotBill  = new Bill_DTO(rs.getLong(1), rs.getLong(2), rs.getLong(3), rs.getLong(4), rs.getDate(5), rs.getString(6));
            }
                
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return dotBill;
    }
}
