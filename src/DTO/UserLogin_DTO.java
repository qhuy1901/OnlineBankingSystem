package DTO;

public class UserLogin_DTO 
{
    private int id;
    private String username, password, role;
    
    public UserLogin_DTO ()
    {
        
    }
    
    public UserLogin_DTO(String username, String password)
    {
        this.password = password;
        this.username = username;
    }
    
    public UserLogin_DTO(int id, String username, String password, String role)
    {
        this.id = id;
        this.password = password;
        this.username = username;
        this.role = role;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getRole()
    {
        return role;
    }
}

