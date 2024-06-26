package com.pluralsight.FullNameParser;

public class ParseFullName {
    static private String firstName;
    static private String lastName = "(none)";
    static private String middleName = "(none)";
    static private String suffix = "(none)";
    public static void parseFullName() {
        String fullName = GetFullName.getFullName();
        String[] fullNameArr = fullName.split(" ");
        switch (fullNameArr.length) {
            case 2:
                lastName = fullNameArr[1];
                break;
            case 3:
                middleName = fullNameArr[1];
                lastName = fullNameArr[2];
                break;
            case 4:
                middleName = fullNameArr[1];
                lastName = fullNameArr[2];
                suffix = fullNameArr[3];
                break;
        }
        firstName = fullNameArr[0];
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
