package Banking_System;
public class Bank {
    private static int totalAccounts = 0;

    // Called whenever a new account is created
    public static void incrementAccountCount() {
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
