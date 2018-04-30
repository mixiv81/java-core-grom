package lesson28.task1;

import java.util.Comparator;

public class DateComparator implements Comparator<Capability> {

    @Override
    public int compare(Capability o1, Capability o2) {

        if (o1.getDateCreated() == null && o2.getDateCreated() != null)
            return 1;

        if (o1.getDateCreated() != null && o2.getDateCreated() == null)
            return -1;

        if (o1.getDateCreated() != null && o2.getDateCreated() != null)
            return o2.getDateCreated().compareTo(o1.getDateCreated());

        return 0;
    }
}
