package tui;

import java.util.ArrayList;
import controller.OrderController;
import controller.PersonController;
import model.OrderLine;

public class OrderMenu {

    private OrderController orderController;
    private PersonController personController;
    
    public OrderMenu() {
        orderController = new OrderController();
    }

    public void menu(){
        boolean shouldRun = true;
        while (shouldRun){
            int choice = writeMenu();
            if (choice == 1){
                createOrder();
            }
            else {
                shouldRun = false;
            }
        }
    }

    private void createOrder() {
        boolean shouldRun = true;
        ArrayList<OrderLine> orderLines = new ArrayList<>();
        String shipAddr;
        String shipZip;
        String shipCity;
        String customerPhone =TextInput.inputString("Indtast tlf. nr. på kunde (999 for kontant)");
        while (shouldRun){
            String input = TextInput.inputString("Scan produkt");
            if (!input.equals("")){
                double qty = TextInput.inputDouble("Indtast antal (kommatal)");
                OrderLine orderLine = new OrderLine(input, qty);
                if (orderLine.isValid()){
                    orderLines.add(orderLine);
                }
                else {
                    System.out.println("Produktet kunne ikke findes, prøv igen");
                }
            }
            else{
                shouldRun = false;
            }
        }
        System.out.println((orderLines.size() + (orderLines.size() > 1 ? " produkter" : " produkt") + " tilføjet"));
        shipAddr = TextInput.inputString("Indtast addresse");
        shipZip = TextInput.inputString("Indtast postnummer");
        shipCity = TextInput.inputString("Indtast by");
        orderController.createOrder(orderLines, "24-12-2021", shipAddr, shipZip, shipCity, customerPhone);
    }

    private int writeMenu() {
        TextOptions menu = new TextOptions("\n ----- Order Menu ----", "Tilbage");
        menu.addOption("Create order");
        return menu.prompt();
    }
}
