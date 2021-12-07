package model;

import java.util.ArrayList;

public class OrderContainer {
    private static OrderContainer instance;
    
    private ArrayList<Order> orders;

    private OrderContainer(){
        orders = new ArrayList<Order>();
    }

    public static OrderContainer getInstance(){
        if (instance == null){
            instance = new OrderContainer();
        }
        return instance;
    }

    public boolean addOrder(Order order){
        return orders.add(order);
    }
}
