package DTO;

public class Admin_DTO 
{
    private int id;
    private String firstName, lastName;
    private int userLoginId;

    public Admin_DTO() 
    {
        
    }

    public Admin_DTO(int id, String firstName, String lastName, int userLoginId) 
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userLoginId = userLoginId;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getUserLoginId() {
        return userLoginId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserLoginId(int userLoginId) {
        this.userLoginId = userLoginId;
    }
}
