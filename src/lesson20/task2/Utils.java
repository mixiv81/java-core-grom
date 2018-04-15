package lesson20.task2;

public class Utils {
    private int limitTransactionPerDayCount = 10;
    private int LimitTransactionPerDayAmount = 100;
    private int limitSimpleTransactionAmount = 40;
    private String[] cities = {"Kiev", "Odessa"};

    public int getLimitTransactionPerDayCount() {
        return limitTransactionPerDayCount;
    }

    public int getLimitTransactionPerDayAmount() {
        return LimitTransactionPerDayAmount;
    }

    public int getLimitSimpleTransactionAmount() {
        return limitSimpleTransactionAmount;
    }

    public String[] getCities() {
        return cities;
    }
}
