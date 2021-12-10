package model;
import java.time.LocalDate;

public class Loan{
    private LocalDate startDate;
    private LocalDate endDate;
    private String toolCondition;

    public Loan(LocalDate startDate, LocalDate endDate, String toolCondition, int days){
        this.toolCondition = toolCondition;
        this.startDate = LocalDate.now();
        this.endDate = LocalDate.now().plusDays(days);
        
    }
    
    public String getToolCondition() {
        return toolCondition;
    }

}
