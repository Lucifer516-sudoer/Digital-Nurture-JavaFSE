package com.dn5;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
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
        when(database.getAccountBalance(anyInt())).thenReturn(5000.0f);
        // anyInt() seems to allow the mock object to take in any integer value and here
        // outputs 5000f alone

        // act & assert
        assertTrue(bankService.canWithdraw(1, 500));
        assertTrue(bankService.canWithdraw(100, 500));

        // Verify
        verify(database, times(1)).getAccountBalance(1);
        verify(database, times(1)).getAccountBalance(100);
        /// here the verify method is acting as a proxy and getting wt we need
    }

    @Test
    void shouldNeverCall() {
        verify(database, never()).getAccountBalance(1);
    }

    // No need for tear down, auto GC and Mockito takes care
}
