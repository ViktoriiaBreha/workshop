package com.pluralsight.Financial;
import java.util.Scanner;

public class FinancialCalculators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi!Welcome to the Financial Calculators!");
        System.out.println("Choose what calculator do you need today:");
        System.out.println("1. A mortgage calculator ");
        System.out.println("2. The future value of one-time deposit calculator ");
        System.out.println("3. the present value of ordinary annuity calculator ");
        System.out.print("You choice number: ");
        int choice = scanner.nextInt();

        if ( choice == 1) {
            // Enter fields

            System.out.println("A mortgage calculator");
            System.out.print("Enter your loan amount: ");
            double loan = scanner.nextFloat();

            System.out.print("Enter your annual interest rate (for example: 7.625): ");
            double annual_interest_rate = scanner.nextFloat();

            System.out.print("Enter your loan term in years (for example: 10): ");
            int loan_term = scanner.nextInt();

            // Changes

            double monthly_annual_interest_rate = (annual_interest_rate/100)/12;
            int month_loan_term = loan_term * 12;

            // Formulas

            double monthly_payment;
            if ( monthly_annual_interest_rate == 0){
                monthly_payment = loan / month_loan_term;
            } else {
                monthly_payment = loan * (monthly_annual_interest_rate * Math.pow(1 + monthly_annual_interest_rate, month_loan_term)) / (Math.pow(1 + monthly_annual_interest_rate, month_loan_term) - 1);
            }

            double total_payment = monthly_payment * month_loan_term;
            double total_interest = total_payment - loan;

            //Result

            System.out.printf("Your monthly payment is: $%.2f\n", monthly_payment);
            System.out.printf("Your interest paid is: $%.2f", total_interest);

        } else if (choice == 2) {
            //Enter all information

            System.out.print("Enter your deposit amount: $ ");
            double deposit = scanner.nextDouble();

            System.out.print("Enter your annual interest rate ( for example: 1.75): ");
            double annual_interest_rate = scanner.nextDouble();

            System.out.print("Enter your number of years: ");
            int years = scanner.nextInt();

            //Calculation

            int days_per_year = 365;

            double annual_interest = annual_interest_rate/100;

            double future_value = deposit * Math.pow(1 + ( annual_interest / days_per_year), (days_per_year * years));
            double interest_earned = future_value - deposit;

            // Result

            System.out.printf("Your Future value is: $%.2f\n", future_value);
            System.out.printf("Your Total Interest Earned: $%.2f\n", interest_earned);
        } else if (choice == 3) {
            // Fields to fill

            System.out.print("Enter you monthly amount of payment: $ ");
            double payment = scanner.nextDouble();

            System.out.print("Enter you interest ( for example: 2.5): ");
            double interest = scanner.nextDouble();

            System.out.print("Enter the number of years: ");
            int years = scanner.nextInt();

            //Changes and formula

            double annual_interest_rate = interest / 100 /12;
            int total_month = years * 12;

            double present_value = payment * (1 - (1/ Math.pow(1 + annual_interest_rate, total_month)))/ annual_interest_rate;

            // Result

            System.out.printf("Your present value of annuity is: $%.2f", present_value);
        }
        else{
            System.out.println("You entered a wrong number. Try again!");
        }


    }
}
