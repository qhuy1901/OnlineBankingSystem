package DTO;

import java.util.Date;

public class SavingDetail_DTO 
{
    private int id;
    private Date maturityDate;
    private long anticipatedInterest;
    private long totalReceivedAmount;
    private int accountId;

    public SavingDetail_DTO() 
    {
    }

    public SavingDetail_DTO(Date maturityDate, long anticipatedInterest, long totalReceivedAmount) {
        this.maturityDate = maturityDate;
        this.anticipatedInterest = anticipatedInterest;
        this.totalReceivedAmount = totalReceivedAmount;
    }

    
    public SavingDetail_DTO(int id, Date maturityDate, long anticipatedInterest, long totalReceivedAmount, int accountId) 
    {
        this.id = id;
        this.maturityDate = maturityDate;
        this.anticipatedInterest = anticipatedInterest;
        this.totalReceivedAmount = totalReceivedAmount;
        this.accountId = accountId;
    }

    public int getId() 
    {
        return id;
    }

    public Date getMaturityDate() 
    {
        return maturityDate;
    }

    public long getAnticipatedInterest() 
    {
        return anticipatedInterest;
    }

    public long getTotalReceivedAmount() 
    {
        return totalReceivedAmount;
    }

    public int getAccountId() 
    {
        return accountId;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public void setMaturityDate(Date maturityDate) 
    {
        this.maturityDate = maturityDate;
    }

    public void setAnticipatedInterest(long anticipatedInterest) 
    {
        this.anticipatedInterest = anticipatedInterest;
    }

    public void setTotalReceivedAmount(long totalReceivedAmount) 
    {
        this.totalReceivedAmount = totalReceivedAmount;
    }

    public void setAccountId(int accountId) 
    {
        this.accountId = accountId;
    }
    
    
}
