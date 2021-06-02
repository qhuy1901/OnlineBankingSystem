package BUS;

import DAL.AccountType_DAL;
import DAL.Account_DAL;
import DTO.Account_DTO;
import java.util.ArrayList;
import java.util.TreeMap;

public class AccountManagement_BUS 
{
    Account_DAL dalAccount = new Account_DAL();
    AccountType_DAL dalAccountType = new AccountType_DAL();
    
    public ArrayList<Account_DTO> getAccountList()
    {
        return dalAccount.getAccountList();
    }
    
    public TreeMap<String, String> getAccountTypeList()
    {
        return dalAccountType.getAccountTypeList();
    }
    
    public boolean openPaymentAccount(long customerId, long initialAmount)
    {
        return dalAccount.openPaymentAccount(customerId, initialAmount);
    }
    
    public boolean lockAccount(long accountId)
    {
        return dalAccount.lockAccount(accountId);
    }
    
    public boolean unlockAccount(long accountId)
    {
        return dalAccount.unlockAccount(accountId);
    }
}
