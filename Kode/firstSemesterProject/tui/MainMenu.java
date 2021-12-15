package tui;

public class MainMenu {

    private ItemMenu itemMenu;

        public MainMenu() {
            itemMenu = new ItemMenu();
        }

        public void start(){
            boolean shouldRun = true;
            while (shouldRun){
                int choice = writeMainMenu();
                if (choice == 1){
                    itemMenu.menu();
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
            return menu.prompt();
        }
    
}
