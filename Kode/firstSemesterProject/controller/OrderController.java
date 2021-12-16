package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;

import model.Item;
import model.Order;
import model.OrderContainer;
import model.OrderLine;

public class OrderController {
    private OrderContainer orderContainer;
    private PersonController personController;
    private ItemController itemController;

    public OrderController() {
        orderContainer = OrderContainer.getInstance();
        personController = new PersonController();
        itemController = new ItemController();
    }

    public Order createOrder(ArrayList<OrderLine> orderLines, String shipmentDate, String shipmentAddress, String shipmentZip, String shipmentCity){
        LocalDate shipDate = LocalDate.parse(shipmentDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        Order newOrder = new Order(orderLines, shipDate, shipmentAddress, shipmentZip, shipmentCity);
        orderContainer.addOrder(newOrder);
        return newOrder;
    }
}
