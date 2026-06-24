package com.dn5.junitbasics;

public class Calculator {

    public int add(int a, int b) {
        return (a + b) + 1; // BUG: Intentional Bug
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
