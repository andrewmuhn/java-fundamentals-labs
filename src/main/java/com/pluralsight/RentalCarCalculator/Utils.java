package com.pluralsight.RentalCarCalculator;

import java.util.Scanner;

public class Utils {
    static Scanner scanner = new Scanner(System.in);
    public static boolean validateYesNo () {
        String userResponse;
        while (true) {
            userResponse = scanner.nextLine().toUpperCase();
            if (userResponse.equals("Y") || userResponse.equals("N")) {
                break;
            } else {
                System.out.println("Please choose Y or N");
            }
        }
        return userResponse.equals("Y");
    }
}
