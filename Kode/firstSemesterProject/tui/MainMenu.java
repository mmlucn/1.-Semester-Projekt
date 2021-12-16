package tui;

import model.Order;

public class MainMenu {

    private ItemMenu itemMenu;
    private OrderMenu orderMenu;

        public MainMenu() {
            itemMenu = new ItemMenu();
            orderMenu = new OrderMenu();
        }

        public void start(){
            boolean shouldRun = true;
            while (shouldRun){
                int choice = writeMainMenu();
                if (choice == 1){
                    itemMenu.menu();
                }
                else if(choice == 2){
                    orderMenu.menu();
                }
                else if(choice == 3){
                    
                }
                else if(choice == 4){
                    TestData.addTestData();
                }
                else{
                    shouldRun = false;
                }
            }
        }

        private int writeMainMenu() {
            TextOptions menu = new TextOptions("\n --- Hovedmenu ---", "Afslut");
            menu.addOption("Produkt menu");
            menu.addOption("Order menu");
            menu.addOption("Kunde menu");
            menu.addOption("Tilføj test data");
            return menu.prompt();
        }
    
}
