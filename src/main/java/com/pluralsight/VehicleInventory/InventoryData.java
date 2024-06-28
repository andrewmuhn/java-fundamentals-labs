package com.pluralsight.VehicleInventory;

public class InventoryData {
    private static int counter = 6;
    static Vehicle[] inventory = new Vehicle[20];
    static {
        inventory[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 135000f);
        inventory[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000f);
        inventory[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700f);
        inventory[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500f);
        inventory[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500f);
        inventory[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000f);
    }

    public static Vehicle[] getInventory() {
        return inventory;
    }

    public static void addAVehicle(Vehicle newVehicle){
        inventory[counter] = newVehicle;
        counter++;
    }

}
