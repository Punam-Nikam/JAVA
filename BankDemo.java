import java.util.Scanner;

// Account.java - Abstract class (Abstraction)
abstract class Account {
    protected String accountNumber;
    protected double balance;
    
    public Account(String accNo, double initialBalance) {
        this.accountNumber = accNo;
        this.balance = initialBalance;
    }
    
    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);
    
    public void displayBalance() {
        System.out.printf("Account: %s | Balance: $%.2f\n", accountNumber, balance);
    }
    
    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
}

// SavingsAccount.java - Concrete class
class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500.0;
    private double interestRate = 0.03;
    
    public SavingsAccount(String accNo, double initialBalance) {
        super(accNo, initialBalance);
        if (initialBalance < MIN_BALANCE) {
            System.out.println("Warning: Minimum balance of $" + MIN_BALANCE + " required.");
        }
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
            return;
        }
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.printf("Withdrawn: $%.2f\n", amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of $" + MIN_BALANCE + " required.");
        }
    }
    
    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
            return;
        }
        balance += amount;
        System.out.printf("Deposited: $%.2f\n", amount);
    }
    
    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.printf("Interest added: $%.2f (Rate: %.1f%%)\n", interest, interestRate * 100);
    }
}

// BankDemo.java - Interactive user input
public class BankDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static SavingsAccount account;
    
    public static void main(String[] args) {
        // Create account with user-provided initial balance
        System.out.print("Enter account number: ");
        String accNum = scanner.nextLine();
        
        System.out.print("Enter initial balance (min $500): ");
        double initialBalance = scanner.nextDouble();
        
        if (initialBalance < 500) {
            System.out.println("Initial balance set to $500 (minimum).");
            initialBalance = 500;
        }
        
        account = new SavingsAccount(accNum, initialBalance);
        System.out.println("\n--- Account Created Successfully ---");
        account.displayBalance();
        
        // Interactive menu
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    depositMenu();
                    break;
                case 2:
                    withdrawMenu();
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    account.addInterest();
                    break;
                case 5:
                    System.out.println("Thank you for using our banking system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1-5.");
            }
            System.out.println();
        } while (choice != 5);
        
        scanner.close();
    }
    
    private static void displayMenu() {
        System.out.println("\n===== Banking System Menu =====");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Add Interest");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
    
    private static void depositMenu() {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }
    
    private static void withdrawMenu() {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }
}