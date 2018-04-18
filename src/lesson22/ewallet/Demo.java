package lesson22.ewallet;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws Exception {


        Transaction transaction1 = new Transaction(1, "Kiev", 20, "buy", TransactionType.OUTCOME, new Date());
        Transaction transaction2 = new Transaction(2, "Odessa", 20, "buy", TransactionType.INCOME, new Date());
        Transaction transaction3 = new Transaction(3, "Odessa", 30, "buy", TransactionType.OUTCOME, new Date());
        Transaction transaction4 = new Transaction(4, "Kiev", 40, "buy", TransactionType.INCOME, new Date());
        Transaction transaction5 = new Transaction(5, "Kiev", 30, "buy", TransactionType.OUTCOME, new Date());
        Transaction transaction6 = new Transaction(6, "Odessa", 100, "buy", TransactionType.OUTCOME, new Date());



        try {
            Controller.save(transaction1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Controller.save(transaction2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Controller.save(transaction3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Controller.save(transaction4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Controller.save(transaction5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Controller.save(transaction6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
