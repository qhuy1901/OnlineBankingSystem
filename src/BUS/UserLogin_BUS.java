/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.UserLogin_DAL;
import DTO.UserLogin_DTO;

/**
 *
 * @author ACER
 */
public class UserLogin_BUS 
{
    UserLogin_DAL dal = new UserLogin_DAL();
    
    public boolean check(UserLogin_DTO userLogin)
    {
        return dal.check(userLogin);
    }
}
