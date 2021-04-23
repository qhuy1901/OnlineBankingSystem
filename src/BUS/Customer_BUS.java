package BUS;


import DAL.Customer_DAL;
import DTO.Customer_DTO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

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
    
    public ArrayList<Customer_DTO> getCustomersList()
    {
        return dal.getCustomersList();
    }
}