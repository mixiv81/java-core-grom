package gromcode.main.lesson29;

import java.util.HashSet;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {
        Order order = new Order(1, 10, "usd", "aa", "aa");
        Order order1 = new Order(2, 20, "usd", "bb", "bb");
        Order order2 = new Order(3, 30, "usd", "cc", "cc");
        Order order4 = new Order(4, 40, "usd", "dd", "dd");
        Order order5 = new Order(5, 50, "usd", "ee", "ee");

        HashSetTest hashSetTest = new HashSetTest();

        Set<Order> orderSet = new HashSet<>();
        orderSet.add(order);
        orderSet.add(order1);
        orderSet.add(order2);
        orderSet.add(order4);
        orderSet.add(order5);

        hashSetTest.useHashSet(orderSet);
    }
}
