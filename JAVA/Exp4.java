class SavingsAccount {
    // Static variable for annual interest rate
    private static double annualInterestRate = 0.0;

    // Private instance variable for savings balance
    private double savingsBalance;

    // Parameterized constructor to initialize savings balance
    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    // Method to calculate and return monthly interest
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate / 100) / 12;
        savingsBalance += monthlyInterest;
    }

    // Static method to modify the annual interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    // Method to display the current balance
    public double getBalance() {
        return savingsBalance;
    }
}

public class Exp4 {
     public static void main(String[] args) {
            // Create two SavingsAccount objects
            SavingsAccount saver1 = new SavingsAccount(2000.00);
            SavingsAccount saver2 = new SavingsAccount(3000.00);
    
            // Set annual interest rate to 4%
            SavingsAccount.modifyInterestRate(4.0);
    
            // Calculate monthly interest and display new balances for both savers
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
    
            System.out.printf("Saver1 Balance with 4%% Interest: Rs %.2f%n", saver1.getBalance());
            System.out.printf("Saver2 Balance with 4%% Interest: Rs %.2f%n", saver2.getBalance());
    
            // Set annual interest rate to 5%
            SavingsAccount.modifyInterestRate(5.0);
    
            // Calculate monthly interest and display new balances for both savers
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
    
            System.out.printf("Saver1 Balance with 5%% Interest: Rs %.2f%n", saver1.getBalance());
            System.out.printf("Saver2 Balance with 5%% Interest: Rs %.2f%n", saver2.getBalance());
        }
    }
    
