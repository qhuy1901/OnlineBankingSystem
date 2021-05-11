package BUS;

// Bus này dùng cho form menu của Customer (Customer_GUI) và Customer_Mangagement
import DAL.Customer_DAL;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.UserLogin_DTO;
import java.util.ArrayList;

public class Customer_BUS 
{
    Customer_DAL dal = new Customer_DAL();
    
    public boolean insert(Customer_DTO dtoCustomer)
    {
        return dal.insert(dtoCustomer);
    }
    
    public boolean delete(Customer_DTO dtoCustomer)
    {
        return dal.delete(dtoCustomer);
    }
    
    public boolean update(Customer_DTO dtoCustomer)
    {
        return dal.update(dtoCustomer);
    }
    
    public Customer_DTO getInformation(long id)
    {
        return dal.getInformation(id);
    }
    
    public Account_DTO getPaymentAccount(Customer_DTO dtoCustomer)
    {
        return dal.getPaymentAccount(dtoCustomer);
    }
    
    public UserLogin_DTO getUserLogin(Customer_DTO dtoCustomer)
    {
        return dal.getUserLogin(dtoCustomer);
    }
    
    public ArrayList<Customer_DTO> getCustomersList()
    {
        return dal.getCustomersList();
    }
}