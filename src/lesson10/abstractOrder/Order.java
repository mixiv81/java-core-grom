package lesson10.abstractOrder;

import java.util.Date;

public abstract class Order {
    private String itemName;
    private Date dateCreated;
    private Date dateConfirmed;
    private Date dateShipped;
    private String shipFromCity;
    private String shipToCity;
    private int basePrice;
    private double totalPrice;
    private Customer customerOwned;

    public Order(String itemName, Date dateCreated, String shipFromCity, String ShipToCity, int basePrice, Customer customerOwned) {
        this.itemName = itemName;
        this.dateCreated = dateCreated;
        this.shipFromCity = shipFromCity;
        this.shipToCity = ShipToCity;
        this.basePrice = basePrice;
        this.customerOwned = customerOwned;
    }

    abstract public void validateOrder();

    abstract public void calculatePrice();

    public void confirmShipping() {
        if (dateShipped == null)
            dateShipped = new Date();
    }

    public String getItemName() {
        return itemName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getDateConfirmed() {
        return dateConfirmed;
    }

    public Date getDateShipped() {
        return dateShipped;
    }

    public String getShipFromCity() {
        return shipFromCity;
    }

    public String getShipToCity() {
        return shipToCity;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Customer getCustomerOwned() {
        return customerOwned;
    }

    public void setDateConfirmed(Date dateConfirmed) {
        this.dateConfirmed = dateConfirmed;
    }

    public void setDateShipped(Date dateShipped) {
        this.dateShipped = dateShipped;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "order{" +
                "itemName='" + itemName + '\'' +
                ", dateCreated=" + dateCreated +
                ", dateConfirmed=" + dateConfirmed +
                ", dateShipped=" + dateShipped +
                ", shipFromCity='" + shipFromCity + '\'' +
                ", shipToCity='" + shipToCity + '\'' +
                ", basePrice=" + basePrice +
                ", totalPrice=" + totalPrice +
                ", customerOwned=" + customerOwned +
                '}';
    }
}