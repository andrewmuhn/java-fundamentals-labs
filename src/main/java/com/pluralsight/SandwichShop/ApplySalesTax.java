package com.pluralsight.SandwichShop;

public class ApplySalesTax {
    static double SALES_TAX = .0825;
    static double salesTax;
    static double totalPrice;
    public static void applySalesTax (double sandwichPrice) {
        salesTax = sandwichPrice * SALES_TAX;
        totalPrice = sandwichPrice + salesTax;
    }
    public static double getSalesTax() {
        return salesTax;
    }
    public static double getTotalPrice() {
        return totalPrice;
    }
}
