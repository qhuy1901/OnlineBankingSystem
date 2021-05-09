package DTO;

import java.util.Date;

public class PaymentBill_DTO 
{
    private long id, supplierID, customerID, billAmount;
    private Date paymentDate;
    private String status;

    public PaymentBill_DTO() 
    {
        
    }

    public PaymentBill_DTO(long id, long supplierID, long customerID, long billAmount, Date paymentDate, String status) {
        this.id = id;
        this.supplierID = supplierID;
        this.customerID = customerID;
        this.billAmount = billAmount;
        this.paymentDate = paymentDate;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public long getSupplierID() {
        return supplierID;
    }

    public long getCustomerID() {
        return customerID;
    }

    public long getBillAmount() {
        return billAmount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSupplierID(long supplierID) {
        this.supplierID = supplierID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public void setBillAmount(long billAmount) {
        this.billAmount = billAmount;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


