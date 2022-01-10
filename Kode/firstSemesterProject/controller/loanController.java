package controller;
import model.*;


public class LoanController{
    private LoanContainer loanContainer;
    private PersonContainer personcontainer;
    private ToolsContainer toolsContainer;
    
    public LoanController(){

        loanContainer = LoanContainer.getInstance();
        personcontainer = PersonContainer.getInstance();
        toolsContainer = ToolsContainer.getInstance();
    }
}
