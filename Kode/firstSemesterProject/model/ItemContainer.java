package model;
import java.util.ArrayList;


/**
 * Write a description of class ItemContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ItemContainer
{
    // instance variables - replace the example below with your own
    private ArrayList<Item> items;
    private static ItemContainer instance;

    /**
     * Constructor for objects of class ItemContainer
     */
    public ItemContainer()
    {
        items = new ArrayList<>();
    }
    //Singleton
    public static ItemContainer getInstance(){
        if(instance == null){
            instance = new ItemContainer();
            }
        return instance;
    }
    
    public void addItem(Item item){
        this.items.add(item);
    }
    
    public ArrayList<Item> getItems(){
        return items;
    }
    
    public Item findItem(String barcode){
        int i = 0;
        boolean found = false;
        Item locatedItem = null;
        while(i < items.size() && !found){
            locatedItem = items.get(i);
            if(locatedItem.getBarcode().equals(barcode)){
                found = true;
            }
            else{
                i++;
            }
        }
        if(found){
            return items.get(i);
        }
        else{
            return null;
        }
        }
    }

