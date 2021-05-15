package BUS;

import DAL.Account_DAL;
import DTO.Account_DTO;
import java.util.ArrayList;

public class Account_BUS 
{
    Account_DAL dal = new Account_DAL();

    /*public Account_DTO getInformation(long id)
    {
        return dal.getInformation(id);
    }*/
    
    public ArrayList<Account_DTO> getAccountList()
    {
        return dal.getAccountList();
    }
    
    public boolean openPaymentAccount(long customerId, long initialAmount)
    {
        return dal.openPaymentAccount(customerId, initialAmount);
    }
    
    public boolean lockAccount(long accountId)
    {
        return dal.lockAccount(accountId);
    }
    
    public boolean unlockAccount(long accountId)
    {
        return dal.unlockAccount(accountId);
    }
    
    public boolean isValidAccount(Account_DTO dtoAccount)
    {
        return dal.isValidAccount(dtoAccount);
    }
}
