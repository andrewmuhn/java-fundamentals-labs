package com.pluralsight.SandwichShop;

import java.util.Objects;
import java.util.Scanner;

public class GetOrder {
    static Scanner scanner = new Scanner(System.in);
    static int sandwichSize;
    static int customerAge;
    static boolean loaded;
    public static void getOrder() {
        System.out.println("What size sandwich you want (1-Regular, 2-Large): ");
        sandwichSize = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Do you want the sandwich loaded (double everything) (Y/N): ");
        String loadedResponse;
        while (true) {
            loadedResponse = scanner.nextLine().toUpperCase();
            if (loadedResponse.equals("Y") || loadedResponse.equals("N")) {
                break;
            } else {
                System.out.println("Please choose Y or N");
            }
        }
        loaded = Objects.equals(loadedResponse, "Y");
        System.out.println("""
                Enter your age to determine if you are eligible for a discount.\s
                Enter 0 if you do not want an age-based discount:""");
        customerAge = scanner.nextInt();
        scanner.nextLine();
    }

    public static int getSandwichSize() {
        return sandwichSize;
    }

    public static int getCustomerAge() {
        return customerAge;
    }

    public static boolean isLoaded() {
        return loaded;
    }
}
