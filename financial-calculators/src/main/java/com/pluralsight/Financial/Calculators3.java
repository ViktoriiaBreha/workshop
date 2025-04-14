package com.pluralsight.Financial;
import java.util.Scanner;

public class Calculators3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fields to fill

        System.out.println("The present value of ordinary annuity calculator");
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
}
/* Calculator 3: A calculator that determines the present value of an
ordinary annuity. (Note: this is difficult)
a. It would accept the monthly payout, expected interest rate,
and years to pay out from the user
b. It would display the present value of that annuity
Example: To fund an annuity that pays $3,000 monthly for 20
years and earns an expected 2.5% interest, you would need to
invest $566,141.46 today.
NOTE: If your results on any of these calculators are off by a
few pennies (not dollars!), don't worry. The difference is likely
attributable to rounding and we aren't that concerned about it
in this academy.
*/