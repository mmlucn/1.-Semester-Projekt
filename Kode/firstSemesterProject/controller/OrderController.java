package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import model.*;

public class OrderController {
    private OrderContainer orderContainer;
    private PersonController personController;

    public OrderController() {
        orderContainer = OrderContainer.getInstance();
        personController = new PersonController();
    }

    public Order createOrder(ArrayList<OrderLine> orderLines, String shipmentDate, String shipmentAddress, String shipmentZip, String shipmentCity, String customerPhone){
        LocalDate shipDate = LocalDate.parse(shipmentDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        Customer customer = personController.findCustomer(customerPhone);
        Order newOrder = new Order(orderLines, shipDate, shipmentAddress, shipmentZip, shipmentCity, customer);
        orderContainer.addOrder(newOrder);
        return newOrder;
    }
}
