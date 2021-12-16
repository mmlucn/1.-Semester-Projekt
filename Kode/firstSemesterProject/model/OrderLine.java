package model;

public class OrderLine {
    private double quantity;
    private Item item;
    
    public OrderLine(String barcode, double qty) {
        item = ItemContainer.getInstance().findItem(barcode);
    }

    public boolean isValid(){
        if (item != null){
            return true;
        }
        return false;
    }
    
    public Item getItem(){
        return item;
    }
}
