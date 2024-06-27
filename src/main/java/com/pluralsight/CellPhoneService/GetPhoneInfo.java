package com.pluralsight.CellPhoneService;

import java.util.Scanner;

public class GetPhoneInfo {
    static Scanner scanner = new Scanner(System.in);

    public static void getPhoneInfo(CellPhone cellPhone) {
        System.out.print("What is the serial number?  ");
        cellPhone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.print("What model is the phone?  ");
        cellPhone.setModel(scanner.nextLine());
        System.out.print("Who is the carrier?  ");
        cellPhone.setCarrier(scanner.nextLine());
        System.out.print("What is the phone number?  ");
        cellPhone.setPhoneNumber(scanner.nextLine());
        System.out.print("Who is the owner of the phone?  ");
        cellPhone.setOwner(scanner.nextLine());
        System.out.println();
    }
}
