package com.pluralsight.RentalCarCalculator;

import java.util.Scanner;

public class GetRentalCarOrder {
    static private String pickupDate;
    static private int rentalLength;
    static private boolean tollTag;
    static private boolean gps;
    static private boolean roadsideAssistance;
    static private int age;
    static Scanner scanner = new Scanner(System.in);
    public static void getRentalCarOrder(){
        System.out.println("What date are you picking up the rental: ");
        pickupDate = scanner.nextLine();
        System.out.println("How many days do you need the rental: ");
        rentalLength = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Do you need an electronic toll tag (Y/N): ");
        tollTag = Utils.validateYesNo();
        System.out.println("Do you need a GPS (Y/N): ");
        gps = Utils.validateYesNo();
        System.out.println("Do you need roadside assistance (Y/N): ");
        roadsideAssistance = Utils.validateYesNo();
        System.out.println("How old are you: ");
        age = scanner.nextInt();
    }

    public static String getPickupDate() {
        return pickupDate;
    }

    public static int getRentalLength() {
        return rentalLength;
    }

    public static boolean isTollTag() {
        return tollTag;
    }

    public static boolean isGps() {
        return gps;
    }

    public static boolean isRoadsideAssistance() {
        return roadsideAssistance;
    }

    public static int getAge() {
        return age;
    }
}
