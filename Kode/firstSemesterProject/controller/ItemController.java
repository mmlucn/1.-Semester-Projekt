package controller;

import model.*;
/**
 * Write a description of class ItemController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ItemController
{
    private ItemContainer itemCont;

    /**
     * Constructor for objects of class ItemController
     */
    public ItemController()
    {
        itemCont = ItemContainer.getInstance();
    }
    
    public Item findItem(String barcode){
        return itemCont.findItem(barcode);
    }
    
    public void createItem(String ID, String name, String description, String barcode, String location, String placement, Double quantity, Double price){
        Item itemObject = new Item(ID, name, description, barcode, location, placement, quantity, price);
        itemCont.addItem(itemObject);
    }
}
