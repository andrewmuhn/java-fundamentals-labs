package com.pluralsight.RentalCarCalculator;

public class CalculateRentalCarCost {
        static private double basicCarRental;
        static private double optionsCost;
        static private double underageDriverSurcharge;
        static private double totalCost;
        static private final double tollTagCostPerDay = GetRentalCarOrder.isTollTag() ? 3.95 : 0.00;
        static private final double gpsCostPerDay = GetRentalCarOrder.isGps() ? 2.95 : 0.00;
        static private final double roadsideAssistanceCostPerDay = GetRentalCarOrder.isRoadsideAssistance() ? 3.95 : 0.00;
        static private final boolean underAgeDriver = GetRentalCarOrder.getAge() < 25;
    public static void calculateCarRentalCost() {
        basicCarRental = 29.99 * GetRentalCarOrder.getRentalLength();
        optionsCost = (tollTagCostPerDay + gpsCostPerDay + roadsideAssistanceCostPerDay) * GetRentalCarOrder.getRentalLength();
        underageDriverSurcharge = underAgeDriver ? basicCarRental * .3 : 0.00;
        totalCost = basicCarRental + optionsCost + underageDriverSurcharge;
    }

    public static double getBasicCarRental() {
        return basicCarRental;
    }

    public static double getOptionsCost() {
        return optionsCost;
    }

    public static double getUnderageDriverSurcharge() {
        return underageDriverSurcharge;
    }

    public static double getTotalCost() {
        return totalCost;
    }
}
