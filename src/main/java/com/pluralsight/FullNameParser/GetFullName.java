package com.pluralsight.FullNameParser;

import java.util.Scanner;

public class GetFullName {
    static Scanner scanner = new Scanner(System.in);
    static private String fullName;
    public static void getUserInput () {
        System.out.print("Please enter your name:\t");
        fullName = scanner.nextLine().strip();
    }
    public static String getFullName() {
        return fullName;
    }
}
