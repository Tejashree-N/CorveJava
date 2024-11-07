package constructor;

public class BankData {
    // Instance variable 
    public double amount;

    // Parameterized constructor 
    public BankData(double initialAmount) {
        this.amount = initialAmount;
    }

    // withdraw amount
    public void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) 
                         ? "Withdraw successful!" 
                         : "Insufficient funds!";
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
        System.out.println(message);
    }

    // Deposit amount
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful!");
    }

    
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        BankData bankAccount = new BankData(10000);
        bankAccount.withdraw(2000);
        bankAccount.deposit(5000);
        bankAccount.displayBalance();
    }
}
