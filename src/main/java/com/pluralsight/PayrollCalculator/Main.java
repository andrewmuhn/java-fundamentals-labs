package com.pluralsight.PayrollCalculator;

public class Main {
    public static void main(String[] args) {
        do {
            EmployeeInfo.getEmployeeInfo();
            CalculatePay.calculatePay();
            PrintPayStub.printPayStub();
        } while (EnterAnotherPayStub.enterAnotherPayStub());
        System.out.println("Goodbye!");
    }
}
