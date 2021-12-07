package controller;

import java.time.LocalDate;

import model.Item;
import model.Order;
import model.OrderContainer;

public class OrderController {
    private OrderContainer orderContainer;
    private PersonController personController;
    private ItemController itemController;

    public OrderController() {
        
    }

    public Order createOrder(Item[] items, LocalDate shipmentDate, String shipmentAddress, String shipmentZip, String shipmentCity){
        Order newOrder = new Order(items, shipmentDate, shipmentAddress, shipmentZip, shipmentCity);
        orderContainer.addOrder(newOrder);
        return newOrder;
    }
}
