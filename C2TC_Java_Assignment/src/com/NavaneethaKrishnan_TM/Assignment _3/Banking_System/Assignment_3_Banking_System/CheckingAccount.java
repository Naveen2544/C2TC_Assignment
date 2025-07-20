package Banking_System;
public class CheckingAccount extends Account {

    public CheckingAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " to Checking Account");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " from Checking Account");
        } else {
            System.out.println("Insufficient funds in Checking Account");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
