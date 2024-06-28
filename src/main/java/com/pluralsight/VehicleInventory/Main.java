package com.pluralsight.VehicleInventory;

public class Main {
    public static void main(String[] args) {
        boolean continueLoop;
        do {
            continueLoop = Menu.displayMenu();
        } while (continueLoop);
    }
}
