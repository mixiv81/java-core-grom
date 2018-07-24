package gromcode.main.lesson29;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

    public Set<Order> useHashSet(Set<Order> orderSet) {
        Set<Order> orderSet1 = new HashSet<>();

        int i = 0;
        while (i < 10) {
            orderSet1.add(new Order(1 + i, 10, "usd", "aa", "aa"));
            i++;
        }

        orderSet1.remove(new Order(10, 10, "usd", "aa", "aa"));

        Iterator<Order> orderIterator = orderSet1.iterator();
        while (orderIterator.hasNext())
            System.out.println(orderIterator.next().getId());

        Object[] orders = orderSet1.toArray();
        System.out.println(Arrays.toString(orders));


        orderSet1.retainAll(orderSet);

        System.out.println(orderSet1.size());

        return orderSet1;
    }
}
