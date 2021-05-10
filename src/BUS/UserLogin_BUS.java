package BUS;

import DAL.UserLogin_DAL;
import DTO.Admin_DTO;
import DTO.Customer_DTO;
import DTO.UserLogin_DTO;

public class UserLogin_BUS 
{
    UserLogin_DAL dal = new UserLogin_DAL();
    
    public boolean checkPassword(UserLogin_DTO dtoUserLogin)
    {
        return dal.checkPassword(dtoUserLogin);
    }
    
    public boolean checkRole(UserLogin_DTO dtoUserLogin)
    {
        return dal.checkRole(dtoUserLogin);
    }
    
    public Customer_DTO getCustomerInfo(UserLogin_DTO dtoUserLogin)
    {
        return dal.getCustomerInfo(dtoUserLogin);
    }
    
    public Admin_DTO getAdminInfo(UserLogin_DTO dtoUserLogin)
    {
        return dal.getAdminInfo(dtoUserLogin);
    }
}
