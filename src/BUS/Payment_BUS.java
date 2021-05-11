package BUS;
// Bus này chỉ dùng cho form thanh toán hóa đơn (Payment)
import DAL.Customer_DAL;
import DAL.PaymentBill_DAL;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.Bill_DTO;
import DTO.Supplier_DTO;
import DTO.UserLogin_DTO;

public class Payment_BUS 
{
    PaymentBill_DAL dalPaymentBill = new PaymentBill_DAL();
    Customer_DAL dalCustomer = new Customer_DAL();
    
    public boolean payment(Bill_DTO dtoBill, Account_DTO dtoAccount)
    {
        return dalPaymentBill.payment(dtoBill, dtoAccount);
    }
    
     public Bill_DTO getBill(Customer_DTO dtoCustomer, Supplier_DTO dtoSupplier)
    {
        return dalPaymentBill.getBill(dtoCustomer, dtoSupplier);
    }
     
    public UserLogin_DTO getUserLogin(Customer_DTO dtoCustomer)
    {
        return dalCustomer.getUserLogin(dtoCustomer);
    }
     
}
