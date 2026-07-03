package qn1.accounts.uml;

public abstract class Account implements Statement {
    private String accountNo;
    private double balance;
    
    public Account(String accountNo, double opening) {
        this.accountNo = accountNo;
        this.balance = opening;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    protected void setBalance(double balance) {
        this.balance = balance;
    }
    
    public abstract boolean withdraw(double amount);
    
    public double getBalance() {
        return balance;
    }
    
    @Override
    public String generateStatement() {
        return "Account Number: " + accountNo + ", Current Balance: $" + String.format("%.2f", balance);
    }
}