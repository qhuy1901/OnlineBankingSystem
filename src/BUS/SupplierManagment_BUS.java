package BUS;

import DAL.Supplier_DAL;
import DTO.Supplier_DTO;
import DAL.Report.Report_DAL;
import java.util.ArrayList;

public class SupplierManagment_BUS 
{
    Supplier_DAL dal = new Supplier_DAL();
    Report_DAL dalReport = new Report_DAL();

    public ArrayList<Supplier_DTO> getSupplierList()
    {
        return dal.getSupplierList();
    }
    
    public ArrayList<String> getServiceTypeList()
    {
        return dal.getServiceTypeList();
    }
    
    public boolean insert(Supplier_DTO dtoSupplier)
    {
        return dal.insert(dtoSupplier);
    }
    
    public boolean update(Supplier_DTO dtoSupplier)
    {
        return dal.update(dtoSupplier);
    }
    
    public boolean delete(Supplier_DTO dtoSupplier)
    {
        return dal.delete(dtoSupplier);
    }
    
    public void showSupplierList() 
    {
        dalReport.showSupplierList();
    }
}
