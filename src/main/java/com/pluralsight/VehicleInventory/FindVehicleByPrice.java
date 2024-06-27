package com.pluralsight.VehicleInventory;

public class FindVehicleByPrice {
    public static void findVehiclesByPrice(double minPrice, double maxPrice) {
        Vehicle[] vehicles = InventoryData.getInventory();
        Vehicle[] vehiclesInPriceRange = new Vehicle[20];
        int iterator = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle == null) {
                break;
            }
            if (vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxPrice) {
                vehiclesInPriceRange[iterator] = vehicle;
                iterator++;
            }
        }
        DisplayVehicleOutput.displayVehicleOutput(vehiclesInPriceRange);
    }
}
