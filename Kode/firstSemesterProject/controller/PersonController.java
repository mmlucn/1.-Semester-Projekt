package controller;
import model.*;

public class PersonController{
    private PersonContainer personContainer;
    
    public PersonController(){
        personContainer = PersonContainer.getInstance();
    }

    public void createCustomer(String firstName, String lastName, String address, String zipCode, String city, String phoneNumber, String companyName, String companyCode){ 
    Customer c = new Customer(firstName, lastName, address, zipCode, city, phoneNumber, companyName, companyCode);
        personContainer.addCustomer(c, phoneNumber);
    }

    public Customer findCustomer(String phoneNumber){
        return personContainer.findCustomer(phoneNumber);
    }

    public void updateCustomer(Customer customerToUpdate, String address, 
    String zipCode, String city, String phoneNumber){
        if (address != null){
            customerToUpdate.setAddress(address);
        }
        if (zipCode  != null){
            customerToUpdate.setZipCode(zipCode);
        }
        if (city  != null){
            customerToUpdate.setCity(city);
        }
        if (phoneNumber != null){
            customerToUpdate.setPhoneNumber(phoneNumber);
        }
    }
    
    public void deleteCustomer(String phoneNumber){
        personContainer.deleteCustomer(phoneNumber);
    }
    
    public void createSalesAssistent(String firstName, String lastName, String address, 
    String zipCode, String city, String phoneNumber, String department){ 
        SalesAssistent sa = new SalesAssistent(firstName, lastName, address, zipCode, city, 
        phoneNumber, department);
        personContainer.addSalesAssistent(sa);
    }

    public SalesAssistent findSalesAssistent(String id){
        return personContainer.findSalesAssistent(id);
    }

    public void updateSalesAssitent(SalesAssistent salesAssistentToUpdate, String address, 
    String zipCode, String city, String phoneNumber, String department){
        if (address != null){
            salesAssistentToUpdate.setAddress(address);
        }
        if (zipCode  != null){
            salesAssistentToUpdate.setZipCode(zipCode);
        }
        if (city  != null){
            salesAssistentToUpdate.setCity(city);
        }
        if (phoneNumber != null){
            salesAssistentToUpdate.setPhoneNumber(phoneNumber);
        }
        if (department != null){
            salesAssistentToUpdate.setDepartment(department);
        }
    }
    
    public void deleteSalesAssistent(String id){
        personContainer.deleteSalesAssistent(id);
    }
    
    
}