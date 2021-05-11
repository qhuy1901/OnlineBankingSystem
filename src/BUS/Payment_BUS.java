package BUS;
// Bus này chỉ dùng cho form thanh toán hóa đơn (Payment)
import DAL.PaymentBill_DAL;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.PaymentBill_DTO;
import DTO.Supplier_DTO;

public class Payment_BUS 
{
    PaymentBill_DAL dalPaymentBill = new PaymentBill_DAL();
    
    public boolean payment(PaymentBill_DTO dtoBill, Account_DTO dtoAccount)
    {
        return dalPaymentBill.payment(dtoBill, dtoAccount);
    }
    
     public PaymentBill_DTO getBill(Customer_DTO dtoCustomer, Supplier_DTO dtoSupplier)
    {
        return dalPaymentBill.getBill(dtoCustomer, dtoSupplier);
    }
     
}
