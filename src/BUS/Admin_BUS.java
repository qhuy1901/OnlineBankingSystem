package BUS;

import DAL.Admin_DAL;
import DTO.Admin_DTO;
import GUI.AdminGUI.AccountManagement_GUI;
import GUI.AdminGUI.CustomerManagement_GUI;
import GUI.AdminGUI.SupplierManagement_GUI;


public class Admin_BUS 
{
    Admin_DAL dal = new Admin_DAL();
    
   public void displayCustomerManagement_GUI(Admin_DTO dtoAdmin)
   {
       new CustomerManagement_GUI(dtoAdmin);
   }
   
   public void displayAccountManagement_GUI(Admin_DTO dtoAdmin)
   {
       new AccountManagement_GUI(dtoAdmin);
   }
   
   public void displaySupplierManagement_GUI(Admin_DTO dtoAdmin)
   {
       new SupplierManagement_GUI(dtoAdmin);
   }
}
