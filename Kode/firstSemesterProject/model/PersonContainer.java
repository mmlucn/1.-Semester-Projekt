package model;
import java.util.ArrayList;
import java.util.HashMap;

public class PersonContainer{
    private static PersonContainer instance;
    private ArrayList<SalesAssistent> salesAssistents;
    private HashMap<String, Customer> customers; //<key: tlf,val: Customer>

    private PersonContainer(){
        salesAssistents = new ArrayList<>();  
        customers = new HashMap<String, Customer>();
        customers.put("999", new Customer("Kontant", null, null, null, null, null, null, null));
    }

    public static PersonContainer getInstance(){
        if(instance == null){
            instance = new PersonContainer();
        }
        return instance;
    }

    public void addCustomer(Customer customer, String phoneNumber){
        customers.put(phoneNumber, customer);
    }

    public boolean deleteCustomer(String phoneNumber){
        boolean found = false;
        Customer c = findCustomer(phoneNumber);
        if(c!= null){
            customers.remove(phoneNumber);
            found = true;
        }
        return found;
    }

    public Customer findCustomer(String phoneNumber){
        Customer c = null;
        c = customers.get(phoneNumber);
        return c;
    }
    
    public void addSalesAssistent(SalesAssistent salesAssistent){
        salesAssistents.add(salesAssistent);
    }
    
    public boolean deleteSalesAssistent(String id){
        boolean found = false;
        SalesAssistent sa = findSalesAssistent(id);
        if(sa != null){
            salesAssistents.remove(sa);
            found = true;
        }
        return found;
    }

    public SalesAssistent findSalesAssistent(String id){
        SalesAssistent sa = null;      
        int index = 0;     
        boolean found = false; 
        while(index < salesAssistents.size() && !found){
            sa = salesAssistents.get(index); 
            if(sa.getId().equals(id)){ 
                found = true;
            }
            else{
                index++; 
            }
        } 
        if (found){
            return salesAssistents.get(index);
        }
        else{   
            return null;
        }

    }
    
    
}
