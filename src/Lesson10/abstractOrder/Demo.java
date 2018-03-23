package Lesson10.abstractOrder;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer("Анна", "Киев", "Женский");
        Customer customer1 = new Customer("Олег", "Полтава", "Мужской");

        ElectronicsOrder electronicsOrder = new ElectronicsOrder("Утюг", new Date(), "Киев", "Харьков", 1100, customer, 12);
        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("Фен", new Date(), "Киев", "Львов", 2300, customer1, 24);

        FurnitureOrder furnitureOrder = new FurnitureOrder("Стул", new Date(), "Полтава", "Киев", 5000, customer1, "CH50");
        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Стол", new Date(), "Киев", "Львов", 250, customer, "TB250");

        electronicsOrder.validateOrder();
        electronicsOrder.calculatePrice();
        electronicsOrder.confirmShipping();

        furnitureOrder.validateOrder();
        furnitureOrder.calculatePrice();
        furnitureOrder.confirmShipping();

        electronicsOrder1.validateOrder();
        electronicsOrder1.calculatePrice();
        electronicsOrder1.confirmShipping();

        furnitureOrder1.validateOrder();
        furnitureOrder1.calculatePrice();
        furnitureOrder1.confirmShipping();
    }
}
