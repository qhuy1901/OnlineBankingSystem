package DAL.Report;

import DAL.*;
import DAL.DBConnection;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Report_DAL 
{
    String m_where;
    String m_report_source = "/customer/";
    String m_sql_stmt;
    Map parametersMap = new HashMap();
    
    protected void showReport() 
    {
        try {
            DBConnection dbUtilities = new DBConnection();
            InputStream is = getClass().getResourceAsStream(m_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(m_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMap,
            dbUtilities.ConnectDb());
            JasperViewer.viewReport(jasperPrint, false);
        } 
        catch (JRException e) 
        {
            System.out.println("Exception message " + e.getMessage());
        }
    }
    
    public void showPaymentReceipt(long billID) 
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
    
    public void showCustomerList() 
    {
        m_report_source = "Customer.jrxml";
        m_sql_stmt = "SELECT C.CUSTOMER_ID, FIRST_NAME || ' ' || LAST_NAME FULL_NAME, C.GENDER, C.DATE_OF_BIRTH, C.ADDRESS, C.PHONE_NUMBER, C.ID_CARD, A.ACCOUNT_ID, STATUS, REVENUE\n" +
                    "FROM CUSTOMER C JOIN ACCOUNT A ON C.CUSTOMER_ID = A.CUSTOMER_ID\n"
                    + "WHERE ACCOUNT_TYPE_ID = 'PA'";
        showReport();
    }
    
    
    public void showSupplierList() 
    {
        m_report_source = "SupplierReport.jrxml";
        m_sql_stmt = "SELECT * FROM SUPPLIER";
        showReport();
    }
}
