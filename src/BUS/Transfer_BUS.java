package BUS;
//Bus này chỉ sử dụng cho form Transfer

import DAL.Account_DAL;
import DAL.UserLogin_DAL;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.TransferDetail_DTO;
import DTO.UserLogin_DTO;


public class Transfer_BUS 
{
    Account_DAL dalAccount = new Account_DAL();
    UserLogin_DAL dalUserLogin = new UserLogin_DAL();
    
    public UserLogin_DTO getUserLogin(Customer_DTO dtoCustomer)
    {
        return dalUserLogin.getUserLogin(dtoCustomer);
    }
    
    public boolean isValidPaymentAccount(Account_DTO dtoAccount)
    {
        return dalAccount.isValidPaymentAccount(dtoAccount);
    }
    
    public boolean transfer(TransferDetail_DTO dtoTransferDetail)
    {
        return dalAccount.transfer(dtoTransferDetail);
    }
}
