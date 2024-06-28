package com.pluralsight.VehicleInventory;

import java.util.Objects;

public class FindVehicleByColor {
    public static void findVehicleByColor(String color) {

        Vehicle[] vehicles = InventoryData.getInventory();
        Vehicle[] vehiclesByColor = new Vehicle[20];
        int iterator = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle == null) {
                break;
            }
            if (Objects.equals(vehicle.getColor().strip(), color)) {
                vehiclesByColor[iterator] = vehicle;
                iterator++;
            }
        }
        DisplayVehicleOutput.displayVehicleOutput(vehiclesByColor);
    }
}
