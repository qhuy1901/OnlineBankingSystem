package BUS;

import DAL.Account_DAL;
import DAL.Customer_DAL;
import DTO.Account_DTO;
import DTO.Customer_DTO;

public class Deposit_BUS 
{
    Account_DAL dalAccount = new Account_DAL();
    Customer_DAL dalCustomer = new Customer_DAL();
    
    /*public ArrayList<Account_DTO> findAccountId(String customerName)
    {
        return dalAccount.findAccountId(customerName);
    }*/
    
    public Customer_DTO getCustomerInfo(Account_DTO dtoAccount)
    {
        return dalCustomer.getCustomerInfo(dtoAccount);
    }
    
    public boolean openPaymentAccount(long customerId, long initialAmount)
    {
        return dalAccount.openPaymentAccount(customerId, initialAmount);
    }
    
    public Customer_DTO getInformation(long id)
    {
        return dalCustomer.getInformation(id);
    }
    
    public boolean deposit(Account_DTO dtoAccount, long amount)
    {
        return dalAccount.deposit(dtoAccount, amount);
    }
}
