package lesson22.ewallet;


import lesson22.ewallet.exception.BadRequestException;
import lesson22.ewallet.exception.InternalServerException;
import lesson22.ewallet.exception.LimitExceeded;

import java.util.Calendar;
import java.util.Date;

public class TransactionDAO {
    private static Transaction[] transactions = new Transaction[10];


    private static void validate(Transaction transaction) throws Exception {

        if (transactions == null)
            throw new InternalServerException("Array is null.");

        if (transaction == null)
            throw new BadRequestException("Transaction is null. Can't be saved");

        for (Transaction tr : transactions) {
            if (tr != null && tr.equals(transaction)) {
                throw new BadRequestException("Transaction  " + transaction.getId() + " can't be saved");
            }
        }

        if (!isPlace()) {
            throw new InternalServerException("there isn't enough place for transaction  " + transaction.getId() + " can't be saved");
        }

        if (!checkCity(transaction)) {
            throw new BadRequestException("Transaction city impossible, id: " + transaction.getId() + ". Can't be saved");
        }

        if (transaction.getAmount() > Utils.getLimitSimpleTransactionAmount())
            throw new LimitExceeded("Transaction limit exceed " + transaction.getId() + ". Can't be saved");

        int sum = 0;
        int count = 0;
        for (Transaction tr : getTransactionsPerDay(transaction.getDateCreated())) {
            sum += tr.getAmount();
            count++;
        }

        if (sum + transaction.getAmount() > Utils.getLimitTransactionsPerDayAmount()) {
            throw new LimitExceeded("Transaction limit per day amount exceed " + transaction.getId() + ". Can't be saved");
        }

        if (count + 1 > Utils.getLimitTransactionsPerDayCount()) {
            throw new LimitExceeded("Transaction limit per day count exceed " + transaction.getId() + ". Can't be saved");
        }
    }


    public static Transaction save(Transaction transaction) throws Exception {

        validate(transaction);

        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] == null) {
                transactions[i] = transaction;
                return transactions[i];
            }
        }
        throw new InternalServerException("Transaction  " + transaction.getId() + " can't be saved");
    }


    public static Transaction[] transactionList() throws InternalServerException {
        if (transactions == null)
            throw new InternalServerException("Tt's impossible to get list. Array is null.");
        int count = 0;
        for (Transaction tr : transactions) {
            if (tr != null)
                count++;
        }
        Transaction[] findTransactions = new Transaction[count];
        if (count == 0)
            return findTransactions;

        int index = 0;
        for (Transaction tr : transactions) {
            if (tr != null) {
                findTransactions[index] = tr;
                index++;
            }
        }
        return findTransactions;
    }


    public static Transaction[] transactionList(String city) throws Exception {

        if (transactions == null)
            throw new InternalServerException("Tt's impossible to get list. Array is null.");

        if (city == null)
            throw new BadRequestException("City is null. Try again");

        int count = 0;
        for (Transaction tr : transactions) {
            if (tr != null && tr.getCity().equals(city))
                count++;
        }
        Transaction[] findTransactions = new Transaction[count];
        if (count == 0)
            return findTransactions;

        int index = 0;
        for (Transaction tr : transactions) {
            if (tr != null && tr.getCity().equals(city)) {
                findTransactions[index] = tr;
                index++;
            }
        }
        return findTransactions;
    }


    public static Transaction[] transactionList(int amount) throws Exception {

        if (transactions == null)
            throw new InternalServerException("Tt's impossible to get list. Array is null.");

        if (amount <= 0)
            throw new BadRequestException("Amount is wrong. Try again");

        int count = 0;
        for (Transaction tr : transactions) {
            if (tr != null && tr.getAmount() == amount)
                count++;
        }
        Transaction[] findTransactions = new Transaction[count];
        if (count == 0)
            return findTransactions;

        int index = 0;
        for (Transaction tr : transactions) {
            if (tr != null && tr.getAmount() == amount) {
                findTransactions[index] = tr;
                index++;
            }
        }
        return findTransactions;
    }


    private static Transaction[] getTransactionsPerDay(Date dateOfCurTransaction) {
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


    private static boolean checkCity(Transaction transaction) {
        for (String city : Utils.getCities()) {
            if (transaction.getCity().equals(city))
                return true;
        }
        return false;
    }

    private static boolean isPlace() {
        for (Transaction tr : transactions) {
            if (tr == null)
                return true;
        }
        return false;
    }
}

