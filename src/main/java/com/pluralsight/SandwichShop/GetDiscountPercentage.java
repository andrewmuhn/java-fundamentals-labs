package com.pluralsight.SandwichShop;

public class GetDiscountPercentage {

    static double discountPercent = 0.00;
    public static void determineDiscountPercent(int age) {
        if (age == 0) {
            discountPercent = 0.00;
        } else if (age <= 17) {
            discountPercent = 0.10;
        } else if (age >= 65) {
            discountPercent = 0.20;
        } else {
            discountPercent = 0.00;
        }
    }
    public static double getDiscountPercent() {
        return discountPercent;
    }
}
