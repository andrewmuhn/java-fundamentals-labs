package com.pluralsight.PayrollCalculator;

public class CalculatePay {
    private static double grossPay;
    static double socialSecurityTax;
    static double medicareTax;
    static double federalTax;
    static double netPay;
    private static final double SOCIAL_SECURITY_TAX_RATE = .062;
    private static final double MEDICARE_TAX_RATE = .0145;

    public static void calculatePay() {
        int hoursWorkedPerWeek = EmployeeInfo.getHoursWorkedPerWeek();
        double hourlyWage = EmployeeInfo.getHourlyWage();
        int filingStatus = EmployeeInfo.getFilingStatus();
        boolean overTime = false;

        grossPay = hoursWorkedPerWeek * hourlyWage;
        if (hoursWorkedPerWeek > 40) {
            grossPay = (40 * hourlyWage) + ((hoursWorkedPerWeek - 40) * (hourlyWage * 1.5));
            overTime = true;
        }
        socialSecurityTax = grossPay * SOCIAL_SECURITY_TAX_RATE;
        medicareTax = grossPay * MEDICARE_TAX_RATE;
        federalTax = grossPay * FederalTaxRate.federalTaxRate(grossPay, filingStatus);
        netPay = grossPay - socialSecurityTax - medicareTax - federalTax;
    }

    public static double getGrossPay() {
        return grossPay;
    }
    public static double getSocialSecurityTax() {
        return socialSecurityTax;
    }

    public static double getMedicareTax() {
        return medicareTax;
    }

    public static double getFederalTax() {
        return federalTax;
    }

    public static double getNetPay() {
        return netPay;
    }
}
