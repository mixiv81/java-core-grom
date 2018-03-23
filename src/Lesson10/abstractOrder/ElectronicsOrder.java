package Lesson10.abstractOrder;

import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String ShipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, ShipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
        if (getShipToCity() != null && getShipFromCity() != null && getCustomerOwned().getGender() != null) {
            if (getShipFromCity().equals("Киев") || getShipFromCity().equals("Одесса") || getShipFromCity().equals("Днепр") || getShipFromCity().equals("Харьков")) {
                if (getShipToCity().equals("Киев") || getShipToCity().equals("Одесса") || getShipToCity().equals("Днепр") || getShipToCity().equals("Харьков")) {
                    if (getBasePrice() >= 100 && getCustomerOwned().getGender().equals("Женский")) {
                        setDateConfirmed(new Date());
                    }
                }
            }
        }
    }

    @Override
    public void calculatePrice() {
        if (getShipToCity() != null) {
            double priceDelivery = getShipToCity().equals("Киев") || getShipToCity().equals("Одесса") ? getBasePrice() * 0.10 : getBasePrice() * 0.15;
            setTotalPrice(getBasePrice() > 1000 ? (getBasePrice() + priceDelivery) * 0.95 : getBasePrice() + priceDelivery);
        }
    }
}