package lesson7;

import lesson6.Order;

import java.util.Date;

public class DemoHomeWork {

    public Order createOrder() {
        return new Order(123,1000, new Date(), true, new Date(), "kiev", "Ukraine", "Buy");
    }

    public Order createOrderAndCallMethods() {
        Order newOrder = new Order(100, 2000, new Date(), true, new Date(), "Kiev", "Ukraine", "SomeValue");
        newOrder.confirmOrder();
        newOrder.checkPrice();
        newOrder.isValidType();
        return newOrder;
    }
}
