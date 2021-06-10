package BUS;

import DAL.Customer_DAL;
import DAL.Report.Report_DAL;

import DTO.Customer_DTO;
import java.util.ArrayList;

public class CustomerManagement_BUS 
{
    Customer_DAL dalCustomer = new Customer_DAL();
    Report_DAL dalReport = new Report_DAL();
    
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
        dalReport.showCustomerList();
    }
   
}