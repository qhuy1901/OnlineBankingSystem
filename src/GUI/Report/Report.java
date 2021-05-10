
package GUI.Report;

public class Report extends JasperReports 
{
    public void showPaymentBill(long billID) 
    {
        m_report_source = "Payment.jrxml";
        m_sql_stmt = "SELECT * \n" +
        "FROM (CUSTOMER C JOIN BILL B ON C.CUSTOMER_ID = B.CUSTOMER_ID) JOIN SUPPLIER S ON S.SUPPLIER_ID = B.SUPPLIER_ID \n" +
                "WHERE B.BILL_ID = " + billID;
        showReport();
    }
}
