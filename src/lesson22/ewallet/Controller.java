package lesson22.ewallet;


import lesson22.ewallet.exception.InternalServerException;

public class Controller {

    public static Transaction save(Transaction transaction) throws Exception {
        return TransactionDAO.save(transaction);
    }

    public static Transaction[] transactionList() throws InternalServerException {
        return TransactionDAO.transactionList();
    }

    public static Transaction[] transactionList(String city) throws Exception {
        return TransactionDAO.transactionList(city);
    }

    public static Transaction[] transactionList(int amount) throws Exception {
        return TransactionDAO.transactionList(amount);
    }
}
