package BUS;
// Bus này chỉ dùng cho form LogIn
import DAL.Admin_DAL;
import DAL.Customer_DAL;
import DAL.UserLogin_DAL;
import DTO.Admin_DTO;
import DTO.Customer_DTO;
import DTO.UserLogin_DTO;

public class Login_BUS 
{
    UserLogin_DAL dalUserLogin = new UserLogin_DAL();
    Admin_DAL dalAdmin = new Admin_DAL();
    Customer_DAL dalCustomer = new Customer_DAL();
    
    public boolean checkPassword(UserLogin_DTO dtoUserLogin)
    {
        return dalUserLogin.checkPassword(dtoUserLogin);
    }
    
    public boolean checkRole(UserLogin_DTO dtoUserLogin)
    {
        return dalUserLogin.checkRole(dtoUserLogin);
    }
    
    public Customer_DTO getCustomerInfo(UserLogin_DTO dtoUserLogin)
    {
        return dalCustomer.getCustomerInfo(dtoUserLogin);
    }
    
    public Admin_DTO getAdminInfo(UserLogin_DTO dtoUserLogin)
    {
        return dalAdmin.getAdminInfo(dtoUserLogin);
    }
}
