/// Exercise 7: Financial Forecasting
/// Scenario:
/// You are developing a financial forecasting tool that predicts future values based on past data.
/// Steps:
///  - Understand Recursive Algorithms:
///     - Explain the concept of recursion and how it can simplify certain problems.
///  - Setup:
///     - Create a method to calculate the future value using a recursive approach.
///  - Implementation:
///     - Implement a recursive algorithm to predict future values based on past growth rates.
///  - Analysis:
///     - Discuss the time complexity of your recursive algorithm.
///     - Explain how to optimize the recursive solution to avoid excessive computation.

package week02.day07.financialforecastingsystem;

public class FinancialForecastingSystem {
    public static double foreCast(double amount, double rate, int years) {
        if (years == 0)
            return amount;
        else
            return foreCast(amount, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        float amount = 1200f;
        float rate = 7.25f;
        int years = 4;
        System.out.println("Forecasted Maturity is: " + (float) foreCast(amount, rate, years));
    }
}
