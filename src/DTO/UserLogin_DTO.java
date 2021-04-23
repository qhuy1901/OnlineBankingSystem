/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author ACER
 */
public class UserLogin_DTO 
{

    private String username, password;
    
    public UserLogin_DTO ()
    {
        
    }
    
    public UserLogin_DTO(String username, String password)
    {
        this.password = password;
        this.username = username;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
}
