package BUS;
//Bus này chỉ sử dụng cho form Transfer

import DAL.Account_DAL;
import DAL.Customer_DAL;
import DAL.UserLogin_DAL;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.TransferDetail_DTO;
import DTO.UserLogin_DTO;
import GUI.Report.Report;

public class Transfer_BUS 
{
    Account_DAL dalAccount = new Account_DAL();
    Customer_DAL dalCustomer = new Customer_DAL();
    UserLogin_DAL dalUserLogin = new UserLogin_DAL();
    Report report = new Report();
    
    public Customer_DTO getCustomerInfo(Account_DTO dtoAccount)
    {
        return dalCustomer.getCustomerInfo(dtoAccount);
    }
    
    public UserLogin_DTO getUserLogin(Customer_DTO dtoCustomer)
    {
        return dalUserLogin.getUserLogin(dtoCustomer);
    }
    
    public boolean isValidPaymentAccount(Account_DTO dtoAccount)
    {
        return dalAccount.isValidPaymentAccount(dtoAccount);
    }
    
    public int transfer(TransferDetail_DTO dtoTransferDetail)
    {
        return dalAccount.transfer(dtoTransferDetail);
    }
    
    public void showTransferReceipt(long transactionID) 
    {
        report.showTransferReceipt(transactionID);
    }
}
