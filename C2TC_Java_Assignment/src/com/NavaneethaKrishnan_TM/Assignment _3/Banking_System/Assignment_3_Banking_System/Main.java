package Banking_System;
public class Main {
    public static void main(String[] args) {
        // Create accounts
        SavingsAccount sa = new SavingsAccount("Naveen", 5000);
        CheckingAccount ca = new CheckingAccount("Priya", 8000);

        // Create transaction handler
        Transaction txn = new Transaction();

        // Perform transactions
        txn.performTransaction(sa, "deposit", 1000); // deposit 1000 - fee
        txn.performTransaction(ca, "withdraw", 2000); // withdraw 2000 + fee

        // Show account info
        sa.displayAccountInfo();
        ca.displayAccountInfo();

        // Show total accounts created
        System.out.println("Total bank accounts created: " + Bank.getTotalAccounts());
    }
}
