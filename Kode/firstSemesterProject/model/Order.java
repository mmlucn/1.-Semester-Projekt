package model;
import java.time.*;
import java.util.ArrayList;

public class Order
{
    private LocalDate orderDate;
    private ArrayList<OrderLine> orderLines;
    private LocalDate deliveryDate;
    private String shipmentAddress;
    private String shipmentZip;
    private String shipmentCity;
    private double total = 0.0;
    private double vat;
    private Customer customer;
    
    public Order(ArrayList<OrderLine> orderLines, LocalDate shipmentDate, String shipmentAddress, String shipmentZip, String shipmentCity, Customer customer)
    {
        this.setOrderDate(LocalDate.now());
        this.setOrderLines(orderLines);
        this.setDeliveryDate(shipmentDate);
        this.setShipmentAddress(shipmentAddress);
        this.setShipmentZip(shipmentZip);
        this.setShipmentCity(shipmentCity);
        orderLines.forEach(o -> this.total += o.getItem().getPrice());
        //Til gruppe: udtrykket jeg bruger her kaldes for lambda expression. I kan læse om det her: https://www.w3schools.com/java/java_lambda.asp
        this.setVat(total * 1.25);
    }

    public double getVat() {
        return vat;
    }

    private void setVat(double vat) {
        this.vat = vat;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    private void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<OrderLine> getOrderLines() {
        return orderLines;
    }

    private void setOrderLines(ArrayList<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getShipmentAddress() {
        return shipmentAddress;
    }

    public void setShipmentAddress(String shipmentAddress) {
        this.shipmentAddress = shipmentAddress;
    }

    public String getShipmentZip() {
        return shipmentZip;
    }

    public void setShipmentZip(String shipmentZip) {
        this.shipmentZip = shipmentZip;
    }

    public String getShipmentCity() {
        return shipmentCity;
    }

    public void setShipmentCity(String shipmentCity) {
        this.shipmentCity = shipmentCity;
    }
}
