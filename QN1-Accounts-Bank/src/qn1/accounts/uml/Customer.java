package qn1.accounts.uml;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Account> accounts;
    
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }
    
    public void addAccount(Account a) {
        accounts.add(a);
    }
    
    public double totalWorth() {
        double total = 0;
        for (Account account : accounts) {
            total += account.getBalance();
        }
        return total;
    }
    
    public String getName() {
        return name;
    }
    
    public List<Account> getAccounts() {
        return accounts;
    }
}