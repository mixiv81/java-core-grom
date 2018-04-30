package lesson28.task1;

import java.util.Comparator;

public class FullComparator implements Comparator<Capability> {

    @Override
    public int compare(Capability o1, Capability o2) {
        if (o1.getChannelName() != null && o2.getChannelName() != null && !o1.getChannelName().equals(o2))
            return o1.getChannelName().compareTo(o2.getChannelName());

        if (o1.getFingerPrint() != null && o2.getFingerPrint() != null && !o1.getFingerPrint().equals(o2.getFingerPrint()))
            return o1.getFingerPrint().compareTo(o2.getFingerPrint());

        if (o1.getDateCreated() != null && o2.getDateCreated() != null && !o1.getDateCreated().equals(o2.getDateCreated()))
            return o2.getDateCreated().compareTo(o1.getDateCreated());

        return 0;
    }
}
