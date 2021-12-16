package controller;
import model.*;

public class loanController{
    private LoanContainer loanContainer;
    private PersonContainer personContainer;
    private ToolsContainer toolsContainer;
    
    public loanController(){
        personContainer = PersonContainer.getInstance();
        toolsContainer = toolsContainer.getInstance();
        loanContainer = loanContainer.getInstance();
    }

    
    
}
