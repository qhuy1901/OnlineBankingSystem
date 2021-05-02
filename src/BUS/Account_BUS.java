package BUS;

import DAL.Account_DAL;
import DTO.Account_DTO;

public class Account_BUS 
{
    Account_DAL dal = new Account_DAL();
    
    public boolean deduct(Account_DTO dtoAccount, long money)
    {
        return dal.deduct(dtoAccount, money);
    }
    
    public boolean increase(Account_DTO dtoAccount, long money)
    {
        return dal.increase(dtoAccount, money);
    }
    
    public boolean isValidAccount(Account_DTO dtoAccount)
    {
        return dal.isValidAccount(dtoAccount);
    }
}
