package BUS;
//Bus này chỉ sử dụng cho form Transfer

import DAL.Account_DAL;
import DAL.Customer_DAL;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.TransferDetail_DTO;
import DTO.UserLogin_DTO;


public class Transfer_BUS 
{
    Account_DAL dalAccount = new Account_DAL();
    Customer_DAL dalCusstomer = new Customer_DAL();
    
    
    public UserLogin_DTO getUserLogin(Customer_DTO dtoCustomer)
    {
        return dalCusstomer.getUserLogin(dtoCustomer);
    }
    
    public boolean isValidAccount(Account_DTO dtoAccount)
    {
        return dalAccount.isValidAccount(dtoAccount);
    }
    
    public boolean transfer(TransferDetail_DTO dtoTransferDetail)
    {
        return dalAccount.transfer(dtoTransferDetail);
    }
}
