package BUS;
// Bus này chỉ dùng cho form thanh toán hóa đơn (Payment)
import DAL.Bill_DAL;
import DAL.Supplier_DAL;
import DAL.User_Login_DAL;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.Bill_DTO;
import DTO.Supplier_DTO;
import DTO.User_Login_DTO;
import GUI.Report.Report;
import java.util.ArrayList;

public class Payment_BUS 
{
    Bill_DAL dalPaymentBill = new Bill_DAL();
    Supplier_DAL dalSupplier = new Supplier_DAL();
    User_Login_DAL dalUserLogin = new User_Login_DAL();
    Report report = new Report();
    
    public boolean payment(Bill_DTO dtoBill, Account_DTO dtoAccount)
    {
        return dalPaymentBill.payment(dtoBill, dtoAccount);
    }
    
    public Bill_DTO getBillInformation(Customer_DTO dtoCustomer, Supplier_DTO dtoSupplier, int month, int year)
    {
        return dalPaymentBill.getBillInformation(dtoCustomer, dtoSupplier, month, year);
    }
     
    public User_Login_DTO getUserLogin(Customer_DTO dtoCustomer)
    {
        return dalUserLogin.getUserLogin(dtoCustomer);
    }
    
    public ArrayList<String> getServiceTypeList()
    {
        return dalSupplier.getServiceTypeList();
    }
    
    public ArrayList<Supplier_DTO> getSupplierNameList(String serviceType)
    {
        return dalSupplier.getSupplierNameList(serviceType);
    }
    
    public void showTransferReceipt(long billID) 
    {
        report.showPaymentReceipt(billID);
    }
}
