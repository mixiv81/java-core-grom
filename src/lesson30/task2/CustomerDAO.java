package lesson30.task2;

import java.util.ArrayList;


public class CustomerDAO {
    private ArrayList<Customer> customerDAO = new ArrayList<>();

    private CustomerDAO(){
        Customer customer1 = new Customer("Andrey", "Ukraine", 2500);
        Customer customer2 = new Customer("Denis", "Ukraine", 2200);
        Customer customer3 = new Customer("Oleg", "France", 2000);
        Customer customer4 = new Customer("Ann", "Finland", 3000);

        customerDAO.add(customer1);
        customerDAO.add(customer2);
        customerDAO.add(customer3);
        customerDAO.add(customer4);
    }
}
