package com.pluralsight.CellPhoneService;

import java.util.Scanner;

public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();
        GetPhoneInfo.getPhoneInfo(cellPhone1);
        CellPhone cellPhone2 = new CellPhone();
        GetPhoneInfo.getPhoneInfo(cellPhone2);
        display(cellPhone1);
        display(cellPhone2);
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());
    }
    public static void display(CellPhone cellPhone) {
        System.out.printf("""
                Serial number: %d\s
                Model: %s\s
                Carrier: %s\s
                Phone number: %s\s
                Owner: %s\s
                """, cellPhone.getSerialNumber(),
                cellPhone.getModel(),
                cellPhone.getCarrier(),
                cellPhone.getPhoneNumber(),
                cellPhone.getOwner());
    }
}
