package com.pluralsight.FullNameParser;

public class DisplayNameParts {
    public static void displayNameParts () {
        System.out.printf("""
                First Name: %s\s
                Middle Name: %s\s
                Last Name: %s\s
                Suffix: %s\s
                """, ParseFullName.getFirstName(),
                ParseFullName.getMiddleName(),
                ParseFullName.getLastName(),
                ParseFullName.getSuffix());
    }
}
