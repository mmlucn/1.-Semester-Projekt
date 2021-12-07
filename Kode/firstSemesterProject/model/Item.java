package model;


/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own 
    private String ID;
    private String name;
    private String description;
    private String barcode;
    private String location;
    private String placement;
    private Double quantity;
    private Double price;

    /**
     * Constructor for objects of class Item
     */
    public Item(String ID, String name, String description, String barcode, String location, String placement, Double quantity, Double price)
    {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.barcode = barcode;
        this.location = location;
        this.placement = placement;
        this.quantity = quantity;
        this.price = price;

    }
    
    public String getBarcode(){
        return barcode;
    }
    
    public void changeLocation(String newLocation){
        this.location = newLocation;
    }
    
    public void changePlacement(String newPlacement){
        this.placement = newPlacement;
    }
}
