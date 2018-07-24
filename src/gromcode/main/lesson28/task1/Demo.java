package gromcode.main.lesson28.task1;

import java.util.ArrayList;
import java.util.Date;

public class Demo {

    public static void main(String[] args) {
        Capability capability1 = new Capability(1001, "test", "kkkk", false, null);
        Capability capability2 = new Capability(1002, null, "kkkk", false, new Date());
        Capability capability3 = new Capability(1000, "test", "kkkk", true, new Date());
        Capability capability4 = new Capability(1005, "sest", "kkkk", true, new Date());

        ArrayList<Capability> capabilities = new ArrayList<>();

        capabilities.add(capability1);
        capabilities.add(capability2);
        capabilities.add(capability3);
        capabilities.add(capability4);

        System.out.println(capabilities);

        capabilities.sort(new IsActiveComparator());
        System.out.println(capabilities);

        capabilities.sort(new DateComparator());
        System.out.println(capabilities);

        capabilities.sort(new FullComparator());
        System.out.println(capabilities);

    }
}
