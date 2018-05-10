package lesson30.task1;

import java.util.Date;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class UkrainianBankSystem implements BankSystem {
    private Set<Transaction> transactions = new TreeSet<>();

    @Override
    public void withdraw(User user, int amount) {

        if (!checkWithdraw(user, amount))
            return;

        user.setBalance(user.getBalance() - amount - getAmountOfCommission(user, amount));

        createAndSaveTransaction(new Date(), TransactionType.WITHDRAWAL, amount, "withdraw");
    }

    @Override
    public void fund(User user, int amount) {

        if (!checkFundLimit(user, amount))
            return;

        user.setBalance(user.getBalance() + amount - getAmountOfCommission(user, amount));

        createAndSaveTransaction(new Date(), TransactionType.FUNDING, amount, "funding");

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

        if (!checkWithdraw(fromUser, amount) && !checkFundLimit(toUser, amount))
            return;
        withdraw(fromUser, amount);

        fund(toUser, amount);

        createAndSaveTransaction(new Date(), TransactionType.TRANSFER, amount, "transfer");

    }

    @Override
    public void paySalary(User user) {
        if (!checkFundLimit(user, user.getSalary()))
            return;
        user.setBalance(user.getBalance() + user.getSalary());

        createAndSaveTransaction(new Date(), TransactionType.SALARY_INCOME, user.getSalary(), "salary");

    }

    private void printWithdrawalErrorMsg(int amount, User user) {
        System.err.println("Can't withdraw money " + amount + " from user " + user.toString());
    }

    private boolean checkWithdraw(User user, int amount) {
        return checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal())
                && checkWithdrawLimits(user, amount, user.getBalance());

    }


    private boolean checkWithdrawLimits(User user, int amount, double limit) {
        if (amount + getAmountOfCommission(user, amount) > limit) {
            printWithdrawalErrorMsg(amount, user);
            return false;
        }
        return true;
    }


    private boolean checkFundLimit(User user, int amount) {
        if (amount > user.getBank().getLimitOfFunding()) {
            printFundError(user, amount);
            return false;
        }
        return true;
    }

    private void printFundError(User user, int amount){
        System.err.println("Cant't fund money " + amount + " to user" + user.toString());
    }

    private double getAmountOfCommission(User user, int amount) {
        return user.getBank().getCommission(amount) * amount;
    }

    private Transaction createAndSaveTransaction(Date dateCreated, TransactionType type, int amount, String description){
        Random random = new Random();
        Transaction tr = new Transaction(random.nextInt(), dateCreated, null, type, amount, description);
        transactions.add(tr);
        return tr;
    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }
}