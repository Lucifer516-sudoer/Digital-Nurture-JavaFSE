package com.dn5;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BankServiceTest {
    /// Three cases
    /// enough balance -> allow wd
    /// insufficient bal -> deny wd
    /// Unknown -> fake 0.0f
    BankService bs;
    Database db;

    @BeforeEach
    void setup() {
        db = new FakeDatabase();
        bs = new BankService(db);
    }

    @ParameterizedTest
    @CsvSource({ "1, 1000", "2, 2000", "3, 3000", "4, 4000", "5, 5000" })
    void testShouldAllowWithdrawalWithSufficentBalance(int userId, int amount) {
        db.addUser(userId, amount);
        assertTrue(bs.canWithdraw(userId, amount / 2));
    }

    @ParameterizedTest
    @CsvSource({ "1, 1000", "2, 2000", "3, 3000", "4, 4000", "5, 5000" })
    void testShouldNotAllowWithdrawalIfBalanceIsLow(int userId, int amount) {
        db.addUser(userId, amount);
        assertFalse(bs.canWithdraw(userId, amount + amount));
    }

}
