package com.pluralsight.VehicleInventory;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    public static void displayMenu() {
        System.out.println("""
                      What do you want to do?\s
                       1 - List all vehicles\s
                       2 - Search by make/model\s
                       3 - Search by price range\s
                       4 - Search by color\s
                       5 - Add a vehicle\s
                       6 - Quit\s
                      Enter your command:\t
                      """);
        int command = scanner.nextInt();
        switch(command) {
            case 1:
                ListAllVehicles.listAllVehicles();
                break;
            case 2:
//                FindVehicleByPrice.findVehiclesByPrice();
                break;
// etc
            case 6:
                return;
        }
    }
}
