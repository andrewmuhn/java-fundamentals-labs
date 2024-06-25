package com.pluralsight.PayrollCalculator;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeInfo.getEmployeeInfo();
        CalculatePay.calculatePay();
        PrintPayStub.printPayStub();
        while (EnterAnotherPayStub.enterAnotherPayStub()) {
            EmployeeInfo.getEmployeeInfo();
            CalculatePay.calculatePay();
            PrintPayStub.printPayStub();
        }
        System.out.println("Goodbye!");
    }
}
