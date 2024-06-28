package com.pluralsight.VehicleInventory;

import java.util.Scanner;

public class AddAVehicle {
    static Scanner scanner = new Scanner(System.in);

    public static void addAVehicle() {
        System.out.println("Please enter a vehicleId");
        int vehicleId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter a makeModel");
        String makeModel = scanner.nextLine();
        System.out.println("Please enter a color");
        String color = scanner.nextLine();
        System.out.println("Please enter a odometerReading");
        int odometerReading = scanner.nextInt();
        System.out.println("Please enter a price");
        float price = scanner.nextFloat();
        Vehicle newVehicle = new Vehicle(vehicleId, makeModel, color, odometerReading, price);
        InventoryData.addAVehicle(newVehicle);
    }
}
