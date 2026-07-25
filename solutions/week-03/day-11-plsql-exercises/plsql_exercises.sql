-- ==============================================================================
-- Exercise 1: Control Structures
-- ==============================================================================
-- Writing PL/SQL blocks demonstrating loops and conditional logic for customer data processing....

DECLARE
    v_customer_id NUMBER;
    v_customer_balance NUMBER;
    v_status VARCHAR2(20);
BEGIN
    -- Simulating processing 5 customers
    FOR i IN 1..5 LOOP
        v_customer_id := i;
        v_customer_balance := DBMS_RANDOM.VALUE(100, 15000);
        
        -- Conditional Logic
        IF v_customer_balance > 10000 THEN
            v_status := 'VIP';
        ELSIF v_customer_balance > 5000 THEN
            v_status := 'Premium';
        ELSE
            v_status := 'Standard';
        END IF;
        
        DBMS_OUTPUT.PUT_LINE('Customer ' || v_customer_id || ' with balance $' || 
                             ROUND(v_customer_balance, 2) || ' is classified as: ' || v_status);
    END LOOP;
END;
/

-- ==============================================================================
-- Exercise 3: Stored Procedures
-- ==============================================================================
-- Create stored procedures with parameters for financial calculations on bank account data.

CREATE OR REPLACE PROCEDURE calculate_interest (
    p_account_id IN NUMBER,
    p_interest_rate IN NUMBER
)
AS
    v_current_balance NUMBER := DBMS_RANDOM.VALUE(1000, 5000); -- Simulated balance
    v_calculated_interest NUMBER;
    v_new_balance NUMBER;
BEGIN
    -- Calculate interest
    v_calculated_interest := v_current_balance * (p_interest_rate / 100);
    v_new_balance := v_current_balance + v_calculated_interest;
    
    DBMS_OUTPUT.PUT_LINE('Account ID: ' || p_account_id);
    DBMS_OUTPUT.PUT_LINE('Current Balance: $' || ROUND(v_current_balance, 2));
    DBMS_OUTPUT.PUT_LINE('Interest Rate: ' || p_interest_rate || '%');
    DBMS_OUTPUT.PUT_LINE('Interest Amount: $' || ROUND(v_calculated_interest, 2));
    DBMS_OUTPUT.PUT_LINE('New Balance: $' || ROUND(v_new_balance, 2));
END;
/

-- Test the procedure
BEGIN
    calculate_interest(101, 5.5);
    calculate_interest(102, 3.2);
END;
/
