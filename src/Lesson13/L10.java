package Lesson13;

import Lesson10.abstractOrder.Customer;
import Lesson10.abstractOrder.ElectronicsOrder;
import Lesson10.abstractOrder.FurnitureOrder;

import java.util.Date;

public class L10 {
    public static void main(String[] args) {
        Customer customer = new Customer("Анна", "Киев", "Женский");
        Customer customer1 = new Customer("Олег", "Полтава", "Мужской");

        ElectronicsOrder electronicsOrder = new ElectronicsOrder("Утюг", new Date(), "Киев", "Харьков", 1100, customer, 12);
        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("Фен", new Date(), null, null, 2300, customer1, 24);
        ElectronicsOrder electronicsOrder2 = new ElectronicsOrder("Фен", new Date(), "Киев", "Харьков", 0, customer1, 24);
        ElectronicsOrder electronicsOrder3 = new ElectronicsOrder("Фен", new Date(), "Киев", "Харьков", Integer.MAX_VALUE, customer, 24);


        FurnitureOrder furnitureOrder = new FurnitureOrder("Стул", new Date(), "Полтава", "Киев", 5000, customer1, "CH50");
        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Стол", new Date(), null, null, 250, customer, "TB250");
        FurnitureOrder furnitureOrder2 = new FurnitureOrder("Стол", new Date(), "Киев", "Львов", 0, customer1, "TB250");
        FurnitureOrder furnitureOrder3 = new FurnitureOrder("Стол", new Date(), "Киев", "Львов", Integer.MAX_VALUE, customer, "TB250");


        electronicsOrder.validateOrder();
        System.out.println(electronicsOrder.getDateConfirmed());
        electronicsOrder1.validateOrder();
        System.out.println(electronicsOrder1.getDateConfirmed());       // проверка на null
        electronicsOrder2.validateOrder();
        System.out.println(electronicsOrder2.getDateConfirmed());
        electronicsOrder3.validateOrder();
        System.out.println(electronicsOrder3.getDateConfirmed());

        furnitureOrder.validateOrder();
        System.out.println(furnitureOrder.getDateConfirmed());
        furnitureOrder1.validateOrder();
        System.out.println(furnitureOrder1.getDateConfirmed());       // проверка на null
        furnitureOrder2.validateOrder();
        System.out.println(furnitureOrder2.getDateConfirmed());
        furnitureOrder3.validateOrder();
        System.out.println(furnitureOrder3.getDateConfirmed());

        electronicsOrder.calculatePrice();
        electronicsOrder1.calculatePrice();
        electronicsOrder2.calculatePrice();

        furnitureOrder.calculatePrice();
        furnitureOrder1.calculatePrice();
        furnitureOrder2.calculatePrice();


    }
}