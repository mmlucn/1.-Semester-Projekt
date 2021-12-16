package tui;

import model.Customer;
import model.Item;
import model.ItemContainer;
import model.OrderContainer;
import model.PersonContainer;

public class TestData {
    public static void addTestData(){
        PersonContainer personContainer = PersonContainer.getInstance();
        OrderContainer orderContainer = OrderContainer.getInstance();
        ItemContainer itemContainer = ItemContainer.getInstance();


        personContainer.addCustomer(new Customer("Malthe", "Larsen", "vej1", "9000", "Aalborg", "12345678", "WorldsBestCompany", "1231"), "12345678");
        itemContainer.addItem(new Item("0", "NKT gipsskruer 3,5mm x 300mm", "Gipsskrue med torx 20 hovede", "5701291502291", "DIY", "8888", 10000.0, 1.0));
        itemContainer.addItem(new Item("1", "Faxe Kondi", "Læskedrik", "5741000109151", "DIY", "1111", 100.0, 15.0));
        
    }
}
