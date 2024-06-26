package com.pluralsight.SandwichShop;

public class PrintReceipt {
    public static void printReceipt (double sandwichPrice, double discount, double salesTax, double totalPrice) {

        System.out.printf("""
                Sandwich Price: $%.2f
                Discount: $%.2f
                Sales Tax: $%.2f
                Total Price: $%.2f
                """, sandwichPrice,
                discount,
                salesTax,
                totalPrice);
    }
}
