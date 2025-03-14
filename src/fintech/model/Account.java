package fintech.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 12S23040 Diana Manurung
 * @author 12S23047 Jennifer Sihotang
 */
public class Account {
    private String accountname;
    private String owner;
    private Double balance;
    private List<Transaction> transactions;

    public Account(String _accountname, String _owner) {
        this.accountname = _accountname;
        this.owner = _owner;
        this.balance = 0.0; 
        this.transactions = new ArrayList<>(); 
    }

    public String getaccountname() {
        return accountname;
    }

    public String getowner() {
        return owner;
    }

    public Double getbalance() {
        return balance;
    }

    public void addTransaction(Transaction transaction) {

        transactions.add(transaction);

        balance += transaction.getAmount();
    }

    @Override
    public String toString() {
        return accountname + "|" + owner + "|" + balance;
    }
}