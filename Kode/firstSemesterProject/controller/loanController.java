package controller;
import model.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class LoanController{
    private LoanContainer loanContainer;
    private PersonContainer personcontainer;
    private ToolsContainer toolsContainer;
    
    public LoanController(){
        loanContainer = loanContainer.getInstance();
        personcontainer = PersonContainer.getInstance();
        toolsContainer = ToolsContainer.getInstance();
    }
    
    // public Loan createLoan(Tools tools, LocalDate startDate, LocalDate endDate, String ToolsCondition){
        
    // }
    
    // public void returnTool(Tools tools){
    // }
    
    

    
    
}
