package BUS;
// Bus này chỉ dùng cho form Saving
import DAL.Account_DAL;
import DTO.Customer_DTO;

public class Saving_BUS 
{
    Account_DAL dalAccount = new Account_DAL();
    
    public long getTotalSavingAccount(Customer_DTO dtoCustomer)
    {
        return dalAccount.getTotalSavingAccount(dtoCustomer);
    }
}
