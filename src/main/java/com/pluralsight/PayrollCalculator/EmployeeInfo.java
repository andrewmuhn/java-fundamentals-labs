package com.pluralsight.PayrollCalculator;

import java.util.Scanner;

public class EmployeeInfo {
    static Scanner scanner = new Scanner(System.in);
    static String employeeName;
    static int hoursWorkedPerWeek;
    static double hourlyWage;
    static int filingStatus;
    public static void getEmployeeInfo() {
        System.out.println("Enter the employee's name: ");
        employeeName = scanner.nextLine();
        System.out.println("Enter the number of hours they worked this week: ");
        hoursWorkedPerWeek = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter their hourly pay rate: ");
        hourlyWage = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter their filing status (1=Single, 2=Married, 3=Head of Household: ");
        filingStatus = scanner.nextInt();
        scanner.nextLine();
    }

    public static String getEmployeeName() {
        return employeeName;
    }

    public static int getHoursWorkedPerWeek() {
        return hoursWorkedPerWeek;
    }

    public static double getHourlyWage() {
        return hourlyWage;
    }

    public static int getFilingStatus() {
        return filingStatus;
    }
}
