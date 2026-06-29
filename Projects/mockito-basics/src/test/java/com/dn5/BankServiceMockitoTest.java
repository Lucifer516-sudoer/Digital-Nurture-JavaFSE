package com.dn5;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class BankServiceMockitoTest {

    @Test
    void testMockCreation() {
        Database db = mock(Database.class);
        System.out.println(db.getClass());

        when(db.getAccountBalance(1))
                .thenReturn(5000f);
        BankService bs = new BankService(db);
        assertTrue(bs.canWithdraw(1, 2000));
    }
}