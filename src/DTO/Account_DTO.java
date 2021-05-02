package DTO;

import java.util.Date;

public class Account_DTO 
{
    private long id;
    private long currentBalance;
    private Date openDay;
    private String accountTypeID;
    private double interestRate;
    private String Status;
    private long CustomerID;

    public Account_DTO() 
    {
        
    }

    public Account_DTO(long id) 
    {
        this.id = id;
    }
    
    public Account_DTO(long id, long currentBalance, Date openDay, String accountTypeID, double interestRate, String Status, long CustomerID) 
    {
        this.id = id;
        this.currentBalance = currentBalance;
        this.openDay = openDay;
        this.accountTypeID = accountTypeID;
        this.interestRate = interestRate;
        this.Status = Status;
        this.CustomerID = CustomerID;
    }

    public long getId() 
    {
        return id;
    }

    public long getCurrentBalance() 
    {
        return currentBalance;
    }

    public Date getOpenDay() 
    {
        return openDay;
    }

    public String getAccountTypeID() 
    {
        return accountTypeID;
    }

    public double getInterestRate() 
    {
        return interestRate;
    }

    public String getStatus() 
    {
        return Status;
    }

    public long getCustomerID() {
        return CustomerID;
    }

    public void setId(long id) 
    {
        this.id = id;
    }

    public void setCurrentBalance(long currentBalance) 
    {
        this.currentBalance = currentBalance;
    }

    public void setOpenDay(Date openDay) 
    {
        this.openDay = openDay;
    }

    public void setAccountTypeID(String accountTypeID) 
    {
        this.accountTypeID = accountTypeID;
    }

    public void setInterestRate(double interestRate) 
    {
        this.interestRate = interestRate;
    }

    public void setStatus(String Status) 
    {
        this.Status = Status;
    }

    public void setCustomerID(long CustomerID) 
    {
        this.CustomerID = CustomerID;
    }
}
