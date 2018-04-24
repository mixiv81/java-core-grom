package lesson26;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        ArrayListTest arrayListTest = new ArrayListTest();

        Order order = new Order(1, 10, "usd", "aa", "aa");
        Order order1 = new Order(2,20, "usd", "bb", "bb");
        Order order2 = new Order(3,30, "usd", "cc", "cc");
        Order order4 = new Order(4,40, "usd", "dd", "dd");
        Order order5 = new Order(5,50, "usd", "ee", "ee");

        ArrayList<Order> list = new ArrayList<>();
        list.add(order);
        list.add(order1);
//        list.add(order2);
//        list.add(order4);
//        list.add(order5);

        System.out.println(arrayListTest.useList(list, order4, order5));
    }
}