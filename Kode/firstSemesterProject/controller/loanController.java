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
    
    public Loan createLoan(Tools tools, LocalDate startDate, LocalDate endDate, String ToolsCondition){
        LocalDate sDate = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate eDate = LocalDate.parse(endDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        Tools tools = ToolsController.findTools(barcode);
        Loan newLoan = new Loan(tools, startDate, endDate, ToolsCondition);
        Loan.addLoan(newLoan);
        return newLoan;
    }
    
    public void returnTool(Tools tools){
    }
    
    

    
    
}
