package com.pluralsight.Financial;
import java.util.Scanner;

public class Calculators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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



    }
}
/*Calculator 1: A mortgage calculator - it is used to calculate out
how much a monthly payment for a loan would be (minus any
insurance or taxes), as well as how much interest you would pay
over the life of the loan.
a. It would accept the principal, interest rate, and loan length
from the user
b. It would display the expected monthly payment and total
interest paid
Example: A $53,000 loan at 7.625% interest for 15 years would
have a $495.09/mo payment with a total interest of $36,115.99
This calculator would use a compounded interest formula.
M=P×(i*(1+i)^n / ((1+i)^n)-1)
- Monthly Payment (M)
- Principal (P): This is the total amount of the loan.
- Annual Interest Rate (r): The nominal annual interest rate in
decimal form (e.g., 7.625% = 0.07625).
- Loan Term in Years (y) How many years the loan lasts.
- Number of Monthly Payments (n): This is 12×y (Because
there are 12 monthly payments per year.)
- Monthly Interest Rate (i): This is the annual interest rate
divided by 12, i.e. r/12
- Total Interest =(M×n)−P*/