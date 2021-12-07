package model;

public class Customer extends Person{
    private String companyName;
    private String companyCode;

    public Customer(String id, String firstName, String lastName, String address, 
    String zipCode, String city, String phoneNumber, String companyName, String companyCode)
    {
        super(id, firstName, lastName, address, zipCode, city, phoneNumber);
        this.companyName = companyName;
        this.companyCode = companyCode;
    }
    
    public String getCompanyName(){
        return companyName;
    }
    
    public String getCompanyCode(){
        return companyCode;
    }
    
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    
    public void setCompanyCode(String companyCode){
        this.companyCode = companyCode;
    }
    
}
