package com.pluralsight.MortageCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double loanAmount;
        double yearlyInterestRate;
        int loanLengthYears;


        System.out.println("Please enter the loan amount");
        loanAmount = scanner.nextDouble();

        System.out.println("Please enter the yearly interest rate");
        yearlyInterestRate = scanner.nextDouble();

        System.out.println("Please enter the loan length in years");
        loanLengthYears = scanner.nextInt();

        double monthlyInterestRate = yearlyInterestRate / 1200;
        int numberOfPayments = loanLengthYears * 12;

        double monthlyPayment = (loanAmount * monthlyInterestRate)/(1 - Math.pow((1 + monthlyInterestRate),(-1 * numberOfPayments)));
        double totalInterestPaid = monthlyPayment * numberOfPayments - loanAmount;

        System.out.printf("The payment for this loan is $%.2f/month\n", monthlyPayment);
        System.out.printf("The interest paid over the 15 year loan will be $%.2f\n", totalInterestPaid);

    }
}
