package lesson20.task2;

import lesson20.task2.exception.BadRequestException;
import lesson20.task2.exception.InternalServerException;
import lesson20.task2.exception.LimitExceeded;

import java.util.Calendar;
import java.util.Date;

public class TransactionDAO {
    private Transaction[] transactions = new Transaction[10];
    private Utils utils = new Utils();

    public TransactionDAO(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public TransactionDAO() {
    }

    public Transaction save(Transaction transaction) throws Exception {
        validate(transaction);

        return transaction;
    }

    private boolean validate(Transaction transaction) throws Exception {
        if (transaction.getAmount() > utils.getLimitSimpleTransactionAmount())
            throw new LimitExceeded("Transaction limit exceed " + transaction.getId() + ". Can't be saved");

        int sum = 0;
        int count = 0;
        for (Transaction tr : getTransactionsPerDay(transaction.getDateCreated())) {
            sum += tr.getAmount();
            count++;
        }

        if (sum > utils.getLimitTransactionPerDayAmount()) {
            throw new LimitExceeded("Transaction limit per day amount exceed " + transaction.getId() + ". Can't be saved");
        }

        if (count > utils.getLimitTransactionPerDayCount()) {
            throw new LimitExceeded("Transaction limit per day count exceed " + transaction.getId() + ". Can't be saved");
        }

        for (String city : utils.getCities()) {
            if (transaction.getCity().equals(city)) {
                break;
            }
            throw new BadRequestException("Transaction city impossible, id: " + transaction.getId() + ". Can't be saved");
        }

        for (Transaction tr : transactions) {
            if (tr != null && tr.equals(transaction)) {
                throw new InternalServerException("Transaction  " + transaction.getId() + " can't be saved");
            }
        }
        return true;
    }

    public Transaction[] transactionList() {
        int count = 0;
        int index = 0;
        for (Transaction tr : transactions) {
            if (tr != null)
                count++;
        }
        Transaction[] findTransactions = new Transaction[count];
        for (Transaction tr : transactions) {
            if (tr != null) {
                findTransactions[index] = tr;
            }
            index++;
        }
        return findTransactions;
    }

    public Transaction[] transactionList(String city) {
        int count = 0;
        int index = 0;
        for (Transaction tr : transactions) {
            if (tr.getCity().equals(city))
                count++;
        }
        Transaction[] findTransactions = new Transaction[count];
        for (Transaction tr : transactions) {
            if (tr.getCity().equals(city)) {
                findTransactions[index] = tr;
            }
            index++;
        }
        return findTransactions;
    }

    public Transaction[] transactionList(int amount) {
        int count = 0;
        int index = 0;
        for (Transaction tr : transactions) {
            if (tr.getAmount() == amount)
                count++;
        }
        Transaction[] findTransactions = new Transaction[count];
        for (Transaction tr : transactions) {
            if (tr.getAmount() == amount) {
                findTransactions[index] = tr;
            }
            index++;
        }
        return findTransactions;
    }

    private Transaction[] getTransactionsPerDay(Date dateOfCurTransaction) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfCurTransaction);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);

                if (trMonth == month && trDay == day)
                    count++;
            }
        }

        Transaction[] result = new Transaction[count];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);
                if (trMonth == month && trDay == day) {
                    result[index] = transaction;
                    index++;
                }
            }
        }
        return result;
    }
}
