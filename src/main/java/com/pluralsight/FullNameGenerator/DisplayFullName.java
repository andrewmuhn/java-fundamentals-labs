package com.pluralsight.FullNameGenerator;

import java.util.Objects;

public class DisplayFullName {
    public static void displayFullName() {
        String firstName = GetFullName.getFirstName();
        String lastName = GetFullName.getLastName();
        String middleName = !Objects.equals(GetFullName.getMiddleName(), "") ? String.format(" %s", GetFullName.getMiddleName()) : "";
        String suffix = !Objects.equals(GetFullName.getSuffix(), "") ? String.format(", %s", GetFullName.getSuffix()) : "";

        System.out.printf("""
                Full Name: %s%s %s%s
                """, firstName, middleName, lastName, suffix);
    }
}
