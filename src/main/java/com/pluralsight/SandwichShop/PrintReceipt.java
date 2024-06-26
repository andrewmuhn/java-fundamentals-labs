package com.pluralsight.SandwichShop;

public class PrintReceipt {
    public static void printReceipt () {
        double sandwichBasePrice = CalculatePrice.getSandwichBasePrice();
        double discount = CalculatePrice.getDiscount();
        double salesTax = ApplySalesTax.getSalesTax();
        double totalPrice = ApplySalesTax.getTotalPrice();

        System.out.printf("""
                Sandwich Price: $%.2f
                Discount: $%.2f
                Sales Tax: $%.2f
                Total Price: $%.2f
                """, sandwichBasePrice,
                discount,
                salesTax,
                totalPrice);
    }
}
