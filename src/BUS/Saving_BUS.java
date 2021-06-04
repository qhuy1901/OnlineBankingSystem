package BUS;
// Bus này chỉ dùng cho form Saving
import DAL.Account_Type_DAL;
import DAL.Account_DAL;
import DAL.User_Login_DAL;
import DTO.Account_Type_DTO;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.User_Login_DTO;
import java.util.ArrayList;
import java.util.TreeMap;

public class Saving_BUS 
{
    Account_DAL dalAccount = new Account_DAL();
    Account_Type_DAL dalAccountType = new Account_Type_DAL();
    User_Login_DAL dalUserLogin = new User_Login_DAL();
            
    public long getTotalSavingAccount(Customer_DTO dtoCustomer)
    {
        return dalAccount.getTotalSavingAccount(dtoCustomer);
    }
    
    public Account_Type_DTO getSavingsAccountType(String savingsAccountType, String term)
    {
        return dalAccountType.getSavingsAccountType(savingsAccountType, term);
    }

    public TreeMap<String, String> getAccountTypeList()
    {
        return dalAccountType.getAccountTypeList();
    }
    
    public User_Login_DTO getUserLogin(Customer_DTO dtoCustomer)
    {
        return dalUserLogin.getUserLogin(dtoCustomer);
    }

    public ArrayList<Account_DTO> getSavingsAccountList(Customer_DTO dtoCustomer)
    {
        return dalAccount.getSavingsAccountList(dtoCustomer);
    }
    
    public boolean openSavingsAccount(Account_DTO dtoAccount)
    {
        return dalAccount.openSavingsAccount(dtoAccount);
    }
    
    public boolean settle(Account_DTO dtoSavingAccount)
    {
        return dalAccount.settle(dtoSavingAccount);
    }
    
}
