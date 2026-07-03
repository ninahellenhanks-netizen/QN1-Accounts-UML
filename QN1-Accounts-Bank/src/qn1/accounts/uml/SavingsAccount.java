package qn1.accounts.uml;

public class SavingsAccount extends Account {
    private double rate;
    
    public SavingsAccount(String accountNo, double opening, double rate) {
        super(accountNo, opening);
        this.rate = rate;
    }
    
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }
    
    public void addInterest() {
        double interest = getBalance() * (rate / 100);
        deposit(interest);
    }
}