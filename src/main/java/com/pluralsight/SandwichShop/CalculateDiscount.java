package com.pluralsight.SandwichShop;

public class CalculateDiscount {
    public static double calculateDiscount(int age) {
        if (age == 0) {
            return 0.00;
        } else if (age <= 17) {
            return 0.10;
        } else if (age >= 65) {
            return 0.20;
        } else {
            return 0.00;
        }
    }
}
