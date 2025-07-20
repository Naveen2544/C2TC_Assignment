package Banking_System;
public class Transaction {

    // final variable: fixed fee
    private final double transactionFee = 10.0;

    // final method: cannot be overridden
    public final void performTransaction(Account account, String type, double amount) {
        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount - transactionFee);
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount + transactionFee);
        } else {
            System.out.println("Invalid transaction type");
        }
        System.out.println("Transaction fee of ₹" + transactionFee + " applied.");
    }
}
