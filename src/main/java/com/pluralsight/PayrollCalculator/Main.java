package com.pluralsight.PayrollCalculator;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String employeeName;
        int hoursWorkedPerWeek;
        double hourlyWage;
        double grossPay;
        int filingStatus;
        boolean overTime = false;
        double SOCIAL_SECURITY_TAX_RATE = .062;
        double MEDICARE_TAX_RATE = .0145;

        System.out.println("Enter the employee's name: ");
        employeeName = scanner.nextLine();
        System.out.println("Enter the number of hours they worked this week: ");
        hoursWorkedPerWeek = scanner.nextInt();
        System.out.println("Enter their hourly pay rate: ");
        hourlyWage = scanner.nextDouble();
        System.out.println("Enter their filing status (1=Single, 2=Married, 3=Head of Household: ");
        filingStatus = scanner.nextInt();

        grossPay = hoursWorkedPerWeek * hourlyWage;
        if (hoursWorkedPerWeek > 40) {
            grossPay = (40 * hourlyWage) + ((hoursWorkedPerWeek - 40) * (hourlyWage * 1.5));
            overTime = true;
        }
        String overTimeString = overTime ? String.format("\t\t(%s did earn overtime)", employeeName) : "";
        double socialSecurityTax = grossPay * SOCIAL_SECURITY_TAX_RATE;
        double medicareTax = grossPay * MEDICARE_TAX_RATE;
        double federalTax = grossPay * FederalTaxRate.federalTaxRate(grossPay, filingStatus);
        double netPay = grossPay - socialSecurityTax - medicareTax - federalTax;

        System.out.printf("""
                Employee: %s\s
                Gross Pay: $%.2f\s
                Social Security Tax: $%.2f\s
                Medicare Tax: $%.2f\s
                Federal Tax: $%.2f\s
                Net Pay: $%.2f\s
                """, employeeName, grossPay, socialSecurityTax, medicareTax, federalTax, netPay);
    }
}
