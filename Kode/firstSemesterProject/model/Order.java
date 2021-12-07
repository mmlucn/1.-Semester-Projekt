package Kode.firstSemesterProject.model;
import java.time.*;
import java.util.ArrayList;


public class Order
{
    private LocalDate orderDate;
    private double vat;
    private double total;
    private String shipmentAddress;
    private String shipmentZip;
    private String shipmentCity;
    private LocalDate deliveryDate;
    private ArrayList<OrderLine> orderLines;
    
    public Order()
    {
        
    }
}
