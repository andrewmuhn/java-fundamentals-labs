package com.pluralsight.VehicleInventory;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    public static boolean displayMenu() {
        System.out.println("""
                      What do you want to do?\s
                       1 - List all vehicles\s
                       2 - Search by make/model\s
                       3 - Search by price range\s
                       4 - Search by color\s
                       5 - Add a vehicle\s
                       6 - Quit\s
                      Enter your command:\t""");
        int command = scanner.nextInt();
        scanner.nextLine();
        switch(command) {
            case 1:
                ListAllVehicles.listAllVehicles();
                break;
            case 2:
                System.out.println("Please enter a make and model: ");
                FindVehicleByMakeModel.findVehicleByMakeModel(scanner.nextLine());
                break;
            case 3:
                System.out.print("Please enter the min price or leave blank for no minimum: ");
                String minPriceStr = scanner.nextLine();
                double minPrice = isInteger(minPriceStr) ? Integer.parseInt(minPriceStr) : 0;
                System.out.print("Please enter the max price or leave blank for no maximum: ");
                String maxPriceStr = scanner.nextLine();
                double maxPrice = isInteger(maxPriceStr) ? Integer.parseInt(maxPriceStr) : Double.POSITIVE_INFINITY;
                FindVehicleByPrice.findVehiclesByPrice(minPrice, maxPrice);
                break;
            case 4:
                System.out.println("Please enter a color: ");
                FindVehicleByColor.findVehicleByColor(scanner.nextLine());
                break;
            case 5:
                AddAVehicle.addAVehicle();
                break;
            case 6:
                return false;
        }
        return true;
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
