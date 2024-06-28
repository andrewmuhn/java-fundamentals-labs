package com.pluralsight.VehicleInventory;

public class ListAllVehicles {
    public static void listAllVehicles() {
        Vehicle[] vehicles = InventoryData.getInventory();
        DisplayVehicleOutput.displayVehicleOutput(vehicles);
    }
}
