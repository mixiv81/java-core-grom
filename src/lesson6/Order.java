package lesson6;

import java.util.Date;

public class Order {
    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;

    public Order(long id, int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.id = id;
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

//    public order() {
//    }

    public void confirmOrder() {
        if (!isConfirmed) {
            isConfirmed = true;
            dateConfirmed = new Date();
        }
    }

    public boolean checkPrice() {
        return price > 1000;
    }

    public boolean isValidType() {
        String buy = "Buy";
        String sale = "Sale";
        if (buy.equals(type))
            return true;
        if (sale.equals(type))
            return true;
        else
            return false;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public Date getDateConfirmed() {
        return dateConfirmed;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "order{" +
                "id=" + id +
                ", price=" + price +
                ", dateCreated=" + dateCreated +
                ", isConfirmed=" + isConfirmed +
                ", dateConfirmed=" + dateConfirmed +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}