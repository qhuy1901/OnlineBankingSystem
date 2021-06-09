package BUS;

import DAL.Customer_DAL;
import DAL.Transaction_DAL;
import DAL.Transaction_Type_DAL;
import DAL.Transfer_Detail_DAL;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.Transaction_DTO;
import DTO.Transaction_Type_DTO;
import DTO.Transfer_Detail_DTO;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

public class Statement_BUS 
{
    Transaction_DAL dalTransaction = new Transaction_DAL();
    Transaction_Type_DAL dalTransactionType = new Transaction_Type_DAL();
    Customer_DAL dalCustomer = new Customer_DAL();
    Transfer_Detail_DAL dalTransferDetail = new Transfer_Detail_DAL();
    
    public ArrayList<Transaction_DTO> getStatement(Account_DTO dtoAccount, Date fromDate, Date toDate) 
    {
        return dalTransaction.getStatement(dtoAccount, fromDate, toDate);
    }
    
    public TreeMap<String, Transaction_Type_DTO> getTransactionTypeList()
    {
        return dalTransactionType.getTransactionTypeList();
    }
    
    public Customer_DTO getCustomerInfo(Account_DTO dtoAccount)
    {
        return dalCustomer.getCustomerInfo(dtoAccount);
    }
    
    public Transfer_Detail_DTO getTransferDetail(int transactionId)
    {
        return dalTransferDetail.getTransferDetail(transactionId);
    }
}