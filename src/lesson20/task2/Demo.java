package lesson20.task2;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {

        Controller controller = new Controller();


        Transaction transaction1 = new Transaction(1, "Kiev", 100, "buy", TransactionType.OUTCOME, new Date());
        Transaction transaction2 = new Transaction(2, "Dnepr", 100, "buy", TransactionType.OUTCOME, new Date());
        Transaction transaction3 = new Transaction(3, "Odessa", 200, "buy", TransactionType.OUTCOME, new Date());
        Transaction transaction4 = new Transaction(4, "Kiev", 100, "buy", TransactionType.OUTCOME, new Date());
        Transaction transaction5 = new Transaction(5, "Kiev", 300, "buy", TransactionType.OUTCOME, new Date());
        Transaction transaction6 = new Transaction(6, "Odessa", 100, "buy", TransactionType.OUTCOME, new Date());

        Transaction[] transactions1 = {transaction1, transaction2, transaction3};
        Transaction[] transactions2 = {transaction4, transaction5, transaction6};

        TransactionDAO transactionDAO1 = new TransactionDAO(transactions1);
        TransactionDAO transactionDAO2 = new TransactionDAO(transactions2);


        System.out.println(Arrays.toString(transactionDAO1.transactionList()));
        System.out.println();
        System.out.println(Arrays.toString(transactionDAO1.transactionList("Kiev")));

    }
}
