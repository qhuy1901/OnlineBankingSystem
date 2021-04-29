package BUS;

import DAL.UserLogin_DAL;
import DTO.UserLogin_DTO;

public class UserLogin_BUS 
{
    UserLogin_DAL dal = new UserLogin_DAL();
    
    public boolean check(UserLogin_DTO dtoUserLogin)
    {
        return dal.check(dtoUserLogin);
    }
    
    public boolean isAdmin(UserLogin_DTO dtoUserLogin)
    {
        return dal.isAdmin(dtoUserLogin);
    }
}
