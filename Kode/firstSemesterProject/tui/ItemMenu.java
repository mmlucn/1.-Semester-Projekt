package tui;
import controller.*;

import java.util.Scanner;

import javax.lang.model.type.ArrayType;

import org.w3c.dom.Text;

public class ItemMenu
{
    ItemController itemController;

     
    public ItemMenu()
    {
        itemController = new ItemController();
    }

    public void menu(){
        boolean shouldRun = true;
        while (shouldRun){
            int choice = writeMenu();
            if (choice == 1){
                createItem();
            }
            else{
                shouldRun = false;
            }
            if (choice == 2){
                findItem();
            }
            else{
                shouldRun = false;
            }
            if (choice == 3){
                updateItem();
            }
            else{
                shouldRun = false;
            }
            if (choice == 4){
                deleteItem();
            }
            else{
                shouldRun = false;
            }
        }
    }

    private int writeMenu(){
        TextOptions menu = new TextOptions("\n ----- ItemMenu ----", "Tilbage");
        menu.addOption("Opret produkt");
        menu.addOption("find produkt");
        menu.addOption("opdater produkt");
        menu.addOption("slet produkt");
        return menu.prompt();
    }

    public void createItem(){
        //Item item = new Item(ID, name, description, barcode, location, placement, quantity, price)
        String ID = TextInput.inputString("Indtast id");
        String name = TextInput.inputString("Indtast navn");
        String description = TextInput.inputString("Indtast beskrivelse");
        String barString = TextInput.inputString("Scan stregkode");
        String loc = TextInput.inputString("Indtast location");
        String plac = TextInput.inputString("Indtast placering");
        double qty = TextInput.inputDouble("Indtast antal (kommatal)");
        double pris = TextInput.inputDouble("Indtast pris");
        itemController.createItem(ID, name, description, barString, loc, plac, qty, pris);
        System.out.println(name + " er blevet tilføjet");
    }

    public void findItem(){
        String barcode = TextInput.inputString("Indtast stregkode/Scan stregkode");
        System.out.println(item);
        
    }

    public void updateItem(){

    }

    public void deleteItem(){

    }

    public void print(String text){
        System.out.println(text);
    }
}
