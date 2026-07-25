package com.dn5;

import java.util.HashMap;
import java.util.Map;

public class FakeDatabase implements Database {
    private Map<Integer, Float> accounts = new HashMap<>();

    @Override
    public float getAccountBalance(int userID) {
        return this.accounts.getOrDefault(userID, 0.0f);
    }

    @Override
    public void addUser(int userID, float balance) {
        this.accounts.put(userID, balance);
    }

}
