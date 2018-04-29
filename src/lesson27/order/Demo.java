package lesson27.order;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedListTest linkedListTest = new LinkedListTest();

        Order order = new Order(1, 10, "usd", "aa", "aa");
        Order order1 = new Order(2,20, "usd", "bb", "bb");
        Order order2 = new Order(3,30, "usd", "cc", "cc");
        Order order4 = new Order(4,40, "usd", "dd", "dd");
        Order order5 = new Order(5,50, "usd", "ee", "ee");

        LinkedList<Order> list = new LinkedList<>();
        list.add(order);
        list.add(order1);
//        list.add(order2);
//        list.add(order4);
//        list.add(order5);

        System.out.println(linkedListTest.useList(list, order4, order5));
    }
}
