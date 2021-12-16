package model;
import java.util.ArrayList;

public class SalesAssistent extends Person{
    private String department;
    private double totalSales;

    public SalesAssistent(String firstName, String lastName, String address, 
    String zipCode, String city, String phoneNumber, String department)
    {
        super(firstName, lastName, address, zipCode, city, phoneNumber);
        this.department = department;
        this.totalSales = 0.0;
    }
    
    public String getDepartment(){
        return department;
    }
    
    public double getTotalSales(){
        return totalSales;
    }
    
    public void setDepartment(String department){
        this.department = department;
    }
    
}
