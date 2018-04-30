package lesson28.task2;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {

        Capability capability1 = new Capability(1001, "test", "kkkk", false, null);
        Capability capability2 = new Capability(1002, null, "kkkk", false, new Date());
        Capability capability3 = new Capability(1000, "test", "kkkk", true, new Date());


        Set<Capability> set = new TreeSet<>();
        set.add(capability1);
        set.add(capability2);
        set.add(capability3);

        System.out.println(set);
    }
}
