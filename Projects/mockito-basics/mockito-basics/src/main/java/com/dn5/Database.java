package com.dn5;

public interface Database {
    public float getAccountBalance(int userID);

    public void addUser(int userID, float balance);

}
