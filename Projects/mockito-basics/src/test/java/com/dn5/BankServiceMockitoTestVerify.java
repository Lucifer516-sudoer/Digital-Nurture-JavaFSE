package com.dn5;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankServiceMockitoTestVerify {
    Database database;
    BankService bankService;

    @BeforeEach
    void setup() {
        database = mock(Database.class); // Our mock object
        bankService = new BankService(database);
    }

    @Test
    void testIfWithdrawalCallWasMade() {
        // arranging Stub(s)
        when(database.getAccountBalance(1)).thenReturn(5000.0f);

        // act & assert
        assertTrue(bankService.canWithdraw(1, 500));
        assertTrue(bankService.canWithdraw(1, 500));

        // Verify
        verify(database, times(2)).getAccountBalance(1);
        /// here the verify method is acting as a proxy and getting wt we need
    }

    @AfterEach
    void tearDown() {
        // Not sure, whether this is needed or not ...
        // Since ther is garbage collection, but still the question is, "Is it needed?"
        database = null;
        bankService = null;
    }
}
