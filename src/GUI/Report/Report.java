
package GUI.Report;

public class Report extends JasperReports 
{
    public void showPaymentBill(long billID) 
    {
        m_report_source = "PaymentReceipt.jrxml";
        m_sql_stmt = "SELECT B.BILL_ID, B.BILL_AMOUNT, B.INVOICE_DATE, B.PAYMENT_DATE, C.CUSTOMER_ID, C.FIRST_NAME || ' ' || C.LAST_NAME FULL_NAME, B.SUPPLIER_ID, S.SUPPLIER_NAME, S.SERVICE_TYPE\n" +
                        "FROM ((CUSTOMER C JOIN BILL B ON C.CUSTOMER_ID = B.CUSTOMER_ID) \n" +
                        "        JOIN SUPPLIER S ON S.SUPPLIER_ID = B.SUPPLIER_ID)\n" +
                        "            JOIN SUPPLIER S ON S.SUPPLIER_ID = B.SUPPLIER_ID\n" +
                        "WHERE B.BILL_ID = " + billID;
        showReport();
    }
    
    public void showTransferReceipt(long transactionID) 
    {
        m_report_source = "TransferReceipt.jrxml";
        m_sql_stmt = "select T.TRANSACTION_ID, T.TRANSACTION_DATE, T.TOTAL_TRANSACTION_AMOUNT, TP.NAME, TP.FEE, TD.AMOUNT, TD.SENDER_ACCOUNT, TD.RECEIVER_ACCOUNT, TD.CONTENT , C.FIRST_NAME || ' ' || C.LAST_NAME FULL_NAME\n" +
                    "from (((TRANSACTION T JOIN TRANSACTION_TYPE TP USING(TRANSACTION_TYPE_ID))\n" +
                    "        JOIN TRANSFER_DETAIL TD ON TD.TRANSACTION_ID= T.TRANSACTION_ID)\n" +
                    "            JOIN ACCOUNT A ON A.ACCOUNT_ID = TD.RECEIVER_ACCOUNT)\n" +
                    "                JOIN CUSTOMER C ON C.CUSTOMER_ID = A.CUSTOMER_ID\n" +
                    "WHERE T.TRANSACTION_ID = " + transactionID;
        showReport();
    }
}
