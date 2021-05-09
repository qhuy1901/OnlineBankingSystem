package DAL;

import DTO.Supplier_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Supplier_DAL 
{
    //Có thể bỏ
    public Supplier_DTO getInformation(String name)
    {
        Supplier_DTO dotSupplier = null;
        try
        {
            Connection con = DBConnection.ConnectDb();
            String SQL = "SELECT * FROM SUPPLIER WHERE SUPPLIER_NAME = ?";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setString(1, name);
            ResultSet rs = prest.executeQuery();
            while(rs.next())
                dotSupplier = new Supplier_DTO(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getDate(4), rs.getString(5), rs.getString(6));
            con.close();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return dotSupplier; 
    }
}
