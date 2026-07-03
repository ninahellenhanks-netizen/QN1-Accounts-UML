package qn1.accounts.uml;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Community Bank Account System ===\n");
        
        // Create customer
        Customer customer = new Customer("John Doe");
        System.out.println("Customer: " + customer.getName());
        
        // Create accounts
        SavingsAccount savings = new SavingsAccount("SAV001", 1000.0, 5.0);
        CurrentAccount current = new CurrentAccount("CUR001", 500.0, 200.0);
        
        // Add accounts to customer
        customer.addAccount(savings);
        customer.addAccount(current);
        System.out.println("Accounts added: " + savings.generateStatement());
        System.out.println("Accounts added: " + current.generateStatement());
        
        System.out.println("\n=== Testing Deposits ===");
        savings.deposit(200);
        System.out.println("Deposited $200 to Savings");
        current.deposit(100);
        System.out.println("Deposited $100 to Current");
        
        System.out.println("\n=== Testing Withdrawals ===");
        System.out.println("Savings withdrawal $150: " + savings.withdraw(150) + " (Updated: " + savings.generateStatement() + ")");
        System.out.println("Savings withdrawal $1500: " + savings.withdraw(1500) + " (Updated: " + savings.generateStatement() + ")");
        System.out.println("Current withdrawal $600: " + current.withdraw(600) + " (Updated: " + current.generateStatement() + ")");
        System.out.println("Current withdrawal $200: " + current.withdraw(200) + " (Updated: " + current.generateStatement() + ")");
        
        System.out.println("\n=== Adding Interest ===");
        savings.addInterest();
        System.out.println("Interest added to Savings at 5%: " + savings.generateStatement());
        
        System.out.println("\n=== Account Statements ===");
        System.out.println(savings.generateStatement());
        System.out.println(current.generateStatement());
        
        System.out.println("\n=== Customer Summary ===");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Total Worth: $" + String.format("%.2f", customer.totalWorth()));
        System.out.println("\nAll Accounts:");
        for (Account account : customer.getAccounts()) {
            System.out.println("  " + account.generateStatement());
        }
    }
}