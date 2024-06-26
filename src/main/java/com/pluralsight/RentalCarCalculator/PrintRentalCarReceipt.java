package com.pluralsight.RentalCarCalculator;

public class PrintRentalCarReceipt {
    public static void printRentalCarReceipt() {
        System.out.printf("""
                Basic Rental: $%.2f\s
                Options Cost: $%.2f\s
                Underage Driver Surcharge: $%.2f\s
                Total Cost: $%.2f\s
                """, CalculateRentalCarCost.getBasicCarRental(),
                CalculateRentalCarCost.getOptionsCost(),
                CalculateRentalCarCost.getUnderageDriverSurcharge(),
                CalculateRentalCarCost.getTotalCost());
    }
}
