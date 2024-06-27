package com.pluralsight.CellPhoneService;

import java.util.Scanner;

public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();
        GetPhoneInfo.getPhoneInfo(cellPhone1);
        CellPhone cellPhone2 = new CellPhone();
        GetPhoneInfo.getPhoneInfo(cellPhone2);
        CellPhone cellPhone3 = new CellPhone(4321, "Google Pixel 8", "T-Mobile", "666", "Husain Obama");
        display(cellPhone1);
        display(cellPhone2);
        display(cellPhone3);
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());
        cellPhone3.dial(cellPhone1.getPhoneNumber());
        cellPhone3.dial(cellPhone2);
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
