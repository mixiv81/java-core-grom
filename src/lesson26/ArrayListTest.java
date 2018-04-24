package lesson26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

    public List<Order> useList(ArrayList<Order> list, Order order1, Order order2) {
        ArrayList<Order> list1 = new ArrayList<>();
        int i = 0;
        while (i < 2) {
            list1.add(order1);
            i++;
        }
        list1.add(1, order2);
        list1.remove(order2);
        list1.remove(0);
        list.addAll(list1);
        list.set(0, order1);

        Order[] orders = new Order[list.size()];
        System.out.println(Arrays.toString(list.toArray(orders)));

        if (list1.contains(order1))
            list1.clear();

        if (list.size() > 5) {
            list.subList(5, list.size()).clear();
        }
        if (list.size() < 5) {
            while (list.size() < 5)
                list.add(order1);
        }
        return list;
    }
}
