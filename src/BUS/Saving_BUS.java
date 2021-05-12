package BUS;
// Bus này chỉ dùng cho form Saving
import DAL.AccountType_DAL;
import DAL.Account_DAL;
import DAL.Customer_DAL;
import DTO.AccountType_DTO;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.UserLogin_DTO;
import java.util.ArrayList;

public class Saving_BUS 
{
    Account_DAL dalAccount = new Account_DAL();
    AccountType_DAL dalAccountType = new AccountType_DAL();
    Customer_DAL dalCustomer = new Customer_DAL();
    
    public long getTotalSavingAccount(Customer_DTO dtoCustomer)
    {
        return dalAccount.getTotalSavingAccount(dtoCustomer);
    }
    
    public AccountType_DTO getSavingsAccountType(String savingsAccountType, String term)
    {
        return dalAccountType.getSavingsAccountType(savingsAccountType, term);
    }
    
    public boolean openSavingsAccount(Customer_DTO dtoCustomer, AccountType_DTO dtoSavingsAccountType, long amount)
    {
        return dalAccount.openSavingsAccount(dtoCustomer, dtoSavingsAccountType, amount);
    }
    
    public UserLogin_DTO getUserLogin(Customer_DTO dtoCustomer)
    {
        return dalCustomer.getUserLogin(dtoCustomer);
    }
    
    public int openSavingsAccount2(Customer_DTO dtoCustomer, AccountType_DTO dtoAccountType, long amount)
    {
        return dalAccount.openSavingsAccount2(dtoCustomer, dtoAccountType,amount);
    }
    
    public ArrayList<Account_DTO> getSavingsAccountList(Customer_DTO dtoCustomer)
    {
        return dalAccount.getSavingsAccountList(dtoCustomer);
    }
}
