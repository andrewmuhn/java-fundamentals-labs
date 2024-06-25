package com.pluralsight.PayrollCalculator;

import java.util.Scanner;

public class EnterAnotherPayStub {
    public static boolean enterAnotherPayStub() {
        Scanner scanner = new Scanner(System.in);
        String selection;
        while (true) {
            System.out.println("Do you want to calculate another employee's pay? (Y/N): ");
            selection = scanner.nextLine().toUpperCase();
            if (selection.equals("Y") || selection.equals("N")) {
                break;
            } else {
                System.out.println("Please choose Y or N");
            }
        }
        return selection.equals("Y");
    }
}
