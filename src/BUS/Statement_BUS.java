package BUS;

import DAL.Customer_DAL;
import DAL.Transaction_DAL;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.Transaction_DTO;
import java.util.ArrayList;
import java.util.Date;

public class Statement_BUS 
{
    Transaction_DAL dalTransaction = new Transaction_DAL();
    Customer_DAL dalCustomer = new Customer_DAL();
    
    public ArrayList<Transaction_DTO> getBankStatement(Account_DTO dtoAccount, Date fromDate, Date toDate) 
    {
        return dalTransaction.getBankStatement(dtoAccount, fromDate, toDate);
    }
    
    public Customer_DTO getCustomerInfo(Account_DTO dtoAccount)
    {
        return dalCustomer.getCustomerInfo(dtoAccount);
    }
}