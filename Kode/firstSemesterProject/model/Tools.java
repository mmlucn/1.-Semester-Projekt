package model;


public class Tools{
    private String name;
    private String id;
    private String description;
    private String barcode;
    private String location;
    private String placement;
    private double quantity;
    private double pricePerDay;

    public Tools(String id, String name, String description, String barcode, 
    String location, String placement, Double quantity, Double pricePerDay){
        this.name = name;
        this.id = id;
        this.description = description;
        this.barcode = barcode;
        this.location = location;
        this.placement = placement;
        this.quantity = quantity;
        this.pricePerDay = pricePerDay;
        
    }

    public String getBarcode(){
        return barcode;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
}
