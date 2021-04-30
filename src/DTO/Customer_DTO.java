package DTO;

import java.util.Date;

public class Customer_DTO
{
    private long id, userLoginID;
    private String name , gender, address, phoneNumber, idCard;
    private Date dateOfBirth;

    public Customer_DTO()
    {

    }
    
    public Customer_DTO(long id)
    {
        this.id = id;
    }
    
    public Customer_DTO(long id, String name, String gender, Date dateOfBirth, String address, String phoneNumber, String idCard)
    {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.idCard = idCard;
        //this.userLoginID = userLoginID;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getGender() {
        return gender;
    }
    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getIDCard() {
        return idCard;
    }
    
    public long getUserLoginID() {
        return userLoginID;
    }
    
}
