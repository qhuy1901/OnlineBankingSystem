package BUS;


import DAL.Customer_DAL;
import DTO.Customer_DTO;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Customer_BUS 
{
    Customer_DAL dal = new Customer_DAL();
    
    public boolean insert(Customer_DTO ct)
    {
        return dal.insert(ct);
    }
    
    public boolean delete(Customer_DTO ct)
    {
        return dal.delete(ct);
    }
    
    public boolean update(Customer_DTO ct)
    {
        return dal.update(ct);
    }
    
    public Customer_DTO getInformation(long id)
    {
        return dal.getInformation(id);
    }
    
    public ArrayList<Customer_DTO> getCustomersList()
    {
        return dal.getCustomersList();
    }
}