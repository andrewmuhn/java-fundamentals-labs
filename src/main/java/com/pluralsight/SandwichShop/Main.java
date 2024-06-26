package com.pluralsight.SandwichShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sandwichSize;
        int customerAge;

        System.out.println("What size sandwich you want (1-Regular, 2-Large): ");
        sandwichSize = scanner.nextInt();
        scanner.nextLine();
        System.out.println("""
                Enter your age to determine if you are eligible for a discount.\s
                Enter 0 if you do not want an age-based discount:
                """);
        customerAge = scanner.nextInt();
        scanner.nextLine();

        double discountPercent = CalculateDiscount.calculateDiscount(customerAge);
        double[] sandwichPrice = CalculatePrice.calculatePrice(sandwichSize, discountPercent);
        double[] totalPrice = ApplySalesTax.appleSalesTax(sandwichPrice[0]);
        PrintReceipt.printReceipt(sandwichPrice[2], sandwichPrice[1], totalPrice[1], totalPrice[0]);

    }
}
