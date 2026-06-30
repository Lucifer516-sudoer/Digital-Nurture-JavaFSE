package com.dn5;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class BankServiceMockitoTest {

    @Test
    void testMockCreation() {
        // Mockito here creates a programmable implementation from `Database`
        Database db = mock(Database.class); // Mocking

        when(db.getAccountBalance(1)) //
                .thenReturn(5000f); // Now we tell the mock to return 5000.0 whenever the userId is 1
        BankService bs = new BankService(db); // bs works fine, because it depends only on the interface `Database`
        assertTrue(bs.canWithdraw(1, 2000));
    }
}