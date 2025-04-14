package com.pluralsight.Financial;
import java.util.Scanner;

public class Calculators2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Enter all information

        System.out.print("Enter your deposit amount: $ ");
        float deposit = scanner.nextFloat();

        System.out.print("Enter your annual interest rate ( for example: 1.75): ");
        float annual_interest_rate = scanner.nextFloat();

        System.out.print("Enter your number of years: ");
        int years = scanner.nextInt();

        //Calculation

        int days_per_year = 365;

        float annual_interest = annual_interest_rate/100;



        double future_value = deposit * Math.pow(1 + ( annual_interest / days_per_year), (days_per_year * years));
        double interest_earned = future_value - deposit;


        // Result

        System.out.printf("Your Future value is: $%.2f\n", future_value);
        System.out.printf("Your Total Interest Earned: $%.2f\n", interest_earned);

    }
}
/*Calculator 2: A calculator that determines the future value of a
one-time deposit assuming compound interest - it is used to help
you decide how much a CD will be worth when it matures
a. It would accept the deposit, interest rate, and number of
years from the user
b. It would display the future value and the total interest
earned
Example: If you deposit $1,000 in a CD that earns 1.75%
interest and matures in 5 years, your CD's ending balance will
be $1,092.62 and you would have earned $92.62 in interest
Note: The numbers above assume daily compounding
FV = P × (1 + (r / 365))^(365 × t)
• Future Value (FV)
• Principal (P): This is the initial deposit amount.
• Annual Interest Rate (r): The nominal annual interest rate in decimal form
(e.g., 1.75% = 0.0175).
• Number of Years (t): The total number of years the deposit will earn interest.
• Days Per Year: Daily compounding assumes 365 days per year.
• Total Number of Days: This is 365 × t (because there are 365 days per year).
• Total Interest Earned = FV - P     */