package gromcode.main.lesson10.abstractOrder;

import java.util.Date;

public class FurnitureOrder extends Order {
    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String ShipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, ShipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder() {
        if (getShipFromCity() != null && getCustomerOwned().getName() != null) {
            if (getShipFromCity().equals("Киев") || getShipFromCity().equals("Львов")) {
                if (getBasePrice() >= 500 && !getCustomerOwned().getName().equals("Тест")) {
                    setDateConfirmed(new Date());
                }
            }
        }
    }

    @Override
    public void calculatePrice() {
        setTotalPrice(getBasePrice() >= 5000 ? getBasePrice() * 1.02 : getBasePrice() * 1.05);
    }
}