package com.dn5;

public class BankService {
    private final Database database;

    public BankService(Database database) {
        this.database = database;
    }

    public boolean canWithdraw(int userID, int amount) {
        return database.getAccountBalance(userID) >= (amount + 500);
        // return true; // Just was making intentional mistakes to learbn from the
        // mistakes ...
    }

}
