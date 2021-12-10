package tui;
import controller.*;
import java.util.Scanner;

public class ItemUI
{
    // instance variables - replace the example below with your own
    private ItemController itemController;

    /**
     * Constructor for objects of class ItemUI
     */
    private Scanner scanner = new Scanner(System.in);   
    public ItemUI()
    {
        // initialise instance variables
        boolean shouldRun = true;
        while (shouldRun){
            print("1. Create a new item");
            print("2. Find an item");
            print("3. Update an item");
            print("4. Delete an item");
            int choice = scanner.nextInt();
            if (choice == 1)
                createItem();
            else if (choice == 2)
                findItem();
            else if (choice == 3)
                updateItem();
            else if (choice == 4)
                deleteItem();
            else
                print("Invalid choice");
        }
    }

    public void createItem(){
        String itemName;
        
        boolean shouldRun = true;
        while (shouldRun){
            print("Item name:");
            itemName = scanner.next();
        }
    }

    public void findItem(){

    }

    public void updateItem(){

    }

    public void deleteItem(){

    }

    public void print(String text){
        System.out.println(text);
    }
}
