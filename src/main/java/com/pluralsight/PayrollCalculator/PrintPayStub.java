package com.pluralsight.PayrollCalculator;

public class PrintPayStub {
    public static void printPayStub() {
        System.out.printf("""
                Employee: %s\s
                Gross Pay: $%.2f\s
                Social Security Tax: $%.2f\s
                Medicare Tax: $%.2f\s
                Federal Tax: $%.2f\s
                Net Pay: $%.2f\s
                """, EmployeeInfo.getEmployeeName(),
                CalculatePay.getGrossPay(),
                CalculatePay.getSocialSecurityTax(),
                CalculatePay.getMedicareTax(),
                CalculatePay.getFederalTax(),
                CalculatePay.getNetPay());
    }
}
