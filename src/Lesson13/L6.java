package Lesson13.L6;

import Lesson6.Order;


import java.util.Date;

public class L6 {
    public static void main(String[] args) {
        Order order = new Order(12, 1000, new Date(), false, new Date(), "Kiev", "Ukraine", "Buy");
        Order order1 = new Order(12, 1001, new Date(), true, new Date(), "Kiev", "Ukraine", "Other");
        Order order2 = new Order(12, Integer.MAX_VALUE, new Date(), false, new Date(), "Kiev", "Ukraine", "Buy");
        Order order3 = new Order(12, Integer.MIN_VALUE, new Date(), false, new Date(), "Kiev", "Ukraine", null);


        //checkPrice
        System.out.println(order.checkPrice());
        System.out.println(order1.checkPrice());
        System.out.println(order2.checkPrice());
        System.out.println(order3.checkPrice());

        //isConfirmed
        order.confirmOrder();
        System.out.println(order.isConfirmed());
        System.out.println();
        order1.confirmOrder();
        System.out.println(order1.isConfirmed());
        System.out.println();

        //isValidType
        System.out.println(order.isValidType());
        System.out.println(order1.isValidType());
        System.out.println(order3.isValidType());



    }
}