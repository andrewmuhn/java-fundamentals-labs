package com.pluralsight.SandwichShop;

public class Main {
    public static void main(String[] args) {
        GetOrder.getOrder();
        GetDiscountPercentage.determineDiscountPercent(GetOrder.getCustomerAge());
        CalculatePrice.calculatePrice(GetOrder.getSandwichSize(), GetOrder.isLoaded(), GetDiscountPercentage.getDiscountPercent());
        ApplySalesTax.applySalesTax(CalculatePrice.getSandwichPrice());
        PrintReceipt.printReceipt();
    }
}
