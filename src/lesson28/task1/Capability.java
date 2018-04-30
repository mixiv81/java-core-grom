package lesson28.task1;

import java.util.Date;

public class Capability {
    private long id;
    private String channelName;
    private String fingerPrint;
    private boolean isActive;
    private Date dateCreated;

    public Capability(long id, String channelName, String fingerPrint, boolean isActive, Date dateCreated) {
        this.id = id;
        this.channelName = channelName;
        this.fingerPrint = fingerPrint;
        this.isActive = isActive;
        this.dateCreated = dateCreated;
    }

    public long getId() {
        return id;
    }

    public String getChannelName() {
        return channelName;
    }

    public String getFingerPrint() {
        return fingerPrint;
    }

    public boolean isActive() {
        return isActive;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Capability{" +
                "id=" + id +
                ", channelName='" + channelName + '\'' +
                ", fingerPrint='" + fingerPrint + '\'' +
                ", isActive=" + isActive +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
