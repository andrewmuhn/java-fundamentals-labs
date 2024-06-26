package com.pluralsight.FullNameGenerator;

import java.util.Scanner;

public class GetFullName {
    static private String firstName;
    static private String lastName;
    static private String middleName;
    static private String suffix;
    static Scanner scanner = new Scanner(System.in);
    public static void getFullName() {
        System.out.print("First Name: ");
        firstName = scanner.nextLine().strip();
        System.out.print("Last Name: ");
        lastName = scanner.nextLine().strip();
        System.out.print("Middle Name: ");
        middleName = scanner.nextLine().strip();
        System.out.print("Suffix: ");
        suffix = scanner.nextLine().strip();
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static String getMiddleName() {
        return middleName;
    }

    public static String getSuffix() {
        return suffix;
    }
}
