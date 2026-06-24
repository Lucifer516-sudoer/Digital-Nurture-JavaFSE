package com.dn5.junitbasics;

public class Calculator {

    public int add(int a, int b) {
        return (a + b); // FIXED: Intentional Bug is removed now
    }

    public int subtract(int a, int b) {
        return (a - b);
    }

    public int multiply(int a, int b) {
        return (a * b);
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Undefined");
        }
        return (a / b);
    }

}
