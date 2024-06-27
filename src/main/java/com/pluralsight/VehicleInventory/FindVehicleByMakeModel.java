package com.pluralsight.VehicleInventory;

import java.util.Objects;

public class FindVehicleByMakeModel {
    public static void findVehicleByMakeModel(String makeModel) {
        Vehicle[] vehicles = InventoryData.getInventory();
        Vehicle[] vehiclesByMakeModel = new Vehicle[20];
        int iterator = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle == null) {
                break;
            }
            if (Objects.equals(vehicle.getMakeModel().strip(), makeModel)) {
                vehiclesByMakeModel[iterator] = vehicle;
                iterator++;
            }
        }
        DisplayVehicleOutput.displayVehicleOutput(vehiclesByMakeModel);
    }
}
