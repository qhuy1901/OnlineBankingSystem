package BUS;

import DAL.Transaction_DAL;
import DTO.Account_DTO;
import DTO.Transaction_DTO;
import java.util.ArrayList;

public class Transaction_BUS 
{
    Transaction_DAL dal = new Transaction_DAL();
    
    public String getLatestTransactionDate(Account_DTO dtoAccount)
    {
        return dal.getLatestTransactionDate(dtoAccount);
    }
    
    public ArrayList<Transaction_DTO> getTransactionHistory(Account_DTO dtoAccount)
    {
        return dal.getTransactionHistory(dtoAccount);
    }
}
