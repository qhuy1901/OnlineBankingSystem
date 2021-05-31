package BUS;

// Bus này dùng cho form menu của Customer (Customer_GUI) và Customer_Mangagement
import DAL.Customer_DAL;

import DTO.Customer_DTO;
import GUI.Report.Report;
import java.util.ArrayList;

public class CustomerManagement_BUS 
{
    Customer_DAL dalCustomer = new Customer_DAL();
    Report report = new Report();
    
    public boolean insert(Customer_DTO dtoCustomer)
    {
        return dalCustomer.insert(dtoCustomer);
    }
    
    public boolean delete(Customer_DTO dtoCustomer)
    {
        return dalCustomer.delete(dtoCustomer);
    }
    
    public boolean update(Customer_DTO dtoCustomer)
    {
        return dalCustomer.update(dtoCustomer);
    }
    
    public Customer_DTO getInformation(long id)
    {
        return dalCustomer.getInformation(id);
    }
    
    
    public ArrayList<Customer_DTO> getCustomersList()
    {
        return dalCustomer.getCustomersList();
    }
    
    public void showCustomerList() 
    {
        report.showCustomerList();
    }
   
}