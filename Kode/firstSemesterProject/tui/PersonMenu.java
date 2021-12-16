package tui;

import controller.PersonController;
import model.PersonContainer;

public class PersonMenu {
    private PersonController personController;

    public PersonMenu() {
        personController = new PersonController();
    }

    public void menu(){
        boolean shouldRun = true;
        while (shouldRun){
            int choice = writeMenu();
            if (choice == 1){
                createPerson();
            }
        }
    }
    private int writeMenu() {
        TextOptions menu = new TextOptions("\n ---- Kunde menu ----", "Tilbage");
        menu.addOption("Opret kunde");
        return menu.prompt();
    }

    public void createPerson(){
        personController.createCustomer(TextInput.inputString("Indtast fornavn"),
        TextInput.inputString("Indtast efternavn"),
        TextInput.inputString("Indtast addresse"),
        TextInput.inputString("Indtast postnummer"),
        TextInput.inputString("Indtast by"),
        TextInput.inputString("Indtast tlf. nr."),
        TextInput.inputString("Indtast firmanavn"),
        TextInput.inputString("Vælg en kode som skal oplyses ved køb"));
    }

    public void findPerson(){

    }

    public void updatePerson(){

    }

    public void deletePerson(){
        personController.deleteCustomer(TextInput.inputString("Indtast tlf. nr. på kunden der skal slettes."));
    }

}
