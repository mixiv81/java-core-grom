package lesson20.task2;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws Exception {

        Controller controller = new Controller();


        Transaction transaction1 = new Transaction(1, "Kiev", 10, "buy", TransactionType.OUTCOME, new Date());
        Transaction transaction2 = new Transaction(2, "Dnepr", 10, "buy", TransactionType.INCOME, new Date());
        Transaction transaction3 = new Transaction(3, "Odessa", 20, "buy", TransactionType.OUTCOME, new Date());
        Transaction transaction4 = new Transaction(4, "Kiev", 10, "buy", TransactionType.INCOME, new Date());
        Transaction transaction5 = new Transaction(5, "Kiev", 300, "buy", TransactionType.OUTCOME, new Date());
        Transaction transaction6 = new Transaction(6, "Odessa", 100, "buy", TransactionType.OUTCOME, new Date());

        Transaction[] transactions1 = {transaction1, transaction2, transaction3, null};
        Transaction[] transactions2 = {transaction4, transaction5, transaction6};

        TransactionDAO transactionDAO1 = new TransactionDAO(transactions1);
        TransactionDAO transactionDAO2 = new TransactionDAO(transactions2);


//        System.out.println(Arrays.toString(transactionDAO1.transactionList()));
//        System.out.println();
//        System.out.println(Arrays.toString(transactionDAO1.transactionList("Kiev")));
//        System.out.println();
//        System.out.println(Arrays.toString(transactionDAO1.transactionList(10)));
//        System.out.println();
//        System.out.println(transactionDAO1.save(transaction4));

//        System.out.println(Arrays.toString(controller.transactionList()));
//        System.out.println();
//        System.out.println(Arrays.toString(controller.transactionList("Kiev")));
//        System.out.println();
//        System.out.println(Arrays.toString(controller.transactionList(10)));
//        System.out.println();
//        System.out.println(controller.save(transaction4));

    }
}
