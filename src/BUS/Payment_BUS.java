package BUS;
// Bus này chỉ dùng cho form thanh toán hóa đơn (Payment)
import DAL.Bill_DAL;
import DAL.UserLogin_DAL;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.Bill_DTO;
import DTO.Supplier_DTO;
import DTO.UserLogin_DTO;

public class Payment_BUS 
{
    Bill_DAL dalPaymentBill = new Bill_DAL();
    UserLogin_DAL dalUserLogin = new UserLogin_DAL();
    
    public boolean payment(Bill_DTO dtoBill, Account_DTO dtoAccount)
    {
        return dalPaymentBill.payment(dtoBill, dtoAccount);
    }
    
     public Bill_DTO getBill(Customer_DTO dtoCustomer, Supplier_DTO dtoSupplier, int month, int year)
    {
        return dalPaymentBill.getBill(dtoCustomer, dtoSupplier, month, year);
    }
     
    public UserLogin_DTO getUserLogin(Customer_DTO dtoCustomer)
    {
        return dalUserLogin.getUserLogin(dtoCustomer);
    }
}
