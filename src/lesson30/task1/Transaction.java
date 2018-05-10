package lesson30.task1;

import java.util.Date;

public class Transaction implements Comparable <Transaction>{
    private long id;
    private Date dateCreated;
    private Date dateComfirmed;
    private TransactionType type;
    private int amount;
    private String description;

    public Transaction(long id, Date dateCreated, Date dateComfirmed, TransactionType type, int amount, String description) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.dateComfirmed = dateComfirmed;
        this.type = type;
        this.amount = amount;
        this.description = description;
    }

    @Override
    public int compareTo(Transaction tr) {
        return tr.dateCreated.compareTo(this.dateCreated);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", dateCreated=" + dateCreated +
                ", dateComfirmed=" + dateComfirmed +
                ", type=" + type +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}
