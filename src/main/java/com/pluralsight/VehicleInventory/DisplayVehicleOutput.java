package com.pluralsight.VehicleInventory;

public class DisplayVehicleOutput {
    public static void displayVehicleOutput (Vehicle[] vehicles) {
        System.out.printf("%-10s %-20s %-10s %-15s %-10s\n","vehicleId", "makeModel", "color", "odometerReading", "price");
        for(Vehicle vehicle : vehicles) {
            if (vehicle == null) {
                break;
            }
            System.out.printf("%-10d %-20s %-10s %-15d %-10.2f\n", vehicle.getVehicleId(), vehicle.getMakeModel(), vehicle.getColor(), vehicle.getOdometerReading(), vehicle.getPrice());
        }
    }
}
