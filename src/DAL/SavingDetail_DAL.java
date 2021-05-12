package DAL;

import DTO.SavingDetail_DTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

class SavingDetail_DAL extends DBConnection
{
    public boolean saveSavingDetail(SavingDetail_DTO dtoSavingDetail)
    {
        /*try{
            // Tìm mã 
            Connection con = DBConnection.ConnectDb();
            String SQL = "INSERT INTO CUSTOMER(CUSTOMER_ID, FIRST_NAME, LAST_NAME, GENDER, DATE_OF_BIRTH, ADDRESS, PHONE_NUMBER, ID_CARD) "
                    + " VALUES (CUSTOMER_ID_SEQUENCE.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement prest = con.prepareStatement(SQL);
            prest.setString(1, ct.getFirstName());
            prest.setString(2, ct.getLastName());
            prest.setString(3, ct.getGender());
            Date sqlDateOfBirth = new java.sql.Date(ct.getDateOfBirth().getTime());
            prest.setDate(4, sqlDateOfBirth); // TO_DATE(?, 'MON DD, YYYY')
            prest.setString(5,  ct.getAddress());
            prest.setString(6, ct.getPhoneNumber());
            prest.setString(7, ct.getIDCard());
            prest.executeUpdate();
            return true;
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);    
        }*/
        return false;
    }
}
