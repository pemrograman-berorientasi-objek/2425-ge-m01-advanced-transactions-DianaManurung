package fintech.model;

/**
 * @author 12S23040 Diana Manurung
 * @author 12S23047 Jennifer Sihotang
 */

public class Transaction {
    private int counter = 1; // ID transaksi otomatis
    private int id;
    private String accountname;
    private double amount;
    private String postedAt;
    private String note;

    public Transaction(String _accountname, double _amount, String _postedAt, String _note) {
        this.id = counter++;
        this.accountname = _accountname;
        this.amount = _amount;
        this.postedAt = _postedAt;
        this.note = _note;
    }

    public int getId() {
        return id;
    }

    public String getAccountname() {
        return accountname;
    }

    public double getAmount() {
        return amount;
    }

    public String getPostedAt() {
        return postedAt;
    }

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return id + "|" + accountname + "|" + amount + "|" + postedAt + "|" + note;
    }
}