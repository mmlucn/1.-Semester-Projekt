package model;
import java.util.ArrayList;

public class SalesAssistent extends Person{
    private String department;
    private double totalSales;

    public SalesAssistent(String id, String firstName, String lastName, String address, 
    String zipCode, String city, String phoneNumber, String department, double totalSales)
    {
        super(id, firstName, lastName, address, zipCode, city, phoneNumber);
        this.department = department;
        this.totalSales = totalSales;
    }
    
    public String getDepartment(){
        return department;
    }
    
    public double getTotalSales(){
        return totalSales;
    }
    
    public void setDepartment(String Department){
        this.department = department;
    }
    
}
