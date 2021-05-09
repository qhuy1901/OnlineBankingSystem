package BUS;

import DAL.Supplier_DAL;
import DTO.Supplier_DTO;

public class Supplier_BUS 
{
    Supplier_DAL dal = new Supplier_DAL();
    
    public Supplier_DTO getInformation(String name)
    {
        return dal.getInformation(name);
    }
}
